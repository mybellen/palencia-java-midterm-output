//Run here.
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    
    private static EntryList nameList = new EntryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
    System.out.println("------------Welcome to Student Record---------------");
        printChoices();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                	 addEntry();
                	 printChoices();
                     break;
                case 2:
                	removeEntryList();
                	printChoices();
                    break;
                case 3:
                	viewEntryList();
                	printChoices();
                	 break;
                case 4:
                	updateEntryList();
                	printChoices();
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
    }

    public static void printChoices() {
        System.out.println("\n1 - Add Student Entry.");
        System.out.println("2 - Delete Student entry.");
        System.out.println("3 - View all Student entries.");
        System.out.println("4 - Update Student entry.");
        System.out.println("0 - Exit.");
    }

    public static void addEntry() {
        System.out.print("Enter Student name: ");
        String name = sc.next();
        System.out.print("Enter Student age: ");
        int age = sc.nextInt();
        nameList.addEntryList(name, age);
        System.out.println(name +" "+ "is" + " "+age);
    }

    public static void updateEntryList() {
   
        System.out.print("Enter New Student entry: ");
        String nameNew = sc.nextLine();
     
        System.out.print("Enter New Student age: ");
        int ageNew = sc.nextInt();
        nameList.updateEntryList(nameNew, ageNew);
        System.out.println (nameNew + " "+ "is" +" "+ ageNew + " has been updated.");

    }

    public static void removeEntryList() {
    	boolean y= true;
    	
    	System.out.print("Enter number to delete: ");
    	int positionNo = sc.nextInt();
    	
    	if(positionNo >= 0) {
          nameList.removeEntryList(positionNo -1);
        System.out.println("Number" + " " +"entry"+ " "+positionNo + " has deleted.");
       } 
    	else {
    	   System.out.println(positionNo +" " + "is not in the entry list");
    		}
    }
        
    public static void viewEntryList() {
    	
    	nameList.printEntryList();
    }
    
}

