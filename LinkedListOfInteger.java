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

    public Integer get(int index){
        if (index < 0 || index >= count){
            throw new IndexOutOfBoundsException();
        }
        if (index == count - 1){ //se o elemento é unico
            return tail.element;// return o elemento do nodo que esta sozinho
        }
        //criar um nodo auxiliar com referencia para o inicio
        //inicio = head
        Node aux = head;
        int aux_contador = 0;
        while(aux_contador < index){
            aux = aux.next;
            aux_contador++;
        }
        return aux.element;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head;

        while (aux != null) {
            s.append("Elemento: [");
            s.append(aux.element.toString());
            s.append("]");
            s.append("\n");
            aux = aux.next;
        }

        return s.toString();
    }  
}
