package fundamental.logic;

import java.util.ArrayList;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;

public class LOGICImpl implements LOGIC{

	@Override
	public ArrayList<BpsDTO> bps(ArrayList<EnterpriseFinanceDTO> list) {
		EnterpriseFinanceDTO info = new EnterpriseFinanceDTO();
		ArrayList<BpsDTO> bpsEpsList = new ArrayList<BpsDTO>();
		EnterpriseTotalDTO entTotal = new EnterpriseTotalDTO(); 
		
		for(int i =0 ; i<list.size();i++){
		info = list.get(i);
			//각 기업의 자산 호출
			double asset_06y = info.getAsset_06y();
			double asset_07y = info.getAsset_07y();
			double asset_08y = info.getAsset_08y();
			double asset_09y = info.getAsset_09y();
			double asset_10y = info.getAsset_10y();
			double asset_11y = info.getAsset_11y();
			double asset_12y = info.getAsset_12y();
			double asset_13y = info.getAsset_13y();
			double asset_14y = info.getAsset_14y();
			double asset_15y = info.getAsset_15y();
			
			//`16~`19년 예상 자산을 구하기 위한 `12~`19년도 예상 자산 증가율 계산
			double asset_1213y_increaseRatio = asset_12y/asset_13y;
			double asset_1314y_increaseRatio = asset_13y/asset_14y;
			double asset_1415y_increaseRatio = asset_14y/asset_15y;
			//`16년도 이후 예상 자산 계산을 위한 가중치 부여 가장 최근 증가율부터 비율(3:2:1)
			double asset_1516y_increaseRatio = (((asset_1213y_increaseRatio*1)+
												 (asset_1314y_increaseRatio*2)+
											  	 (asset_1415y_increaseRatio*3))/6)/10;
			double asset_1617y_increaseRatio = (((asset_1314y_increaseRatio*1)+
											 	 (asset_1415y_increaseRatio*2)+
												 (asset_1516y_increaseRatio*3))/6)/10;
			double asset_1718y_increaseRatio = (((asset_1415y_increaseRatio*1)+
										     	 (asset_1516y_increaseRatio*2)+
											     (asset_1617y_increaseRatio*3))/6)/10;
			double asset_1819y_increaseRatio = (((asset_1516y_increaseRatio*1)+
										  	   	 (asset_1617y_increaseRatio*2)+
										  	   	 (asset_1718y_increaseRatio*3))/6)/10;
			
			//`16~`19년 예상 자산
			double asset_16y = (asset_1516y_increaseRatio*asset_15y)+asset_15y;
			double asset_17y = (asset_1617y_increaseRatio*asset_16y)+asset_16y;
			double asset_18y = (asset_1718y_increaseRatio*asset_17y)+asset_17y;
			double asset_19y = (asset_1819y_increaseRatio*asset_18y)+asset_18y;
			
			
			double capitalstock = entTotal.getTotalstock();
			//int weekCount = stockClose.getWeek();
			
			BpsDTO bps = new BpsDTO();
			//BPS 계산
			bps.setBps06y6((asset_06y/capitalstock)*6);
			bps.setBps06y9((asset_06y/capitalstock)*9);
			bps.setBps06y12((asset_06y/capitalstock)*12);
			bps.setBps06y16((asset_06y/capitalstock)*16);
			
			bps.setBps07y6((asset_07y/capitalstock)*6);
			bps.setBps07y9((asset_07y/capitalstock)*9);
			bps.setBps07y12((asset_07y/capitalstock)*12);
			bps.setBps07y16((asset_07y/capitalstock)*16);
			
			bps.setBps08y6((asset_08y/capitalstock)*6);
			bps.setBps08y9((asset_08y/capitalstock)*9);
			bps.setBps08y12((asset_08y/capitalstock)*12);
			bps.setBps08y16((asset_08y/capitalstock)*16);
			
			bps.setBps09y6((asset_09y/capitalstock)*6);
			bps.setBps09y9((asset_09y/capitalstock)*9);
			bps.setBps09y12((asset_09y/capitalstock)*12);
			bps.setBps09y16((asset_09y/capitalstock)*16);
			
			bps.setBps10y6((asset_10y/capitalstock)*6);
			bps.setBps10y9((asset_10y/capitalstock)*9);
			bps.setBps10y12((asset_10y/capitalstock)*12);
			bps.setBps10y16((asset_10y/capitalstock)*16);
			
			bps.setBps11y6((asset_11y/capitalstock)*6);
			bps.setBps11y9((asset_11y/capitalstock)*9);
			bps.setBps11y12((asset_11y/capitalstock)*12);
			bps.setBps11y16((asset_11y/capitalstock)*16);
			
			bps.setBps12y6((asset_12y/capitalstock)*6);
			bps.setBps12y9((asset_12y/capitalstock)*9);
			bps.setBps12y12((asset_12y/capitalstock)*12);
			bps.setBps12y16((asset_12y/capitalstock)*16);
			
			bps.setBps13y6((asset_13y/capitalstock)*6);
			bps.setBps13y9((asset_13y/capitalstock)*9);
			bps.setBps13y12((asset_13y/capitalstock)*12);
			bps.setBps13y16((asset_13y/capitalstock)*16);
			
			bps.setBps14y6((asset_14y/capitalstock)*6);
			bps.setBps14y9((asset_14y/capitalstock)*9);
			bps.setBps14y12((asset_14y/capitalstock)*12);
			bps.setBps14y16((asset_14y/capitalstock)*16);
			
			bps.setBps15y6((asset_15y/capitalstock)*6);
			bps.setBps15y9((asset_15y/capitalstock)*9);
			bps.setBps15y12((asset_15y/capitalstock)*12);
			bps.setBps15y16((asset_15y/capitalstock)*16);
			
			//16년, 17년, 18년, 19년도 예상 bps 계산 시작
			bps.setBps16y6((asset_16y/capitalstock)*6);
			bps.setBps16y9((asset_16y/capitalstock)*9);
			bps.setBps16y12((asset_16y/capitalstock)*12);
			bps.setBps16y16((asset_16y/capitalstock)*16);
			
			bps.setBps17y6((asset_17y/capitalstock)*6);
			bps.setBps17y9((asset_17y/capitalstock)*9);
			bps.setBps17y12((asset_17y/capitalstock)*12);
			bps.setBps17y16((asset_17y/capitalstock)*16);
			
			bps.setBps18y6((asset_18y/capitalstock)*6);
			bps.setBps18y9((asset_18y/capitalstock)*9);
			bps.setBps18y12((asset_18y/capitalstock)*12);
			bps.setBps18y16((asset_18y/capitalstock)*16);
			
			bps.setBps19y6((asset_19y/capitalstock)*6);
			bps.setBps19y9((asset_19y/capitalstock)*9);
			bps.setBps19y12((asset_19y/capitalstock)*12);
			bps.setBps19y16((asset_19y/capitalstock)*16);
			//16년, 17년, 18년, 19년도 예상 bps 계산 끝
			
			
			//PBR밴드 차트 데이터  `07,~`18-> (이전년도 자산)*(1+((다음년도 자산/이번년도 자산)^(1/(이번~다음년도 주(week)수)-1))
			bps.setPbr_07y((double)info.getAsset_06y()*(double)(1+(Math.pow((info.getAsset_08y()/info.getAsset_07y()),(1/53.0))-1)));
			bps.setPbr_08y((double)info.getAsset_07y()*(double)(1+(Math.pow((info.getAsset_09y()/info.getAsset_08y()),(1/53.0))-1)));
			bps.setPbr_09y((double)info.getAsset_08y()*(double)(1+(Math.pow((info.getAsset_10y()/info.getAsset_09y()),(1/53.0))-1)));
			bps.setPbr_10y((double)info.getAsset_09y()*(double)(1+(Math.pow((info.getAsset_11y()/info.getAsset_10y()),(1/53.0))-1)));
			bps.setPbr_11y((double)info.getAsset_10y()*(double)(1+(Math.pow((info.getAsset_12y()/info.getAsset_11y()),(1/53.0))-1)));
			bps.setPbr_12y((double)info.getAsset_11y()*(double)(1+(Math.pow((info.getAsset_13y()/info.getAsset_12y()),(1/53.0))-1)));
			bps.setPbr_13y((double)info.getAsset_12y()*(double)(1+(Math.pow((info.getAsset_14y()/info.getAsset_13y()),(1/53.0))-1)));
			bps.setPbr_14y((double)info.getAsset_13y()*(double)(1+(Math.pow((info.getAsset_15y()/info.getAsset_14y()),(1/53.0))-1)));
			bps.setPbr_15y((double)info.getAsset_14y()*(double)(1+(Math.pow((info.getAsset_16y()/info.getAsset_15y()),(1/53.0))-1)));
			bps.setPbr_16y((double)info.getAsset_15y()*(double)(1+(Math.pow((info.getAsset_17y()/info.getAsset_16y()),(1/53.0))-1)));
			bps.setPbr_17y((double)info.getAsset_16y()*(double)(1+(Math.pow((info.getAsset_18y()/info.getAsset_17y()),(1/53.0))-1)));
			bps.setPbr_18y((double)info.getAsset_17y()*(double)(1+(Math.pow((info.getAsset_19y()/info.getAsset_18y()),(1/53.0))-1)));
			
			bpsEpsList.add(bps);
		}
		return bpsEpsList;
	}
	
	@Override
	public ArrayList<EpsDTO> eps(ArrayList<EnterpriseFinanceDTO> list) {
		EnterpriseFinanceDTO info = new EnterpriseFinanceDTO();
		ArrayList<EpsDTO> bpsEpsList = new ArrayList<EpsDTO>();
		
		EpsDTO bpsEps = new EpsDTO();
		EnterpriseTotalDTO entTotal = new EnterpriseTotalDTO(); 
		
		
		bpsEpsList.add(bpsEps);
		return bpsEpsList;
	}

}
