package fundamental.dto;

public class BpsDTO {
	//BPS = 전분기 * (1+((다음분기/이번분기)^(1/(이번~다음분기일수)-1))
	int yearCount; //매년 주(week) 갯수 카운트
	String code;
	
	//매년BPS, 6 9 12 16배
	int bps06y;
	int bps06y2; //BPS
	int bps06y3; //BPS
	int bps06y4; //BPS

	int bps07y; //BPS
	int bps07y2; //BPS
	int bps07y3; //BPS
	int bps07y4; //BPS
	
	int bps08y; //BPS
	int bps08y2; //BPS
	int bps08y3; //BPS
	int bps08y4; //BPS
	
	int bps09y; //BPS
	int bps09y2; //BPS
	int bps09y3; //BPS
	int bps09y4; //BPS
	
	int bps10y; //BPS
	int bps10y2; //BPS
	int bps10y3; //BPS
	int bps10y4; //BPS
	
	int bps11y; //BPS
	int bps11y2; //BPS
	int bps11y3; //BPS
	int bps11y4; //BPS
	
	int bps12y; //BPS
	int bps12y2; //BPS
	int bps12y3; //BPS
	int bps12y4; //BPS
	
	int bps13y; //BPS
	int bps13y2; //BPS
	int bps13y3; //BPS
	int bps13y4; //BPS
	
	int bps14y; //BPS
	int bps14y2; //BPS
	int bps14y3; //BPS
	int bps14y4; //BPS
	
	int bps15y; //BPS
	int bps15y2; //BPS
	int bps15y3; //BPS
	int bps15y4; //BPS
	
	int bps16y; //BPS
	int bps16y2; //BPS
	int bps16y3; //BPS
	int bps16y4; //BPS
	
	int bps17y; //BPS
	int bps17y2; //BPS
	int bps17y3; //BPS
	int bps17y4; //BPS
	
	int bps18y; //BPS
	int bps18y2; //BPS
	int bps18y3; //BPS
	int bps18y4; //BPS
	
	int bps19y; //BPS
	int bps19y2; //BPS
	int bps19y3; //BPS
	int bps19y4; //BPS
	
	//pbrband차트 데이터(`07~`16)
	int pbr_07y;
	int pbr_08y;
	int pbr_09y;
	int pbr_10y;
	int pbr_11y;
	int pbr_12y;
	int pbr_13y;
	int pbr_14y;
	int pbr_15y;
	int pbr_16y;
	int pbr_17y;
	int pbr_18y;
	int pbr_19y;
	
	//perband차트 데이터(`07~`16)
	int per_07y;
	int per_08y;
	int per_09y;
	int per_10y;
	int per_11y;
	int per_12y;
	int per_13y;
	int per_14y;
	int per_15y;
	int per_16y;
	int per_17y;
	int per_18y;
	int per_19y;
	
	
	public BpsDTO(){
		
	}


