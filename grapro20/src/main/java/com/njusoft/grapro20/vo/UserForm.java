package grapro20.src.main.java.com.njusoft.grapro20.vo;

public class UserForm {
    /**
     * 用户id，不可重复
     */
    private Integer id;
    /**
     * 用户密码
     */
    private String password;


    public Integer getid() {
        return id;
    }

    public void setEmail(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
