package day46_Final_Abstract;

public class Final_Encapsulation {

    final private int data1 = 200;
    private int data2 = 300;

    public int getData1(){ //final variable can be generate getter
        return data1;
    }

//    public void setData1(int data1){ // final variable never can be generate setter
//        this.data1 =data1;
//    }

    public int getData2(){
        return data2;
    }

    public void setData2(int data2){
        this.data2 =data2;
    }




}
