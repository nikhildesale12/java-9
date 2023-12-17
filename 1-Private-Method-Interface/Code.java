interface Java9InterfacePrivateMethod {  
    default void say() {  
        saySomething();  
    }  
    private void saySomething() {  
        System.out.println("Hello... I'm private method of java 9");  
    }  
}  
public class PrivateInterface implements Java9InterfacePrivateMethod {  
    public static void main(String[] args) {  
        Java9InterfacePrivateMethod privateInterface = new PrivateInterface();  
        privateInterface.say();  
    }  
}  