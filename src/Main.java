public class Main {
    private LinkedIntList linkedIntList = new LinkedIntList();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        System.out.println("Add first:");
        linkedIntList.addFirst(3);
        linkedIntList.addFirst(1);
        linkedIntList.addFirst(2);
        linkedIntList.addFirst(4);
        printLinkedIntList();

        System.out.println("-----------------\nRemove first:");
        linkedIntList.removeFirst();
        printLinkedIntList();

        System.out.println("-----------------\nAdd last:");
        linkedIntList.addLast(5);
        printLinkedIntList();

        System.out.println("-----------------\nRemove last:");
        linkedIntList.removeLast();
        printLinkedIntList();

        System.out.println("-----------------\nRemove Node at index 1:");
        linkedIntList.removeAtIndex(1);
        printLinkedIntList();

        System.out.println("-----------------\nAdd Node at index 1:");
        linkedIntList.addAtIndex(1, 5);
        printLinkedIntList();

        System.out.println("-----------------\nGet Node value at index 2:");
        System.out.println(linkedIntList.get(2).getValue());

        System.out.println("-----------------\nSize:");
        System.out.println(linkedIntList.size());

        System.out.println("-----------------\nIs empty:");
        System.out.println(linkedIntList.isEmpty());

        System.out.println("-----------------\nClear list:");
        linkedIntList.clear();
        System.out.println("Size: " + linkedIntList.size());
        System.out.println("IsEmpty: " + linkedIntList.isEmpty());

    }

    // Print LinkedIntList
    public void printLinkedIntList() {
        for (int i = 0; i < linkedIntList.size(); i++) {
            if (linkedIntList.size() - i != 1) {
                System.out.print(linkedIntList.get(i).getValue() + ", ");
            }
            else {
                System.out.print(linkedIntList.get(i).getValue() + "\n");
            }
        }
    }
}
