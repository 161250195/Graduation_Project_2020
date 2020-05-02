package grapro20.src.main.java.com.njusoft.grapro20.blImpl.investor;

import grapro20.src.main.java.com.njusoft.grapro20.bl.investor.InvestorService;
import grapro20.src.main.java.com.njusoft.grapro20.model.IdentityCheck;
import grapro20.src.main.java.com.njusoft.grapro20.model.Investor;
import grapro20.src.main.java.com.njusoft.grapro20.vo.ResponseVO;

import java.util.List;

public class InvestorServiceImpl implements InvestorService {
    @Override
    public ResponseVO addInvestor(Investor investor) {
        return null;
    }

    @Override
    public Investor getInvestorInfo(Integer id) {
        return null;
    }

    @Override
    public ResponseVO updateManager(Investor investor) {
        return null;
    }

    @Override
    public ResponseVO submitCheckInvestor(Investor investor) {
        return null;
    }

    @Override
    public ResponseVO checkInvestor(IdentityCheck identityCheck) {
        return null;
    }

    @Override
    public List<IdentityCheck> investorIdentityCheckList() {
        return null;
    }

    @Override
    public List<IdentityCheck> identityCheckListHistory() {
        return null;
    }

    @Override
    public List<Investor> searchInvestor(Integer id) {
        return null;
    }

    @Override
    public List<Investor> searchInvestor(String name) {
        return null;
    }

    @Override
    public boolean unreadInvestorCheckResult(Integer id) {
        return false;
    }
}
