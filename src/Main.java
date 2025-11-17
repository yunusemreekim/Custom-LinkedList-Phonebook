import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- PHONEBOOK MENU ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Print All Contacts");
            System.out.println("0. Exit");
            System.out.print("Choose an option between 0-3: ");
            try {
                int choice=scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        System.out.println("Enter Name: ");
                        String name=scanner.nextLine();
                        System.out.println("Enter Number: ");
                        String phoneNumber=scanner.nextLine();
                        phonebook.addContact(name,phoneNumber);
                        System.out.println("Contact added successfully.");
                        break;
                    case 2:
                        System.out.println("Enter Name to Delete: ");
                        String nameToDelete=scanner.nextLine();
                        phonebook.deleteByName(nameToDelete);
                        break;
                    case 3:
                        phonebook.printDirectory();
                        break;
                    case 0:
                        System.out.println("Exiting the program!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please select 0-3.");
                }
            }catch(InputMismatchException e){
                System.out.println("ERROR: Invalid input! Please enter a number");
                scanner.nextLine();
            }
        }
    }
}