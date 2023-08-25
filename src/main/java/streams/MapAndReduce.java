package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndReduce {

    /*class Emp{
        public int empId;
        public String name;
        public double salary;
        public String department;

        public Emp(int empId, String name, double salary, String department) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }
*/
    //Map->Transforming Data
    //Reduce->Aggregating Data(Combining elements of streams and produces a single result)
    // T reduce(T identity , BinaryOperator<T> accumulator) where identity is initial value of T and accumulator is a function for combining two values.

    public static void main(String[] args) {
        //Example 1:
        // find the sum of list of integers

        List<Integer> integers = Arrays.asList(3,7,8,1,5,9);
        // first method
        System.out.println(integers.stream().mapToInt(s -> s).sum());
        //second method
        System.out.println(integers.stream().reduce(0,(a,b)->a+b));

        //Example 2:
        // find the multiplication of list of integers
        // first method
        System.out.println(integers.stream().mapToInt(i -> i).reduce((a, b) -> a * b).getAsInt());
        // second method
        System.out.println(integers.stream().mapToInt(i -> i).reduce(1,(a, b) -> a * b));

        //Example 3:
        // find max value from list
        // first method
        System.out.println(integers.stream().mapToInt(i -> i).max().getAsInt());
        // second method
        System.out.println(integers.stream().reduce((a, b) -> a > b ? a : b).get());
        // third method
        System.out.println(integers.stream().reduce(Integer::max).get());

        //Example4
        //find the longest string

        List<String> strings = Arrays.asList("Hello","Gaurav","Welcome!");

        System.out.println(strings.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get());

        //Example5
        //mapped all the employee object based on there location

        List<Employee> employees = Arrays.asList(new streams.Employee(1,"Gaurav","Ratlam")
                ,new streams.Employee(2,"Abhi","Indore")
                ,new streams.Employee(3,"Arshad","Ratlam")
                ,new streams.Employee(4,"Wadu","Indore")
                ,new streams.Employee(5,"Sourabh","Mandsaur")
                ,new streams.Employee(6,"Akash","Indore")
                ,new streams.Employee(7,"Ajay","Ratlam")
                ,new streams.Employee(8,"Mukesh","Mandsaur")
        );
        Stream<Employee> employeeStream = employees.stream();

        Map<String,List<Employee>> employeeListCityBased =  employeeStream.collect(Collectors.groupingBy(Employee::getCity));
        employeeListCityBased.forEach((k,v)-> System.out.println("City is :"+k+" and Value is :"+v));

        //Example7
        //In above scenario i need set of employee as value in map instead of list of employee

        Stream<Employee> employeeStreams = employees.stream();
        Map<String, Set<Employee>> employeeSetCityBased = employeeStreams.collect(Collectors.groupingBy(Employee::getCity,Collectors.toSet()));
        employeeSetCityBased.forEach((k,v)-> System.out.println("City is :"+k+" and Value is :"+v));

        //Example8
        //mapped all the employee name based on there location

        Stream<Employee> employeeStream1 = employees.stream();
        Map<String, Set<String>> employeeNameSetCityBased = employeeStream1.collect(Collectors.groupingBy(Employee::getCity,Collectors.mapping(Employee::getName,Collectors.toSet())));
        employeeNameSetCityBased.forEach((k,v)-> System.out.println("City is :"+k+" and Value is :"+v));

        //Example9
        //return TreeMap for above example

        Stream<Employee> employeeStream2 = employees.stream();
        TreeMap<String, Set<String>> map =  employeeStream2.collect(Collectors.groupingBy(Employee::getCity,TreeMap::new,Collectors.mapping(Employee::getName,Collectors.toSet())));
        map.forEach((k,v)-> System.out.println("City is :"+k+" and Value is :"+v));


    }




}
