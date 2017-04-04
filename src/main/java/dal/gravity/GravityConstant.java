/**
 * 
 */
package dal.gravity;

/**
 * @author Kelvin
 *
 */
public class GravityConstant implements GravityModel {

	/**
	 * 
	 */
	private double jG;
	
	public GravityConstant(double jG) {
		// TODO Auto-generated constructor stub
		this.jG = jG;
	}
	
	
	public double getGravitationalField() {
		return jG;
	}

	public void setGravititionalField(double jG) {
		this.jG = jG;
	}
}
