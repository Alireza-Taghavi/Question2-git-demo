public abstract class Book {
    private String title;
    private double price;

    private double price2;
    private String publisher;
    private double somethingToMakeConflict;

    private double kabab;
    private String somagh;


    public Book(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice(double price);

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}