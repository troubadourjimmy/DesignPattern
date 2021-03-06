package com.ling.Decorator.Decorate;

import com.ling.Decorator.Suit.Suit;

public class Skirt extends Decorate {
    public Skirt(Suit suit) {
        super(suit);
    }

    @Override
    public String getName() {
        return suit.getName()+"  +短裙";
    }

    @Override
    public int price() {
        return suit.price()+499;
    }
}
