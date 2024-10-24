package ds;

public class LL {
    private Node head = null; // First node of the list
    private Node tail = null; // Last node of the list
    private int size = 0; // the number of nodes in the list

    public void Add (int Data, Boolean flag) {
        if (head == null) { // Add the first node as head, if there is no head
            head = new Node(Data, null);
            tail = head;
            size++;
            return;
        }
        Node Temp = new Node(Data, null);
        if (flag == true) { // Add node at head
            Temp.SetNext(head); // or: Temp.Next = head;
            head = Temp;
        } else { // Add node at tail
            tail.SetNext(Temp);
            tail = Temp;
        }
        size++;
    }

    public int GetData(int index) {
        if (index <= 0) {
            return 0;
        }
        Node Current = head;
        // Pass through the linked list to reach to the desired position
        for (int i = 1; i < index; i++) {
            if (Current.GetNext() == null) {
                return 0;
            }
            Current = Current.GetNext();
        }
        return Current.GetData();
    }

    public void PrintAllData() {
        Node Current = head;
        int ReturnedValue = 0;
        for (int i = 0; i < size; i++) {
            ReturnedValue = Current.GetData();
            System.out.print(ReturnedValue + " -->");
            Current = Current.GetNext();
        }
        System.out.print("null");
    }

    public int GetSize() {
        return size;
    }

    public void Delete(Boolean flag) {
        if (head == null) {
            System.out.println("Error: Attempt to remove from an empty list");
            return;
        }
        if (flag == true) { // Delete from tail
            Node Current = head;
            for (int i = 0; i < size; i++) {
                if (Current.GetNext() == tail) {
                    tail = null;
                    Current.SetNext(null);
                    tail = Current;
                    size--;
                }
                Current = Current.GetNext();
            }
        } else { // Delete from head
            Node Temp = head;
            head = head.GetNext();
            Temp.SetNext(null);
            size--;
        }
    }
}


