package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Skill;
import in.sp.beans.StudentC;

public class Main {
	public static void main(String args []) {
		String config_loc = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		
	
		StudentC std = (StudentC) context.getBean("stdId");
		std.display();
		
		System.out.println("-----------------------------");
		
		StudentC std1 = (StudentC) context.getBean("stdId1");
		std1.display();
		
		
		System.out.println("-----------------------");
	Skill std2 =(Skill) context.getBean("stdId3");
		
		std2.display1();
		
	
	}

}


//1. spring-beans-xxx.jar
//2.spring-core-xxx.jar
//3.spring-context-xxx.jar
//4.common-loggin-xxx.jar
//5.spring- expression-xxx.jar