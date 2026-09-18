public class EBook extends Book {
    private double fileSizeMB;

    // Constructor
    public EBook(String title, int totalCopies, double fileSizeMB) {
        super(title, totalCopies);
        this.fileSizeMB = fileSizeMB;
    }

    // Overriding showStatus to include file size
    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}