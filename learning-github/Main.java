public class Main {
    public static void main(String[] args) {
        // Create one Book object with 2 total copies
        Book myBook = new Book("Java Programming", 2);
        
        // Create one EBook object
        EBook myEBook = new EBook("Advanced OOP in Java", 5, 15.5);

        // Issue book 3 times in a row to trigger exception on the third try
        try {
            myBook.issueBook(); // 1st try (Success)
            myBook.issueBook(); // 2nd try (Success)
            myBook.issueBook(); // 3rd try (Triggers Exception)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Return the book once
        myBook.returnBook();

        // Call showStatus() on both objects
        System.out.println("\n--- Book Status ---");
        myBook.showStatus();

        System.out.println("\n--- EBook Status ---");
        myEBook.showStatus();
    }
}