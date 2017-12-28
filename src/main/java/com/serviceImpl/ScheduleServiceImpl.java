package com.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Course;
import com.bean.Schedule;
import com.dao.IScheduleDao;
import com.service.IScheduleService;

@Service("scheduleService")
public class ScheduleServiceImpl implements IScheduleService{
    @Resource
    private IScheduleDao dao;
	@Override
	public List<Course> getSchedule() {
		List<Course> list=dao.getSchedule();
		System.out.println(list.size());
		return list;
	}
	@Override
	public List<Schedule> queryMark() {
		List<Schedule> list=dao.queryMark();
		System.out.println(list.size());
		return list;
	}
	@Override
	public String selectCourse(String stu_id,String Course_id) {
		dao.selectCourse(stu_id,Course_id);
		String msg="选课成功";
		return msg;
	}

}
