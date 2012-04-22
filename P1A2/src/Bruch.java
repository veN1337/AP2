/**
 * Die Klasse implementiert unveraenderliche Brueche.
 * <p>
 * Brueche sind in gekuerzter
 * Form gespeichert. Nur der Zaehler kann 0 oder negativ sein.
 * <p>
 * Die Aufrufe sind von der Form
 * 
 * <pre>
 * linkerOperand.Operator(rechterOperand)
 * bruch.Operation()
 * </pre>
 * 
 * Bruch Objekte werden niemals veraendert.
 * <p>
 * Beispiele:
 * <pre>
 * Bruch r0 = new Bruch(2);
 * Bruch r1 = new Bruch(3, 4).addiere(r0);
 * Bruch r2 = r1.invertiere();
 * if (r1.equals(r2)) ...
 * if (r1.compareTo(r2) < 0) ...
 * System.out.println(r2);
 * </pre>
 * 
 */
public final class Bruch implements Comparable<Bruch> {
    private final long zaehler;
    private final long nenner;
    
    /**
     * Die Konstante 0.
     */
    public static final Bruch ZERO = new Bruch(0); 
    
    /**
     * Die Konstante 1.
     */
    public static final Bruch ONE = new Bruch(1);

    /**
     * Diese Methode ueberschreibt die entsprechende Methode aus
     * <code>java.lang.Object</code> indem sie die Werte zweier Brueche
     * vergleicht. In dem Vergleich <code>a.equals(b)</code> kann <code>b</code>
     * fuer eine beliebige Objektreferenz stehen. Das Ergebnis ist genau dann
     * <code>true</code> wenn das Argument einen Bruch mit gleichem Wert
     * darstellt.
     * 
     * @param einObjekt das Objekt mit dem <code>this</code> verglichen wird.
     * @return <code>true</code> wenn die Werte gleich sind.
     */
    @Override
    public boolean equals(Object einObjekt) {
        if (einObjekt instanceof Bruch) {
        	Bruch einBruch = (Bruch) einObjekt; // Was bedeutet das??
        	if(this.zaehler == einBruch.zaehler && this.nenner == einBruch.nenner) {
        		return true;
        	}
        }
        return false;
    }

    /**
     * Erzeugt aus einem String den dadurch beschriebenen Bruch.
     * Es wird vorausgesetzt, dass der Bruch formal korrekt geschrieben ist.
     * Insbesondere sind innerhalb des Bruchs nur Ziffern, Voruzeichen und
     * der Bruchstrich erlaubt. Wenn der Bruchstrich fehlt, wird von einer
     * ganzen Zahl ausgegangen
     * <p>
     * Die Ausgabe von <code>toString</code> ist in jedem Fall eine erlaubte
     * Eingabe.
     * 
     * @param s Stringdarstellung des Bruches
     * @return erzeugter Bruch
     * @throws NumberFormatException wenn der String keinen Bruch darstellt
     */
    public static Bruch parseBruch(String s) {
        String[] parts = s.split("/");
        return new Bruch(
        		Long.parseLong(parts[0]),
        		parts.length == 1 ? 1 : Long.parseLong(parts[1]));
    }

    /**
     * Erzeugt aus einer ganzen Zahl einen Bruch.
     * 
     * @param zahl als Bruch darzustellende Zahl
     */
    public Bruch(long zahl) {
        this.zaehler = zahl;
        this.nenner = 1;
    }

    public Bruch(long zaehler, long nenner) {
    	if(nenner  == 0) { 
    		throw new ArithmeticException("Nenner 0 ist nicht möglich!");
    	}
    	long ggt = ggt(Math.abs(zaehler),Math.abs(nenner));
    	if (nenner < 0) {
    		zaehler = -zaehler/ggt;
    		nenner = -nenner/ggt;
    	} else {
    		zaehler = zaehler/ggt;
    		nenner = nenner/ggt;
    	}
    	this.zaehler = zaehler;
    	this.nenner = nenner;
    }

    /**
     * Berechnet den groessten gemeinsamen Teiler zweier <b>positiver</b>
     * Zahlen.
     * 
     * @param a 1. Zahl
     * @param b 2. Zahl
     * @return groesster gemeinsamer Teiler
     */
    private static long ggt(long a, long b) {
        return b != 0 ? ggt(b, a % b) : a;
    }
        
    /**
     * Addiert zwei Brueche.
     * 
     * @param b zweiter Operand
     * @return Ergebnisbruch
     */
    public Bruch addiere(Bruch b) {
        return new Bruch(zaehler * b.nenner + nenner * b.zaehler,
                nenner * b.nenner);
    }

