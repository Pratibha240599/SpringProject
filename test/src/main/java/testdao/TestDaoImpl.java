package testdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entities.Student;

public class TestDaoImpl implements TestDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "insert into student(id,name,address) value(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int change(Student student) {
		String query = "update student set id=?, name=?, address=?";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return r;
	}

	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	
	
	
	

}
