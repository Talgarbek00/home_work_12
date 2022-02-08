package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.service.CatImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aplicationComtext.xml");
        Person myPerson = applicationContext.getBean("MyPerson", Person.class);
        Person myPerson1 = applicationContext.getBean("MyPerson1", Person.class);

        System.out.println(myPerson);
        myPerson.getAnimal().animalPlus();
        myPerson.getAnimal().animalMinus();
        System.out.println("==================================");
        System.out.println(myPerson1);
        myPerson.getAnimal().animalPlus();
        myPerson.getAnimal().animalMinus();
    }
}
