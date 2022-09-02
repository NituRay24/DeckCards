import java.util.Random;
public class DeckCards {
    public void DeckInitialise

    {
        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        }
        int n = SUITS.length * RANKS.length;
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];

            }
        }
        public void Shuffle {

        Random rand = new Random();

        for (int i = 0; i < n; i++) {

            int r = i + rand.nextInt(52 - i);

            int temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;

        }

    }
    }
        public static void main (String[]args){
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22,
                23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36,
                37, 38, 39, 40, 41, 42, 43,
                44, 45, 46, 47, 48, 49, 50,
                51};

        Shuffle(a, 52);

        // Printing all shuffled elements of cards
        for (int i = 0; i < 52; i++)
            System.out.print(a[i] + " ");

    }

    }


}