	public BpsDTO(int yearCount, String code, int bps06y, int bps06y2, int bps06y3, int bps06y4,
			int bps07y, int bps07y2, int bps07y3, int bps07y4, int bps08y, int bps08y2,
			int bps08y3, int bps08y4, int bps09y, int bps09y2, int bps09y3, int bps09y4,
			int bps10y, int bps10y2, int bps10y3, int bps10y4, int bps11y, int bps11y2,
			int bps11y3, int bps11y4, int bps12y, int bps12y2, int bps12y3, int bps12y4,
			int bps13y, int bps13y2, int bps13y3, int bps13y4, int bps14y, int bps14y2,
			int bps14y3, int bps14y4, int bps15y, int bps15y2, int bps15y3, int bps15y4,
			int bps16y, int bps16y2, int bps16y3, int bps16y4, int bps17y, int bps17y2,
			int bps17y3, int bps17y4, int bps18y, int bps18y2, int bps18y3, int bps18y4,
			int bps19y, int bps19y2, int bps19y3, int bps19y4, int pbr_07y, int pbr_08y,
			int pbr_09y, int pbr_10y, int pbr_11y, int pbr_12y, int pbr_13y, int pbr_14y,
			int pbr_15y, int pbr_16y, int pbr_17y, int pbr_18y, int pbr_19y, int per_07y,
			int per_08y, int per_09y, int per_10y, int per_11y, int per_12y, int per_13y,
			int per_14y, int per_15y, int per_16y, int per_17y, int per_18y, int per_19y) {
		super();
		this.yearCount = yearCount;
		this.code = code;
		this.bps06y = bps06y;
		this.bps06y2 = bps06y2;
		this.bps06y3 = bps06y3;
		this.bps06y4 = bps06y4;
		this.bps07y = bps07y;
		this.bps07y2 = bps07y2;
		this.bps07y3 = bps07y3;
		this.bps07y4 = bps07y4;
		this.bps08y = bps08y;
		this.bps08y2 = bps08y2;
		this.bps08y3 = bps08y3;
		this.bps08y4 = bps08y4;
		this.bps09y = bps09y;
		this.bps09y2 = bps09y2;
		this.bps09y3 = bps09y3;
		this.bps09y4 = bps09y4;
		this.bps10y = bps10y;
		this.bps10y2 = bps10y2;
		this.bps10y3 = bps10y3;
		this.bps10y4 = bps10y4;
		this.bps11y = bps11y;
		this.bps11y2 = bps11y2;
		this.bps11y3 = bps11y3;
		this.bps11y4 = bps11y4;
		this.bps12y = bps12y;
		this.bps12y2 = bps12y2;
		this.bps12y3 = bps12y3;
		this.bps12y4 = bps12y4;
		this.bps13y = bps13y;
		this.bps13y2 = bps13y2;
		this.bps13y3 = bps13y3;
		this.bps13y4 = bps13y4;
		this.bps14y = bps14y;
		this.bps14y2 = bps14y2;
		this.bps14y3 = bps14y3;
		this.bps14y4 = bps14y4;
		this.bps15y = bps15y;
		this.bps15y2 = bps15y2;
		this.bps15y3 = bps15y3;
		this.bps15y4 = bps15y4;
		this.bps16y = bps16y;
		this.bps16y2 = bps16y2;
		this.bps16y3 = bps16y3;
		this.bps16y4 = bps16y4;
		this.bps17y = bps17y;
		this.bps17y2 = bps17y2;
		this.bps17y3 = bps17y3;
		this.bps17y4 = bps17y4;
		this.bps18y = bps18y;
		this.bps18y2 = bps18y2;
		this.bps18y3 = bps18y3;
		this.bps18y4 = bps18y4;
		this.bps19y = bps19y;
		this.bps19y2 = bps19y2;
		this.bps19y3 = bps19y3;
		this.bps19y4 = bps19y4;
		this.pbr_07y = pbr_07y;
		this.pbr_08y = pbr_08y;
		this.pbr_09y = pbr_09y;
		this.pbr_10y = pbr_10y;
		this.pbr_11y = pbr_11y;
		this.pbr_12y = pbr_12y;
		this.pbr_13y = pbr_13y;
		this.pbr_14y = pbr_14y;
		this.pbr_15y = pbr_15y;
		this.pbr_16y = pbr_16y;
		this.pbr_17y = pbr_17y;
		this.pbr_18y = pbr_18y;
		this.pbr_19y = pbr_19y;
		this.per_07y = per_07y;
		this.per_08y = per_08y;
		this.per_09y = per_09y;
		this.per_10y = per_10y;
		this.per_11y = per_11y;
		this.per_12y = per_12y;
		this.per_13y = per_13y;
		this.per_14y = per_14y;
		this.per_15y = per_15y;
		this.per_16y = per_16y;
		this.per_17y = per_17y;
		this.per_18y = per_18y;
		this.per_19y = per_19y;
	}


