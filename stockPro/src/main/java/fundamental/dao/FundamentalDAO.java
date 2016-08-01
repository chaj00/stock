package fundamental.dao;

import java.util.List;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalDAO {
	//�����ڵ� ����Ʈ
	List<EnterpriseTotalDTO> codeList();
	
	//�����ڵ�, �����, �ֽ��Ѽ� ����Ʈ
//	List<EnterpriseTotalDTO> totalList(String code);
	
	//�����ڵ�, ����, ��¥(�ִ���) ����Ʈ
	List<StockCloseWDTO> stockClose();
	
	//��� �繫����
	EnterpriseFinanceDTO enterpriseFinance(String code);
	
}


