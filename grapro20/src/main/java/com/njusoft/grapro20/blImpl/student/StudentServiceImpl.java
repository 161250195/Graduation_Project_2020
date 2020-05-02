package grapro20.src.main.java.com.njusoft.grapro20.blImpl.student;

import grapro20.src.main.java.com.njusoft.grapro20.bl.student.StudentService;
import grapro20.src.main.java.com.njusoft.grapro20.model.IdentityCheck;
import grapro20.src.main.java.com.njusoft.grapro20.model.Student;
import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public ResponseVO addStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentrInfo(Integer id) {
        return null;
    }

    @Override
    public ResponseVO updateStudent(Student student) {
        return null;
    }

    @Override
    public ResponseVO submitCheckStudent(Student student) {
        return null;
    }

    @Override
    public ResponseVO checkStudent(IdentityCheck identityCheck) {
        return null;
    }

    @Override
    public List<IdentityCheck> studentIdentityCheckList() {
        return null;
    }

    @Override
    public List<IdentityCheck> studentIdentityCheckListHistory() {
        return null;
    }

    @Override
    public List<Student> searchStudent(Integer id) {
        return null;
    }

    @Override
    public List<Student> searchStudent(String name) {
        return null;
    }

    @Override
    public boolean unreadStudentCheckResult(Integer id) {
        return false;
    }
}
