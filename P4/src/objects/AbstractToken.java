package objects;

public abstract class AbstractToken implements Token {
	/**
	 * Zaehlt die Zahl der schwarzen Nachbarfelder.
	 * 
	 * @param neighbours Nachbarfelder (im Uhrzeigersinn)
	 * @return Anzahl der schwarzen Nachbarn
	 */
	private int blackNeighbours(Token[] neighbours) {
		// TODO: Anzahl der schwarzen Nachbarn bestimmen.
		return 0;
	}
	
	/**
	 * Bestimmt den Nachfolger des aktuellen Objekts.
	 * @return Objekt der naechsten Generation
	 */
	public Token nextGeneration(Token[] neighbours) {
		return nextGeneration(blackNeighbours(neighbours));
	}
	
	/**
	 * Die Spielregen werden durch Black-/WhiteToken festgelegt.
	 * 
	 * @param n Anzahl der schwarzen Nachbarfelder
	 * @return Objekt der naechsten Generation
	 */
	protected abstract Token nextGeneration(int n);
}
