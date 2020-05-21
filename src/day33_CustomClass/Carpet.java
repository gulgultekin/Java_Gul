package day33_CustomClass;

public class Carpet {
    /*
    2. create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice, & isParsian
						calcCost(): should be able to caculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including the total cost
						of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double cost=0;

    public void customOrder(double carpetWidth,double carpetLength,double carpetUnitPrice,boolean isPersian){
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        this.isPersian = isPersian;

        System.out.println("This carpet width : "+carpetWidth+" length : "+carpetLength+" unit price: $"
                +carpetUnitPrice+" is it Persian : "+isPersian);
    }

    public double calcCost(){
       cost = (width+length)*unitPrice;
        if(isPersian) return cost+200;
         return cost;
    }
    public String toString(){
      String result = "This carpet width : "+width+" length : "+length+" unit price: $"
                +unitPrice+" is it Persian : "+isPersian+" \nYour total cost is :$"+cost;

        return result;
    }


}
