package kata01_42;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
        
    public Person(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
    }
        
    public String getName(){
        return name;
    }
        
    public int getAge(){
        /*Date timeNow = new Date();
        timeNow.setTime(System.currentTimeMillis());*/
        return(int) ((new Date().getTime()-birthday.getTime())/31536000000L);
        /*int edad = timeNow.getYear()- birthday.getYear();
        
        if(birthday.getMonth()>timeNow.getMonth()){
            return edad;
        }else if(birthday.getMonth()<timeNow.getMonth()){
            return edad-1;
        }else{
            if(birthday.getDay()>timeNow.getDay()){
                return edad;
            }else{
                return edad-1;
            }
        }*/
    }
}

