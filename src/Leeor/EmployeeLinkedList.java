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

    public Employee removeFromFront(){

        //if the list is empty; nothing to return
        if (isEmpty())
            return null;

        //set tempHead to head
        EmployeeNode tempHead = head;
        //set head to the second item (making it the new head)
        head = tempHead.prev;
        //head points to null (nothing in front)
        head.setNext(null);
        //disconnecting the old head(tempHead) back pointer (not mandatory)
        tempHead.setPrev(null);

        size--;

        return tempHead.getEmployee();
    }

    public Employee removeFromEnd(){

        if (isEmpty())
            return null;

        EmployeeNode oldTail = tail;
        //setting tail to the one before the last item
        tail = oldTail.next;
        //disconnecting tail's prev pointer
        tail.setPrev(null);
        //disconnecting the old tail's pointer
        oldTail.setNext(null);

        size--;

        return oldTail.getEmployee();


    }

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
