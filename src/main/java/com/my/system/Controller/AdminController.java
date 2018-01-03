package com.my.system.Controller;

import com.my.system.Service.CourseService;
import com.my.system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/admin")
    public ModelAndView admin(){
        ModelAndView mv = new ModelAndView("admin/admin");
        System.out.println("admin视图");
        return mv;
    }

    @GetMapping("/showCourse")
    public ModelAndView showCourse(){
        ModelAndView mv = new ModelAndView("admin/showCourse");
        System.out.println("showCourse视图");
        mv.addObject("courseList",courseService.getCourseList());
        return mv;
    }

    @GetMapping("/showStudent")
    public ModelAndView showStudent(){
        ModelAndView mv = new ModelAndView("admin/showStudent");
        System.out.println("showStudent视图");
        mv.addObject("studentList",studentService.getStudentList());
        return mv;
    }

    @GetMapping("/addCourse")
    public ModelAndView addCourse(){
        ModelAndView mv = new ModelAndView("admin/addCourse");
        return mv;
    }
}
