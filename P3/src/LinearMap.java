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
    
    /* TODO: Die Klasse soll richtig vervollstaendigt werden.
     */
    
	@Override
	public int size() {
		// TODO
		return size;
	}

	@Override
	public V put(K key, V value) {
		// TODO
		if(key == null) {
			throw new NullPointerException("Key == null");
		}
		data[size++] = new Entry<K,V>(key, value);
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
	
	/**
	* Gibt den Index des ersten Vorkommens von
	* <tt>gesucht</tt> zurueck.
	* @param gesucht Objekt das gesucht wird.
	* @return Index des ersten Vorkommens oder -1 wenn nicht gefunden.
	*/
	public int indexOf(K gesucht) {
		/*
		for (int i=0;i<data.length;i++) {
			if(data[i] != null) { 
				if(data[i].equals(gesucht)) { 
					return i;
				}
			}else if(data[i] == gesucht) {
				return i;
			}
		}
		return -1;
		*/
		return java.util.Arrays.asList(data).indexOf(gesucht);
	}

    
    
}