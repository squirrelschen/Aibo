package org.aibo.test;

import org.aibo.dao.UserCollectedDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Squirrel-Chen on 2018/2/20.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application.xml"})
public class DaoTest {


    @Autowired
    private UserCollectedDao userCollectedDao;

    @Test
    public void testGetUser() throws Exception {
        userCollectedDao.selectUserCollectedById(1);
    }


}
