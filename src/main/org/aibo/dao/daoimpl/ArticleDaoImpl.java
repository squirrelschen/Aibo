package org.aibo.dao.daoimpl;

import org.aibo.bean.Article;
import org.aibo.dao.ArticleDao;
import org.aibo.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/3.
 */
@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    private ArticleMapper articleMapper;


    public ArrayList<Article> selectUserArticleByPage(int user_id, int pageNum, int pageSize) {
        return articleMapper.selectUserArticleByPage(user_id, pageNum, pageSize);
    }

    public Article selectArticleById(int article_id) {
        return articleMapper.selectArticleById(article_id);
    }
}
