package testdao;

import entities.Student;

public interface TestDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);

}
