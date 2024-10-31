public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author author = new Author("Collen Hoover");


        author.addTitle(new PrintedBook("Billedbog for børn", "BI", 10, 30));
        author.addTitle(new PrintedBook("Tegneserie", "TE", 5, 50));
        author.addTitle(new AudioBook("Lydbog", "LYRIK", 3, 120));


        float totalPay = author.calculateTotalPay();
        System.out.printf("%s: %.2fkr%n", author.getName(), totalPay);
    }
}