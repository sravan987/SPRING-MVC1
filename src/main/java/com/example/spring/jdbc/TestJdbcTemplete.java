package com.example.spring.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJdbcTemplete {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	 JdbcTemplete templete=context.getBean("dbcTemplete",JdbcTemplete.class);
	int i=templete.update("insert into employee values(?,?,?)",100,"sravan","uhsbkj");
	System.out.println("no of rows"+i);
	int count=template.queryforObject("select count(*) from users",Integer.class);
	System.out.println("no of record"+count);
	/* Query ofr map*/
	Map<String,Object>row=template.queryForMap("select from users wher id =?",100);
	System.out.println(row);
	List<Map<String,Object>>lst=templete.queryForList("select *from users");
	
	
}
}
