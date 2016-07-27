package technical.dao;

import java.util.List;

import technical.dto.StockDInfoDTO;

public interface TechnicalDAO {
	List<StockDInfoDTO> getStockCodeList();
	List<StockDInfoDTO> getStockInfoList(String code);

}
