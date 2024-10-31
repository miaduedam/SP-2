class PrintedBook extends Title {
    int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
        double calculatePoints() {
        return pages * calculateLiteraturePoints() * copies;
    }
        double calculateLiteraturePoints(){
        return 0;
    }
}

