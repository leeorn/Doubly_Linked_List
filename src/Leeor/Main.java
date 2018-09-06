package Leeor;

public class Main {

    public static void main(String[] args) {

        EmployeeLinkedList employee = new EmployeeLinkedList();

        Employee one = new Employee ("Amit", "Aola", 6);
        Employee two = new Employee ("Bill", "Bob", 12);
        Employee three = new Employee ("Coco", "Chill", 23);
        Employee four = new Employee ("Didi", "Dobe", 34);
        Employee five = new Employee("Ed","Eddie",45);

        //test to remove when list is empty (should be null)
        System.out.println(employee.removeFromEnd());
        System.out.println(employee.removeFromFront());
        System.out.println("\n");

        //adding to the list and printing it
        employee.addToFront(one);
        employee.addToFront(two);
        employee.addToFront(three);
        employee.addToFront(four);
        employee.addToEnd(five);

        employee.printList();


        System.out.println("\n");

        //removing from front and end and printing the list again
        employee.removeFromFront();
        employee.removeFromEnd();
        employee.printList();

    }
}
