package grapro20.src.main.java.com.njusoft.grapro20.model;

public class IdentityCheck {
    private Integer id;

    private Integer userid;

    private Integer usertype;

    private Integer checkerid;

    private Integer ifchecked;

    private String repeat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getCheckerid() {
        return checkerid;
    }

    public void setCheckerid(Integer checkerid) {
        this.checkerid = checkerid;
    }

    public Integer getIfchecked() {
        return ifchecked;
    }

    public void setIfchecked(Integer ifchecked) {
        this.ifchecked = ifchecked;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat == null ? null : repeat.trim();
    }
}