	@Override
	public String toString() {
		return "BpsDTO [yearCount=" + yearCount + ", code=" + code + ", bps06y=" + bps06y + ", bps06y2=" + bps06y2
				+ ", bps06y3=" + bps06y3 + ", bps06y4=" + bps06y4 + ", bps07y=" + bps07y + ", bps07y2=" + bps07y2
				+ ", bps07y3=" + bps07y3 + ", bps07y4=" + bps07y4 + ", bps08y=" + bps08y + ", bps08y2=" + bps08y2
				+ ", bps08y3=" + bps08y3 + ", bps08y4=" + bps08y4 + ", bps09y=" + bps09y + ", bps09y2=" + bps09y2
				+ ", bps09y3=" + bps09y3 + ", bps09y4=" + bps09y4 + ", bps10y=" + bps10y + ", bps10y2=" + bps10y2
				+ ", bps10y3=" + bps10y3 + ", bps10y4=" + bps10y4 + ", bps11y=" + bps11y + ", bps11y2=" + bps11y2
				+ ", bps11y3=" + bps11y3 + ", bps11y4=" + bps11y4 + ", bps12y=" + bps12y + ", bps12y2=" + bps12y2
				+ ", bps12y3=" + bps12y3 + ", bps12y4=" + bps12y4 + ", bps13y=" + bps13y + ", bps13y2=" + bps13y2
				+ ", bps13y3=" + bps13y3 + ", bps13y4=" + bps13y4 + ", bps14y=" + bps14y + ", bps14y2=" + bps14y2
				+ ", bps14y3=" + bps14y3 + ", bps14y4=" + bps14y4 + ", bps15y=" + bps15y + ", bps15y2=" + bps15y2
				+ ", bps15y3=" + bps15y3 + ", bps15y4=" + bps15y4 + ", bps16y=" + bps16y + ", bps16y2=" + bps16y2
				+ ", bps16y3=" + bps16y3 + ", bps16y4=" + bps16y4 + ", bps17y=" + bps17y + ", bps17y2=" + bps17y2
				+ ", bps17y3=" + bps17y3 + ", bps17y4=" + bps17y4 + ", bps18y=" + bps18y + ", bps18y2=" + bps18y2
				+ ", bps18y3=" + bps18y3 + ", bps18y4=" + bps18y4 + ", bps19y=" + bps19y + ", bps19y2=" + bps19y2
				+ ", bps19y3=" + bps19y3 + ", bps19y4=" + bps19y4 + ", pbr_07y=" + pbr_07y + ", pbr_08y=" + pbr_08y
				+ ", pbr_09y=" + pbr_09y + ", pbr_10y=" + pbr_10y + ", pbr_11y=" + pbr_11y + ", pbr_12y=" + pbr_12y
				+ ", pbr_13y=" + pbr_13y + ", pbr_14y=" + pbr_14y + ", pbr_15y=" + pbr_15y + ", pbr_16y=" + pbr_16y
				+ ", pbr_17y=" + pbr_17y + ", pbr_18y=" + pbr_18y + ", pbr_19y=" + pbr_19y + ", per_07y=" + per_07y
				+ ", per_08y=" + per_08y + ", per_09y=" + per_09y + ", per_10y=" + per_10y + ", per_11y=" + per_11y
				+ ", per_12y=" + per_12y + ", per_13y=" + per_13y + ", per_14y=" + per_14y + ", per_15y=" + per_15y
				+ ", per_16y=" + per_16y + ", per_17y=" + per_17y + ", per_18y=" + per_18y + ", per_19y=" + per_19y
				+ "]";
	}


	public int getYearCount() {
		return yearCount;
	}


