package com.example.spring.jdbc;

public class Mapper implements implements RowMapper<User>{
	User users=new User();
	users.setId(rs.getInt("ID"));
return users;

}
