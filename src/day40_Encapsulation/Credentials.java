package day40_Encapsulation;

public class Credentials {

    private String UserName;
    private String PassWord;

    public String getUserName(){
        return UserName;
    }

    public void setUserName(String UserName){
        this.UserName = UserName;
    }

    public String getPassWord(){
        return PassWord;
    }

    public void setPassWord(String Password){
        this.PassWord = Password;
    }

}
