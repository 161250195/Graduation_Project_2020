package grapro20.src.main.java.com.njusoft.grapro20.bl.investor;

import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;
import grapro20.src.main.java.com.njusoft.grapro20.model.Investor;
import grapro20.src.main.java.com.njusoft.grapro20.model.IdentityCheck;
import java.util.List;

public interface InvestorService {
    /**
     * 创建投资人账号
     * @param investor
     * @return
     */
    ResponseVO addInvestor(Investor investor);
    /**
     * 查看投资人信息
     * @param
     * @return
     */
    Investor getInvestorInfo(Integer id);
    /**
     * 修改投资人信息
     * @param
     * @return
     */
    ResponseVO updateManager(Investor investor);
    /**
     * 投资人提交审核
     * @param
     * @return
     */
    ResponseVO submitCheckInvestor(Investor investor);
    /**
     * 修改投资人审核信息（批准/拒绝、回复消息）
     * @param
     * @return
     */
    ResponseVO checkInvestor(IdentityCheck identityCheck);

    /**
     * 投资人审核表列表
     * @param
     * @return
     */
    List<IdentityCheck> investorIdentityCheckList();
    /**
     * 投资人审核表历史记录
     * @param
     * @return
     */
    List<IdentityCheck> identityCheckListHistory();
    /**
     * 查找投资人
     * @param id
     * @return
     */
    List<Investor> searchInvestor(Integer id);
    /**
     * 查找投资人
     * @param name
     * @return
     */
    List<Investor> searchInvestor(String name);
    /**
     * 有无未读投资人资格审核结果
     * @param
     * @return
     */
    boolean unreadInvestorCheckResult(Integer id);
}
