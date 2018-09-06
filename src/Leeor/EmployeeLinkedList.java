package Leeor;

public class EmployeeLinkedList
{
    public EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){

        EmployeeNode newHead = new EmployeeNode(employee);

        //if the list is empty just put it there
        if (isEmpty())
        {
            head = newHead;
            tail = newHead;
            newHead.setNext(null);
            newHead.setPrev(null);
        }

        else
        {
            //the old head is setting its next to the new head
            head.setNext(newHead);
            //the new head setting its prev arrow to the old head and its
            // next arrow to null
            newHead.setPrev(head);
            newHead.setNext(null);
            //changing that head will be the new node (new head)
            head = newHead;
        }

        size++;
    }

    public void addToEnd(Employee employee){

        EmployeeNode newTail = new EmployeeNode(employee);

        //if the list is empty
        if (isEmpty())
        {
            head = newTail;
            tail = newTail;
            newTail.setNext(null);
            newTail.setPrev(null);
        }
        else
        {
            //setting the prev arrow from the old tail to point to the new
            // tail
            tail.setPrev(newTail);
            //inserting the new tail after the old tail and fixing pointers
            newTail.setNext(tail);
            newTail.setPrev(null);
            //now "the tail" become tail
            tail = newTail;
        }

        size++;
    }

//    public Employee removeFromFront(){
//
//        size--;
//    }
//
//    public Employee removeFromEnd(){
//
//        size--;
//    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize()
    {
        return size;
    }

    public void printList(){

        EmployeeNode current = head;
        System.out.println("Head: ");

        while (current != null)
        {
            System.out.println(current + " -> ");
            current = current.getPrev();
        }
        System.out.println("end");
    }

}
