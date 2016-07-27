package fundamental.dto;

public class BpsDTO {
	//BPS = 전분기 * (1+((다음분기/이번분기)^(1/(이번~다음분기일수)-1))
	int yearCount; //매년 주(week) 갯수 카운트
	String code;
	
	//매년BPS, 6 9 12 16배
	double bps;
	double bps06y6; //BPS
	double bps06y9; //BPS
	double bps06y12; //BPS
	double bps06y16; //BPS
	double bps07y6; //BPS
	double bps07y9; //BPS
	double bps07y12; //BPS
	double bps07y16; //BPS
	double bps08y6; //BPS
	double bps08y9; //BPS
	double bps08y12; //BPS
	double bps08y16; //BPS
	double bps09y6; //BPS
	double bps09y9; //BPS
	double bps09y12; //BPS
	double bps09y16; //BPS
	double bps10y6; //BPS
	double bps10y9; //BPS
	double bps10y12; //BPS
	double bps10y16; //BPS
	double bps11y6; //BPS
	double bps11y9; //BPS
	double bps11y12; //BPS
	double bps11y16; //BPS
	double bps12y6; //BPS
	double bps12y9; //BPS
	double bps12y12; //BPS
	double bps12y16; //BPS
	double bps13y6; //BPS
	double bps13y9; //BPS
	double bps13y12; //BPS
	double bps13y16; //BPS
	double bps14y6; //BPS
	double bps14y9; //BPS
	double bps14y12; //BPS
	double bps14y16; //BPS
	double bps15y6; //BPS
	double bps15y9; //BPS
	double bps15y12; //BPS
	double bps15y16; //BPS
	double bps16y6; //BPS
	double bps16y9; //BPS
	double bps16y12; //BPS
	double bps16y16; //BPS
	double bps17y6; //BPS
	double bps17y9; //BPS
	double bps17y12; //BPS
	double bps17y16; //BPS
	double bps18y6; //BPS
	double bps18y9; //BPS
	double bps18y12; //BPS
	double bps18y16; //BPS
	double bps19y6; //BPS
	double bps19y9; //BPS
	double bps19y12; //BPS
	double bps19y16; //BPS
	
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


