package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ComparatorAndThenComparing {

    class Employee {
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

        public static void main(String[] args) {
            Stream<streams.Employee> employeeStream = Arrays.asList(new streams.Employee(1,"Gaurav","Ratlam")
                    ,new streams.Employee(2,"Abhi","Indore")
                    ,new streams.Employee(3,"Arshad","Ratlam")
                    ,new streams.Employee(4,"Wadu","Indore")
                    ,new streams.Employee(5,"Sourabh","Mandsaur")
                    ,new streams.Employee(6,"Akash","Indore")
                    ,new streams.Employee(7,"Ajay","Ratlam")
                    ,new streams.Employee(8,"Mukesh","Mandsaur")
            ).stream();

           // employeeStream.sorted(Comparator.comparing(streams.Employee::getName)).forEach(System.out::println);

            employeeStream.sorted(Comparator.comparing(streams.Employee::getName).thenComparing(streams.Employee::getCity)).forEach(System.out::println);
    }
}