    /**
     * Subtrahiert zwei Brueche.
     * 
     * @param b zweiter Operand
     * @return Ergebnisbruch
     */
    public Bruch subtrahiere(Bruch b) {
        return new Bruch(zaehler * b.nenner - nenner * b.zaehler,
                nenner * b.nenner);
    }

    /* UNBEDINGT: auch JavaDoc schreiben --- das gilt ueberall! */
    
    /**
     * Multipliziert zwei Brueche.
     * 
     * @param b zweiter Operand
     * @return Ergebnisbruch
     */
    
    public Bruch multipliziere(Bruch b) {
    	long zaehler = this.zaehler * b.zaehler; 
    	long nenner = this.nenner * b.nenner;
        return new Bruch(zaehler,nenner);
    }

    /**
     * Dividiert zwei Brueche. Division durch 0 ist nicht möglich!
     * 
     * @param bruch2 zweiter Operand
     * @return Ergebnisbruch
     * @throws ArithmeticExeception
     */
    
    public Bruch dividiere(Bruch bruch2) {
    	if(bruch2.zaehler == 0) {
    		throw new ArithmeticException("Division durch 0 ist nicht möglich!");
    	}
    	long zaehler = this.zaehler * bruch2.nenner; 
    	long nenner = this.nenner * bruch2.zaehler;
        return new Bruch(zaehler,nenner);
    }
    
    /**
     * Liefert Kehrwert eines Bruch.
     * 
     * @return Ergebnisbruch
     * @throws ArithmeticExeception
     */
    public Bruch kehrwert() {
    	if ( zaehler == 0 ) {
    		throw new ArithmeticException("Division durch 0 ist nicht möglich!");
    	}
        return new Bruch(this.nenner,this.zaehler);
    }

    /**
     * Gibt den Zaehler des Bruchs in gekuerzter Form zurueck. Wenn der Bruch
     * negativ ist, ist auch der Zaehler negativ.
     * 
     * @return Wert des Zaehlers
     */
    public long zaehler() {
        return zaehler;
    }

    /**
     * Gibt den Nenner des Bruchs in gekuerzter Form zurueck. Der Nenner ist
     * immer positiv.
     * 
     * @return Wert des Nenners
     */
    public long nenner() {
        return nenner;
    }

    /**
     * Gibt den Wert des Bruchs als Gleitkommazahl zurueck.
     * 
     * @return Wert des Bruchs
     */
    public double doubleValue() {
        return (double) zaehler / (double) nenner;
    }

    /**
     * Gibt eine Stringdarstellung des Bruchs in gekuerzter Form zurueck. Das
     * negative Vorzeichen steht vor dem Zaehler. Ganze Zahlen werden ohne
     * Bruchstrich zurueckgegeben.
     * <p>
     * Beispiele:
     * 
     * <pre>
     * 2/3, -2/3, 0, 10
     * </pre>
     */
    @Override
    public String toString() {
        return (nenner != 1)? zaehler + "/" + nenner: String.valueOf(zaehler);
    }

    @Override
    public int hashCode() {
        return (int)(zaehler + nenner);
    }

    /**
     * Diese Methode implementiert den von der Schnittstelle
     * <code>java.lang.Comparable</code> geforderten Vergleich der Groesse
     * zweier Brueche. Der Aufruf:
     * 
     * <pre>
     * a.compareTo(b)
     * </pre>
     * 
     * ist definiert fuer zwei Brueche <code>a</code> und <code>b</code>. Das
     * Ergebnis ist positiv, wenn <code>a > b</code> gilt, negativ wenn
     * <code>a < b</code> und 0, wenn die beiden Brueche gleich sind.
     * <p>
     * Aufrufe koennen wie folgt aussehen:
     * 
     * <pre>
     * if (a.compareTo(b) >= 0) // wenn a >= b
     * if (a.compareTo(b) == 0) // wenn a == b
     * </pre>
     * 
     * @param einBruch der zweite Bruch
     * @return positive, negative Zahl oder 0 wenn das aufrufende Objekt
     *         groesser, kleiner oder gleich dem Argument ist
     */
    public int compareTo(Bruch einBruch) {
    	double b1 = (double)this.zaehler / (double)this.nenner;
    	//System.out.println(b1);
    	double b2 = (double)einBruch.zaehler / (double)einBruch.nenner;
    	//System.out.println(b1);
    	if(b1 > b2) {
    		return 1;
    	} else if(b1 < b2) {
    		return -1;
    	} else {
    		return 0;
    	}
    }
}