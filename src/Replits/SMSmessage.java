package Replits;
import java.util.Scanner;
/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */

public class SMSmessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        int start;
        int stop;

        start= message.indexOf("<");
        stop = message.indexOf(">");
        sender = message.substring(start+1,stop);

        start = message.indexOf("[");
        stop = message.indexOf("]");
        phoneNumber=message.substring(start+1,stop);

        start=message.indexOf("{");
        stop=message.indexOf("}");
        messageBody=message.substring(start+1,stop);

        System.out.println("sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);

















       /* int start;
        int stop;

        start = message.indexOf('<');
        stop = message.indexOf('>');
        sender = message.substring(start+1, stop);


        start = message.indexOf('[');
        stop = message.indexOf(']');
        phoneNumber = message.substring(start+1, stop);

        start = message.indexOf('{');
        stop = message.indexOf('}');
        messageBody= message.substring(start+1, stop);
        System.out.println("Sender: "+ sender);
        System.out.println("Phone Number: "+ phoneNumber);
        System.out.println("Message body: "+ messageBody);

*/


    }
}