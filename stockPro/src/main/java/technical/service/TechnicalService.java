package technical.service;

import java.util.List;

import technical.dto.StockDInfoDTO;

public interface TechnicalService {
	List<StockDInfoDTO> getStockCodeList();
	List<StockDInfoDTO> getStockInfoList(String code);
	List<StockDInfoDTO> getGoldencrossList();
	Boolean isGoldencross(List<StockDInfoDTO> stockInfoList);

}
