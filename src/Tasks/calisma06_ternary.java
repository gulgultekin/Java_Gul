package Tasks;

public class calisma06_ternary {
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

         int statusCode = 401;
         String result=(statusCode==200)? "OK" : (statusCode==201) ? "Created" : (statusCode==202)? "Accepted" :
                 (statusCode==301)? "Moved Permanently" : (statusCode==303)? "See Other" :
                 (statusCode==304)? "Not Modified" : (statusCode==307)? "Temporary Redirect" :
                 (statusCode==400)? "Bad Request":  (statusCode==401)?"Unauthorized":
                 (statusCode==403)?"Forbidden": (statusCode==404)? "Not Found" :
                 (statusCode==410)? "Gone" :(statusCode==500)? "Internal Server Error" :
                 (statusCode==503)?"Service Unavailable":"Invalid Code";

        System.out.println(statusCode + " is: " +result);



    }
}
