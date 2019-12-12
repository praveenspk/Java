package com.spk.interfacevsAbstract;
/**
 * @author Praveen
 *
 */
interface anyInterface
{
    int i = 10;            //By default, interface fields are public, static and final
     
    void abstractMethod();          //Interface can have abstract method
     
    default void defaultMethod()
    {
        System.out.println("Interface can have default method");
    }
    default void displayDefaultMethod() {
    	System.out.println("Hello");
    }
     
    static void staticMethod() 
    {
        System.out.println("Interface can have static method");
    }
     
    //No constructors in an interface
     
    //No non-static and non-final variables in an interface
     
    //No private fields and methods in an interface
     
    //No protected fields and methods in an interface
     
    //No final methods in an interface
}