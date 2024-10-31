import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public float calculateTotalPay() {
        float total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return total;
    }

    public String getName() {
        return name;
    }

}
