interface Java9InterfacePrivateMethod {  
    default void say() { 
		staticMethod();
    }  
	private static void staticMethod(){
		System.out.println("Hello... I'm private static method of java 9"); 
	}
}  
public class PrivateInterface implements Java9InterfacePrivateMethod {  
    public static void main(String[] args) {  
        Java9InterfacePrivateMethod privateInterface = new PrivateInterface();  
        privateInterface.say();  
    }  
}  