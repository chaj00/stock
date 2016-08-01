package fundamental.logic;

import org.springframework.stereotype.Repository;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EpsDTO;

@Repository("fundamentallogic")
public class LOGICImpl implements LOGIC {

	@Override
	public BpsDTO bps(EnterpriseFinanceDTO info, int totalStock, String code) {
		
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
			double asset_16y = info.getAsset_16y();
			double asset_17y = info.getAsset_17y();
			double asset_18y = info.getAsset_18y();
			double asset_19y = info.getAsset_19y();
			
			// `16~`19년 예상 자산을 구하기 위한 `12~`19년도 예상 자산 증가율 계산
			double asset_1213y_increaseRatio_notyet = (double) asset_12y / asset_13y;
			double asset_1314y_increaseRatio_notyet = (double) asset_13y / asset_14y;
			double asset_1415y_increaseRatio_notyet = (double) asset_14y / asset_15y;
			double asset_1213y_increaseRatio = Math.round(asset_1213y_increaseRatio_notyet * 10d) / 10d;
			double asset_1314y_increaseRatio = Math.round(asset_1314y_increaseRatio_notyet * 10d) / 10d;
			double asset_1415y_increaseRatio = Math.round(asset_1415y_increaseRatio_notyet * 10d) / 10d;

			System.out.println("asset_1415y_increaseRatio : " + asset_1415y_increaseRatio);

			// `16년도 이후 예상 자산 계산을 위한 가중치 부여 가장 최근 증가율부터 비율(3:2:1)
			double asset_1516y_increaseRatio_notyet = (((asset_1213y_increaseRatio * 1)
					+ (asset_1314y_increaseRatio * 2) + (asset_1415y_increaseRatio * 3)) / 6) / 10;
			double asset_1516y_increaseRatio = Math.round(asset_1516y_increaseRatio_notyet * 1000d) / 1000d;
			double asset_1617y_increaseRatio_notyet = (((asset_1314y_increaseRatio * 1)
					+ (asset_1415y_increaseRatio * 2) + (asset_1516y_increaseRatio * 3)) / 6) / 10;
			double asset_1617y_increaseRatio = Math.round(asset_1617y_increaseRatio_notyet * 1000d) / 1000d;
			double asset_1718y_increaseRatio_notyet = (((asset_1415y_increaseRatio * 1)
					+ (asset_1516y_increaseRatio * 2) + (asset_1617y_increaseRatio * 3)) / 6) / 10;
			double asset_1718y_increaseRatio = Math.round(asset_1718y_increaseRatio_notyet * 1000d) / 1000d;
			double asset_1819y_increaseRatio_notyet = (((asset_1516y_increaseRatio * 1)
					+ (asset_1617y_increaseRatio * 2) + (asset_1718y_increaseRatio * 3)) / 6) / 10;
			double asset_1819y_increaseRatio = Math.round(asset_1819y_increaseRatio_notyet * 1000d) / 1000d;
			System.out.println("asset_1516y_increaseRatio_notyet : " + asset_1516y_increaseRatio_notyet);
			System.out.println("asset_1617y_increaseRatio_notyet : " + asset_1617y_increaseRatio_notyet);
			System.out.println("asset_1718y_increaseRatio_notyet : " + asset_1718y_increaseRatio_notyet);
			System.out.println("asset_1819y_increaseRatio_notyet : " + asset_1819y_increaseRatio_notyet);
			System.out.println(
					"asset_1516y_increaseRatio : " + Math.round(asset_1516y_increaseRatio_notyet * 1000d) / 1000d);
			System.out.println(
					"asset_1617y_increaseRatio : " + Math.round(asset_1617y_increaseRatio_notyet * 1000d) / 1000d);
			System.out.println(
					"asset_1718y_increaseRatio : " + Math.round(asset_1718y_increaseRatio_notyet * 1000d) / 1000d);
			System.out.println(
					"asset_1819y_increaseRatio : " + Math.round(asset_1819y_increaseRatio_notyet * 1000d) / 1000d);

			// `16~`19년 예상 자산
			double asset_16y_notyet = (asset_1516y_increaseRatio * asset_15y) + asset_15y;
			double asset_17y_notyet = (asset_1617y_increaseRatio * asset_16y_notyet) + asset_16y_notyet;
			double asset_18y_notyet = (asset_1718y_increaseRatio * asset_17y_notyet) + asset_17y_notyet;
			double asset_19y_notyet = (asset_1819y_increaseRatio * asset_18y_notyet) + asset_18y_notyet;

			// `16~`19년 예상 자산 소수점 둘째자리에서 반올림
			asset_16y = Math.round(asset_16y_notyet * 1d) / 1d;
			asset_17y = Math.round(asset_17y_notyet * 1d) / 1d;
			asset_18y = Math.round(asset_18y_notyet * 1d) / 1d;
			asset_19y = Math.round(asset_19y_notyet * 1d) / 1d;
			
			System.out.println("info.getCode()"+info.getCode());
			
			System.out.println("asset_13y : " + asset_13y);
			System.out.println("asset_14y : " + asset_14y);
			System.out.println("asset_15y : " + asset_15y);
			System.out.println("asset_16y : " + asset_16y);
			System.out.println("asset_17y : " + asset_17y);
			System.out.println("asset_18y : " + asset_18y);
			System.out.println("asset_19y : " + asset_19y);
			System.out.println("asset_1819y_increaseRatio : " + asset_1819y_increaseRatio);

			// int weekCount = stockClose.getWeek();
			BpsDTO bps = new BpsDTO();
			int billion = 100000000;
			
			// BPS 계산
//			bps.setBps06y(1000);

			bps.setBps06y((int)(Math.round((asset_06y * billion / totalStock) * 1d) / 1d));
			System.out.println("asset_06y : "+asset_06y);
			System.out.println("billion : "+billion );
			System.out.println("totalStock : "+totalStock);
//			bps.setBps06y((int)(((int)asset_06y * (int)billion / (int)totalStock)));
			
			if(info.getAsset_06y()==0){
				bps.setBps06y(0);
				bps.setBps06y2(0);
				bps.setBps06y3(0);
				bps.setBps06y4(0);
				
			}else if (info.getAsset_06y()!=0){
				bps.setBps06y((int)(Math.round((asset_06y * billion / totalStock) * 1d) / 1d));
				bps.setBps06y2((int)(Math.round(((asset_06y * billion / totalStock) * 2) * 1d) / 1d));
				bps.setBps06y3((int)(Math.round(((asset_06y * billion / totalStock) * 3) * 1d) / 1d));
				bps.setBps06y4((int)(Math.round(((asset_06y * billion / totalStock) * 4) * 1d) / 1d));
			}
			
			bps.setBps07y((int)(Math.round((asset_07y * billion / totalStock) * 1d) / 1d));
			bps.setBps07y2((int)(Math.round(((asset_07y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps07y3((int)(Math.round(((asset_07y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps07y4((int)(Math.round(((asset_07y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps08y((int)(Math.round((asset_08y * billion / totalStock) * 1d) / 1d));
			bps.setBps08y2((int)(Math.round(((asset_08y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps08y3((int)(Math.round(((asset_08y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps08y4((int)(Math.round(((asset_08y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps09y((int)(Math.round((asset_09y * billion / totalStock) * 1d) / 1d));
			bps.setBps09y2((int)(Math.round(((asset_09y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps09y3((int)(Math.round(((asset_09y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps09y4((int)(Math.round(((asset_09y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps10y((int)(Math.round((asset_10y * billion / totalStock) * 1d) / 1d));
			bps.setBps10y2((int)(Math.round(((asset_10y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps10y3((int)(Math.round(((asset_10y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps10y4((int)(Math.round(((asset_10y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps11y((int)(Math.round((asset_11y * billion / totalStock) * 1d) / 1d));
			bps.setBps11y2((int)(Math.round(((asset_11y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps11y3((int)(Math.round(((asset_11y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps11y4((int)(Math.round(((asset_11y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps12y((int)(Math.round((asset_12y * billion / totalStock) * 1d) / 1d));
			bps.setBps12y2((int)(Math.round(((asset_12y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps12y3((int)(Math.round(((asset_12y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps12y4((int)(Math.round(((asset_12y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps13y((int)(Math.round((asset_13y * billion / totalStock) * 1d) / 1d));
			bps.setBps13y2((int)(Math.round(((asset_13y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps13y3((int)(Math.round(((asset_13y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps13y4((int)(Math.round(((asset_13y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps14y((int)(Math.round((asset_14y * billion / totalStock) * 1d) / 1d));
			bps.setBps14y2((int)(Math.round(((asset_14y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps14y3((int)(Math.round(((asset_14y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps14y4((int)(Math.round(((asset_14y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps15y((int)(Math.round((asset_15y * billion / totalStock) * 1d) / 1d));
			bps.setBps15y2((int)(Math.round(((asset_15y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps15y3((int)(Math.round(((asset_15y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps15y4((int)(Math.round(((asset_15y * billion / totalStock) * 4) * 1d) / 1d));

			// 16년, 17년, 18년, 19년도 예상 bps 계산 시작
			bps.setBps16y((int)(Math.round((asset_16y * billion / totalStock) * 1d) / 1d));
			bps.setBps16y2((int)(Math.round(((asset_16y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps16y3((int)(Math.round(((asset_16y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps16y4((int)(Math.round(((asset_16y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps17y((int)(Math.round((asset_17y * billion / totalStock) * 1d) / 1d));
			bps.setBps17y2((int)(Math.round(((asset_17y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps17y3((int)(Math.round(((asset_17y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps17y4((int)(Math.round(((asset_17y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps18y((int)(Math.round((asset_18y * billion / totalStock) * 1d) / 1d));
			bps.setBps18y2((int)(Math.round(((asset_18y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps18y3((int)(Math.round(((asset_18y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps18y4((int)(Math.round(((asset_18y * billion / totalStock) * 4) * 1d) / 1d));

			bps.setBps19y((int)(Math.round((asset_19y * billion / totalStock) * 1d) / 1d));
			bps.setBps19y2((int)(Math.round(((asset_19y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps19y3((int)(Math.round(((asset_19y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps19y4((int)(Math.round(((asset_19y * billion / totalStock) * 4) * 1d) / 1d));
			// 16년, 17년, 18년, 19년도 예상 bps 계산 끝
			System.out.println("bps logic1");
			System.out.println("totalstock : " + totalStock);
			System.out.println("(int)(Math.round((asset_14y/totalStock)*billion*1d) / 1d) : "
					+ (int)(Math.round(((asset_14y / totalStock) * billion) * 1d) / 1d));
			System.out.println("(int)Math.round((asset_15y/totalStock)*billion*1d) / 1d) : "
					+ (int)(Math.round(((asset_15y / totalStock) * billion) * 1d) / 1d));
			System.out.println("(int)Math.round((asset_16y/totalStock)*billion*1d) / 1d) : "
					+ (int)(Math.round((asset_16y * billion / totalStock) * 1d) / 1d));
			System.out.println("(int)Math.round((asset_17y/totalStock)*billion*1d) / 1d) : "
					+ (int)(Math.round((asset_17y * billion / totalStock) * 1d) / 1d));
			
			System.out.println("Math.round((asset_14y/totalStock)*billion*1d) / 1d) : "
					+ Math.round(((asset_14y / totalStock) * billion) * 1d) / 1d);
			System.out.println("Math.round((asset_15y/totalStock)*billion*1d) / 1d) : "
					+ Math.round(((asset_15y / totalStock) * billion) * 1d) / 1d);
			System.out.println("Math.round((asset_16y/totalStock)*billion*1d) / 1d) : "
					+ Math.round((asset_16y * billion / totalStock) * 1d) / 1d);
			System.out.println("Math.round((asset_17y/totalStock)*billion*1d) / 1d) : "
					+ Math.round((asset_17y * billion / totalStock) * 1d) / 1d);
			
			System.out.println("LOGICIMPL - bps.bps07y : " + bps.getBps07y());
			
			
		return bps;
	}


	@Override
	public EpsDTO eps(EnterpriseFinanceDTO info, int totalStock, String code) {
		EnterpriseFinanceDTO finance = new EnterpriseFinanceDTO();
		EpsDTO eps = new EpsDTO();

		
//			BpsDTO bps = new BpsDTO();
//			epsList.add(bps);
		return eps;
	}

}
