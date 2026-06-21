import java.util.Scanner;


public class library {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Action;
        String book1 = "no book";
        String book2 = "no book";
        String book3 = "no book";
        String book4 = "no book";
        String book5 = "no book";

        do{
            System.out.print("______________________________________________________\n" +
                    "1 - Show available books\n2 - enter new book\n3 - library storage\n4- Exit\nEnter Action: ");
            Action = sc.nextInt();
            sc.nextLine();

            System.out.println("______________________________________________________");

            if(Action == 1){
                System.out.println("these are the books currently available in the library");
                System.out.println(book1 + "\n" + book2 + "\n" + book3 + "\n" + book4 + "\n" + book5);
            }else if(Action == 2) {
                System.out.println("Library Storage = 5 books");
                System.out.print("Enter book 1: ");
                book1 = sc.nextLine();
                System.out.print("Enter book 2: ");
                book2 = sc.nextLine();
                System.out.print("Enter book 3: ");
                book3 = sc.nextLine();
                System.out.print("Enter book 4: ");
                book4 = sc.nextLine();
                System.out.print("Enter book 5: ");
                book5 = sc.nextLine();

            }else if(Action == 3) {
                System.out.println("Library Storage = 5 books");
            }else if(Action == 4) {
                System.out.println("Exiting..");
            }
        }while(Action != 4);
        sc.close();
    }
}
