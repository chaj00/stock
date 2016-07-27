package technical.logic;

import java.util.List;

import technical.dto.StockDInfoDTO;

public interface TechnicalLogic {
	List<StockDInfoDTO> getGoldencrossList(List<StockDInfoDTO> stockInfoList);

}
