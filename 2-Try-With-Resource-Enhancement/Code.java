import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
public class FinalVariable {  
    public static void main(String[] args) throws FileNotFoundException {  
        FileOutputStream fileStream=new FileOutputStream("test.txt");  
        try(fileStream){  
             String greeting = "Welcome to Java 9 try with resource enhancement.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }         
    }  
}  