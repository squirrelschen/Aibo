package org.aibo.service.serviceimpl;

import org.aibo.bean.Article;
import org.aibo.dao.ArticleDao;
import org.aibo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/3.
 */
@Service
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    private ArticleDao articleDao;

    public ArrayList<Article> selectUserArticleByPage(int user_id, int pageNum, int pageSize) {
        return articleDao.selectUserArticleByPage(user_id,pageNum,pageSize);
    }

    public Article selectArticleById(int article_id) {
        return articleDao.selectArticleById(article_id);
    }

    public int updateArticleById(Article article) {
        return articleDao.updateArticleById(article);
    }

    public int insertArticle(Article article) {
        return articleDao.insertArticle(article);
    }
}
