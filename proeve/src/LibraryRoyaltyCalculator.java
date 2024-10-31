public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author author1 = new Author("Collen Hoover");


        author1.addTitle(new PrintedBook("Hodja fra Pjort", "BI", 100, 30));
        author1.addTitle(new PrintedBook("Anders And", "TE", 5, 50));
        author1.addTitle(new AudioBook("Mordet", "LYRIK", 3, 120));


        float totalPay = author.calculateTotalPay();
        System.out.printf("%s: %.2fkr%n", author.getName(), totalPay);
    }
}