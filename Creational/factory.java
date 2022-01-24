/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;

/**
 *
 * @author vaibh
 */

interface Card
{
    int getCardLimit();
    String cardName();
}

class Titanium implements Card
{
    @Override
    public int getCardLimit() {
        return 100000;
    }

    @Override
    public String cardName() {
         return "Titanium";
    }
    
}

class Regular implements Card
{

    @Override
    public int getCardLimit() {
         return 10000;
    }

    @Override
    public String cardName() {
        return "regular";    
    }
    
}
 class CardFactory
{
    public Card getCard(String cardType)
    {
        if(cardType.equals("regular"))
           return new Regular();
        return new Titanium();
                
    }
}
public class factory {
     public static void main(String[] args) {
        CardFactory cardFactory=new CardFactory();
        Card card=cardFactory.getCard("regular");
        System.out.println(card.cardName()+card.getCardLimit());
    }
    
}
