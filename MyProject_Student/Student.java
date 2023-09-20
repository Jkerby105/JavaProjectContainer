package project1;

import java.util.regex.Pattern;

public class Student {

    //------------------\\
    private String userName;
    private String passWord;
    private String name;
    private String address;
    private String email;
    //------------------\\
    
    public Student(String userName, String passWorod, String name, String address,String email){
        setUserName(userName);
        setPassWord(passWorod);
        setName(name);
        setAddress(address);
        setEmail(email);
    }
    //--------------------------------------\\
    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassWord(String passWord){
        this.passWord = passWord;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }


         //---------------- Validate Email Address------------------- \\
    public boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
          .matcher(emailAddress)
          .matches();
    }
    
    public boolean testUsingStrictRegex(String emailAddress) {
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
     
            return patternMatches(emailAddress, regexPattern);
    }

    public void setEmail(String email){
        if(testUsingStrictRegex(email)){
            this.email = email;
        }else{
            this.email = "N/A";
        }
    }
             // ------------------------------------------------\\


    //--------------------------------------\\
    public String getUserName(){
        return this.userName;
    }

    public String getPassWord(){
        return this.passWord;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getEmail(){
        return email;
    }
    //--------------------------------------\\
    public String toString(){
        return this.name + " : " + this.address + " : " + this.email;
    }
    //--------------------------------------\\


    
}
