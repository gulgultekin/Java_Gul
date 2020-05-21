package Replits;

public class Tv {
    /*
     Write a custom class Tv that has 4 instance variables: int channel=1, int volumeLevel=1,
     boolean on = false, String brand = "undefined".
Create one "no arguments" constructor that prints message: "Creating Tv object using no Args- constructor".
Also, create one more constructor that defines instance variable brand,
and displays message:"Creating Tv object using 1 arg - constructor".
Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel),
channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.
Create isOn(), turnOn() and turnOff() methods for "on" instance variable.
If tv is already on, no need to turn it on again, display message: "Tv is already ON".
If tv is already off, then no need to turn it off again, display message: "Tv is already OFF".
Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
If user will try to set invalid channel, display message: "ERROR: Tv is either OFF or invalid Channel".
    Volume can be only in the range between 1 and 7. You may change volume only if Tv is on.
     Otherwise, display message: "ERROR: Tv is either OFF or invalid Volume level".
     Create isOn() method that will check tv status.
     */

    int channel=1;
    int volumeLevel=1;
    boolean on=false;
    String brand="undefined";

    public Tv(){
        System.out.println("Creating TV object using no Args- constructer");
    }

    public Tv(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }

    public int getChannel(){
        return channel;
    }
    public String getBrand(){
        return brand;
    }
    public void setVolumeLevel(int vol){
        if(vol<=7 && vol>=1 && on){
            volumeLevel=vol;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public void setChannel(int ch){
        if(ch<=120 && on){
            channel=ch;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel.");
        }
    }
    public void setBrand(String br){
        brand=br;
    }
    public void volumeUp(){
        setVolumeLevel(volumeLevel+1);
    }
    public void volumeDown(){
        setVolumeLevel(volumeLevel-1);
    }
    public void channelUp(){
        setChannel(channel+1);
    }
    public void channelDown(){
        setChannel(channel-1);
    }
    public boolean isOn(){
        return on;
    }
    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }


}
