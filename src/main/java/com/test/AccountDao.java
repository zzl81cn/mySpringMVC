package com.test;

import java.io.Reader;

import com.book.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Created by zhouzilong on 2016/7/26.
 */
public class AccountDao {
//    @Test
//    public void testGetUser() throws Exception {
//        InputStream in = this.getClass().getClassLoader().getResourceAsStream("mybatiscfg.xml");
//    }
    public static void main(String[] args) {
        String resources = "com/mapper/mybatiscfg.xml";
        Reader reader = null;
        SqlSession session;

        try {
            reader = Resources.getResourceAsReader(resources);
        }catch (Exception e){
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        session = factory.openSession();
        Account account = session.selectOne("getAccountById", 1);
        System.out.println("\nuserName: " + account.getUserName());
//        System.out.println("haha");
        session.close();
    }

}
