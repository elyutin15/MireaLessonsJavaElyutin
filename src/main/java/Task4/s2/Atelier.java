package Task4.s2;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Pants();
        clothes[1] = new Skirt();
        clothes[2] = new Tie();
        clothes[3] = new TShirt();

        dressMen(clothes);

        System.out.println();

        dressWoman(clothes);
    }

    public static void dressMen (Clothes[] clothes) {
        for (int i = 0; i < clothes.length; ++i) {
            if (clothes[i] instanceof MenClothing) {
                ((MenClothing) clothes[i]).dressMan();
            }
        }
    }

    public static void dressWoman (Clothes[] clothes) {
        for (int i = 0; i < clothes.length; ++i) {
            if (clothes[i] instanceof WomanClothing) {
                ((WomanClothing) clothes[i]).dressWoman();
            }
        }
    }
}
