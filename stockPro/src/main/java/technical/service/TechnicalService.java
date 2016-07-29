package technical.service;

import java.util.List;

import technical.dto.MovingAverageDTO;
import technical.dto.StockDInfoDTO;

public interface TechnicalService {
	
	//�ֽ� ���� �ڵ� ����Ʈ 
	List<String> getStockCodeList();
	
	//�ش� ������ �ֽ����� ����Ʈ
	List<StockDInfoDTO> getStockInfoList(String code);
	
	List<StockDInfoDTO> getWholeStockInfoList(String day);

	
	//5,20,60,120 �� ��� ���� ���
	List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList);
	
	//���ũ�ν� üũ
	Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode);
	
	
}
