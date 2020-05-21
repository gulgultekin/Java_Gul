package day37_Constructors;

public class CybertekStudent {

    static String schoolName = "Cybertek University"; // herkeste ayni old icin sadece static olarak initialize ettik
    String studentName; //we must need to know
    int groupNumber;  //we must need to know
    String batch;   //we must need to know

    public CybertekStudent(String studentName,int groupNumber,String batch){
      // schoolName = "Cybertek University";
//school ismini constructor icinde initialize edersek obje altinda bir degisiklik yapilirsa farkli sonuc cikar
  //  cunku constructor her  objeden sonra yeniden run yapiyor. Bu yuzden constructor icinde STATIC VARiable initialize yapmamaliyiz
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;

    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group: "+groupNumber+" School Name: "+schoolName;
    }

}

class CObjects{
    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent("Gul",4,"Batch 18 ");
           student1.schoolName ="Harvard";
        System.out.println(student1);

        CybertekStudent student2 = new CybertekStudent("Ayse",12,"Batch 18");
        System.out.println(student2);

    }
}
