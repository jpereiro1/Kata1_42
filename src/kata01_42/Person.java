package kata01_42;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    
    public Person(String name, Calendar birthday){
        this.name = name;
        this.birthday = birthday;
    }
        
    public String getName(){
        return name;
    }
        
    public int getAge(){
        Calendar now = GregorianCalendar.getInstance();
        final long milliseconsPerYear = (long) (365.25*24*60*60*1000L);
        return (int) ((now.getTimeInMillis()-birthday.getTimeInMillis())/milliseconsPerYear);
    }
}

