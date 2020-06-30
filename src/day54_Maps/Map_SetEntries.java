package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

        LinkedHashMap<String,String> fb = new LinkedHashMap<>();
        fb.put("Tester01","password1");
        fb.put("Tester02","password1");
        fb.put("Tester02","password2");

        System.out.println(fb);  //{Tester01=password1, Tester02=password2}
        System.out.println(fb.size());  //2  --> key duplicate almiyor , valude de sonu olani aliyor

        fb.put("Tester03","password3");
        fb.put("Tester04","password4");
        fb.put("Tester05","password5");

        System.out.println("************keySet()*************************");

        System.out.println(fb.keySet()); //[Tester01, Tester02, Tester03, Tester04, Tester05]
        //sadece key'leri getiriyor

        fb.keySet();//collection of data old icin for each loop icinde yazdirabiliriz

        for( String eachKey : fb.keySet() ){

            System.out.println(eachKey);
           // System.out.println(eachKey+" "+fb.get(eachKey));
        }

        List<String> userName = new ArrayList<>(fb.keySet());
        System.out.println(userName);//[Tester01, Tester02, Tester03, Tester04, Tester05]

        System.out.println("************values()*****************************");

        System.out.println(fb.values()); //[password1, password2, password3, password4, password5]

        for(String eachValue : fb.values() ){

            System.out.println(eachValue);
        }


        // collection type old icin baska collection type aktarilabilir
        List<String> password = new ArrayList<>(fb.values());
        System.out.println(password); //[password1, password2, password3, password4, password5]


        System.out.println("***********************************************");


/*
 create a map and store your classmate' names and birthday
    create a map that conatins student names and Score
                                        String    Integer
                                    put 5 students names and thier scores
            write a program that can print out the names of the students who scored less than 90
 */

        LinkedHashMap<String,Integer>students = new LinkedHashMap<>();

        students.put("Zeynep",90);
        students.put("Elif",85);
        students.put("Zuleyha",96);
        students.put("Nedime",95);
        students.put("Canan",80);

        LinkedHashMap<String, Integer>badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer>goodStudents = new LinkedHashMap<>();

        for(String eachKey : students.keySet()){
            int eachValue = students.get(eachKey); //score
            if(eachValue < 90){
               // System.out.println(eachKey);  //name
                badStudents.put(eachKey,eachValue);
            }else{
                goodStudents.put(eachKey,eachValue);
            }
        }

        System.out.println(goodStudents); //{Zeynep=90, Zuleyha=96, Nedime=95}
        System.out.println(badStudents); //{Elif=85, Canan=80}







    }
}
