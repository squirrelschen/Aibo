package org.aibo.test.daoTest;

import org.aibo.bean.Article_Collected;
import org.aibo.bean.User_Collected;
import org.aibo.mapper.UserCollectedMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class UserCollectedDaoTest {

    @Autowired
    private UserCollectedMapper userCollectedMapper;


    @Test
    public void testGetUser() throws Exception {
        User_Collected user_collected= userCollectedMapper.selectUserCollectedById(1);
        System.out.println("how many user_collected "+user_collected);
            System.out.println(user_collected.getUser_id());
            for(Article_Collected article_collected:user_collected.getCollecteds())
            {
                System.out.println(article_collected.getCollected_id());
            }
//        System.out.println("how many article_collected "+user_collected.get(0).getCollecteds().size());
    }

    @Test
    @Transactional
    public void testInsertUserCollected(){
        int result =userCollectedMapper.insertUserCollected(1,7,new Date());
        System.out.println("返回的记录数"+result);
    }
}
