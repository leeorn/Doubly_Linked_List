package Leeor;

public class Main {

    public static void main(String[] args) {

        EmployeeLinkedList employee = new EmployeeLinkedList();

        Employee one = new Employee ("Amit", "Aola", 6);
        Employee two = new Employee ("Bill", "Bob", 12);
        Employee three = new Employee ("Coco", "Chill", 23);
        Employee four = new Employee ("Didi", "Dobe", 34);
        Employee five = new Employee("Ed","Eddie",45);

        employee.addToFront(one);
        employee.addToFront(two);
        employee.addToFront(three);
        employee.addToFront(four);
        employee.addToEnd(five);


        employee.printList();
//        System.out.println(employee.head.getPrev());
    }
}
