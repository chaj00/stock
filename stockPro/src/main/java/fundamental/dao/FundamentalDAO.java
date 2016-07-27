package fundamental.dao;

import java.util.List;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalDAO {
	//��� ��ü ����Ʈ - �����ڵ�, �����
	List<EnterpriseTotalDTO> enterpriselist();
	
	//��� Ŭ�� - �����, �������
	StockCloseWDTO stockclose_w(String code);
	
	//��� ���� - �繫����
	EnterpriseFinanceDTO enterpriseinfo(String code);
	
	//��� �˻� - �����ڵ�, �����...
	
	
}




