package com.pragim.SpringJdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcClient {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	
	
	public void insertIntoStu() {
		jdbcTemplate.execute("insert into stu values(109,'pune','akhilesh')");
		System.out.println("Done!");
	}
	
	
	public void updateStu() {
		
		jdbcTemplate.update("update stu set stu_addr=? where stu_id=?", "hyd",108);
		System.out.println("Done!");
	}
	
	public void selectData() {
		
		List<Map<String,Object>> data = jdbcTemplate.queryForList("select * from stu");
		for (Map<String, Object> map : data) {
			System.out.println(map);
		}
		
	}
	
	
	public void selectDataUsingRowMapper() {
		List<Student> list = jdbcTemplate.query("select * from stu",new MyRowMapper());
		for (Student student : list) {
			System.out.println(student);
		}
			
	}
	
	public void selectDataUsingRowMapperUsingCondition() {
		List<Student> list = jdbcTemplate.query("select * from stu where stu_id=?",new MyRowMapper(),new Object[] {109});
		for (Student student : list) {
			System.out.println(student);
		}
			
	}
	
	/*public void selectDataUsingRowMapperUsingNamedParams() {
		
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("input", Integer.valueOf(108));
		
		Student stuObj = namedParameterJdbcTemplate.queryForObject("select * from stu where stu_id=:input",namedParameters,new MyRowMapper());
		System.out.println(stuObj);
			
	}*/
	
	public void selectDataUsingRowMapperUsingConditionNamesParams() {
		
		Student student = new Student();
		student.setId(108);
		
		SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(student);
		Student stuObj = jdbcTemplate.queryForObject("select * from stu where stu_id=:id",new MyRowMapper(),namedParameters);
		System.out.println(stuObj);
			
	}
	
	
	
	
	
	
	
	//execute
	//update
	//query
	

}
