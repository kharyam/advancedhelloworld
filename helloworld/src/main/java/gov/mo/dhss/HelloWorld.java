package gov.mo.dhss;

import java.util.Date;
import gov.mo.dhss.HelloWorldSupport;

public class HelloWorld {
  public static void main (String[] args) {
  HelloWorldSupport support = new HelloWorldSupport();
  String salutation = support.generateSalutation(args[0],new Date());
  System.out.println(salutation);
  }
}
