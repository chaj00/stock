package bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import bigdata.dao.BigdataDAO;
import bigdata.dto.BigdataDTO;
@Service
public class BigdataServiceImpl implements BigdataService{
	@Autowired
	@Qualifier("bigdatadao")
	BigdataDAO dao;
	@Override
	public List<BigdataDTO> getTopicnews() {
		
		return dao.getTopicnews();
	}
	@Override
	public List<BigdataDTO> getIndustrynews() {
		// TODO Auto-generated method stub
		return dao.getIndustrynews();
	}
	
}
