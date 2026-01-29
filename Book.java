/******************************************************************************

Eura Pulliam
1.29.26
LAB: Testing Objects

*******************************************************************************/

public class Book {

    private String title;
    private String author;
    private int pages;
    private double price;
    private boolean hardcover;

    // No-argument constructor
    public Book() {
        title = "Untitled";
        author = "Unknown";
        pages = 0;
        price = 0.0;
        hardcover = false;
    }

    // Parameterized constructor
    public Book(String title, String author, int pages, double price, boolean hardcover) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.hardcover = hardcover;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages >= 0) {
            this.pages = pages;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    // toString override
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author +
               "', pages=" + pages + ", price=" + price +
               ", hardcover=" + hardcover + "}";
    }
}