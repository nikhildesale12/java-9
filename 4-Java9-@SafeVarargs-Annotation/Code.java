import java.util.ArrayList;  
import java.util.List;  
public class SafeVar{  
    // Applying @SaveVarargs annotation  
    @SafeVarargs  
    private void display(List<String>... products) { // Not using @SaveVarargs  
        for (List<String> product : products) {  
            System.out.println(product);  
        }  
    }  
    public static void main(String[] args) {  
        SafeVar p = new SafeVar();  
        List<String> list = new ArrayList<String>();  
        list.add("Laptop");  
        list.add("Tablet");  
        p.display(list);  
    }     
}  

------------------------------------------------------------------------------------------
What happens? If we compile the following code by using older versions of Java.
------------------------------------------------------------------------------------------

SafeVar.java:6: error: Invalid SafeVarargs annotation. Instance method display(List<String>...) is not final.
	private void display(List<String>... products) {
	             ^
Note: SafeVar.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
