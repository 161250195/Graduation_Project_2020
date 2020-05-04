package grapro20.src.main.java.com.njusoft.grapro20.mapper;


import grapro20.src.main.java.com.njusoft.grapro20.model.StartupKnowledge;

import java.util.List;

public interface StartupKnowledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StartupKnowledge record);

    List<StartupKnowledge> selectByPrimaryKey(Integer id);

    List<StartupKnowledge> selectAll();

    int updateByPrimaryKey(StartupKnowledge record);

    List<StartupKnowledge> pickedList();

    List<StartupKnowledge> unreadList(Integer userid);

    List<Integer> descid();

}