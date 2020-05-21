package day12_Recap;

public class Switch_Practice {

    public static void main(String[] args) {

        switch(3){
            case 1:
           // case value
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println("*******************************");
       /*
       200, OK
       201, Created
       202, Accepted
       301, Moved Permanently
       303, See Other
       304, Not Modified
       307, Temporary Redirect
       400, Bad Request
       401, Unauthorized
       403, Forbidden
       404, Not Found
       410, Gone
       500, Internal Server Error
       503, Service Unavailable
        */
        int statusCode =200;
        String result = "";

        switch(statusCode){
            case 200:
                //System.out.println("Ok");
                result="Ok";
                break;
            case 201:
               // System.out.println("Created");
                result="Created";
                break;
            case 202:
                //System.out.println("Accepted");
                result="Accepted";
                break;
            case 301:
                //System.out.println("Moved Permanently");
                result= "Moved Permanently";
                break;
            case 303:
               // System.out.println("See Other");
                result="See Other";
                break;
            default:
               // System.out.println("Invalid Status Code");
                result="Invalid Status Code";

        }
        System.out.println(result);

    }
}
