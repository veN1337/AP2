/**
 * @author veN
 *
 */
public class Circle extends AbstractShape {
	
	/**
	* Der Radius des Kreises.
	*/
	private double r;

	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}
	
	/**
	* Berechnet die Flaeche des Kreises
	* 
	* @return Fl�che
	*/
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}
	
	/**
	 * Gib den Namen des Kreises zur�ck
	 * 
	 * @return Circle. + Name des Kreises
	 */
	public String toString() {
		return "Circle." + getName();
	}
}
