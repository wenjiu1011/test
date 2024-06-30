package com.kby.controller;

import com.kby.common.Page;
import com.kby.entity.Student;
import com.kby.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/25 16:21
 */
@Controller
@RequestMapping("/student")
@ResponseBody
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/cha", method = RequestMethod.GET)
    public List<Student> chaStudent(){
        return studentService.chaStudent();
    }
//
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public Page<Student> queryStudent(@RequestParam("studentNo") Integer studentNo,
//                                      @RequestParam("studentName") String studentName,
//                                      @RequestParam("pageNo") Integer pageNo,
//                                      @RequestParam("pageSize") Integer pageSize) {
//        return studentService.queryList(studentNo, studentName, pageNo, pageSize);
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public Boolean add(@RequestBody Student student) {
//        return studentService.add(student);
//    }
//
//    @RequestMapping(value = "/queryByNo", method = RequestMethod.GET)
//    public Student queryByNo(@RequestParam("studentNo") Integer studentNo) {
//        return studentService.queryByNo(studentNo);
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public Boolean update(@RequestBody Student student) {
//        return studentService.update(student);
//    }
//
//    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
//    public Boolean del(@RequestParam("studentNo") Integer studentNo) {
//        return studentService.delete(studentNo);
//    }

}
