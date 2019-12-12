package com.spk.singleton;




import java.lang.reflect.Constructor;
/**
 * @author Praveen
 *
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
    	Singleton_Test instanceOne = Singleton_Test.getInstance();
    	Singleton_Test instanceTwo = null;
        try {
			Constructor[] constructors = Singleton_Test.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Singleton_Test) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
