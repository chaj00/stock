package technical.dto;

public class StockDInfoDTO {
	private String code;
	private String name;
	private String day;
	private int startprice;
	private int highprice;
	private int lowprice;
	private int endprice;
	private int volume;
	private int totalstock;
	private float foreigner;
	
	public StockDInfoDTO(){
		
	}

	public StockDInfoDTO(String code, String name, String day, int startprice, int highprice, int lowprice,
			int endprice, int volume, int totalstock, float foreigner) {
		super();
		this.code = code;
		this.name = name;
		this.day = day;
		this.startprice = startprice;
		this.highprice = highprice;
		this.lowprice = lowprice;
		this.endprice = endprice;
		this.volume = volume;
		this.totalstock = totalstock;
		this.foreigner = foreigner;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getStartprice() {
		return startprice;
	}

	public void setStartprice(int startprice) {
		this.startprice = startprice;
	}

	public int getHighprice() {
		return highprice;
	}

	public void setHighprice(int highprice) {
		this.highprice = highprice;
	}

	public int getLowprice() {
		return lowprice;
	}

	public void setLowprice(int lowprice) {
		this.lowprice = lowprice;
	}

	public int getEndprice() {
		return endprice;
	}

	public void setEndprice(int endprice) {
		this.endprice = endprice;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getTotalstock() {
		return totalstock;
	}

	public void setTotalstock(int totalstock) {
		this.totalstock = totalstock;
	}

	public float getForeigner() {
		return foreigner;
	}

	public void setForeigner(float foreigner) {
		this.foreigner = foreigner;
	}

	@Override
	public String toString() {
		return "StockDInfoDTO [code=" + code + ", name=" + name + ", day=" + day + ", startprice=" + startprice
				+ ", highprice=" + highprice + ", lowprice=" + lowprice + ", endprice=" + endprice + ", volume="
				+ volume + ", totalstock=" + totalstock + ", foreigner=" + foreigner + "]";
	}
	
	
}
