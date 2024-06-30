package com.kby.service.impl;

import com.kby.common.Page;
import com.kby.entity.Student;
import com.kby.mapper.StudentMapper;
import com.kby.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/12 9:24
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> chaStudent() {
        return studentMapper.chaStudent();
    }
//
//    /**
//     * 通过学号、姓名查询学生列表
//     *
//     * @param studentNo
//     * @param studentName
//     * @param pageNo
//     * @param pageSize
//     * @return
//     */
//    @Override
//    public Page<Student> queryList(Integer studentNo, String studentName, Integer pageNo, Integer pageSize) {
//        Integer startIndex = (pageNo - 1) * pageSize;
//
//        // 查询分页列表
//        List<Student> studentList = studentMapper.queryList(studentNo, studentName, startIndex, pageSize);
//
//        // 查询总条数
//        Integer totalCount = studentMapper.getTotalCount(studentNo, studentName);
//
//        // 计算总页数
//        Integer totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
//
//        Page<Student> page = new Page<>();
//        page.setPageNo(pageNo);
//        page.setPageSize(pageSize);
//        page.setTotalPage(totalPage);
//        page.setTotalCount(totalCount);
//        page.setList(studentList);
//        return page;
//    }
//
//    /**
//     * 保存学生
//     *
//     * @param student
//     * @return
//     */
//    @Override
//    public Boolean add(Student student) {
//        return studentMapper.add(student) == 1;
//    }
//
//    /**
//     * 通过学号查询具体学生信息
//     *
//     * @param studentNo
//     * @return
//     */
//    @Override
//    public Student queryByNo(Integer studentNo) {
//        return studentMapper.queryByNo(studentNo);
//    }
//
//    /**
//     * 修改
//     *
//     * @param student
//     * @return
//     */
//    @Override
//    public Boolean update(Student student) {
//        return studentMapper.update(student) == 1;
//    }
//
//    /**
//     * 删除
//     *
//     * @param studentNo
//     * @return
//     */
//    @Override
//    public Boolean delete(Integer studentNo) {
//        return studentMapper.delete(studentNo) == 1;
//    }

}
