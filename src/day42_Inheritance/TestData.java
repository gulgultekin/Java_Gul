package day42_Inheritance;

public class TestData extends Data {
    /*
    public: accessible at everywhere, visibile to the world
    protected: visible in same package, visible in sub class outside package
    default: only visible in same package
    private: only visible within the same class
 */
    /*
    public (inherited)
    default (inherited)
    protected (inherited)
     */
    public static void main(String[] args) {

        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
       // System.out.println(TestData.privateData); // private old icin inherit edilmez
    }


}
