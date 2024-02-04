
public class LinkedIntList {
    Node head;

    // Add first node
    public void addFirst(int value) {
        Node newHead = new Node(value); // Laver et nyt head
        newHead.next = head; // Sætter det gamle head til at komme efter det nye head
        head = newHead;
    }

    // Add last node
    public void addLast(int value) {
        if (head == null) { // Tjekker om der findes 1 Node
            head = new Node(value);
        } else { // Tjek og iterer igennem alle Nodes, indtil der bliver fundet en tom plads
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    // Add at index
    public void addAtIndex(int index, int value) {
        Node current = head;
        Node previous = null;

        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }

        // Hvis den forrige plads ikke er tom, så lav en ny Node på pladsen mellem den forrige og næste Node
        if (previous != null) {
            Node newNode = new Node(value);
            newNode.next = current;
            previous.next = newNode;
        } else { // Ellers, tilføj en ny Node på den første plads
            addFirst(value);
        }
    }

    // Remove at index
    public void removeAtIndex(int index) {
        Node current = head;
        Node previous = null;

        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }

        // Hvis den forrige plads ikke er tom, så spring Noden, der skal fjernes over.
        if (previous != null) {
            current = previous;
            current.next = current.next.next;
        } else { // Ellers, fjern den første Node
            removeFirst();
        }
    }

    // Remove last
    public void removeLast() {
        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        if (previous != null) {
            previous.next = null;
        }
    }

    // Remove first
    public void removeFirst() {
        head = head.next;
    }

    // Get Node at index
    public Node get(int index) {
        Node current = head;
        Node previous = null;
        int i = 0;

        while (i != index + 1) {
            previous = current;
            current = current.next;
            i++;
        }
        return previous;
    }

    // Get if empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get amount of Nodes
    public int size() {
        int counter;
        Node current = head;

        if (head == null) {
            counter = 0;
        } else {
            counter = 1;
        }

        if (current != null) {
            while (current.next != null) {
                current = current.next;
                counter++;
            }
        }
        return counter;
    }

    // Clear list
    public void clear() {
        head = null;
    }
}
