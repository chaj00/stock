package fundamental.dao;

import java.util.List;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalDAO {
	//기업 전체 리스트 - 종목코드, 종목명
	List<EnterpriseTotalDTO> enterpriselist();
	
	//기업 클릭 - 기업명, 기업종가
	StockCloseWDTO stockclose_w(String code);
	
	//기업 정보 - 재무정보
	EnterpriseFinanceDTO enterpriseinfo(String code);
	
	//기업 검색 - 종목코드, 종목명...
	
	
}




