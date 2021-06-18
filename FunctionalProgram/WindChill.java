package javaprograms;

public class WindChill {
	
	private static void Wind(double t,double v) {
		if (t > 50 || v > 120 || v < 3) {
			System.out.println("Invalid input!");
		} else {
			double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75 )* Math.pow(v, 0.16);
	        System.out.println("The wind chill value is: " +wind+ " units.");
		}
    }
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		Wind(t,v);
	}

}
