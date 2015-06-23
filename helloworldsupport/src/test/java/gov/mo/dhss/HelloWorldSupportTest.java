package gov.mo.dhss;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class HelloWorldSupportTest {

@Test
public void morningTest() {
    Date date = new Date(2015,5,18,9,0);
    HelloWorldSupport support = new HelloWorldSupport();
    assertTrue(support.generateSalutation("Joe",date).contains("morning"));    
   } 

@Test
public void afternoonTest() {
    Date date = new Date(2015,5,18,14,0);
    HelloWorldSupport support = new HelloWorldSupport();
    assertTrue(support.generateSalutation("Joe",date).contains("afternoon"));
   }

@Test
public void eveningTest() {
    Date date = new Date(2015,5,18,19,0);
    HelloWorldSupport support = new HelloWorldSupport();
    assertTrue(support.generateSalutation("Joe",date).contains("evening"));
   }


}
