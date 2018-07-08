public class AddressBook {
    public static void main(String[] args) {
        Address address1 = new Address("Wrocław", "Ruska", "19", "2");
        Person person1 = new Person("Jan", "Kowalski", address1);

        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("Mieszka pod adresem: ");
        System.out.printf("%s, %s, %s/%s", person1.address.city, person1.address.street, person1.address.homeNumber, person1.address.apartment);
    }
}
