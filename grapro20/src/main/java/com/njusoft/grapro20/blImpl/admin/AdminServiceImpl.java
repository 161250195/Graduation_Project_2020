package grapro20.src.main.java.com.njusoft.grapro20.blImpl.admin;

import grapro20.src.main.java.com.njusoft.grapro20.bl.admin.AdminService;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.AdminMapper;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.IdentityCheckMapper;
import grapro20.src.main.java.com.njusoft.grapro20.model.Admin;
import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;
import grapro20.src.main.java.com.njusoft.grapro20.vo.UserForm;
import java.util.List;

public class AdminServiceImpl implements AdminService{
    private final static String ACCOUNT_EXIST = "账号已存在";
    private final static String UPDATE_ERROR = "修改失败";
    AdminMapper adminMapper;
    IdentityCheckMapper identityCheckMapper;
    @Override
    public List<Admin> getAllManagers() {
       return adminMapper.selectAll();
    }

    @Override
    public Admin login(UserForm userForm) {
        Admin admin = adminMapper.selectByPrimaryKey(userForm.getid());
        if (null == admin || !admin.getPassword().equals(userForm.getPassword())) {
            return null;
        }
        return admin;
    }

    @Override
    public Admin getAdminInfo(int id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public ResponseVO updateAdminInfo(Admin admin) {
        try {
            adminMapper.updateByPrimaryKey(admin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(UPDATE_ERROR);
        }
        return ResponseVO.buildSuccess(true);
    }


    @Override
    public boolean unreadIdentityCheck() {
       if (identityCheckMapper.unreadList().size()!=0){
          return true;
        }
        return false;
    }
}
