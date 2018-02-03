package org.aibo.service;

import org.aibo.bean.Article;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/3.
 */
public interface ArticleService {
    public ArrayList<Article> getUserArticle(int user_id);

}
