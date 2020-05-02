package grapro20.src.main.java.com.njusoft.grapro20.model;

public class StartupKnowledge {
    private Integer id;

    private Integer userid;

    private Integer usertype;

    private String title;

    private String content;

    private Integer ifchecked;

    private String repeat;

    private Integer ifread;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    public Integer getIfread() {
        return ifread;
    }

    public void setIfread(Integer ifread) {
        this.ifread = ifread;
    }
}