//Oppgave 3b

public class Person {
    public String navn;
    public Bil3 bil;

    public Person(String navn, Bil3 bil) {
        navn = navn;
        bil = bil;
    }

    public void skrivUtInfo() {
        System.out.println("Hei" + navn + ", bilen din har nummer " + bil.hentNummer());
    }
}
