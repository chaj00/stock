package fundamental.dto;

public class EpsDTO {
	//BPS = 전분기 * (1+((다음분기/이번분기)^(1/(이번~다음분기일수)-1))
	int yearCount; //매년 주(week) 갯수 카운트
	String code;
	
	//매년 EPS 6 9 12 16배
	double eps; //EPS
	double eps06y6; //EPS
	double eps06y9; //EPS
	double eps06y12; //EPS
	double eps06y16; //EPS
	double eps07y6; //EPS
	double eps07y9; //EPS
	double eps07y12; //EPS
	double eps07y16; //EPS
	double eps08y6; //EPS
	double eps08y9; //EPS
	double eps08y12; //EPS
	double eps08y16; //EPS
	double eps09y6; //EPS
	double eps09y9; //EPS
	double eps09y12; //EPS
	double eps09y16; //EPS
	double eps10y6; //EPS
	double eps10y9; //EPS
	double eps10y12; //EPS
	double eps10y16; //EPS
	double eps11y6; //EPS
	double eps11y9; //EPS
	double eps11y12; //EPS
	double eps11y16; //EPS
	double eps12y6; //EPS
	double eps12y9; //EPS
	double eps12y12; //EPS
	double eps12y16; //EPS
	double eps13y6; //EPS
	double eps13y9; //EPS
	double eps13y12; //EPS
	double eps13y16; //EPS
	double eps14y6; //EPS
	double eps14y9; //EPS
	double eps14y12; //EPS
	double eps14y16; //EPS
	double eps15y6; //EPS
	double eps15y9; //EPS
	double eps15y12; //EPS
	double eps15y16; //EPS
	
	public EpsDTO(){
		
	}

	public EpsDTO(int yearCount, String code, double eps, double eps06y6, double eps06y9, double eps06y12,
			double eps06y16, double eps07y6, double eps07y9, double eps07y12, double eps07y16, double eps08y6,
			double eps08y9, double eps08y12, double eps08y16, double eps09y6, double eps09y9, double eps09y12,
			double eps09y16, double eps10y6, double eps10y9, double eps10y12, double eps10y16, double eps11y6,
			double eps11y9, double eps11y12, double eps11y16, double eps12y6, double eps12y9, double eps12y12,
			double eps12y16, double eps13y6, double eps13y9, double eps13y12, double eps13y16, double eps14y6,
			double eps14y9, double eps14y12, double eps14y16, double eps15y6, double eps15y9, double eps15y12,
			double eps15y16) {
		super();
		this.yearCount = yearCount;
		this.code = code;
		this.eps = eps;
		this.eps06y6 = eps06y6;
		this.eps06y9 = eps06y9;
		this.eps06y12 = eps06y12;
		this.eps06y16 = eps06y16;
		this.eps07y6 = eps07y6;
		this.eps07y9 = eps07y9;
		this.eps07y12 = eps07y12;
		this.eps07y16 = eps07y16;
		this.eps08y6 = eps08y6;
		this.eps08y9 = eps08y9;
		this.eps08y12 = eps08y12;
		this.eps08y16 = eps08y16;
		this.eps09y6 = eps09y6;
		this.eps09y9 = eps09y9;
		this.eps09y12 = eps09y12;
		this.eps09y16 = eps09y16;
		this.eps10y6 = eps10y6;
		this.eps10y9 = eps10y9;
		this.eps10y12 = eps10y12;
		this.eps10y16 = eps10y16;
		this.eps11y6 = eps11y6;
		this.eps11y9 = eps11y9;
		this.eps11y12 = eps11y12;
		this.eps11y16 = eps11y16;
		this.eps12y6 = eps12y6;
		this.eps12y9 = eps12y9;
		this.eps12y12 = eps12y12;
		this.eps12y16 = eps12y16;
		this.eps13y6 = eps13y6;
		this.eps13y9 = eps13y9;
		this.eps13y12 = eps13y12;
		this.eps13y16 = eps13y16;
		this.eps14y6 = eps14y6;
		this.eps14y9 = eps14y9;
		this.eps14y12 = eps14y12;
		this.eps14y16 = eps14y16;
		this.eps15y6 = eps15y6;
		this.eps15y9 = eps15y9;
		this.eps15y12 = eps15y12;
		this.eps15y16 = eps15y16;
	}

