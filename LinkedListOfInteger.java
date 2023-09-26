public class LinkedListOfInteger{

    class Node {
        public Integer element;
        public Node next;
        public Node(Integer e) {
         element = e;
         next = null;
         }
         } 

    Node head;
    Node tail;
    int count; 

    public LinkedListOfInteger() {
        this.head = null;
    }

    public void add(Integer element){
        Node novoNode = new Node(element);

        if (head == null) {
            head = novoNode;
        } else {
            tail.next = novoNode;
            }
            tail = novoNode;
            count++;
        }

    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        return count;
    }

    

    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head;

        while (aux != null) {
            s.append("Elemento: ");
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }

        return s.toString();
    }  
}
