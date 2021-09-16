package kata01_42;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthday;
    
    public Person(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
        
    public String getName(){
        return name;
    }
        
    public int getAge(){
        LocalDate now = now();
        return Period.between(birthday,now).getYears();
    }
}

