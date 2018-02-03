package org.aibo.mapper;

import org.aibo.bean.Article;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/3.
 */
@Component
public interface ArticleMapper {
    public ArrayList<Article> getUserArticle(int user_id);
}
