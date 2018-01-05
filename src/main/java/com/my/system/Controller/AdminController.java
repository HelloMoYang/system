package com.my.system.Controller;

import com.my.system.Bean.Course;
import com.my.system.Service.CollegeService;
import com.my.system.Service.CourseService;
import com.my.system.Service.StudentService;
import com.my.system.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CollegeService collegeService;
    @Autowired
    private TeacherService teacherService;

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
        mv.addObject("teacherList",teacherService.getTeachers());
        mv.addObject("collegeList",collegeService.getCollegeList());
        return mv;
    }

    @PostMapping("/addCourse")
    public String addCourseForm(@RequestParam("courseId") Integer courseId,@RequestParam("courseName") String courseName,
                                @RequestParam("teacherId") Integer teacherId,@RequestParam("courseTime") String courseTime,
                                @RequestParam("classRoom") String classRoom,@RequestParam("courseWeek") Integer courseWeek,
                                @RequestParam("courseType") String courseType,@RequestParam("collegeId") Integer collegeId,
                                @RequestParam("score") Integer score){
        Course course = new Course();
        course.setCourseid(courseId);
        course.setCoursename(courseName);
        course.setTeacherid(teacherId);
        course.setCoursetime(courseTime);
        course.setClassroom(classRoom);
        course.setCourseweek(courseWeek);
        course.setCoursetype(courseType);
        course.setCollegeid(collegeId);
        course.setScore(score);
        try {
            courseService.addCourse(course);
        }catch (Exception e){
            throw new RuntimeException("添加课程信息失败！");
        }
        return "redirect:/admin/showCourse";
    }
}
