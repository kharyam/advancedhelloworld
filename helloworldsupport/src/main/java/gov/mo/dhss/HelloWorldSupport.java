package gov.mo.dhss;

import java.util.Date;

public class HelloWorldSupport {
    
    public String generateSalutation(String name, Date date) {
        String result = null;
       
        if (date == null) {
         date = new Date();
        }

        if (date.getHours() < 12 ) {
            result = "Good morning, " + name;
        } else if (date.getHours() < 18) {
            result = "Good afternoon " + name;
        } else {
            result = "Good evening " + name;
        }
        return result;
    }
}

