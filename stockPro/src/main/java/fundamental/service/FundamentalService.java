package fundamental.service;

import java.util.List;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalService {
	//�����ڵ� ����Ʈ
	List<EnterpriseTotalDTO> codelist();
	
	//�����ڵ�, ����, �ֽ��Ѽ� ����Ʈ
	List<StockCloseWDTO> closelist();
	
	//��� �繫���� ����Ʈ
	EnterpriseFinanceDTO enterpriseFinance(String code);
	
	//������� - BPS
	BpsDTO bps(EnterpriseFinanceDTO enterpriseFinance, int capitalStock);
	 
	//������� - EPS
	EpsDTO eps(EnterpriseFinanceDTO EnterpriseFinance, int capitalStock);
	 
}




