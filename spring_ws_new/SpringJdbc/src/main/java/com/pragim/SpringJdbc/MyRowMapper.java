package com.pragim.SpringJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MyRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			Student student = new Student();
			student.setId(rs.getInt(1));
			student.setStuAddr(rs.getString(2));
			student.setStuName(rs.getString(3));
			return student;
		}
	}


