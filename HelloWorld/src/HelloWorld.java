/**
 * 
 */

/**
 * @author Ales
 *
 */
public class HelloWorld {

	/**
	 * @param args Seznam vhodnih argumentov ob zagonu
	 */
	public static void main(String[] args) {
		// Izpišemo pozdrav
		System.out.println("Hello world!");
	
		Kozarec k = new Kozarec(200);
		Krigel kr = new Krigel(5000, "Steklo", "Okrogel", false);
	
		try {
			kr.odpriPokrov();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
