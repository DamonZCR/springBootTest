package com.damon.springBoot;

import com.damon.springboot.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/12/21 0021.
 */
public class MyBatisTestApplication {
    //查询全部
    @Test
    public void testSelectAllEmployee(){
        String resource = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            List<Employee> list = sqlSession.selectList("selectAllEmployee");
            for(Employee employee : list){
                System.out.println(employee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //通过id查询Employee
    @Test
    public void testSelectEmployeeById(){
        String resource = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            Employee employee = sqlSession.selectOne("selectEmployeeById",7);
            //namespace+id,参数
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //添加员工
    @Test
    public void testInsertEmployee(){
        String resource = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            Employee employee = new Employee();
            employee.setName("Damon");
            employee.setAge((int)(Math.random() * 100));
            employee.setBirthday(new Date());
            employee.setSalary(new BigDecimal(5000));
            int result = sqlSession.insert("insertEmployee", employee);
            sqlSession.commit();
            if(result>0){
                System.out.println("插入成功!");
            }else{
                System.out.println("插入失败!");
            }
            sqlSession.commit();
            sqlSession.close();
            //增删改的时候一定要记得提交事务,不然数据库是不会更新的,这个跟之前不太一样,切记切记

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //删除员工
    @Test
    public void testDeleteEmployee(){
        String resource = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            int result = sqlSession.delete("deleteEmployee",20);
            if(result>0){
                System.out.println("删除成功!");
            }else{
                System.out.println("删除失败!");
            }
            sqlSession.commit();
            sqlSession.close();
            //提交事务,提交事务,提交事务!!!!

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //更新员工信息
    @Test
    public void testUpdateEmployee(){
        String resource = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            Employee employee = sqlSession.selectOne("test.selectEmployeeById", 7);
            int result = sqlSession.update("updateEmployee", employee);
            if(result>0){
                System.out.println("更新成功!");
            }else{
                System.out.println("更新失败!");
            }
            sqlSession.commit();
            sqlSession.close();
            //提交事务,提交事务,提交事务!!!!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
