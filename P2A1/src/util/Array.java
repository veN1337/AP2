package util;

/**
 * Klasse zum Speichern von Daten. (sich selbst vergroesserndes Array).
 * <p>
 * Neue Daten werden stets am Ende angehaengt..
 * Der Zugriff auf die Inhalte erfolgt ueber die Indexnummer von 0 bis
 * Anzahl der Elemente - 1.
 * 
 * @param T Elementtyp
 */
public class Array<T> {
	/**
	 * Kennung "nicht gefunden".
	 */
	private static final int NOT_FOUND = -1;
	
	/**
	 * Anzahl der gespeicherten Datenelemente
	 */
    private int size = 0;
    /**
     * Array zum Speichern der Daten.
     */
    private T[] data = newArray(2);
    
    /**
     * Erzeugt ein Array der Groesse <tt>length</tt>.
     * Das Array hat den statischen Typ des Array-Objekts.
     * 
     * @param length Groesse des Arrays
     * @return neues Array
     */
    @SuppressWarnings("unchecked")
	private T[] newArray(int length) {
    	/*
    	 * Hinweis zu Typparameter:
    	 * a) zum Erzeugen eines Arrays muss der Elementtyp bekannt sein.
    	 * b) wenn man beliebige Referenzen speichern will, muss dies
    	 *    Object sein.
    	 * c) fuer die Rueckgabe braucht man eine Typangabe.
    	 * d) diese fuehrt zu der Warnung, dass Typparameter zur Laufzeit
    	 *    nicht geprueft werden koennen.
    	 * 
    	 * Tieferer Grund: Unstimmigkeiten im Java-Typsystem.
    	 */
    	return (T[]) new Object[length];
    }

    /**
     * Gibt die Anzahl der gespeicherten Inhalte zurueck.
     * 
     * @return Anzahl der Inhalte
     */
    public int size() {
    	// TODO: korrigieren
        return this.size;
    }
    
    /**
     * Gibt das index-te Element zurueck.
     * Nur erlaubt, wenn genuegend viele Elemente gespeichert sind.
     * 
     * @param index Elementnummer
     * @return gewaehltes Element
     * @throws IndexOutOfBoundsException wenn <tt>index</tt> illegal ist.
     */
    public T get(int index) {
    	// TODO: korrigieren
    	checkIndex(index);
        return data[index];
    }

    /**
     * Speichert Inhalt.
     * Das Objekt wird als letztes Element hinzugefuegt.
     * 
     * @param neu zu speichernde Transkation.
     */
    public void add(T neu) {
       if (size == data.length) adjustArrayLength();
   	   // TODO: korrigieren
       data[size++] = neu;
    }
    
	/**
	 * Gibt ein Feld zurueck, dass die umgekehrte Elementreihenfolge hat.
	 * Das this-Objekt wird nicht veraendert!
	 * @return neues umgedrehtes Array
	 */
	public Array<T> reversed() {
		// TODO: Korrigieren !
		/*
		T[] data2 = newArray(size);
		for (int i = 0, j = size - 1; i < size / 2; i++, j--) {
			T t = data[i];
			data2[i] = data[j];
			data2[j] = t;
		}
		Array<T> data3 = new Array<T>();
		for(T t1 : data2) {
			data3.add(t1);
		}
		return data3;*/
		Array<T> data2 = new Array<T>();
		for (int i = size - 1;i>=0;i--) {
			data2.add(data[i]);
		}
		return data2;
	}
    
    /**
     * Gibt den Index des ersten Vorkommens von
     * <tt>gesucht</tt> zurueck.
     * @param gesucht Objekt das gesucht wird.
     * @return Index des ersten Vorkommens oder -1 wenn nicht gefunden.
     */
    public int indexOf(T gesucht) {
    	// TODO: da fehlt was.
    	/*for (int i=0;i<data.length;i++) {
    		if(data[i] != null) { 
				if(data[i].equals(gesucht)) { 
					return i;
				}
    		}else if(data[i] == gesucht) {
    			return i;
    		}
		}
    	return NOT_FOUND; */
    	return java.util.Arrays.asList(data).indexOf(gesucht);
    	//return NOT_FOUND;
    }

	/**
	 * Ersetzt das bestehende Array durch ein Array doppelter Groesse.
	 */
	private void adjustArrayLength() {
		// TODO: korrigieren
		T[] data2 = newArray(size);
		data2 = data.clone();
		data = newArray(size*2);
		for (int i=0;i<data2.length;i++) {
			data[i] = data2[i];
		}
	}
    
    /**
     * Prueft ob <tt>index</tt> im erlaubten Bereich
     * von 0 bis Anzahl der Elemente - 1 liegt.
     * 
     * @param index zu pruefender Index
     * @throws IndexOutOfBoundsexception wenn <tt>index</tt> ausserhalb des
     *          erlaubten Bereichs liegt.
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(index + " nicht erlaubt");
    }
}
