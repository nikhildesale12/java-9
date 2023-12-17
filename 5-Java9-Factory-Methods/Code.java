import java.util.List;  
public class FactoryMethodsExample {  
    public static void main(String[] args) {  
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:list) {  
            System.out.println(l);  
        }  
    }  
}  


--------------------------------------------------------------------------------------------

import java.util.Set;  
public class FactoryMethodsExample {  
    public static void main(String[] args) {  
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:set) {  
            System.out.println(l);  
        }  
    }  
}  


---------------------------------------------------------------------------------------------

import java.util.Map;  
public class FactoryMethodsExample {  
    public static void main(String[] args) {  
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");  
        for(Map.Entry<Integer, String> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }  
}  