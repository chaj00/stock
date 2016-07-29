package technical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import technical.dao.TechnicalDAO;
import technical.dto.MovingAverageDTO;
import technical.dto.StockDInfoDTO;
import technical.logic.TechnicalLogic;

@Service
public class TechnicalServiceImpl implements TechnicalService{
	@Autowired
	@Qualifier("technicaldao")
	TechnicalDAO dao;
	
	@Autowired
	@Qualifier("technicallogic")
	TechnicalLogic logic;
	
	
	@Override
	public List<String> getStockCodeList() {
		return dao.getStockCodeList();
	}

	@Override
	public List<StockDInfoDTO> getStockInfoList(String code) {
		return dao.getStockInfoList(code);
	}
	
	@Override
	public List<StockDInfoDTO> getWholeStockInfoList(String day) {
		return dao.getWholeStockInfoList(day);
	}

	@Override
	public List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList) {
		return logic.getMovingAvgList(stockInfoList);
	}

	@Override
	public Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode) {
		return logic.isGoldencross(movingAvgList,mode);
	}

	

}
