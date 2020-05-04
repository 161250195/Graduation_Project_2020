package grapro20.src.main.java.com.njusoft.grapro20.blImpl.investor;

import grapro20.src.main.java.com.njusoft.grapro20.bl.investor.InvestorService;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.IdentityCheckMapper;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.InvestorMapper;
import grapro20.src.main.java.com.njusoft.grapro20.mapper.StudentMapper;
import grapro20.src.main.java.com.njusoft.grapro20.model.IdentityCheck;
import grapro20.src.main.java.com.njusoft.grapro20.model.Investor;
import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;

import java.util.List;

public class InvestorServiceImpl implements InvestorService {
    private final static String CREAT_ERROR = "创建失败";
    private final static String UPDATE_ERROR = "修改失败";
   InvestorMapper investorMapper;
   StudentMapper studentMapper;
   IdentityCheckMapper identityCheckMapper;
    @Override
    public ResponseVO addInvestor(Investor investor) {
        Integer id=Math.max(investorMapper.descid().get(0),studentMapper.descid().get(0))+1;
        try {
           investor.setId(id);
           investorMapper.insert(investor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(CREAT_ERROR);
        }
         ResponseVO r= ResponseVO.buildSuccess(true);
        r.setMessage(id.toString());
        return r;
    }

    @Override
    public Investor getInvestorInfo(Integer id) {
        return investorMapper.selectByPrimaryKey(id);
    }

    @Override
    public ResponseVO updateInvestor(Investor investor) {
        try {
            investorMapper.updateByPrimaryKey(investor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(UPDATE_ERROR);
        }
       return ResponseVO.buildSuccess(true);

    }

    @Override
    public ResponseVO submitCheckInvestor(IdentityCheck identityCheck) {
        try {
           Integer id=identityCheckMapper.descid().get(0)+1;
           identityCheck.setId(id);
           identityCheckMapper.insert(identityCheck);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(CREAT_ERROR);
        }
        return ResponseVO.buildSuccess(true);
    }

    @Override
    public ResponseVO checkInvestor(IdentityCheck identityCheck) {
        try {
            identityCheckMapper.updateByPrimaryKey(identityCheck);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseVO.buildFailure(UPDATE_ERROR);
        }
        return ResponseVO.buildSuccess(true);
    }


    @Override
    public List<IdentityCheck> identityCheckListHistory(Integer id) {
        return identityCheckMapper.selectByPrimaryKey(id);
    }

    @Override
    public Investor searchInvestorByid(Integer id) {
        return investorMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Investor> searchInvestorBynName(String name) {
        return investorMapper.selectByName(name);
    }

    @Override
    public boolean unreadInvestorCheckResult(Integer id) {
        if (identityCheckMapper.unreadList(id).size()>0){return  true;}
        return false;
    }
}
