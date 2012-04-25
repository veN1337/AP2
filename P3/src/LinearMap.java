import java.util.List;

/**
 * Die Klasse implementiert ein Verzeichnis, in dem nach
 * unter einem Schluessel gespeicherten Daten gesucht werden
 * kann.
 */
public  class LinearMap<K,V> implements IMap<K,V> {

    /**
     * Anzahl der gespeicherten Adressen.
     */
    private int size = 0;
    
    /**
     * Feld mit den Daten.
     */
    private Entry<K,V>[] data = newArray(4);
    
    /**
     * Umgeht die Probleme beim Anlegen eines neuen Array mit Typparameter.
     * 
     * @param length Groesse des Array
     * @return neues Array
     */
    @SuppressWarnings("unchecked")
	private Entry<K,V>[] newArray(int length) {
    	return new Entry[length];
    }

	@Override
	public int size() {
		// TODO
		return size;
	}

	@Override
	public V put(K key, V value) {
		// TODO
		return null;
	}

	@Override
	public V get(K key) {
		// TODO
		return null;
	}

	@Override
	public boolean containsKey(K key) {
		// TODO
		return false;
	}

	@Override
	public V remove(K key) {
		// TODO
		return null;
	}

	@Override
	public List<K> keys() {
		// TODO
		return null;
	}

    /* TODO: Die Klasse soll richtig vervollstaendigt werden.
     */
    
}