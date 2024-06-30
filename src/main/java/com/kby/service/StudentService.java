package com.kby.service;

import com.kby.common.Page;
import com.kby.entity.Student;

import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/12 9:22
 */
public interface StudentService {

    /*
    空参查询
     */
    List<Student> chaStudent();

//    /**
//     * 通过学号、姓名查询学生列表
//     *
//     * @param studentNo
//     * @param studentName
//     * @param pageNo
//     * @param pageSize
//     * @return
//     */
//    Page<Student> queryList(Integer studentNo, String studentName, Integer pageNo, Integer pageSize);
//
//    /**
//     * 保存学生
//     *
//     * @param student
//     * @return
//     */
//    Boolean add(Student student);
//
//    /**
//     * 通过学号查询具体学生信息
//     *
//     * @param studentNo
//     * @return
//     */
//    Student queryByNo(Integer studentNo);
//
//    /**
//     * 修改
//     *
//     * @param student
//     * @return
//     */
//    Boolean update(Student student);
//
//    /**
//     * 删除
//     *
//     * @param studentNo
//     * @return
//     */
//    Boolean delete(Integer studentNo);

}
