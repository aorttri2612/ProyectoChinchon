package dominio;

public enum Card {
	
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	JACK(10),   
    KNIGHT(11), 
    KING(12);   

    private final int value;

    Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
	
