package com.classpath.innerclass.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends AbstractDomain<User> {

	private int id;
	private String name;

	public User(int id2, String name2) {
		this.id = id;
		this.name = name;
	}

	@Override
	public User mapRow(ResultSet res) throws SQLException {
		return UserMapper.rowMapper(res);
	}

	static class UserMapper {
		public static User rowMapper(ResultSet res) throws SQLException {
			int id = res.getInt(1);
			String name = res.getString(2);
			return new User(id, name);

		}
	}

}
