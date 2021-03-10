// deklariramo javni razred Krigel, ki razširi razred Kozarec
public class Krigel extends Kozarec {
	//deklariramo lastnosti, ki so značilne samo za krigle, 
	// ne pa tudi za kozarce
	private String material;
	private String oblikaRocaja;
	private boolean imaPokrov;
	private boolean pokrovOdprt;
	
	// Deklariramo nov konstruktor
	/**
	 * @param kapaciteta krigla
	 * @param material
	 * @param or Oblika ro�aja
	 * @param ip
	 */
	public Krigel(int k, String m, String or, boolean ip) {
		
		// Kličemo konstruktor nadrazreda
		super(k);
		
		// inicializiramo lastnosti
		material = m;
		oblikaRocaja = or;
		imaPokrov = ip;
		pokrovOdprt = false;
	}
	// Deklariramo nove metode
	public void odpriPokrov() throws Exception {
		
		// če krigel nima pokrova, vrže izjemo
		if(!imaPokrov) {
			throw new Exception("Ta krigel nima pokrova");
		}
		
		// spremenimo lastnost
		pokrovOdprt = true;
	}
	
	// metoda vrne material
	public String getMaterial(){
		
		return material;
	}
}