	public void setYearCount(int yearCount) {
		this.yearCount = yearCount;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public int getBps06y() {
		return bps06y;
	}


	public void setBps06y(int bps06y) {
		this.bps06y = bps06y;
	}


	public int getBps06y2() {
		return bps06y2;
	}


	public void setBps06y2(int bps06y2) {
		this.bps06y2 = bps06y2;
	}


	public int getBps06y3() {
		return bps06y3;
	}


	public void setBps06y3(int bps06y3) {
		this.bps06y3 = bps06y3;
	}


	public int getBps06y4() {
		return bps06y4;
	}


	public void setBps06y4(int bps06y4) {
		this.bps06y4 = bps06y4;
	}


	public int getBps07y() {
		return bps07y;
	}


	public void setBps07y(int bps07y) {
		this.bps07y = bps07y;
	}


	public int getBps07y2() {
		return bps07y2;
	}


	public void setBps07y2(int bps07y2) {
		this.bps07y2 = bps07y2;
	}


	public int getBps07y3() {
		return bps07y3;
	}


	public void setBps07y3(int bps07y3) {
		this.bps07y3 = bps07y3;
	}


	public int getBps07y4() {
		return bps07y4;
	}


	public void setBps07y4(int bps07y4) {
		this.bps07y4 = bps07y4;
	}


	public int getBps08y() {
		return bps08y;
	}


	public void setBps08y(int bps08y) {
		this.bps08y = bps08y;
	}


	public int getBps08y2() {
		return bps08y2;
	}


	public void setBps08y2(int bps08y2) {
		this.bps08y2 = bps08y2;
	}


	public int getBps08y3() {
		return bps08y3;
	}


	public void setBps08y3(int bps08y3) {
		this.bps08y3 = bps08y3;
	}


	public int getBps08y4() {
		return bps08y4;
	}


	public void setBps08y4(int bps08y4) {
		this.bps08y4 = bps08y4;
	}


	public int getBps09y() {
		return bps09y;
	}


	public void setBps09y(int bps09y) {
		this.bps09y = bps09y;
	}


	public int getBps09y2() {
		return bps09y2;
	}


	public void setBps09y2(int bps09y2) {
		this.bps09y2 = bps09y2;
	}


	public int getBps09y3() {
		return bps09y3;
	}


	public void setBps09y3(int bps09y3) {
		this.bps09y3 = bps09y3;
	}


	public int getBps09y4() {
		return bps09y4;
	}


	public void setBps09y4(int bps09y4) {
		this.bps09y4 = bps09y4;
	}


	public int getBps10y() {
		return bps10y;
	}


	public void setBps10y(int bps10y) {
		this.bps10y = bps10y;
	}


	public int getBps10y2() {
		return bps10y2;
	}


	public void setBps10y2(int bps10y2) {
		this.bps10y2 = bps10y2;
	}


	public int getBps10y3() {
		return bps10y3;
	}


	public void setBps10y3(int bps10y3) {
		this.bps10y3 = bps10y3;
	}


	public int getBps10y4() {
		return bps10y4;
	}


	public void setBps10y4(int bps10y4) {
		this.bps10y4 = bps10y4;
	}


	public int getBps11y() {
		return bps11y;
	}


	public void setBps11y(int bps11y) {
		this.bps11y = bps11y;
	}


	public int getBps11y2() {
		return bps11y2;
	}


	public void setBps11y2(int bps11y2) {
		this.bps11y2 = bps11y2;
	}


	public int getBps11y3() {
		return bps11y3;
	}


	public void setBps11y3(int bps11y3) {
		this.bps11y3 = bps11y3;
	}


	public int getBps11y4() {
		return bps11y4;
	}


	public void setBps11y4(int bps11y4) {
		this.bps11y4 = bps11y4;
	}


	public int getBps12y() {
		return bps12y;
	}


	public void setBps12y(int bps12y) {
		this.bps12y = bps12y;
	}


	public int getBps12y2() {
		return bps12y2;
	}


	public void setBps12y2(int bps12y2) {
		this.bps12y2 = bps12y2;
	}


	public int getBps12y3() {
		return bps12y3;
	}


	public void setBps12y3(int bps12y3) {
		this.bps12y3 = bps12y3;
	}


	public int getBps12y4() {
		return bps12y4;
	}


	public void setBps12y4(int bps12y4) {
		this.bps12y4 = bps12y4;
	}


	public int getBps13y() {
		return bps13y;
	}


	public void setBps13y(int bps13y) {
		this.bps13y = bps13y;
	}


	public int getBps13y2() {
		return bps13y2;
	}


	public void setBps13y2(int bps13y2) {
		this.bps13y2 = bps13y2;
	}


	public int getBps13y3() {
		return bps13y3;
	}


	public void setBps13y3(int bps13y3) {
		this.bps13y3 = bps13y3;
	}


	public int getBps13y4() {
		return bps13y4;
	}


	public void setBps13y4(int bps13y4) {
		this.bps13y4 = bps13y4;
	}


	public int getBps14y() {
		return bps14y;
	}


	public void setBps14y(int bps14y) {
		this.bps14y = bps14y;
	}


	public int getBps14y2() {
		return bps14y2;
	}


	public void setBps14y2(int bps14y2) {
		this.bps14y2 = bps14y2;
	}


	public int getBps14y3() {
		return bps14y3;
	}


	public void setBps14y3(int bps14y3) {
		this.bps14y3 = bps14y3;
	}


	public int getBps14y4() {
		return bps14y4;
	}


	public void setBps14y4(int bps14y4) {
		this.bps14y4 = bps14y4;
	}


	public int getBps15y() {
		return bps15y;
	}


	public void setBps15y(int bps15y) {
		this.bps15y = bps15y;
	}


	public int getBps15y2() {
		return bps15y2;
	}


	public void setBps15y2(int bps15y2) {
		this.bps15y2 = bps15y2;
	}


	public int getBps15y3() {
		return bps15y3;
	}


	public void setBps15y3(int bps15y3) {
		this.bps15y3 = bps15y3;
	}


	public int getBps15y4() {
		return bps15y4;
	}


	public void setBps15y4(int bps15y4) {
		this.bps15y4 = bps15y4;
	}


	public int getBps16y() {
		return bps16y;
	}


	public void setBps16y(int bps16y) {
		this.bps16y = bps16y;
	}


	public int getBps16y2() {
		return bps16y2;
	}


	public void setBps16y2(int bps16y2) {
		this.bps16y2 = bps16y2;
	}


	public int getBps16y3() {
		return bps16y3;
	}


	public void setBps16y3(int bps16y3) {
		this.bps16y3 = bps16y3;
	}


	public int getBps16y4() {
		return bps16y4;
	}


	public void setBps16y4(int bps16y4) {
		this.bps16y4 = bps16y4;
	}


	public int getBps17y() {
		return bps17y;
	}


	public void setBps17y(int bps17y) {
		this.bps17y = bps17y;
	}


	public int getBps17y2() {
		return bps17y2;
	}


	public void setBps17y2(int bps17y2) {
		this.bps17y2 = bps17y2;
	}


	public int getBps17y3() {
		return bps17y3;
	}


	public void setBps17y3(int bps17y3) {
		this.bps17y3 = bps17y3;
	}


	public int getBps17y4() {
		return bps17y4;
	}


	public void setBps17y4(int bps17y4) {
		this.bps17y4 = bps17y4;
	}


	public int getBps18y() {
		return bps18y;
	}


	public void setBps18y(int bps18y) {
		this.bps18y = bps18y;
	}


	public int getBps18y2() {
		return bps18y2;
	}


	public void setBps18y2(int bps18y2) {
		this.bps18y2 = bps18y2;
	}


	public int getBps18y3() {
		return bps18y3;
	}


	public void setBps18y3(int bps18y3) {
		this.bps18y3 = bps18y3;
	}


	public int getBps18y4() {
		return bps18y4;
	}


	public void setBps18y4(int bps18y4) {
		this.bps18y4 = bps18y4;
	}


	public int getBps19y() {
		return bps19y;
	}


	public void setBps19y(int bps19y) {
		this.bps19y = bps19y;
	}


	public int getBps19y2() {
		return bps19y2;
	}


	public void setBps19y2(int bps19y2) {
		this.bps19y2 = bps19y2;
	}


	public int getBps19y3() {
		return bps19y3;
	}


	public void setBps19y3(int bps19y3) {
		this.bps19y3 = bps19y3;
	}


	public int getBps19y4() {
		return bps19y4;
	}


	public void setBps19y4(int bps19y4) {
		this.bps19y4 = bps19y4;
	}


	public int getPbr_07y() {
		return pbr_07y;
	}


	public void setPbr_07y(int pbr_07y) {
		this.pbr_07y = pbr_07y;
	}


	public int getPbr_08y() {
		return pbr_08y;
	}


	public void setPbr_08y(int pbr_08y) {
		this.pbr_08y = pbr_08y;
	}


	public int getPbr_09y() {
		return pbr_09y;
	}


	public void setPbr_09y(int pbr_09y) {
		this.pbr_09y = pbr_09y;
	}


	public int getPbr_10y() {
		return pbr_10y;
	}


	public void setPbr_10y(int pbr_10y) {
		this.pbr_10y = pbr_10y;
	}


	public int getPbr_11y() {
		return pbr_11y;
	}


	public void setPbr_11y(int pbr_11y) {
		this.pbr_11y = pbr_11y;
	}


	public int getPbr_12y() {
		return pbr_12y;
	}


	public void setPbr_12y(int pbr_12y) {
		this.pbr_12y = pbr_12y;
	}


	public int getPbr_13y() {
		return pbr_13y;
	}


	public void setPbr_13y(int pbr_13y) {
		this.pbr_13y = pbr_13y;
	}


	public int getPbr_14y() {
		return pbr_14y;
	}


	public void setPbr_14y(int pbr_14y) {
		this.pbr_14y = pbr_14y;
	}


	public int getPbr_15y() {
		return pbr_15y;
	}


	public void setPbr_15y(int pbr_15y) {
		this.pbr_15y = pbr_15y;
	}


	public int getPbr_16y() {
		return pbr_16y;
	}


	public void setPbr_16y(int pbr_16y) {
		this.pbr_16y = pbr_16y;
	}


	public int getPbr_17y() {
		return pbr_17y;
	}


	public void setPbr_17y(int pbr_17y) {
		this.pbr_17y = pbr_17y;
	}


	public int getPbr_18y() {
		return pbr_18y;
	}


	public void setPbr_18y(int pbr_18y) {
		this.pbr_18y = pbr_18y;
	}


	public int getPbr_19y() {
		return pbr_19y;
	}


	public void setPbr_19y(int pbr_19y) {
		this.pbr_19y = pbr_19y;
	}


	public int getPer_07y() {
		return per_07y;
	}


	public void setPer_07y(int per_07y) {
		this.per_07y = per_07y;
	}


	public int getPer_08y() {
		return per_08y;
	}


	public void setPer_08y(int per_08y) {
		this.per_08y = per_08y;
	}


	public int getPer_09y() {
		return per_09y;
	}


	public void setPer_09y(int per_09y) {
		this.per_09y = per_09y;
	}


	public int getPer_10y() {
		return per_10y;
	}


	public void setPer_10y(int per_10y) {
		this.per_10y = per_10y;
	}


	public int getPer_11y() {
		return per_11y;
	}


	public void setPer_11y(int per_11y) {
		this.per_11y = per_11y;
	}


	public int getPer_12y() {
		return per_12y;
	}


	public void setPer_12y(int per_12y) {
		this.per_12y = per_12y;
	}


	public int getPer_13y() {
		return per_13y;
	}


	public void setPer_13y(int per_13y) {
		this.per_13y = per_13y;
	}


	public int getPer_14y() {
		return per_14y;
	}


	public void setPer_14y(int per_14y) {
		this.per_14y = per_14y;
	}


	public int getPer_15y() {
		return per_15y;
	}


	public void setPer_15y(int per_15y) {
		this.per_15y = per_15y;
	}


	public int getPer_16y() {
		return per_16y;
	}


	public void setPer_16y(int per_16y) {
		this.per_16y = per_16y;
	}


	public int getPer_17y() {
		return per_17y;
	}


	public void setPer_17y(int per_17y) {
		this.per_17y = per_17y;
	}


	public int getPer_18y() {
		return per_18y;
	}


	public void setPer_18y(int per_18y) {
		this.per_18y = per_18y;
	}


	public int getPer_19y() {
		return per_19y;
	}


	public void setPer_19y(int per_19y) {
		this.per_19y = per_19y;
	}

	
	
}
