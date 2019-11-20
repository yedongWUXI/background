package com.kaituo.comparison.back.core.controller.student;

import com.kaituo.comparison.back.core.entity.student.Student;
import com.kaituo.comparison.back.core.service.student.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Description:
 * @Author: yedong
 * @Date: 2019/11/20 12:09
 * @Modified by:
 */
@RestController
@RequestMapping(value = "/student")
@Api(tags = {"多数据源测试"})
public class StudentController {
    @Autowired
    StudentService studentService;
    private Random random = new Random();

    @RequestMapping(value = "/addUserStudy", method = RequestMethod.GET)
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public String addUserStudy() {
        Student studnet = new Student();
        studnet.setName("测试用户" + random.nextInt());
        studnet.setAge(random.nextInt(100));
        studentService.addUserStudy(studnet);
        return "success";
    }

    @RequestMapping(value = "/addUserStudent1", method = RequestMethod.GET)
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public String addUserStudent1() {
        Student studnet = new Student();
        studnet.setName("测试用户" + random.nextInt());
        studnet.setAge(random.nextInt(100));
        studentService.addUserStudent1(studnet);
        return "success";
    }

    @RequestMapping(value = "/addUserStudent2", method = RequestMethod.GET)
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public String addUserStudent2() {
        Student studnet = new Student();
        studnet.setName("测试用户" + random.nextInt());
        studnet.setAge(random.nextInt(100));
        studentService.addUserStudent2(studnet);
        return "success";
    }

}
