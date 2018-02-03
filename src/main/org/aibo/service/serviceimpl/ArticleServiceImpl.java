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

    public ArrayList<Article> getUserArticle(int user_id) {
        return articleDao.getUserArticle(user_id);
    }
}
