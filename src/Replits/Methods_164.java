package Replits;

public class Methods_164 {
    /*
    To book  a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false
     */

    public static void main(String[] args) {
      boolean bool =  simpleRoomBook(false,7,1,2018);
        System.out.println(bool);
    }



    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){

        boolean result= true;
  if(isAvailable==true && year==2018) {
    if (month < 7) {
        result = true;
    } else if (month == 7 && day <= 8) {
        result = false;

    } else if (month == 7 && day > 8) {
        result = true;
    } else {
        result = true;
    }

  }else{

    result = false;
}

        return result;

    }
}
