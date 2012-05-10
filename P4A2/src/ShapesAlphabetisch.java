import java.util.Comparator;

/**
 * @author veN
 *
 */
public class ShapesAlphabetisch implements Comparator<IShape> {

	public int compare(IShape arg0, IShape arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}

}
