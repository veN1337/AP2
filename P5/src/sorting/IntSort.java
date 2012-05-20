package sorting;

/**
 * Generelle Schnittstelle fuer das Sortieren von Feldern von ganzen 
 * Zahlen.
 */
public interface IntSort {
    /**
     * Sortiert das uebergebene Feld.
     * Es wird kein neues Feld erzeugt, sondern einfach die Reihenfolge der
     * Elemente geaendert.
     * 
     * @param array zu sortierendes Feld
     */
    public void sort(int[] array);
}
