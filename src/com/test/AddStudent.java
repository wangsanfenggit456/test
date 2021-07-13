package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.IStudentMapper;
import com.po.Student;

public class AddStudent {
  public static void main(String[] args) {
	SqlSessionFactory sessionFactory=null;
	SqlSession session=null;
	try {
		//加载mybatis配置资源文件
		InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
		//获取sessionFactory
		sessionFactory=new SqlSessionFactoryBuilder().build(in);//使用资源文件流获取数据会话工厂
		//获取数据库会话
		session=sessionFactory.openSession();
		System.out.println("session===>"+session);
		//获取学生表映射接口对象
		IStudentMapper studentmapper=session.getMapper(IStudentMapper.class);
		Student st=new Student("张三","男","西安","1990-01-01",1);
		int rows=studentmapper.save(st);
		if(rows>0){
			session.commit();
			System.out.println("提交成功");
		}else{
			System.out.println("提交失败");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
