package com.dao;

import java.util.List;

import com.bean.Teacher;

public interface ITeacherDao {
	List<Teacher> getTeacher();
	public Teacher getTeacherID(String teacherid);
	int deleteTeacher(String teacherid);
	void addTeacher(Teacher teacher);
}
