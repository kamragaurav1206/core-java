package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*

The groupingBy() method returns a Collector implementing a “GROUP BY” operation on Stream elements and returns the result as a Map.

Syntax
groupingBy(classifier)
groupingBy(classifier, collector)
groupingBy(classifier, supplier, collector)

classifier: maps input elements to map keys
collector: is the downstream reduction function. By default, Collectors.toList() is used which causes the grouped elements into a List.
supplier: provides a new empty Map into which the results will be inserted. By default, HashMap::new is used. We can use other maps such as TreeMap, LinkedHashMap or ConcurrentMap to insert additional behavior in the grouping process such as sorting.

 */
class Employee{
    private int id;
    private String name;
    private String city;

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class GroupBySample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new streams.Employee(1,"Gaurav","Ratlam")
                ,new streams.Employee(2,"Abhi","Indore")
                ,new streams.Employee(3,"Arshad","Ratlam")
                ,new streams.Employee(4,"Wadu","Indore")
                ,new streams.Employee(5,"Sourabh","Mandsaur")
                ,new streams.Employee(6,"Akash","Indore")
                ,new streams.Employee(7,"Ajay","Ratlam")
                ,new streams.Employee(8,"Mukesh","Mandsaur")
        );

        //Example1
        //mapped all the employee object based on there location
       Stream<Employee> employeeStream0 = employees.stream();

        Map<String,List<Employee>> employeeListCityBased =  employeeStream0.collect(Collectors.groupingBy(Employee::getCity));
        employeeListCityBased.forEach((k,v)-> System.out.println("City is :"+k+" and Value is :"+v));

        //Example2
        //In above scenario i need set of employee as value in map instead of list of employee

        Stream<Employee> employeeStreams = employees.stream();
        Map<String, Set<Employee>> employeeSetCityBased = employeeStreams.collect(Collectors.groupingBy(Employee::getCity,Collectors.toSet()));
        employeeSetCityBased.forEach((k,v)-> System.out.println("City is :"+k+" and Value is :"+v));

        //Example3
        //mapped all the employee name based on there location

        Stream<Employee> employeeStream1 = employees.stream();
        Map<String, Set<String>> employeeNameSetCityBased = employeeStream1.collect(Collectors.groupingBy(Employee::getCity,Collectors.mapping(Employee::getName,Collectors.toSet())));
        employeeNameSetCityBased.forEach((k,v)-> System.out.println("City is :"+k+" and Value is :"+v));

        //Example4
        //return TreeMap for above example

        Stream<Employee> employeeStream2 = employees.stream();
        TreeMap<String, Set<String>> treeMap =  employeeStream2.collect(Collectors.groupingBy(Employee::getCity,TreeMap::new,Collectors.mapping(Employee::getName,Collectors.toSet())));
        treeMap.forEach((k,v)-> System.out.println("City is :"+k+" and Value is :"+v));
    }
}
