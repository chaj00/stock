package fundamental.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;

@Repository("fundamentalmybatis")
public class FundamentalMybatisDAOImpl implements FundamentalDAO {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<EnterpriseTotalDTO> enterpriselist() {
		return sqlSession.selectList("stock.fundamental.enterpriseList");
	}

	@Override
	public StockCloseWDTO stockclose_w(String code) {
		return sqlSession.selectOne("stock.fundamental.stockClose", code);
	}

	@Override
	public EnterpriseFinanceDTO enterpriseinfo(String code) {
		return sqlSession.selectOne("stock.fundamental.enterpriseFinance", code);
	}
}
