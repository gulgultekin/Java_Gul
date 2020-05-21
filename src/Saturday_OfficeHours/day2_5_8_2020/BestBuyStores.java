package Saturday_OfficeHours.day2_5_8_2020;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy store1 = new BestBuy();

        store1.numberOfComputers = 10;

        BestBuy.numberOfComputers --;
        System.out.println(BestBuy.numberOfComputers);


        store1.close();
        store1.closeAll();


    }
}
