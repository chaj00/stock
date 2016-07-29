package technical.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import technical.dto.MovingAverageDTO;
import technical.dto.StockDInfoDTO;

@Repository("technicallogic")
public class TechnicalLogicImpl implements TechnicalLogic {

	@Override
	public List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList) {

		List<MovingAverageDTO> movingAvgList = new ArrayList<MovingAverageDTO>();

		int listSize = stockInfoList.size();
		for (int i = 0; i < listSize; i++) {
			// 5일 평균 종가 계산
			int fiveTotal = 0;
			int fiveAvg = 0;
			if (listSize - i >= 5) {
				for (int j = 0; j < 5; j++) {
					fiveTotal = fiveTotal + stockInfoList.get(i + j).getEndPrice();
				}
				fiveAvg = fiveTotal / 5;
			}

			// 20일 평균 종가 계산
			int twentyTotal = 0;
			int twentyAvg = 0;
			if (listSize - i >= 20) {
				for (int j = 0; j < 20; j++) {
					twentyTotal = twentyTotal + stockInfoList.get(i + j).getEndPrice();
				}
				twentyAvg = twentyTotal / 20;
			}

			// 60일 평균 종가 계산
			int sixtyTotal = 0;
			int sixtyAvg = 0;
			if (listSize - i >= 60) {
				for (int j = 0; j < 60; j++) {
					sixtyTotal = sixtyTotal + stockInfoList.get(i + j).getEndPrice();
				}
				sixtyAvg = sixtyTotal / 60;
			}
			
			
			// 120일 평균 종가 계산
			int oneTwentyTotal = 0;
			int oneTwentyAvg = 0;
			if (listSize - i >= 120) {
				for (int j = 0; j < 120; j++) {
					oneTwentyTotal = oneTwentyTotal + stockInfoList.get(i + j).getEndPrice();
				}
				oneTwentyAvg = oneTwentyTotal / 120;
			}

			String day = stockInfoList.get(i).getDay();
			int endPrice = stockInfoList.get(i).getEndPrice();
			MovingAverageDTO movingAvg = new MovingAverageDTO(day, endPrice, fiveAvg, twentyAvg, sixtyAvg,oneTwentyAvg);
			//MovingAverageDTO movingAvg = new MovingAverageDTO(day, endPrice, fiveAvg, twentyAvg, si,0);
			movingAvgList.add(movingAvg);

		}
		return movingAvgList;
	}

	@Override
	public Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode) {
		int count = 0;
		boolean result = false;
		if(mode.equals("20")){
			int nextFiveAvg = movingAvgList.get(3).getFiveAvg();
			int nextTwentyAvg = movingAvgList.get(3).getTwentyAvg();

			int preFiveAvg = movingAvgList.get(4).getFiveAvg();
			int preTwentyAvg = movingAvgList.get(4).getTwentyAvg();
			
			if (preFiveAvg <= preTwentyAvg & nextFiveAvg >= nextTwentyAvg) {
				for(int i=0; i<4 ;i++){
					int fiveAvg = movingAvgList.get(i).getFiveAvg();
					int twentyAvg = movingAvgList.get(i).getTwentyAvg();
					
					if(fiveAvg > twentyAvg){
						count = count + 1;
					}
							
				}
			}
			if (count > 3) {
				result = true;
			}
			//System.out.println("count: "+count);
		}else if(mode.equals("60")){
			
			int nextTwentyAvg = movingAvgList.get(3).getTwentyAvg();
			int nextSixtyAvg = movingAvgList.get(3).getSixtyAvg();

			
			int preTwentyAvg = movingAvgList.get(4).getTwentyAvg();
			int preSixtyAvg = movingAvgList.get(4).getSixtyAvg();
			//System.out.println(nextTwentyAvg+","+nextSixtyAvg);
			if ( preTwentyAvg <= preSixtyAvg &  nextTwentyAvg >= nextSixtyAvg ) {
				for(int i=0; i<4 ;i++){
					int sixtyAvg = movingAvgList.get(i).getSixtyAvg();
					int twentyAvg = movingAvgList.get(i).getTwentyAvg();
					
					if(twentyAvg > sixtyAvg ){
						count = count + 1;
					}
							
				}
			}
			if (count > 3) {
				result = true;
			}
		}
		
		return result;
	}

}
