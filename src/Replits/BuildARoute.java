package Replits;

import java.util.Scanner;

public class BuildARoute {
    /*
    Write a program that will print out route instructions.
    Your program should take 2 parameters: start point and end point. U
    se left, right, up and down for navigation. Insert ">" between commands.
    If start point equals to end point - display: "start/end(start or end variable!) found".

Note: you may move only clock wise.
Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found


     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String start = scan.next();
        String end = scan.next();

        String path="";
        if(start.equalsIgnoreCase("A")){
            path+=end.equalsIgnoreCase("A")? "": end.equalsIgnoreCase("B")? "right: ":
                    end.equalsIgnoreCase("C")? "right > down: " : "right > down > left: ";

        }else if (start.equalsIgnoreCase("B")){
            path+=end.equalsIgnoreCase("B")? "" : end.equalsIgnoreCase("C")? "down: "
                    : end.equalsIgnoreCase("D")? "down > left: " : "down > left > up: ";

        }else if(start.equalsIgnoreCase("C")){
            path+= end.equalsIgnoreCase("C")? "" : end.equalsIgnoreCase("D")? "left: "
                    :end.equalsIgnoreCase("A")? "left > up: ": "left > up > right: ";
        }else{
            path+= end.equalsIgnoreCase("D")? "" : end.equalsIgnoreCase("A")?"up: "
                    :end.equalsIgnoreCase("B")? "up > right: ": "up > right > down: ";
        }

        System.out.println(path + end +" found");





    }
}
