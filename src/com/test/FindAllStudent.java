package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.IStudentMapper;
import com.po.Student;

public class FindAllStudent {
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
		IStudentMapper studentmapper=session.getMapper(IStudentMapper.class);
		List<Student> lsst=studentmapper.findAll();
		for(Student st:lsst){
			System.out.println("编号:"+st.getSid());
			System.out.println("姓名:"+st.getSname());
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
