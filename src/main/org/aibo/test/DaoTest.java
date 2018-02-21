package org.aibo.test;

import org.aibo.bean.Article;
import org.aibo.bean.Article_Collected;
import org.aibo.bean.User_Collected;
import org.aibo.dao.UserCollectedDao;
import org.aibo.mapper.UserCollectedMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Squirrel-Chen on 2018/2/20.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
@Transactional
public class DaoTest {


    @Autowired
    private UserCollectedMapper userCollectedDao;

    @Test
    public void testGetUser() throws Exception {
    User_Collected user_collected= userCollectedDao.selectUserCollectedById(1);
    for(Article_Collected article:user_collected.getCollecteds())
    {
        System.out.println(article.getCollected_id());

    }
    }


    private class UserCollectedMappere {
    }
}
