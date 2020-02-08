package learn.hanjc;

public class StoneAxe implements Axe {

    private String cost;
    private int value;

    public StoneAxe(String cost, int value) {
        this.cost = cost;
        this.value = value;
    }

    @Override
    public String chop() {
        return cost + "," +value + ",stone axe is slow";
    }
}
