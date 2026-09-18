public class Book {
    private String title;
    private int totalCopies;
    private int availableCopies;

    // Constructor
    public Book(String title, int totalCopies) {
        this.title = title;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    // issueBook method with exception handling
    public void issueBook() throws Exception {
        if (availableCopies <= 0) {
            throw new Exception("Error: No copies available to issue for '" + title + "'");
        }
        availableCopies--;
        System.out.println("Book issued successfully: " + title);
    }

    // returnBook method (never above totalCopies)
    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            System.out.println("Book returned successfully: " + title);
        } else {
            System.out.println("Warning: All copies are already in stock for '" + title + "'");
        }
    }

    // showStatus method
    public void showStatus() {
        System.out.println("Title: " + title + " | Available Copies: " + availableCopies + "/" + totalCopies);
    }
}