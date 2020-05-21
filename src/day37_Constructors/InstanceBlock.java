package day37_Constructors;

public class InstanceBlock {
    // INSTANCE block will get executed as many times as many objects we create.
// every object we create will have it run one time. Times = number of objects
// but if we have a static block ==> it will get executed only ONCE
    static{
        System.out.println("Static block");
    }


    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {

        InstanceBlock obj =new InstanceBlock();
        InstanceBlock obj2 =new InstanceBlock(); // 2 obje old icin instance block execute 2 times

    }
    {
        System.out.println("Instance block1");
    }
}
