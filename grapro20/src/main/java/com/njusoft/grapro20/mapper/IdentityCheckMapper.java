package grapro20.src.main.java.com.njusoft.grapro20.mapper;

import grapro20.src.main.java.com.njusoft.grapro20.model.IdentityCheck;
import java.util.List;

public interface IdentityCheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IdentityCheck record);

    List<IdentityCheck> selectByPrimaryKey(Integer id);

    List<IdentityCheck> selectAll();

    int updateByPrimaryKey(IdentityCheck record);

    List<IdentityCheck> uncheckList();

    List<Integer> descid();

    List<IdentityCheck> unreadList(Integer id);
}