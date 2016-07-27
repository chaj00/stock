package technical.logic;

import java.util.List;

import org.springframework.stereotype.Repository;

import technical.dto.StockDInfoDTO;

@Repository("technicallogic")
public class TechnicalLogicImpl implements TechnicalLogic{

	@Override
	public List<StockDInfoDTO> getGoldencrossList(List<StockDInfoDTO> stockInfoList) {
		System.out.println(stockInfoList.size());
		
		return stockInfoList;
	}

}
