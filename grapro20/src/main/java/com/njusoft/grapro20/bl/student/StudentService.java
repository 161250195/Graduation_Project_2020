package grapro20.src.main.java.com.njusoft.grapro20.bl.student;

import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;
import grapro20.src.main.java.com.njusoft.grapro20.model.Student;
import grapro20.src.main.java.com.njusoft.grapro20.model.IdentityCheck;
import java.util.List;


public interface StudentService {
    /**
     * 创建学生账号
     * @param student
     * @return
     */
    ResponseVO addStudent(Student student);
    /**
     * 查看学生信息
     * @param
     * @return
     */
    Student getStudentrInfo(Integer id);
    /**
     * 修改学生信息
     * @param
     * @return
     */
    ResponseVO updateStudent(Student student);
    /**
     * 学生提交审核
     * @param
     * @return
     */
    ResponseVO submitCheckStudent(IdentityCheck identityCheck);
    /**
     * 修改学生审核信息（批准/拒绝、回复消息）
     * @param
     * @return
     */
    ResponseVO checkStudent(IdentityCheck identityCheck);

    /**
     * 学生审核表历史记录
     * @param
     * @return
     */
    List<IdentityCheck> studentIdentityCheckListHistory(Integer id);
    /**
     * 查找学生
     * @param id
     * @return
     */
    Student searchStudentByid(Integer id);
    /**
     * 查找学生
     * @param name
     * @return
     */
    List<Student> searchStudentByName(String name);
    /**
     * 有无未读学生资格审核结果
     * @param
     * @return
     */
    boolean unreadStudentCheckResult(Integer userid);
}
