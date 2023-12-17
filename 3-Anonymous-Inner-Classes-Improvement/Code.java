abstract class TestJava9AnonymousInnerClass<T>{  
    abstract T show(T a, T b);  
}  
public class TypeInferExample {  
    public static void main(String[] args) {  
        TestJava9AnonymousInnerClass<String> a = new TestJava9AnonymousInnerClass<>() { // diamond operator is empty, compiler infer type  
            String show(String a, String b) {  
                return a+b;   
            }  
        };    
        String result = a.show("Java"," 9");  
        System.out.println(result);  
    }  
}


----------------------------------------------------------------------------------------------------------------

Java 8 compiler throws compile time error because it can't infer type. The error message looks like the below.

----------------------------------------------------------------------------------------------------------------


TypeInferExample.java:7: error: cannot infer type arguments for TestJava9AnonymousInnerClass<T>
		TestJava9AnonymousInnerClass<String> a = new TestJava9AnonymousInnerClass<>() {
																				 ^
  reason: cannot use '<>' with anonymous inner classes
  where T is a type-variable:
    T extends Object declared in class TestJava9AnonymousInnerClass
1 error