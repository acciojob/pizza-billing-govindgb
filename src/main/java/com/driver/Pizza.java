package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    private boolean is_cheese_added ;
    private boolean is_toppings_added ;
    private boolean is_takeaway_added;
    private boolean is_bill_generated;
    private int extra_cheese_price;
    private int extra_toppings_price;
    private int take_away_price;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        this.is_cheese_added  = false;
        this.is_toppings_added = false;
        this.is_takeaway_added = false;
        this.is_bill_generated = false;
        this.extra_cheese_price = 80;
        this.take_away_price = 20;
        if(isVeg == true)
        {
            this.price = 300;
            this.extra_toppings_price = 70;
        }
        else
        {
            this.price = 400;
            this.extra_toppings_price = 120;
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(is_cheese_added == false)
        {
            this.price += extra_cheese_price;
            is_cheese_added = true;//I don't want it to added repeatedly
            bill = "";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(is_toppings_added == false )
        {
            this.price += this.extra_toppings_price;
            is_toppings_added = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(is_takeaway_added == false)
        {
            this.price += take_away_price;
            is_takeaway_added = true;
        }
    }

    public String getBill(){
        // your code goes here

        if(is_bill_generated == false)
        {
            if(is_cheese_added == true)
            {
                this.bill += "Extra Cheese Price = " + this.extra_cheese_price + "\n";
            }
            if(is_toppings_added == true)
            {
                this.bill += "Extra Toppings Added: " + this.extra_toppings_price + "\n";
            }
            if(is_takeaway_added == true)
            {
                this.bill += "Paperbag Added: " + this.take_away_price + "\n";
            }
            is_bill_generated  = true;
            this.bill += "total price: " + this.price + "\n";
        }

        return this.bill;
    }
}
