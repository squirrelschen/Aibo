package org.aibo.mapper;

import org.aibo.bean.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/3.
 */
@Component
public interface ArticleMapper {

    public ArrayList<Article> selectUserArticleByPage(@Param("user_id")int user_id, @Param("pageNum")int pageNum, @Param("pageSize")int pageSize); //获取博文信息时候分页
    public Article selectArticleById(int article_id);         //通过id获取对应博文信息
    public int updateArticleById(Article article);            //更新对应id的博文信息
    public int insertArticle(Article article);                //插入博文信息
    public int deleteArticleById(int article_id);             //删除对应id博文信息
}
