package objects;

/**
 * Ein Feld mit der Anfangsbelegung
 * <pre>
 *     xx
 *    xx
 *     x
 * </pre>
 */
class R_Pentomino extends AbstractWorld {
	R_Pentomino(int nx, int ny) {
		super(nx, ny);
		/*set(75, 75, BlackToken.instance());
		set(76, 75, BlackToken.instance());
		set(74, 74, BlackToken.instance());
		set(75, 74, BlackToken.instance());
		set(75, 73, BlackToken.instance());*/
		
		//QUADRAT
		/*set(50, 50, BlackToken.instance());
		set(51, 50, BlackToken.instance());
		set(52, 50, BlackToken.instance());
		set(53, 50, BlackToken.instance());
		set(54, 50, BlackToken.instance());
		set(55, 50, BlackToken.instance());
		set(56, 50, BlackToken.instance());
		set(57, 50, BlackToken.instance());
		set(58, 50, BlackToken.instance());
		set(50, 51, BlackToken.instance());
		set(50, 52, BlackToken.instance());
		set(50, 53, BlackToken.instance());
		set(50, 54, BlackToken.instance());
		set(50, 55, BlackToken.instance());
		set(50, 56, BlackToken.instance());
		set(50, 57, BlackToken.instance());
		set(50, 58, BlackToken.instance());
		set(51, 58, BlackToken.instance());
		set(52, 58, BlackToken.instance());
		set(53, 58, BlackToken.instance());
		set(54, 58, BlackToken.instance());
		set(55, 58, BlackToken.instance());
		set(56, 58, BlackToken.instance());
		set(57, 58, BlackToken.instance());
		set(58, 58, BlackToken.instance());
		set(58, 50, BlackToken.instance());
		set(58, 51, BlackToken.instance());
		set(58, 52, BlackToken.instance());
		set(58, 53, BlackToken.instance());
		set(58, 54, BlackToken.instance());
		set(58, 55, BlackToken.instance());
		set(58, 56, BlackToken.instance());
		set(58, 57, BlackToken.instance());*/
		
		set(50, 50, BlackToken.instance());
		set(55, 50, BlackToken.instance());
		set(50, 52, BlackToken.instance());
		set(55, 52, BlackToken.instance());
		set(48, 51, BlackToken.instance());
		set(49, 51, BlackToken.instance());
		set(51, 51, BlackToken.instance());
		set(52, 51, BlackToken.instance());
		set(53, 51, BlackToken.instance());
		set(54, 51, BlackToken.instance());
		set(56, 51, BlackToken.instance());
		set(57, 51, BlackToken.instance());
		
		set(80, 50, BlackToken.instance());
		set(81, 50, BlackToken.instance());
		set(83, 50, BlackToken.instance());
		set(84, 50, BlackToken.instance());
		set(81, 51, BlackToken.instance());
		set(83, 50, BlackToken.instance());
		set(81, 52, BlackToken.instance());
		set(83, 52, BlackToken.instance());
		set(81, 53, BlackToken.instance());
		set(83, 53, BlackToken.instance());
		set(81, 50, BlackToken.instance());
	}
}
