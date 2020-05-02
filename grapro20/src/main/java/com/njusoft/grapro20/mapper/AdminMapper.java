package grapro20.src.main.java.com.njusoft.grapro20.mapper;


import grapro20.src.main.java.com.njusoft.grapro20.model.Admin;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer id);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
}