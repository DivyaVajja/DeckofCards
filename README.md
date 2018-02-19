# DeckofCards

52 cards with:
● 4 suits: hearts , spades , clubs , diamonds
● Face values of: Ace , 2-10 , Jack , Queen , and King ).
Within one of your classes, you must provide two operations:
shuffle() - shuffle returns no value, but results in the cards in the deck being randomly
permuted
dealOneCard() - returns one card from the deck to the caller. Specifically, a call to
shuffle() followed by 52 calls to dealOneCard() should result in the caller being provided
all 52 cards of the deck in a random order. If the caller then makes a 53rd call
dealOneCard(), no card is dealt.
