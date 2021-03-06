package org.aibo.dao;

import org.aibo.bean.Article;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/3.
 */
public interface ArticleDao {

    public ArrayList<Article> selectUserArticleByPage(int user_id,int pageNum,int pageSize);
    public Article selectArticleById(int article_id);
    public int updateArticleById(Article article);
    public int insertArticle(Article article);
    public int deleteArticleById(int article_id);
}
