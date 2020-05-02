package grapro20.src.main.java.com.njusoft.grapro20.bl.startupKnowledge;

import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;
import grapro20.src.main.java.com.njusoft.grapro20.model.StartupKnowledge;

import java.util.List;

public interface StartupKnowledgeService {
    /**
     * 创业知识投稿
     * @param
     * @return
     */
    ResponseVO submitStartupKnowledge(StartupKnowledge startupKnowledge);
    /**
     * 修改创业知识投稿(包括修改投稿内容、采用状态、回复消息)
     * @param
     * @return
     */
    ResponseVO updateStartupKnowledge(StartupKnowledge startupKnowledge);

    /**
     * 创业知识投稿列表
     * @param
     * @return
     */
    List<StartupKnowledge> allStartupKnowledge();
    /**
     * 被采用的创业知识投稿列表
     * @param
     * @return
     */
    List<StartupKnowledge> pickedStartupKnowledge();
    /**
     * 创业知识投稿历史记录
     * @param
     * @return
     */
    List<StartupKnowledge> startupKnowledgeHistory(Integer id);
    /**
     * 有无未读创业知识投稿结果
     * @param
     * @return
     */
    boolean unreadStartupKnowledgeResult(Integer id);
}
