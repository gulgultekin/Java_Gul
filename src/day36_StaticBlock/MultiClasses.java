package day36_StaticBlock;

class Tester{// Access Modifier--> default
    public static void main(String[] args) {


        System.out.println("Tester class");
    }

}

class Developer{// Access Modifier--> default
    public static void main(String[] args) {


        System.out.println("Developer class");
    }


}

class scrumTeam{  // Access Modifier--> default
    public static void main(String[] args) {


        System.out.println("scrum team class");
    }


}



public class MultiClasses { // Access Modifier--> public

//public class name ile file name ayni olmali
    //sadece 1 public class olabilir

    public static void main(String[] args) {


        System.out.println("public class");
    }


}
//hepsinin icinde main class olabilir. herbirini tek tek run yapabilirsin