package org.aibo.dao;

import org.aibo.bean.Article;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/3.
 */
public interface ArticleDao {

    public ArrayList<Article> getUserArticle(int user_id);
}
