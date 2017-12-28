package com.dao;

import java.util.List;

import com.bean.Course;
import com.bean.Schedule;

public interface IScheduleDao {
      public List<Course> getSchedule();
      public List<Schedule> queryMark();
      public void selectCourse(String stu_id,String course_id);
}
