package technical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import technical.dao.TechnicalDAO;
import technical.dto.StockDInfoDTO;
import technical.logic.TechnicalLogic;

@Service
public class TechnicalServiceImpl implements TechnicalService{
	@Autowired
	@Qualifier("technicaldao")
	TechnicalDAO dao;
	@Qualifier("technicallogic")
	TechnicalLogic logic;
	
	
	@Override
	public List<StockDInfoDTO> getStockCodeList() {
		return dao.getStockCodeList();
	}

	@Override
	public List<StockDInfoDTO> getStockInfoList(String code) {
		return dao.getStockInfoList(code);
	}

	@Override
	public List<StockDInfoDTO> getGoldencrossList() {
		return null;
	}

	@Override
	public Boolean isGoldencross(List<StockDInfoDTO> stockInfoList) {
		return null;
	}

}
