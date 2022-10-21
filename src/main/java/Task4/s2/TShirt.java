package Task4.s2;

public class TShirt extends Clothes implements MenClothing, WomanClothing{


    @Override
    public void dressMan() {
        System.out.println("Its tshirt for man");
    }

    @Override
    public void dressWoman() {
        System.out.println("Its tshirt for woman");
    }
}
