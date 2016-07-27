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

@Service
public class FundamentalServiceImpl implements FundamentalService{
	@Autowired
	@Qualifier("fundamentalmybatis")
	FundamentalDAO dao;

	@Override
	public StockCloseWDTO stockclose_w(String code) {
		return dao.stockclose_w(code);
	}

	@Override
	public EnterpriseFinanceDTO enterpriseinfo(String code) {
		return dao.enterpriseinfo(code);
	}

	@Override
	public List<EnterpriseTotalDTO> enterpriselist() {
		return dao.enterpriselist();
	}
	
}
