package com.kby.mapper;

import com.kby.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/12 9:27
 */
public interface StudentMapper {
    List<Student> chaStudent();

//    /**
//     * 通过学号、姓名查询学生列表
//     *
//     * @param studentNo
//     * @param studentName
//     * @return
//     */
//    List<Student> queryList(@Param("studentNo") Integer studentNo, @Param("studentName") String studentName, @Param("index") Integer startIndex, @Param("pageSize") Integer pageSize);
//
//    /**
//     * 获取分页总条数
//     *
//     * @param studentNo
//     * @param studentName
//     * @return
//     */
//    Integer getTotalCount(@Param("studentNo") Integer studentNo, @Param("studentName") String studentName);
//
//    /**
//     * 保存学生
//     *
//     * @param student
//     * @return
//     */
//    Integer add(@Param("stu") Student student);
//
//    /**
//     * 通过学号查询具体学生信息
//     *
//     * @param studentNo
//     * @return
//     */
//    Student queryByNo(@Param("studentNo") Integer studentNo);
//
//    /**
//     * 修改
//     *
//     * @param student
//     * @return
//     */
//    Integer update(@Param("stu") Student student);
//
//    /**
//     * 删除
//     *
//     * @param studentNo
//     * @return
//     */
//    Integer delete(@Param("studentNo") Integer studentNo);

}
