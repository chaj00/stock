package bigdata.service;

import java.util.List;

import bigdata.dto.BigdataDTO;

public interface BigdataService {
	List<BigdataDTO> getTopicnews(String ndate);
	List<BigdataDTO> getIndustrynews(String ndate);
}
