
package com.yangcong.test;

import com.yangcong.entity.People;
import com.yangcong.repository.PeopleRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName Test2
 * @Description TODO
 * @date 2023/7/17 14:27
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //        加载MyBatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取自定义接口的代理对象
        PeopleRepository mapper = sqlSession.getMapper(PeopleRepository.class);
//        People people = new People();
//        people.setName("科比");
//        people.setAge(37);
//        people.setMoney(250000.00);
//        int i = mapper.savePeople(people);

//        mapper.deletePeople(6);

//        People people1 = new People();
//        people1.setId(1);
//        people1.setName("科比");
//        people1.setMoney(250000.00);
//        int num = mapper.updatePeople(people1);
//
        People byId = mapper.findById(1);

        List<People> all = mapper.findAll();
        System.err.println(byId);
          System.err.println(all);


//        System.err.println(i);
        sqlSession.commit();
        sqlSession.close();


    }
}
