package fundamental.service;

import java.util.List;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalService {
	//종목코드 리스트
	List<EnterpriseTotalDTO> codelist();
	
	//종목코드, 종가, 주식총수 리스트
	List<StockCloseWDTO> closelist();
	
	//기업 재무정보 리스트
	EnterpriseFinanceDTO enterpriseFinance(String code);
	
	//기업정보 - BPS
	BpsDTO bps(EnterpriseFinanceDTO enterpriseFinance, int capitalStock);
	 
	//기업정보 - EPS
	EpsDTO eps(EnterpriseFinanceDTO EnterpriseFinance, int capitalStock);
	 
}




