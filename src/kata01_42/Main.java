package kata01_42;

import java.time.LocalDate;
import static java.time.LocalDate.of;



public class Main {
    public static void main(String[] args) {
        LocalDate birthdate = of(1980,1,1);
        Person person1 = new Person("Antonio",birthdate);
        
        System.out.println(person1.getName()+" tiene " + person1.getAge()
                + " años.");
    }
    
    
    
}
