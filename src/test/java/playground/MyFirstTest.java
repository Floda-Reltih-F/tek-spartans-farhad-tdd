package playground;

import org.testng.annotations.*;

public class MyFirstTest {
    @BeforeClass
    public void runBeforeClass(){
        System.out.println("before classes");
    }


    @BeforeMethod
    public void runBeforeTest(){
        System.out.println("before each shit methode");
    }


    @Test
    public void anotherShit(){
        System.out.println("another how are you lol");
    }




    @Test
    public void firstTestMethode(){
        System.out.println("Hello MTF");
    }

@AfterMethod
    public void runAfterTest(){
        System.out.println("fk this after each shit");
    }



}
