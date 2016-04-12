package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
        Employee e1 = new Employee("Neisha", "Stokes", "111-11-1111");
        Employee e2 = new Employee("Juan", "Carrillo", "222-22-2222");
        Employee e3 = new Employee("Alex", "Lancerio", "333-33-3333");
        Employee e4 = new Employee("Ritu", "Rai", "111-11-1111");
        
        
        Map<String,Employee> employees = new HashMap<>();
        employees.put("111-11-1111", e1);
        employees.put("222-22-2222", e2);
        employees.put("333-33-3333", e3);
        employees.put("111-11-1111", e4);
        //get values loop
        Collection<Employee> values = employees.values();
        for(Employee e : values) {
            System.out.println(e);
        }
        //Get keys loop
        Set<String> keys = employees.keySet();
//        
        for (String key : keys) {
            Employee e = employees.get(key);
            System.out.println(e);
        }
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
    }
}
