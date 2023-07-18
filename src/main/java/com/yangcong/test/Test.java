package com.yangcong.test;

import com.yangcong.entity.People;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @ClassName Test
 * @Description TODO
 * @date 2023/7/17 12:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

//        加载MyBatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        调用MyBatis原生接口执行sql语句
        String statement = "com.yangcong.mapper.PeopleMapper.findById";
        People people = sqlSession.selectOne(statement, 1);
        System.err.println(people);
        sqlSession.close();

    }

}
