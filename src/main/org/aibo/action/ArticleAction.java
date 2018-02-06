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
import java.util.HashMap;

/**
 * Created by Squirrel-Chen on 2018/2/4.
 */
@Controller
public class ArticleAction {


    @Autowired
    private ArticleService articleService;
    private String status;
    private boolean flag=false;
    private Object json;
    private HashMap<String ,Object> resultmap=new HashMap<String, Object>();

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
//            status="{'status':'true'}";
            flag=true;
            resultmap.put("status",flag);
            resultmap.put("articles",articles);
            json=JSON.toJSON(resultmap);
            return json;
        }
        flag=false;
        resultmap.put("status",flag);
        json=JSON.toJSON(resultmap);
        return json;
    }

    @RequestMapping("/article")
    @ResponseBody
    public Object article(@RequestParam("id")int article_id)
    {
        Article article=articleService.selectArticleById(article_id);
        if(article!=null)
        {
            status="{'status':'true'}";
            resultmap.put("status",status);
            resultmap.put("article",article);
            json=JSON.toJSON(resultmap);
            return json;
        }
        status="{'status':'false'}";
        resultmap.put("status",status);
        json=JSON.toJSON(resultmap);
        return json;
    }

    @RequestMapping("/updateArticle")
    @ResponseBody
    public Object update(Article article)
    {
        int result=articleService.updateArticleById(article);
        if(result!=-1&&result!=0)
        {
            status="{'status':'true'}";
            resultmap.put("status",status);
            json=JSON.toJSON(resultmap);
            return json;
        }
        status="{'status':'flase'}";
        resultmap.put("status",status);
        json=JSON.toJSON(resultmap);
        return json;
    }
}
