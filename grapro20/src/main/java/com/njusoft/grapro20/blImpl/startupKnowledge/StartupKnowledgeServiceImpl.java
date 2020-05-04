package grapro20.src.main.java.com.njusoft.grapro20.blImpl.startupKnowledge;

import grapro20.src.main.java.com.njusoft.grapro20.bl.startupKnowledge.StartupKnowledgeService;
import grapro20.src.main.java.com.njusoft.grapro20.model.StartupKnowledge;
import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.StartupKnowledgeMapper;
import java.util.List;

public class StartupKnowledgeServiceImpl implements StartupKnowledgeService {
    private final static String SUBMIT_ERROR = "提交失败";
    private final static String UPDATE_ERROR = "修改失败";
   StartupKnowledgeMapper startupKnowledgeMapper;
    @Override
    public ResponseVO submitStartupKnowledge(StartupKnowledge startupKnowledge) {
        try {
            startupKnowledge.setId(startupKnowledgeMapper.descid().get(0)+1);
            startupKnowledgeMapper.insert(startupKnowledge);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(SUBMIT_ERROR);
        }
        return ResponseVO.buildSuccess(true);
    }

    @Override
    public ResponseVO updateStartupKnowledge(StartupKnowledge startupKnowledge) {
        try {
            startupKnowledgeMapper.updateByPrimaryKey(startupKnowledge);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(UPDATE_ERROR);
        }
        return ResponseVO.buildSuccess(true);
    }



    @Override
    public List<StartupKnowledge> allStartupKnowledge() {
        return startupKnowledgeMapper.selectAll();
    }

    @Override
    public List<StartupKnowledge> pickedStartupKnowledge() {
        return startupKnowledgeMapper.pickedList();
    }

    @Override
    public List<StartupKnowledge> startupKnowledgeHistory(Integer id) {
        return startupKnowledgeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean unreadStartupKnowledgeResult(Integer userid) {
        if (startupKnowledgeMapper.unreadList(userid).size()!=0){
            return true;
        }
        return false;
    }
    }

