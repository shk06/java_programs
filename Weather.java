public class Weather extends Climate {
	private int highTemp;
	private int lowTemp;
	private int monthOfYear;
	private boolean goodConditions;
	private double probablityOfThunderstorms;

	public Weather(String loc, String bi, boolean gf, int high, int low, boolean condition, double prob) {
		super(loc, bi, gf);
		highTemp = high;
		lowTemp = low;
		goodConditions = condition;
		probablityOfThunderstorms = prob;
	}

	public Weather() {
		super();
		highTemp = 68;
		lowTemp = 50;
		goodConditions = true;
		probablityOfThunderstorms = 0.05;
	}
}