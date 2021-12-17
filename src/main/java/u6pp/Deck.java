package u6pp;

public class Deck 
{
    private int cards = 51;
    private Card[] deck;
    
    public Deck() 
    {
        deck = new Card[52];
        int x = 0;
        for(String suit: Card.SUITS)
        {
            for(String value: Card.VALUES)
            {
                deck[x] = new Card(suit, value);
                x++;
            }
        }
    }
    public int cardsRemaining()
    {
        int remaining = cards + 1;
        return remaining;
    }

    public Card deal()
    {
        if (cards > -1)
        {
            cards -= 1;
        }
        return deck[cards + 1];
    }

    public void shuffle()
    {
        cards = 51;
        for (int a = 0; a < 2; a++)
        {
            for (int b = 0; b < deck.length; b++)
            {
                int num = (int)(Math.random() * 51);
                Card temp = deck[b];
                deck[b] = deck[num];
                deck[num] = temp;

            }
        }

    }
}




