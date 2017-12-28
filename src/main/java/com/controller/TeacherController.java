package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Account;
import com.bean.Course;
import com.service.IAccountService;
import com.service.ICourseService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	@Resource
	private ICourseService iCourseService;
	@RequestMapping("/getcourse_tea")
	public String getCourseTeacher(ModelMap resultMap,HttpSession session) {
		Account acc=(Account) session.getAttribute("account");
		List<Course> list=iCourseService.getTeacherCourse(acc.getAccountid());
		resultMap.addAttribute("teaCourselist", list);
		return "teacher/showCourse";
	}
	@Resource
	private IAccountService iAccountService;
	@RequestMapping("/update_tea_pd")
	public String update_stu_pd(ModelMap resutMap,String accountid,String password,String newpassword) {
		String msg=iAccountService.updatepassword(accountid, password, newpassword);
		resutMap.addAttribute("msg", msg);
		return "teacher/updatePassword";
	}
	
	@RequestMapping("/update_teacherPd")
 	public String update_studentPd(ModelMap resultMap) {
 		return "teacher/updatePassword";
 	}
	@RequestMapping("/getmarkcourse_tea")
	public String getMarkCourseTeacher(ModelMap resultMap,HttpSession session) {
		Account acc=(Account) session.getAttribute("account");
		List<Course> list=iCourseService.getTeacherCourse(acc.getAccountid());
		resultMap.addAttribute("teaCourselist", list);
		return "teacher/showMarkCourse";
	}
}
