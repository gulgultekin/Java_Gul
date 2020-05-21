package day41_Inheritance;

public class EBook extends Book{
/*
 public String title;
    public String author;
    public double price;         inherited
     public String toString(){
       return "Title: "+title+" Author: "+author+" Price: $"+price;
   }
 */
    public String size;
    public int pages;

    public void readbook(){
        System.out.println("I'm reading "+title);
    }


//    public static void main(String[] args) {
//
//        EBook ebook1 = new EBook();
//        ebook1.title= "Hamlet";
//        ebook1.author = "Shakespeare";
//        ebook1.price = 20;
//        ebook1.size = "2 Gb";
//
//        ebook1.pages =300;
//        System.out.println(ebook1.title+" is "+ebook1.size+" e-book with "+ebook1.pages+" pages long");
//        System.out.println(ebook1);
//
//    }

}
