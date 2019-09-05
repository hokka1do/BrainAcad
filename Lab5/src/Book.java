public class Book {
    static final String AUTHOR = "Mark Twain";
    private static final String[] CHAPTERS = {"First", "Second", "Third", "Fourth", "Fifth"};
    private String bookName;
    private int pageNumber = 0;

    String getBookName() {
        return bookName;
    }

    void setBookName() {
        this.bookName = "Tom Sawyer";
    }

    public void switchPage(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String[] getBookChapters() {
        return CHAPTERS;
    }

    public static int chapterIs(int i) {
        int chapter;
        if (i > 0 && i < 250) {
            chapter = 1;
        } else if (i >= 250 && i < 300) {
            chapter = 2;
        } else if (i >= 300 && i < 420) {
            chapter = 3;
        } else return 0;
        return chapter;
    }

}