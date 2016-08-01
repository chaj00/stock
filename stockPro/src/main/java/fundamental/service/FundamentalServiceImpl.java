package fundamental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fundamental.dao.FundamentalDAO;
import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;
import fundamental.logic.LOGIC;
import fundamental.logic.LOGICImpl;

@Service
public class FundamentalServiceImpl implements FundamentalService{
	@Autowired
	@Qualifier("fundamentalmybatis")
	FundamentalDAO dao;
	
	@Autowired
	@Qualifier("fundamentallogic")
	LOGIC logic;
	
	@Override
	public List<EnterpriseTotalDTO> codelist() {
		return dao.codeList();
	}
	
	@Override
	public List<StockCloseWDTO> closelist() {
		return dao.stockClose();
	}

	@Override
	public EnterpriseFinanceDTO enterpriseFinance(String code) {
		return dao.enterpriseFinance(code);
	}


	@Override
	public BpsDTO bps(EnterpriseFinanceDTO EnterpriseFinance, int capitalStock) {
		LOGIC logic = new LOGICImpl();
		BpsDTO bps = logic.bps(EnterpriseFinance, capitalStock);
		System.out.println("Service bps");
		return bps;
	}
	
	@Override
	public EpsDTO eps(EnterpriseFinanceDTO EnterpriseFinance, int capitalStock) {
		LOGIC logic = new LOGICImpl();
		EpsDTO eps = logic.eps(EnterpriseFinance, capitalStock);
		System.out.println("Service eps");
		return eps;
	}
}
