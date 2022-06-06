package com.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.di.Students;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext x=new ClassPathXmlApplicationContext("beans.xml");
		Student2 s2=x.getBean("s2",Student2.class);
		s2.cheating();
		Another_student s3=x.getBean("s3",Another_student.class);
		s3.cheating();
	}

}
