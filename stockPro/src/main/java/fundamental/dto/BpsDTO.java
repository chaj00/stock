package fundamental.dto;

public class BpsDTO {
	//BPS = 전분기 * (1+((다음분기/이번분기)^(1/(이번~다음분기일수)-1))
	int yearCount; //매년 주(week) 갯수 카운트
	String code;
	
	//매년BPS, 6 9 12 16배
	double bps06y;
	double bps06y2; //BPS
	double bps06y3; //BPS
	double bps06y4; //BPS

	double bps07y; //BPS
	double bps07y2; //BPS
	double bps07y3; //BPS
	double bps07y4; //BPS
	
	double bps08y; //BPS
	double bps08y2; //BPS
	double bps08y3; //BPS
	double bps08y4; //BPS
	
	double bps09y; //BPS
	double bps09y2; //BPS
	double bps09y3; //BPS
	double bps09y4; //BPS
	
	double bps10y; //BPS
	double bps10y2; //BPS
	double bps10y3; //BPS
	double bps10y4; //BPS
	
	double bps11y; //BPS
	double bps11y2; //BPS
	double bps11y3; //BPS
	double bps11y4; //BPS
	
	double bps12y; //BPS
	double bps12y2; //BPS
	double bps12y3; //BPS
	double bps12y4; //BPS
	
	double bps13y; //BPS
	double bps13y2; //BPS
	double bps13y3; //BPS
	double bps13y4; //BPS
	
	double bps14y; //BPS
	double bps14y2; //BPS
	double bps14y3; //BPS
	double bps14y4; //BPS
	
	double bps15y; //BPS
	double bps15y2; //BPS
	double bps15y3; //BPS
	double bps15y4; //BPS
	
	double bps16y; //BPS
	double bps16y2; //BPS
	double bps16y3; //BPS
	double bps16y4; //BPS
	
	double bps17y; //BPS
	double bps17y2; //BPS
	double bps17y3; //BPS
	double bps17y4; //BPS
	
	double bps18y; //BPS
	double bps18y2; //BPS
	double bps18y3; //BPS
	double bps18y4; //BPS
	
	double bps19y; //BPS
	double bps19y2; //BPS
	double bps19y3; //BPS
	double bps19y4; //BPS
	
	//pbrband차트 데이터(`07~`16)
	double pbr_07y;
	double pbr_08y;
	double pbr_09y;
	double pbr_10y;
	double pbr_11y;
	double pbr_12y;
	double pbr_13y;
	double pbr_14y;
	double pbr_15y;
	double pbr_16y;
	double pbr_17y;
	double pbr_18y;
	double pbr_19y;
	
	//perband차트 데이터(`07~`16)
	double per_07y;
	double per_08y;
	double per_09y;
	double per_10y;
	double per_11y;
	double per_12y;
	double per_13y;
	double per_14y;
	double per_15y;
	double per_16y;
	double per_17y;
	double per_18y;
	double per_19y;
	
	
	public BpsDTO(){
		
	}


