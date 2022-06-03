package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String args[])
	{
		//injecting the value for dependency name(normal way) 
	@SuppressWarnings("resource")
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	Students s1=c.getBean("s1",Students.class);
	s1.display();
	
	/*Student s2=c.getBean("s2",Student.class);
	s2.display();*/
	}

}

