package org.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext cnt = new ClassPathXmlApplicationContext("basic.xml");
        Document doc = (Document)cnt.getBean("doc");
        doc.display();
    }
}
