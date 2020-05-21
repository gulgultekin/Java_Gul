package day07_IfStatements;

public class WarmUpTask {
    public static void main(String[] args) {
        /*
        HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers).
         Part of the protocol includes a status code returned by the server to tell the browser
         the status of its most recent page request. Some of the codes and their meanings are listed below:
status code:
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

      1. declare an int variable called StatusCode
      2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
     Example:
        if status code = 200
        output:
                ok

        if status code = 201:
        output:
                accepted

         */

        int StatusCode=404;
        String finalResult = "Invalid Status Code"; // any code doesn't match print this(burada olmayan  num. girince bunu yazacak)
        if (StatusCode == 200) {

           // System.out.println("200, OK");
            finalResult = "OK";
        }
        if (StatusCode == 201) {

            //System.out.println("201, Created");
            finalResult = "Created";
        }
        if (StatusCode == 202) {

            //System.out.println("202, Accepted");
            finalResult = "Accepted";
        }
        if (StatusCode == 301) {

            //System.out.println("301, Moved Permanently");
            finalResult = "Moved Permanently";
        }
        if (StatusCode == 303) {

            //System.out.println("303, See Other");
            finalResult = "See Other";
        }
        if (StatusCode == 304) {

           // System.out.println("304, Not Modified");
            finalResult = "Not Modified";
        }
        if (StatusCode == 307) {

            //System.out.println("307, Temporary Redirect");
            finalResult = "Temporary Redirect";
        }
        if (StatusCode == 400) {

            //System.out.println("400, Bad Request");
            finalResult = "Bad Request";
        }
        if (StatusCode == 401) {

            //System.out.println("401, Unauthorized");
            finalResult = "Unauthorized";
        }
        if (StatusCode == 403) {

            //System.out.println("403, Forbidden");
            finalResult = "Forbidden";
        }
        if (StatusCode == 404) {

            //System.out.println("404, Not Found");
            finalResult = "Not Found";
        }if (StatusCode == 410) {

            //System.out.println("410, Gone");
            finalResult = "Gone";
        }
        if (StatusCode == 500) {

            //System.out.println("500, Internal Server Error");
            finalResult = "Internal Server Error";
        }
        if (StatusCode == 503) {

            //System.out.println("503, Service Unavailable");
            finalResult = "Service Unavailable";
        }
        System.out.println("Status code  "+StatusCode+ " is : " + finalResult); // outside of the if statement




        /*
        Warmup task:
    1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write a program that declares three integers as angles and check whether a triangle is valid or not.
    */
        int angle1 = 100, angle2=30, angle3= 50;
        boolean valid = (angle1 +angle2 + angle3)==180;
        boolean nonvalid = (angle1 +angle2 + angle3)!=180;

        if (valid){
            System.out.println("it's a valid triangle");
        }
        if (nonvalid){
            System.out.println("invalid triangle");
        }



    //2. write a java program that accepts three numbers and return the maximum number

        int num1 = 150;
        int num2 =80;
        int num3 = 40;
        int max =0;
        if(num1 > num2 && num1 > num3){
            max= num1;
        }
        if (num2 > num1 && num2 > num3){
            max = num2;
        }
        if(num3 > num2 && num3 > num1){
            max = num3;
        }
        System.out.println("Maximum number is : "+ max);



    //3. write a java program that accepts three numbers and return the minimum number

        int number1 = 20;
        int number2 =88;
        int number3 = 655;
        int min = 0;
         if (number1 <number2 && number1<number3){
            min = number1;
        }
        if (number2 <number1 && number2<number3){
            min = number2;
        }
        if (number3 <number2 && number3<number1){
            min = number3;
        }
        System.out.println("Minimum number is : "+ min);


    //4. write a java program that accepts three numbers and return the mediam number

        int a= 10;
        int b= 6;
        int c= 8;






   /* 5. write a java program that can identify if a person is eligible to vote for Donald Trump
    Note : use single if statements
         */

        byte  userAge = 28;
        byte voteAge =18;

        if(userAge>=voteAge){
            System.out.println("You are eligible to vote");
        }
        if (userAge< voteAge){
            System.out.println("You are not eligible to vote");
        }




    }

}
