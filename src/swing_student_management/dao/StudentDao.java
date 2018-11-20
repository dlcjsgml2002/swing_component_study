package swing_student_management.dao;

import java.util.List;

import swing_student_management.dto.Student;

public interface StudentDao {
	public boolean addStudent(Student std);

	public boolean removeStudent(Student std);

	public boolean updateStudent(Student std);

	public Student serchStudent(Student std);

	public void setStudentList(List<Student> lists);

	public List<Student> getStudentList();

}
