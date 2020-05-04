package grapro20.src.main.java.com.njusoft.grapro20.blImpl.student;

import grapro20.src.main.java.com.njusoft.grapro20.bl.student.StudentService;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.IdentityCheckMapper;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.InvestorMapper;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.StudentMapper;
import grapro20.src.main.java.com.njusoft.grapro20.model.IdentityCheck;
import grapro20.src.main.java.com.njusoft.grapro20.model.Student;
import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final static String CREAT_ERROR = "创建失败";
    private final static String UPDATE_ERROR = "修改失败";
    InvestorMapper investorMapper;
    StudentMapper studentMapper;
    IdentityCheckMapper identityCheckMapper;
    @Override
    public ResponseVO addStudent(Student student) {
        Integer id=Math.max(investorMapper.descid().get(0),studentMapper.descid().get(0))+1;
        try {
            student.setId(id);
            studentMapper.insert(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(CREAT_ERROR);
        }
        ResponseVO r= ResponseVO.buildSuccess(true);
        r.setMessage(id.toString());
        return r;
    }

    @Override
    public Student getStudentrInfo(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public ResponseVO updateStudent(Student student) {
        try {
            studentMapper.updateByPrimaryKey(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(UPDATE_ERROR);
        }
        return ResponseVO.buildSuccess(true);
    }

    @Override
    public ResponseVO submitCheckStudent(IdentityCheck identityCheck) {
        try {
            Integer id=identityCheckMapper.descid().get(0)+1;
            identityCheck.setId(id);
            identityCheckMapper.insert(identityCheck);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(CREAT_ERROR);
        }
        return ResponseVO.buildSuccess(true);
    }

    @Override
    public ResponseVO checkStudent(IdentityCheck identityCheck) {
        try {
            identityCheckMapper.updateByPrimaryKey(identityCheck);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(UPDATE_ERROR);
        }
        return ResponseVO.buildSuccess(true);
    }

    @Override
    public List<IdentityCheck> studentIdentityCheckListHistory(Integer id) {
         return identityCheckMapper.selectByPrimaryKey(id);
    }

    @Override
    public Student searchStudentByid(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> searchStudentByName(String name) {
        return studentMapper.selectByName(name);
    }

    @Override
    public boolean unreadStudentCheckResult(Integer id) {
        if (identityCheckMapper.unreadList(id).size()>0){return  true;}
        return false;
    }
}
