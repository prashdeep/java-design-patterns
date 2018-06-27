package com.classpath.innerclass.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
	
	public T mapRow(ResultSet res) throws SQLException;

}
