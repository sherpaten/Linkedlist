package ds;
public class Node {
    int Data;
    Node next;

    public Node(int _Data, Node _next) {
        Data = _Data;
        next = _next;

    }

    public Node GetNext() {
        return next;
    }

    public int GetData() {
        return Data;
    }

    public void SetData(int _Data) {
        Data = _Data;
    }

    public void SetNext(Node _next) {
        next = _next;
    }
}


