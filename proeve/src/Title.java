abstract class Title {
    String title;
    String literatureType;
    protected int copies;
    protected static final double RATE = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    double calculatePoints(){
       return 0;
    }
        double calculateLiteraturePoints(){
            switch (literatureType) {
                case "BI": return 3.0;
                case "TE": return 1.5;
                case "LYRIK": return 1.2;
                case "SKØN": return 1.7;
                case "FAG": return 1.4;
                default: return 1.0;
            }
    }
    protected double calculateRoyalty() {
        return calculatePoints() * RATE;
    }
}