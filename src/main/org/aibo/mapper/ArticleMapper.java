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

    public ArrayList<Article> selectUserArticleByPage(@Param("user_id")int user_id, @Param("pageNum")int pageNum, @Param("pageSize")int pageSize);
    public Article selectArticleById(int article_id);
    public int updateArticleById(Article article);
}
