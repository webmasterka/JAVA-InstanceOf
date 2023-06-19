package pkgInstanceOf;

public class Main {
    public static void main(String[] args) {

        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Mikołaj", "Pietruszka", 5000);
        osoba [1] = new Student("Nikodem", "Pietruszka");


      for (Osoba person: osoba)
        {
            if (person instanceof Pracownik)
                ((Pracownik)person).pobierzOpis();
            else
                break;
        }

    }
}

abstract class Osoba {
    String imie;
    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    abstract void pobierzOpis();
}

class Pracownik extends Osoba {
    double wynagrodzenie;
    Pracownik (String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    void pracuj () {
        System.out.println("Pracuj");
    };
    @Override
    void pobierzOpis() {
        System.out.println("Jestem pracownikiem.");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);

    }
}

class Student extends Osoba {
    Student (String imie, String nazwisko) {
        super(imie, nazwisko);
    }
    @Override
    void pobierzOpis() {
        System.out.println("Jestem studentem.");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
}
