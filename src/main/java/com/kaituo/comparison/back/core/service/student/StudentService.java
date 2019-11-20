package com.kaituo.comparison.back.core.service.student;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaituo.comparison.back.core.entity.student.Student;
import com.kaituo.comparison.back.core.mapper.student.StudentMapper;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: yedong
 * @Date: 2019/11/20 12:12
 * @Modified by:
 */
@Service
public class StudentService extends ServiceImpl<StudentMapper, Student> {
    //    @DS("master")//这里必须包一层，不能调用mp默认的插入，因为会走到从库去
    @DS("study")
    public void addUser(Student studnet) {
        baseMapper.insert(studnet);
    }

    @DS("study")
    public void addUserStudy(Student studnet) {
        baseMapper.insert(studnet);
    }

    @DS("student1")
    public void addUserStudent1(Student studnet) {
        baseMapper.insert(studnet);
    }

    @DS("student2")
    public void addUserStudent2(Student studnet) {
        baseMapper.insert(studnet);
    }
}
