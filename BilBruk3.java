// Oppgave 3c

public class BilBruk3 {
    public static void main(String[] args) {
        String bilNummer = "AK42315";
        Bil3 bil = new Bil3 (bilNummer);
        Person person = new Person("Lisa", bil);
        person.skrivUtInfo();
    }
}
