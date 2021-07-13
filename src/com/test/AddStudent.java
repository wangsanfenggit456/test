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
		//����mybatis������Դ�ļ�
		InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
		//��ȡsessionFactory
		sessionFactory=new SqlSessionFactoryBuilder().build(in);//ʹ����Դ�ļ�����ȡ���ݻỰ����
		//��ȡ���ݿ�Ự
		session=sessionFactory.openSession();
		System.out.println("session===>"+session);
		//��ȡѧ����ӳ��ӿڶ���
		IStudentMapper studentmapper=session.getMapper(IStudentMapper.class);
		Student st=new Student("����","��","����","1990-01-01",1);
		int rows=studentmapper.save(st);
		if(rows>0){
			session.commit();
			System.out.println("�ύ�ɹ�");
		}else{
			System.out.println("�ύʧ��");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
