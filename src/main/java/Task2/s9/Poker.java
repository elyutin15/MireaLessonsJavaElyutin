package Task2.s9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Poker {
    public static class Card {
        private final int value;
        private final Character mast;
        public Card(int value, Character mast) {
            this.value = value;
            this.mast = mast;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "value=" + value +
                    ", mast=" + mast +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Card card = (Card) o;
            return value == card.value && Objects.equals(mast, card.mast);
        }

        @Override
        public int hashCode() {
            return value + (int)(mast - 'A') * 13;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Card> s = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            System.out.println("Player " + (i + 1));
            ArrayList<Card> cards = new ArrayList<>();
            while (cards.size() < 5) {
                int value = (int)(Math.random() * 12);
                int mast = (int)(Math.random() * 3);
                Card c = new Card(value, (char)((int)'A' + mast));
                if (!s.contains(c)) {
                    cards.add(c);
                    s.add(c);
                }
            }
            System.out.println(cards);
            System.out.println();

        }
    }
}
