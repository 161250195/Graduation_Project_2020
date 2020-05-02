package grapro20.src.main.java.com.njusoft.grapro20.bl.admin;
import grapro20.src.main.java.com.njusoft.grapro20.vo.UserForm;
import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;
import grapro20.src.main.java.com.njusoft.grapro20.model.Admin;

import java.util.List;

public interface AdminService {

    /**
     * 获得所有酒店管理人员信息
     * @return  List<Admin>
     */
    List<Admin> getAllManagers();
    /**
     * 管理员登录，登录成功会将管理员信息保存在session中
     *
     * @return
     */
    Admin login(UserForm userForm);
    /**
     * 获管理员个人信息
     * @param id
     * @return
     */
    Admin getAdminInfo(int id);

    /**
     * 管理员修改个人信息
     * @param
     * @return
     */
    ResponseVO updateAdminInfo(Admin admin);
    /**
     * 有无新资格审核表
     * @param
     * @return
     */
    boolean unreadIdentityCheck();

}
