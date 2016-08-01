package bigdata.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bigdata.dto.BigdataDTO;
@Repository("bigdatadao")
public class BigdataDAOImpl implements BigdataDAO{
	@Autowired
	SqlSession sqlsession;

	@Override
	public List<BigdataDTO> getTopicnews() {
		
		return sqlsession.selectList("stock.bigdata.topicnews");
		
	}

	@Override
	public List<BigdataDTO> getIndustrynews() {
		// TODO Auto-generated method stub
		return sqlsession.selectList("stock.bigdata.industrynews");
	}
	

}
