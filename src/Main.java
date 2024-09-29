import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Sellers firstSeller = new Sellers();
        Sellers secondSeller = new Sellers();

        firstSeller.setName("Vaclav");
        firstSeller.setBirthdate(LocalDate.of(1985,05,5));
        firstSeller.setAddress("Brno");

        secondSeller.setName("Jan");
        secondSeller.setBirthdate(LocalDate.of(1987,3,4));
        secondSeller.setAddress("Pardubice");

        System.out.println();
        System.out.println("Prodejce mrkve:");
        System.out.println("name: " + firstSeller.getName() + "; birthdate: " + firstSeller.getBirthdate() + "; address: " + firstSeller.getAddress());
        System.out.println("name: " + secondSeller.getName() + "; birthdate: " + secondSeller.getBirthdate() + "; address: " + secondSeller.getAddress());

    }
}