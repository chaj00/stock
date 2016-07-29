package technical.logic;

import java.util.List;

import technical.dto.MovingAverageDTO;
import technical.dto.StockDInfoDTO;

public interface TechnicalLogic {
	
	List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList);
	
	Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode);

}