	@Override
	public String toString() {
		return "EpsDTO [yearCount=" + yearCount + ", code=" + code + ", eps=" + eps + ", eps06y6=" + eps06y6
				+ ", eps06y9=" + eps06y9 + ", eps06y12=" + eps06y12 + ", eps06y16=" + eps06y16 + ", eps07y6=" + eps07y6
				+ ", eps07y9=" + eps07y9 + ", eps07y12=" + eps07y12 + ", eps07y16=" + eps07y16 + ", eps08y6=" + eps08y6
				+ ", eps08y9=" + eps08y9 + ", eps08y12=" + eps08y12 + ", eps08y16=" + eps08y16 + ", eps09y6=" + eps09y6
				+ ", eps09y9=" + eps09y9 + ", eps09y12=" + eps09y12 + ", eps09y16=" + eps09y16 + ", eps10y6=" + eps10y6
				+ ", eps10y9=" + eps10y9 + ", eps10y12=" + eps10y12 + ", eps10y16=" + eps10y16 + ", eps11y6=" + eps11y6
				+ ", eps11y9=" + eps11y9 + ", eps11y12=" + eps11y12 + ", eps11y16=" + eps11y16 + ", eps12y6=" + eps12y6
				+ ", eps12y9=" + eps12y9 + ", eps12y12=" + eps12y12 + ", eps12y16=" + eps12y16 + ", eps13y6=" + eps13y6
				+ ", eps13y9=" + eps13y9 + ", eps13y12=" + eps13y12 + ", eps13y16=" + eps13y16 + ", eps14y6=" + eps14y6
				+ ", eps14y9=" + eps14y9 + ", eps14y12=" + eps14y12 + ", eps14y16=" + eps14y16 + ", eps15y6=" + eps15y6
				+ ", eps15y9=" + eps15y9 + ", eps15y12=" + eps15y12 + ", eps15y16=" + eps15y16 + "]";
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

	public double getEps() {
		return eps;
	}

	public void setEps(double eps) {
		this.eps = eps;
	}

	public double getEps06y6() {
		return eps06y6;
	}

	public void setEps06y6(double eps06y6) {
		this.eps06y6 = eps06y6;
	}

	public double getEps06y9() {
		return eps06y9;
	}

	public void setEps06y9(double eps06y9) {
		this.eps06y9 = eps06y9;
	}

	public double getEps06y12() {
		return eps06y12;
	}

	public void setEps06y12(double eps06y12) {
		this.eps06y12 = eps06y12;
	}

	public double getEps06y16() {
		return eps06y16;
	}

	public void setEps06y16(double eps06y16) {
		this.eps06y16 = eps06y16;
	}

	public double getEps07y6() {
		return eps07y6;
	}

	public void setEps07y6(double eps07y6) {
		this.eps07y6 = eps07y6;
	}

	public double getEps07y9() {
		return eps07y9;
	}

	public void setEps07y9(double eps07y9) {
		this.eps07y9 = eps07y9;
	}

	public double getEps07y12() {
		return eps07y12;
	}

	public void setEps07y12(double eps07y12) {
		this.eps07y12 = eps07y12;
	}

	public double getEps07y16() {
		return eps07y16;
	}

	public void setEps07y16(double eps07y16) {
		this.eps07y16 = eps07y16;
	}

	public double getEps08y6() {
		return eps08y6;
	}

	public void setEps08y6(double eps08y6) {
		this.eps08y6 = eps08y6;
	}

	public double getEps08y9() {
		return eps08y9;
	}

	public void setEps08y9(double eps08y9) {
		this.eps08y9 = eps08y9;
	}

	public double getEps08y12() {
		return eps08y12;
	}

	public void setEps08y12(double eps08y12) {
		this.eps08y12 = eps08y12;
	}

	public double getEps08y16() {
		return eps08y16;
	}

	public void setEps08y16(double eps08y16) {
		this.eps08y16 = eps08y16;
	}

	public double getEps09y6() {
		return eps09y6;
	}

	public void setEps09y6(double eps09y6) {
		this.eps09y6 = eps09y6;
	}

	public double getEps09y9() {
		return eps09y9;
	}

	public void setEps09y9(double eps09y9) {
		this.eps09y9 = eps09y9;
	}

	public double getEps09y12() {
		return eps09y12;
	}

	public void setEps09y12(double eps09y12) {
		this.eps09y12 = eps09y12;
	}

	public double getEps09y16() {
		return eps09y16;
	}

	public void setEps09y16(double eps09y16) {
		this.eps09y16 = eps09y16;
	}

	public double getEps10y6() {
		return eps10y6;
	}

	public void setEps10y6(double eps10y6) {
		this.eps10y6 = eps10y6;
	}

	public double getEps10y9() {
		return eps10y9;
	}

	public void setEps10y9(double eps10y9) {
		this.eps10y9 = eps10y9;
	}

	public double getEps10y12() {
		return eps10y12;
	}

	public void setEps10y12(double eps10y12) {
		this.eps10y12 = eps10y12;
	}

	public double getEps10y16() {
		return eps10y16;
	}

	public void setEps10y16(double eps10y16) {
		this.eps10y16 = eps10y16;
	}

	public double getEps11y6() {
		return eps11y6;
	}

	public void setEps11y6(double eps11y6) {
		this.eps11y6 = eps11y6;
	}

	public double getEps11y9() {
		return eps11y9;
	}

	public void setEps11y9(double eps11y9) {
		this.eps11y9 = eps11y9;
	}

	public double getEps11y12() {
		return eps11y12;
	}

	public void setEps11y12(double eps11y12) {
		this.eps11y12 = eps11y12;
	}

	public double getEps11y16() {
		return eps11y16;
	}

	public void setEps11y16(double eps11y16) {
		this.eps11y16 = eps11y16;
	}

	public double getEps12y6() {
		return eps12y6;
	}

	public void setEps12y6(double eps12y6) {
		this.eps12y6 = eps12y6;
	}

	public double getEps12y9() {
		return eps12y9;
	}

	public void setEps12y9(double eps12y9) {
		this.eps12y9 = eps12y9;
	}

	public double getEps12y12() {
		return eps12y12;
	}

	public void setEps12y12(double eps12y12) {
		this.eps12y12 = eps12y12;
	}

	public double getEps12y16() {
		return eps12y16;
	}

	public void setEps12y16(double eps12y16) {
		this.eps12y16 = eps12y16;
	}

	public double getEps13y6() {
		return eps13y6;
	}

	public void setEps13y6(double eps13y6) {
		this.eps13y6 = eps13y6;
	}

	public double getEps13y9() {
		return eps13y9;
	}

	public void setEps13y9(double eps13y9) {
		this.eps13y9 = eps13y9;
	}

	public double getEps13y12() {
		return eps13y12;
	}

	public void setEps13y12(double eps13y12) {
		this.eps13y12 = eps13y12;
	}

	public double getEps13y16() {
		return eps13y16;
	}

	public void setEps13y16(double eps13y16) {
		this.eps13y16 = eps13y16;
	}

	public double getEps14y6() {
		return eps14y6;
	}

	public void setEps14y6(double eps14y6) {
		this.eps14y6 = eps14y6;
	}

	public double getEps14y9() {
		return eps14y9;
	}

	public void setEps14y9(double eps14y9) {
		this.eps14y9 = eps14y9;
	}

	public double getEps14y12() {
		return eps14y12;
	}

	public void setEps14y12(double eps14y12) {
		this.eps14y12 = eps14y12;
	}

	public double getEps14y16() {
		return eps14y16;
	}

	public void setEps14y16(double eps14y16) {
		this.eps14y16 = eps14y16;
	}

	public double getEps15y6() {
		return eps15y6;
	}

	public void setEps15y6(double eps15y6) {
		this.eps15y6 = eps15y6;
	}

	public double getEps15y9() {
		return eps15y9;
	}

	public void setEps15y9(double eps15y9) {
		this.eps15y9 = eps15y9;
	}

	public double getEps15y12() {
		return eps15y12;
	}

	public void setEps15y12(double eps15y12) {
		this.eps15y12 = eps15y12;
	}

	public double getEps15y16() {
		return eps15y16;
	}

	public void setEps15y16(double eps15y16) {
		this.eps15y16 = eps15y16;
	}
	
	
	
	
	
	
}
