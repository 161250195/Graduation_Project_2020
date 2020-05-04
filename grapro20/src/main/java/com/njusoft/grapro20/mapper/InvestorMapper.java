package grapro20.src.main.java.com.njusoft.grapro20.mapper;


import grapro20.src.main.java.com.njusoft.grapro20.model.Investor;

import java.util.List;

public interface InvestorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Investor record);

    Investor selectByPrimaryKey(Integer id);

    List<Investor> selectAll();

    int updateByPrimaryKey(Investor record);

    List<Integer> descid();

    List<Investor> selectByName(String name);
}