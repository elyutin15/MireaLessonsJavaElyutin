package Task4.s2;

public class Pants extends Clothes implements MenClothing, WomanClothing{

    @Override
    public void dressMan() {
        System.out.println("Its pants for man");
    }

    @Override
    public void dressWoman() {
        System.out.println("Its pants for woman");
    }
}
