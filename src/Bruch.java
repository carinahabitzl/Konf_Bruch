public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner


    public Bruch(int numerator, int denominator) {
        // TODO: Setzen Sie die Attribute entsprechend
        this.numerator = numerator;
        this.denominator = denominator;

    }


    public int getNumerator() {return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double toDecimal() {

        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        return 1.0* numerator/denominator;
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        return numerator +" / "+denominator;
    }

//    public Bruch multiplicate(Bruch b2) {
//        /* TODO:
//        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
//        *   => Übergeben Sie im Konstruktur für numerator den
//        *       eigenen numerator multipliziert mit b2.getNumerator()
//        *   => Selbige auch für denominator
//        *  Retournieren Sie ihre neue Bruch-Variable
//        * */
//
//
//        int numeratornew;
//        int denominatornew;
//        numeratornew = b2.getNumerator()*b2.getNumerator();
//        denominatornew = b2.getDenominator()*b2.getDenominator();
//        b2.setNumerator(numeratornew);
//        b2.setDenominator(denominatornew);
//
//        return b2;
//    }

    public Bruch multiplicate(Bruch b2) {
    b2.setNumerator(b2.getNumerator() * this.getNumerator());
    b2.setDenominator(b2.getDenominator() * this.getDenominator());
    return b2;
    }


    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3
       b2.setNumerator(b2.getNumerator()  * this.getNumerator()* b3.getNumerator());
       b2.setDenominator(b2.getDenominator() * this.getDenominator()* b3.getDenominator());
        return b2;
    }
}
