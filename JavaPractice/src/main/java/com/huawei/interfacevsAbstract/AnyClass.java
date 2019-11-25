package com.huawei.interfacevsAbstract;

interface InterfaceWithDefaultMethod
{
    void abstractMethod();           //Abstract Method
     
    default void defaultMethod()
    {
        System.out.println("It is a default method");
    }
}
 
class AnyClass implements InterfaceWithDefaultMethod
{
    @Override
    public void abstractMethod() 
    {
        System.out.println("Abstract Method implemented");
    }
     
    //No need to implement defaultMethod()
    public static void main(String[] args) {
		new AnyClass().defaultMethod();
		new AnyClass().abstractMethod();
		
	}
}