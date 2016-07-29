package technical.service;

import java.util.List;

import technical.dto.MovingAverageDTO;
import technical.dto.StockDInfoDTO;

public interface TechnicalService {
	
	//주식 종목 코드 리스트 
	List<String> getStockCodeList();
	
	//해당 종목의 주식정보 리스트
	List<StockDInfoDTO> getStockInfoList(String code);
	
	List<StockDInfoDTO> getWholeStockInfoList(String day);

	
	//5,20,60,120 일 평균 종가 계산
	List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList);
	
	//골든크로스 체크
	Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode);
	
	
}
