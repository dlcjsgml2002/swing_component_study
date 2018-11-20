package swing_student_management.dao;

import java.util.List;

import swing_student_management.dto.Student;

public class StudentDaoImpl implements StudentDao {
	private List<Student> lists;

	@Override
	public boolean addStudent(Student std) {
		if (lists.contains(std)) {
			return false;
		}
		return lists.add(std);
	}

	@Override
	public boolean removeStudent(Student std) {
		if (!lists.contains(std)) {
			return false;
		}
		return lists.remove(std);
	}

	@Override
	public boolean updateStudent(Student std) {
		if (!lists.contains(std)) {
			return false;
		}
		return lists.set(lists.indexOf(std), std) == null ? false : true;
	}

	@Override
	public Student serchStudent(Student std) {
		return lists.get(lists.indexOf(std));
	}

	@Override
	public List<Student> getStudentList() {
		return lists;
	}

	@Override
	public void setStudentList(List<Student> lists) {
		this.lists = lists;

	}

}
