//Oppgave 3a

public class Bil3 {

    public void skrivUt() {
      System.out.println("Jeg er en bil med bil nummer:" + bilNummer);
    }

    public Bil3(String bilNummer) {
        bilNummer = bilNummer;
    }

    public String hentNummer() {
        return bilNummer;
    }
}
