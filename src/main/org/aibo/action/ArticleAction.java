package org.aibo.action;

import com.alibaba.fastjson.JSON;
import org.aibo.bean.Article;
import org.aibo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/4.
 */
@Controller
public class ArticleAction {


    @Autowired
    private ArticleService articleService;
    private String status;
    private Object json;

    public Object getJson() {
        return json;
    }

    public void setJson(Object json) {
        this.json = json;
    }

    @RequestMapping("/myarticle")
    @ResponseBody
    public Object getUserArticle(@RequestParam("user_id")int user_id,@RequestParam("pageNum")int pageNum,@RequestParam("pageSize")int pageSize)
    {


        System.out.println(
                "pageSize"+pageSize+"pageNum"+pageNum
        );

        ArrayList<Article> articles=new ArrayList<Article>();
        if(user_id!=0&&user_id!=-1)
        {
            articles=articleService.selectUserArticleByPage(user_id,pageNum,pageSize);
        }
        if(articles.size()!=0)
        {
            json= JSON.toJSON(articles);
            return json;
        }
        status="{'status':'false'}";
        json=JSON.parse(status);
        return json;
    }

}
