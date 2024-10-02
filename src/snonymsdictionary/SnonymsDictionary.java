/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snonymsdictionary;

/**
 *
 * @author Ali
 */
public class SnonymsDictionary {

   public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        int choice;

        do {
            System.out.println("\nDictionary Menu:");
            System.out.println("1. Add Word");
            System.out.println("2. Remove Word");
            System.out.println("3. Update Word");
            System.out.println("4. Print All Words");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = dictionary.scanner.nextInt();
            dictionary.scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    dictionary.addWord();
                    break;
                case 2:
                    dictionary.removeWord();
                    break;
                case 3:
                    dictionary.UpdateWord();
                    break;
                case 4:
                    dictionary.printAll();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
        
        dictionary.scanner.close();
    }

    
}
