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
		//����mybatis������Դ�ļ�
		InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
		//��ȡsessionFactory
		sessionFactory=new SqlSessionFactoryBuilder().build(in);//ʹ����Դ�ļ�����ȡ���ݻỰ����
		//��ȡ���ݿ�Ự
		session=sessionFactory.openSession();
		System.out.println("session===>"+session);
		IStudentMapper studentmapper=session.getMapper(IStudentMapper.class);
		List<Student> lsst=studentmapper.findAll();
		for(Student st:lsst){
			System.out.println("���:"+st.getSid());
			System.out.println("����:"+st.getSname());
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
