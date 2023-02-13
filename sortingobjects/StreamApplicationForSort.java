package sortingobjects;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplicationForSort {

    static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("D", 40),
            new User("A", 10),
            new User("B", 20),
            new User("E", 50));

    public static void main(String[] args) {
        
        List<User> sortedListWithOutFunction = users.stream()
			.sorted((o1, o2) -> o1.getAge() - o2.getAge())
			.collect(Collectors.toList());
        System.out.println("With out function sort ");
        sortedListWithOutFunction.forEach(System.out::println);	
        List<User> sortedList = users.stream()
			.sorted(Comparator.comparingInt(User::getAge))
			.collect(Collectors.toList());
        System.out.println("Sort with function");
        sortedList.forEach(System.out::println);
//*1.2 reverse order.//        
        List<User> reversesortedList = users.stream()
        		.sorted(Comparator.comparingInt(User::getAge)
        		.reversed())
        		.collect(Collectors.toList());
        System.out.println("Sort with function in reverse order");
        reversesortedList.forEach(System.out::println);
 //*1.3 Sort by name//
        List<User> sortedListByName = users.stream()
        		.sorted(Comparator.comparing(User::getName))
        		.collect(Collectors.toList());
        System.out.println("Sort with function by name order");
        sortedListByName.forEach(System.out::println);

    }

    static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}