	public BpsDTO(int yearCount, String code, double bps, double bps06y6, double bps06y9, double bps06y12,
			double bps06y16, double bps07y6, double bps07y9, double bps07y12, double bps07y16, double bps08y6,
			double bps08y9, double bps08y12, double bps08y16, double bps09y6, double bps09y9, double bps09y12,
			double bps09y16, double bps10y6, double bps10y9, double bps10y12, double bps10y16, double bps11y6,
			double bps11y9, double bps11y12, double bps11y16, double bps12y6, double bps12y9, double bps12y12,
			double bps12y16, double bps13y6, double bps13y9, double bps13y12, double bps13y16, double bps14y6,
			double bps14y9, double bps14y12, double bps14y16, double bps15y6, double bps15y9, double bps15y12,
			double bps15y16, double bps16y6, double bps16y9, double bps16y12, double bps16y16, double bps17y6,
			double bps17y9, double bps17y12, double bps17y16, double bps18y6, double bps18y9, double bps18y12,
			double bps18y16, double bps19y6, double bps19y9, double bps19y12, double bps19y16, double pbr_07y,
			double pbr_08y, double pbr_09y, double pbr_10y, double pbr_11y, double pbr_12y, double pbr_13y,
			double pbr_14y, double pbr_15y, double pbr_16y, double pbr_17y, double pbr_18y, double pbr_19y,
			double per_07y, double per_08y, double per_09y, double per_10y, double per_11y, double per_12y,
			double per_13y, double per_14y, double per_15y, double per_16y, double per_17y, double per_18y,
			double per_19y) {
		super();
		this.yearCount = yearCount;
		this.code = code;
		this.bps = bps;
		this.bps06y6 = bps06y6;
		this.bps06y9 = bps06y9;
		this.bps06y12 = bps06y12;
		this.bps06y16 = bps06y16;
		this.bps07y6 = bps07y6;
		this.bps07y9 = bps07y9;
		this.bps07y12 = bps07y12;
		this.bps07y16 = bps07y16;
		this.bps08y6 = bps08y6;
		this.bps08y9 = bps08y9;
		this.bps08y12 = bps08y12;
		this.bps08y16 = bps08y16;
		this.bps09y6 = bps09y6;
		this.bps09y9 = bps09y9;
		this.bps09y12 = bps09y12;
		this.bps09y16 = bps09y16;
		this.bps10y6 = bps10y6;
		this.bps10y9 = bps10y9;
		this.bps10y12 = bps10y12;
		this.bps10y16 = bps10y16;
		this.bps11y6 = bps11y6;
		this.bps11y9 = bps11y9;
		this.bps11y12 = bps11y12;
		this.bps11y16 = bps11y16;
		this.bps12y6 = bps12y6;
		this.bps12y9 = bps12y9;
		this.bps12y12 = bps12y12;
		this.bps12y16 = bps12y16;
		this.bps13y6 = bps13y6;
		this.bps13y9 = bps13y9;
		this.bps13y12 = bps13y12;
		this.bps13y16 = bps13y16;
		this.bps14y6 = bps14y6;
		this.bps14y9 = bps14y9;
		this.bps14y12 = bps14y12;
		this.bps14y16 = bps14y16;
		this.bps15y6 = bps15y6;
		this.bps15y9 = bps15y9;
		this.bps15y12 = bps15y12;
		this.bps15y16 = bps15y16;
		this.bps16y6 = bps16y6;
		this.bps16y9 = bps16y9;
		this.bps16y12 = bps16y12;
		this.bps16y16 = bps16y16;
		this.bps17y6 = bps17y6;
		this.bps17y9 = bps17y9;
		this.bps17y12 = bps17y12;
		this.bps17y16 = bps17y16;
		this.bps18y6 = bps18y6;
		this.bps18y9 = bps18y9;
		this.bps18y12 = bps18y12;
		this.bps18y16 = bps18y16;
		this.bps19y6 = bps19y6;
		this.bps19y9 = bps19y9;
		this.bps19y12 = bps19y12;
		this.bps19y16 = bps19y16;
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
		return "BpsDTO [yearCount=" + yearCount + ", code=" + code + ", bps=" + bps + ", bps06y6=" + bps06y6
				+ ", bps06y9=" + bps06y9 + ", bps06y12=" + bps06y12 + ", bps06y16=" + bps06y16 + ", bps07y6=" + bps07y6
				+ ", bps07y9=" + bps07y9 + ", bps07y12=" + bps07y12 + ", bps07y16=" + bps07y16 + ", bps08y6=" + bps08y6
				+ ", bps08y9=" + bps08y9 + ", bps08y12=" + bps08y12 + ", bps08y16=" + bps08y16 + ", bps09y6=" + bps09y6
				+ ", bps09y9=" + bps09y9 + ", bps09y12=" + bps09y12 + ", bps09y16=" + bps09y16 + ", bps10y6=" + bps10y6
				+ ", bps10y9=" + bps10y9 + ", bps10y12=" + bps10y12 + ", bps10y16=" + bps10y16 + ", bps11y6=" + bps11y6
				+ ", bps11y9=" + bps11y9 + ", bps11y12=" + bps11y12 + ", bps11y16=" + bps11y16 + ", bps12y6=" + bps12y6
				+ ", bps12y9=" + bps12y9 + ", bps12y12=" + bps12y12 + ", bps12y16=" + bps12y16 + ", bps13y6=" + bps13y6
				+ ", bps13y9=" + bps13y9 + ", bps13y12=" + bps13y12 + ", bps13y16=" + bps13y16 + ", bps14y6=" + bps14y6
				+ ", bps14y9=" + bps14y9 + ", bps14y12=" + bps14y12 + ", bps14y16=" + bps14y16 + ", bps15y6=" + bps15y6
				+ ", bps15y9=" + bps15y9 + ", bps15y12=" + bps15y12 + ", bps15y16=" + bps15y16 + ", bps16y6=" + bps16y6
				+ ", bps16y9=" + bps16y9 + ", bps16y12=" + bps16y12 + ", bps16y16=" + bps16y16 + ", bps17y6=" + bps17y6
				+ ", bps17y9=" + bps17y9 + ", bps17y12=" + bps17y12 + ", bps17y16=" + bps17y16 + ", bps18y6=" + bps18y6
				+ ", bps18y9=" + bps18y9 + ", bps18y12=" + bps18y12 + ", bps18y16=" + bps18y16 + ", bps19y6=" + bps19y6
				+ ", bps19y9=" + bps19y9 + ", bps19y12=" + bps19y12 + ", bps19y16=" + bps19y16 + ", pbr_07y=" + pbr_07y
				+ ", pbr_08y=" + pbr_08y + ", pbr_09y=" + pbr_09y + ", pbr_10y=" + pbr_10y + ", pbr_11y=" + pbr_11y
				+ ", pbr_12y=" + pbr_12y + ", pbr_13y=" + pbr_13y + ", pbr_14y=" + pbr_14y + ", pbr_15y=" + pbr_15y
				+ ", pbr_16y=" + pbr_16y + ", pbr_17y=" + pbr_17y + ", pbr_18y=" + pbr_18y + ", pbr_19y=" + pbr_19y
				+ ", per_07y=" + per_07y + ", per_08y=" + per_08y + ", per_09y=" + per_09y + ", per_10y=" + per_10y
				+ ", per_11y=" + per_11y + ", per_12y=" + per_12y + ", per_13y=" + per_13y + ", per_14y=" + per_14y
				+ ", per_15y=" + per_15y + ", per_16y=" + per_16y + ", per_17y=" + per_17y + ", per_18y=" + per_18y
				+ ", per_19y=" + per_19y + "]";
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


	public double getBps() {
		return bps;
	}


	public void setBps(double bps) {
		this.bps = bps;
	}


	public double getBps06y6() {
		return bps06y6;
	}


	public void setBps06y6(double bps06y6) {
		this.bps06y6 = bps06y6;
	}


	public double getBps06y9() {
		return bps06y9;
	}


	public void setBps06y9(double bps06y9) {
		this.bps06y9 = bps06y9;
	}


	public double getBps06y12() {
		return bps06y12;
	}


	public void setBps06y12(double bps06y12) {
		this.bps06y12 = bps06y12;
	}


	public double getBps06y16() {
		return bps06y16;
	}


	public void setBps06y16(double bps06y16) {
		this.bps06y16 = bps06y16;
	}


	public double getBps07y6() {
		return bps07y6;
	}


	public void setBps07y6(double bps07y6) {
		this.bps07y6 = bps07y6;
	}


	public double getBps07y9() {
		return bps07y9;
	}


	public void setBps07y9(double bps07y9) {
		this.bps07y9 = bps07y9;
	}


	public double getBps07y12() {
		return bps07y12;
	}


	public void setBps07y12(double bps07y12) {
		this.bps07y12 = bps07y12;
	}


	public double getBps07y16() {
		return bps07y16;
	}


	public void setBps07y16(double bps07y16) {
		this.bps07y16 = bps07y16;
	}


	public double getBps08y6() {
		return bps08y6;
	}


	public void setBps08y6(double bps08y6) {
		this.bps08y6 = bps08y6;
	}


	public double getBps08y9() {
		return bps08y9;
	}


	public void setBps08y9(double bps08y9) {
		this.bps08y9 = bps08y9;
	}


	public double getBps08y12() {
		return bps08y12;
	}


	public void setBps08y12(double bps08y12) {
		this.bps08y12 = bps08y12;
	}


	public double getBps08y16() {
		return bps08y16;
	}


	public void setBps08y16(double bps08y16) {
		this.bps08y16 = bps08y16;
	}


	public double getBps09y6() {
		return bps09y6;
	}


	public void setBps09y6(double bps09y6) {
		this.bps09y6 = bps09y6;
	}


	public double getBps09y9() {
		return bps09y9;
	}


	public void setBps09y9(double bps09y9) {
		this.bps09y9 = bps09y9;
	}


	public double getBps09y12() {
		return bps09y12;
	}


	public void setBps09y12(double bps09y12) {
		this.bps09y12 = bps09y12;
	}


	public double getBps09y16() {
		return bps09y16;
	}


	public void setBps09y16(double bps09y16) {
		this.bps09y16 = bps09y16;
	}


	public double getBps10y6() {
		return bps10y6;
	}


	public void setBps10y6(double bps10y6) {
		this.bps10y6 = bps10y6;
	}


	public double getBps10y9() {
		return bps10y9;
	}


	public void setBps10y9(double bps10y9) {
		this.bps10y9 = bps10y9;
	}


	public double getBps10y12() {
		return bps10y12;
	}


	public void setBps10y12(double bps10y12) {
		this.bps10y12 = bps10y12;
	}


	public double getBps10y16() {
		return bps10y16;
	}


	public void setBps10y16(double bps10y16) {
		this.bps10y16 = bps10y16;
	}


	public double getBps11y6() {
		return bps11y6;
	}


	public void setBps11y6(double bps11y6) {
		this.bps11y6 = bps11y6;
	}


	public double getBps11y9() {
		return bps11y9;
	}


	public void setBps11y9(double bps11y9) {
		this.bps11y9 = bps11y9;
	}


	public double getBps11y12() {
		return bps11y12;
	}


	public void setBps11y12(double bps11y12) {
		this.bps11y12 = bps11y12;
	}


	public double getBps11y16() {
		return bps11y16;
	}


	public void setBps11y16(double bps11y16) {
		this.bps11y16 = bps11y16;
	}


	public double getBps12y6() {
		return bps12y6;
	}


	public void setBps12y6(double bps12y6) {
		this.bps12y6 = bps12y6;
	}


	public double getBps12y9() {
		return bps12y9;
	}


	public void setBps12y9(double bps12y9) {
		this.bps12y9 = bps12y9;
	}


	public double getBps12y12() {
		return bps12y12;
	}


	public void setBps12y12(double bps12y12) {
		this.bps12y12 = bps12y12;
	}


	public double getBps12y16() {
		return bps12y16;
	}


	public void setBps12y16(double bps12y16) {
		this.bps12y16 = bps12y16;
	}


	public double getBps13y6() {
		return bps13y6;
	}


	public void setBps13y6(double bps13y6) {
		this.bps13y6 = bps13y6;
	}


	public double getBps13y9() {
		return bps13y9;
	}


	public void setBps13y9(double bps13y9) {
		this.bps13y9 = bps13y9;
	}


	public double getBps13y12() {
		return bps13y12;
	}


	public void setBps13y12(double bps13y12) {
		this.bps13y12 = bps13y12;
	}


	public double getBps13y16() {
		return bps13y16;
	}


	public void setBps13y16(double bps13y16) {
		this.bps13y16 = bps13y16;
	}


	public double getBps14y6() {
		return bps14y6;
	}


	public void setBps14y6(double bps14y6) {
		this.bps14y6 = bps14y6;
	}


	public double getBps14y9() {
		return bps14y9;
	}


	public void setBps14y9(double bps14y9) {
		this.bps14y9 = bps14y9;
	}


	public double getBps14y12() {
		return bps14y12;
	}


	public void setBps14y12(double bps14y12) {
		this.bps14y12 = bps14y12;
	}


	public double getBps14y16() {
		return bps14y16;
	}


	public void setBps14y16(double bps14y16) {
		this.bps14y16 = bps14y16;
	}


	public double getBps15y6() {
		return bps15y6;
	}


	public void setBps15y6(double bps15y6) {
		this.bps15y6 = bps15y6;
	}


	public double getBps15y9() {
		return bps15y9;
	}


	public void setBps15y9(double bps15y9) {
		this.bps15y9 = bps15y9;
	}


	public double getBps15y12() {
		return bps15y12;
	}


	public void setBps15y12(double bps15y12) {
		this.bps15y12 = bps15y12;
	}


	public double getBps15y16() {
		return bps15y16;
	}


	public void setBps15y16(double bps15y16) {
		this.bps15y16 = bps15y16;
	}


	public double getBps16y6() {
		return bps16y6;
	}


	public void setBps16y6(double bps16y6) {
		this.bps16y6 = bps16y6;
	}


	public double getBps16y9() {
		return bps16y9;
	}


	public void setBps16y9(double bps16y9) {
		this.bps16y9 = bps16y9;
	}


	public double getBps16y12() {
		return bps16y12;
	}


	public void setBps16y12(double bps16y12) {
		this.bps16y12 = bps16y12;
	}


	public double getBps16y16() {
		return bps16y16;
	}


	public void setBps16y16(double bps16y16) {
		this.bps16y16 = bps16y16;
	}


	public double getBps17y6() {
		return bps17y6;
	}


	public void setBps17y6(double bps17y6) {
		this.bps17y6 = bps17y6;
	}


	public double getBps17y9() {
		return bps17y9;
	}


	public void setBps17y9(double bps17y9) {
		this.bps17y9 = bps17y9;
	}


	public double getBps17y12() {
		return bps17y12;
	}


	public void setBps17y12(double bps17y12) {
		this.bps17y12 = bps17y12;
	}


	public double getBps17y16() {
		return bps17y16;
	}


	public void setBps17y16(double bps17y16) {
		this.bps17y16 = bps17y16;
	}


	public double getBps18y6() {
		return bps18y6;
	}


	public void setBps18y6(double bps18y6) {
		this.bps18y6 = bps18y6;
	}


	public double getBps18y9() {
		return bps18y9;
	}


	public void setBps18y9(double bps18y9) {
		this.bps18y9 = bps18y9;
	}


	public double getBps18y12() {
		return bps18y12;
	}


	public void setBps18y12(double bps18y12) {
		this.bps18y12 = bps18y12;
	}


	public double getBps18y16() {
		return bps18y16;
	}


	public void setBps18y16(double bps18y16) {
		this.bps18y16 = bps18y16;
	}


	public double getBps19y6() {
		return bps19y6;
	}


	public void setBps19y6(double bps19y6) {
		this.bps19y6 = bps19y6;
	}


	public double getBps19y9() {
		return bps19y9;
	}


	public void setBps19y9(double bps19y9) {
		this.bps19y9 = bps19y9;
	}


	public double getBps19y12() {
		return bps19y12;
	}


	public void setBps19y12(double bps19y12) {
		this.bps19y12 = bps19y12;
	}


	public double getBps19y16() {
		return bps19y16;
	}


	public void setBps19y16(double bps19y16) {
		this.bps19y16 = bps19y16;
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