	public BpsDTO(int yearCount, String code, double bps06y, double bps06y2, double bps06y3, double bps06y4,
			double bps07y, double bps07y2, double bps07y3, double bps07y4, double bps08y, double bps08y2,
			double bps08y3, double bps08y4, double bps09y, double bps09y2, double bps09y3, double bps09y4,
			double bps10y, double bps10y2, double bps10y3, double bps10y4, double bps11y, double bps11y2,
			double bps11y3, double bps11y4, double bps12y, double bps12y2, double bps12y3, double bps12y4,
			double bps13y, double bps13y2, double bps13y3, double bps13y4, double bps14y, double bps14y2,
			double bps14y3, double bps14y4, double bps15y, double bps15y2, double bps15y3, double bps15y4,
			double bps16y, double bps16y2, double bps16y3, double bps16y4, double bps17y, double bps17y2,
			double bps17y3, double bps17y4, double bps18y, double bps18y2, double bps18y3, double bps18y4,
			double bps19y, double bps19y2, double bps19y3, double bps19y4, double pbr_07y, double pbr_08y,
			double pbr_09y, double pbr_10y, double pbr_11y, double pbr_12y, double pbr_13y, double pbr_14y,
			double pbr_15y, double pbr_16y, double pbr_17y, double pbr_18y, double pbr_19y, double per_07y,
			double per_08y, double per_09y, double per_10y, double per_11y, double per_12y, double per_13y,
			double per_14y, double per_15y, double per_16y, double per_17y, double per_18y, double per_19y) {
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


	public double getBps06y() {
		return bps06y;
	}


	public void setBps06y(double bps06y) {
		this.bps06y = bps06y;
	}


	public double getBps06y2() {
		return bps06y2;
	}


	public void setBps06y2(double bps06y2) {
		this.bps06y2 = bps06y2;
	}


	public double getBps06y3() {
		return bps06y3;
	}


	public void setBps06y3(double bps06y3) {
		this.bps06y3 = bps06y3;
	}


	public double getBps06y4() {
		return bps06y4;
	}


	public void setBps06y4(double bps06y4) {
		this.bps06y4 = bps06y4;
	}


	public double getBps07y() {
		return bps07y;
	}


	public void setBps07y(double bps07y) {
		this.bps07y = bps07y;
	}


	public double getBps07y2() {
		return bps07y2;
	}


	public void setBps07y2(double bps07y2) {
		this.bps07y2 = bps07y2;
	}


	public double getBps07y3() {
		return bps07y3;
	}


	public void setBps07y3(double bps07y3) {
		this.bps07y3 = bps07y3;
	}


	public double getBps07y4() {
		return bps07y4;
	}


	public void setBps07y4(double bps07y4) {
		this.bps07y4 = bps07y4;
	}


	public double getBps08y() {
		return bps08y;
	}


	public void setBps08y(double bps08y) {
		this.bps08y = bps08y;
	}


	public double getBps08y2() {
		return bps08y2;
	}


	public void setBps08y2(double bps08y2) {
		this.bps08y2 = bps08y2;
	}


	public double getBps08y3() {
		return bps08y3;
	}


	public void setBps08y3(double bps08y3) {
		this.bps08y3 = bps08y3;
	}


	public double getBps08y4() {
		return bps08y4;
	}


	public void setBps08y4(double bps08y4) {
		this.bps08y4 = bps08y4;
	}


	public double getBps09y() {
		return bps09y;
	}


	public void setBps09y(double bps09y) {
		this.bps09y = bps09y;
	}


	public double getBps09y2() {
		return bps09y2;
	}


	public void setBps09y2(double bps09y2) {
		this.bps09y2 = bps09y2;
	}


	public double getBps09y3() {
		return bps09y3;
	}


	public void setBps09y3(double bps09y3) {
		this.bps09y3 = bps09y3;
	}


	public double getBps09y4() {
		return bps09y4;
	}


	public void setBps09y4(double bps09y4) {
		this.bps09y4 = bps09y4;
	}


	public double getBps10y() {
		return bps10y;
	}


	public void setBps10y(double bps10y) {
		this.bps10y = bps10y;
	}


	public double getBps10y2() {
		return bps10y2;
	}


	public void setBps10y2(double bps10y2) {
		this.bps10y2 = bps10y2;
	}


	public double getBps10y3() {
		return bps10y3;
	}


	public void setBps10y3(double bps10y3) {
		this.bps10y3 = bps10y3;
	}


	public double getBps10y4() {
		return bps10y4;
	}


	public void setBps10y4(double bps10y4) {
		this.bps10y4 = bps10y4;
	}


	public double getBps11y() {
		return bps11y;
	}


	public void setBps11y(double bps11y) {
		this.bps11y = bps11y;
	}


	public double getBps11y2() {
		return bps11y2;
	}


	public void setBps11y2(double bps11y2) {
		this.bps11y2 = bps11y2;
	}


	public double getBps11y3() {
		return bps11y3;
	}


	public void setBps11y3(double bps11y3) {
		this.bps11y3 = bps11y3;
	}


	public double getBps11y4() {
		return bps11y4;
	}


	public void setBps11y4(double bps11y4) {
		this.bps11y4 = bps11y4;
	}


	public double getBps12y() {
		return bps12y;
	}


	public void setBps12y(double bps12y) {
		this.bps12y = bps12y;
	}


	public double getBps12y2() {
		return bps12y2;
	}


	public void setBps12y2(double bps12y2) {
		this.bps12y2 = bps12y2;
	}


	public double getBps12y3() {
		return bps12y3;
	}


	public void setBps12y3(double bps12y3) {
		this.bps12y3 = bps12y3;
	}


	public double getBps12y4() {
		return bps12y4;
	}


	public void setBps12y4(double bps12y4) {
		this.bps12y4 = bps12y4;
	}


	public double getBps13y() {
		return bps13y;
	}


	public void setBps13y(double bps13y) {
		this.bps13y = bps13y;
	}


	public double getBps13y2() {
		return bps13y2;
	}


	public void setBps13y2(double bps13y2) {
		this.bps13y2 = bps13y2;
	}


	public double getBps13y3() {
		return bps13y3;
	}


	public void setBps13y3(double bps13y3) {
		this.bps13y3 = bps13y3;
	}


	public double getBps13y4() {
		return bps13y4;
	}


	public void setBps13y4(double bps13y4) {
		this.bps13y4 = bps13y4;
	}


	public double getBps14y() {
		return bps14y;
	}


	public void setBps14y(double bps14y) {
		this.bps14y = bps14y;
	}


	public double getBps14y2() {
		return bps14y2;
	}


	public void setBps14y2(double bps14y2) {
		this.bps14y2 = bps14y2;
	}


	public double getBps14y3() {
		return bps14y3;
	}


	public void setBps14y3(double bps14y3) {
		this.bps14y3 = bps14y3;
	}


	public double getBps14y4() {
		return bps14y4;
	}


	public void setBps14y4(double bps14y4) {
		this.bps14y4 = bps14y4;
	}


	public double getBps15y() {
		return bps15y;
	}


	public void setBps15y(double bps15y) {
		this.bps15y = bps15y;
	}


	public double getBps15y2() {
		return bps15y2;
	}


	public void setBps15y2(double bps15y2) {
		this.bps15y2 = bps15y2;
	}


	public double getBps15y3() {
		return bps15y3;
	}


	public void setBps15y3(double bps15y3) {
		this.bps15y3 = bps15y3;
	}


	public double getBps15y4() {
		return bps15y4;
	}


	public void setBps15y4(double bps15y4) {
		this.bps15y4 = bps15y4;
	}


	public double getBps16y() {
		return bps16y;
	}


	public void setBps16y(double bps16y) {
		this.bps16y = bps16y;
	}


	public double getBps16y2() {
		return bps16y2;
	}


	public void setBps16y2(double bps16y2) {
		this.bps16y2 = bps16y2;
	}


	public double getBps16y3() {
		return bps16y3;
	}


	public void setBps16y3(double bps16y3) {
		this.bps16y3 = bps16y3;
	}


	public double getBps16y4() {
		return bps16y4;
	}


	public void setBps16y4(double bps16y4) {
		this.bps16y4 = bps16y4;
	}


	public double getBps17y() {
		return bps17y;
	}


	public void setBps17y(double bps17y) {
		this.bps17y = bps17y;
	}


	public double getBps17y2() {
		return bps17y2;
	}


	public void setBps17y2(double bps17y2) {
		this.bps17y2 = bps17y2;
	}


	public double getBps17y3() {
		return bps17y3;
	}


	public void setBps17y3(double bps17y3) {
		this.bps17y3 = bps17y3;
	}


	public double getBps17y4() {
		return bps17y4;
	}


	public void setBps17y4(double bps17y4) {
		this.bps17y4 = bps17y4;
	}


	public double getBps18y() {
		return bps18y;
	}


	public void setBps18y(double bps18y) {
		this.bps18y = bps18y;
	}


	public double getBps18y2() {
		return bps18y2;
	}


	public void setBps18y2(double bps18y2) {
		this.bps18y2 = bps18y2;
	}


	public double getBps18y3() {
		return bps18y3;
	}


	public void setBps18y3(double bps18y3) {
		this.bps18y3 = bps18y3;
	}


	public double getBps18y4() {
		return bps18y4;
	}


	public void setBps18y4(double bps18y4) {
		this.bps18y4 = bps18y4;
	}


	public double getBps19y() {
		return bps19y;
	}


	public void setBps19y(double bps19y) {
		this.bps19y = bps19y;
	}


	public double getBps19y2() {
		return bps19y2;
	}


	public void setBps19y2(double bps19y2) {
		this.bps19y2 = bps19y2;
	}


	public double getBps19y3() {
		return bps19y3;
	}


	public void setBps19y3(double bps19y3) {
		this.bps19y3 = bps19y3;
	}


	public double getBps19y4() {
		return bps19y4;
	}


	public void setBps19y4(double bps19y4) {
		this.bps19y4 = bps19y4;
	}


	public double getPbr_07y() {
		return pbr_07y;
	}


	public void setPbr_07y(double pbr_07y) {
		this.pbr_07y = pbr_07y;
	}


	public double getPbr_08y() {
		return pbr_08y;
	}


	public void setPbr_08y(double pbr_08y) {
		this.pbr_08y = pbr_08y;
	}


	public double getPbr_09y() {
		return pbr_09y;
	}


	public void setPbr_09y(double pbr_09y) {
		this.pbr_09y = pbr_09y;
	}


	public double getPbr_10y() {
		return pbr_10y;
	}


	public void setPbr_10y(double pbr_10y) {
		this.pbr_10y = pbr_10y;
	}


	public double getPbr_11y() {
		return pbr_11y;
	}


	public void setPbr_11y(double pbr_11y) {
		this.pbr_11y = pbr_11y;
	}


	public double getPbr_12y() {
		return pbr_12y;
	}


	public void setPbr_12y(double pbr_12y) {
		this.pbr_12y = pbr_12y;
	}


	public double getPbr_13y() {
		return pbr_13y;
	}


	public void setPbr_13y(double pbr_13y) {
		this.pbr_13y = pbr_13y;
	}


	public double getPbr_14y() {
		return pbr_14y;
	}


	public void setPbr_14y(double pbr_14y) {
		this.pbr_14y = pbr_14y;
	}


	public double getPbr_15y() {
		return pbr_15y;
	}


	public void setPbr_15y(double pbr_15y) {
		this.pbr_15y = pbr_15y;
	}


	public double getPbr_16y() {
		return pbr_16y;
	}


	public void setPbr_16y(double pbr_16y) {
		this.pbr_16y = pbr_16y;
	}


	public double getPbr_17y() {
		return pbr_17y;
	}


	public void setPbr_17y(double pbr_17y) {
		this.pbr_17y = pbr_17y;
	}


	public double getPbr_18y() {
		return pbr_18y;
	}


	public void setPbr_18y(double pbr_18y) {
		this.pbr_18y = pbr_18y;
	}


	public double getPbr_19y() {
		return pbr_19y;
	}


	public void setPbr_19y(double pbr_19y) {
		this.pbr_19y = pbr_19y;
	}


	public double getPer_07y() {
		return per_07y;
	}


	public void setPer_07y(double per_07y) {
		this.per_07y = per_07y;
	}


	public double getPer_08y() {
		return per_08y;
	}


	public void setPer_08y(double per_08y) {
		this.per_08y = per_08y;
	}


	public double getPer_09y() {
		return per_09y;
	}


	public void setPer_09y(double per_09y) {
		this.per_09y = per_09y;
	}


	public double getPer_10y() {
		return per_10y;
	}


	public void setPer_10y(double per_10y) {
		this.per_10y = per_10y;
	}


	public double getPer_11y() {
		return per_11y;
	}


	public void setPer_11y(double per_11y) {
		this.per_11y = per_11y;
	}


	public double getPer_12y() {
		return per_12y;
	}


	public void setPer_12y(double per_12y) {
		this.per_12y = per_12y;
	}


	public double getPer_13y() {
		return per_13y;
	}


	public void setPer_13y(double per_13y) {
		this.per_13y = per_13y;
	}


	public double getPer_14y() {
		return per_14y;
	}


	public void setPer_14y(double per_14y) {
		this.per_14y = per_14y;
	}


	public double getPer_15y() {
		return per_15y;
	}


	public void setPer_15y(double per_15y) {
		this.per_15y = per_15y;
	}


	public double getPer_16y() {
		return per_16y;
	}


	public void setPer_16y(double per_16y) {
		this.per_16y = per_16y;
	}


	public double getPer_17y() {
		return per_17y;
	}


	public void setPer_17y(double per_17y) {
		this.per_17y = per_17y;
	}


	public double getPer_18y() {
		return per_18y;
	}


	public void setPer_18y(double per_18y) {
		this.per_18y = per_18y;
	}


	public double getPer_19y() {
		return per_19y;
	}


	public void setPer_19y(double per_19y) {
		this.per_19y = per_19y;
	}



	
}
