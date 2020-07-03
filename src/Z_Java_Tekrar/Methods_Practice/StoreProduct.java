package Z_Java_Tekrar.Methods_Practice;

public class StoreProduct {
    /*
    1. Complete the Z_Java_Tekrar.Methods_Practice.StoreProduct.java class:

Include the following class variables:
* label
* price (as an integer)
* category
* hasExpiration (as a boolean)
* stock (represents how many the store has available)
All class variables should be declared case sensitive

Write four constructors:
* The default constructor
* A secondary constructor that does not have a category or an expiration
* (category defaults to "misc", hasExpiration defaults to false)
* A secondary constructor that does not have a category, expiration, or stock (stock defaults to 0)
* A secondary constructor that just does not have stock

2. CountLetters your code with the Main.java class:
Create several Z_Java_Tekrar.Methods_Practice.StoreProduct objects using all Constructors and print their fields/states to make sure it's correct.

3. Include the following methods:

* public void expired(boolean hasExpired)
If the product has an expiration date and hasExpired is true, then it should set the stock to 0.
 Otherwise, nothing happens.

* public boolean sale(int quantity)
Check if the quantity (being bought) is available given the stock.  If there is enough,
then make the sale by subtracting the quantity from the stock and return true (the sale was successful).
 If there isn't enough, return false instead.

* public double getDiscountedPrice(double discount)
The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.
 Multiply the product's price by the (1 - discount) and return that number.
     */

    String label;
    int price;
    String category;
    boolean hasExpiration;
    int stock;

    public StoreProduct(){

    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        stock=0;
    }

    public StoreProduct(String label, int price){
      category="misc";
      hasExpiration=false;
        this.label = label;
        this.price = price;
        stock=0;
    }

    public StoreProduct(String label, int price, int stock) {
        category="misc";
        hasExpiration=false;
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }



    public void expired(boolean hasExpired){

        if(hasExpired==true) stock=0;
    }

    public boolean sale(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        } else {
            return false;
        }
    }

    public double getDiscountedPrice(double discount){
       double result =price*(1-discount);
       return result;
    }







}
