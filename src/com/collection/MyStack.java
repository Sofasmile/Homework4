package collection;

public class MyStack<T> {
    private NodeStack<T> head;
    private int size;

    public MyStack() {
        head = new NodeStack<>(null, null);
        size = 0;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void push(T item) {
        NodeStack<T> node = new NodeStack<>(item, head);
        head = node;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Steck is empty!");
        }
        NodeStack<T> temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Steck is empty!");
        }
        return head.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        int oldSize = size;
        for (int i = 0; i < oldSize; i++) {
            pop();
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Steck is empty!");
            return;
        }
        if (index >= size || index < 0) {
            System.out.println("Index " + index + " is out of bound!");
            return;
        }
        if (index == 0) {
            pop();
        } else {
            NodeStack<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            remove(prev);
        }
    }

    private void remove(NodeStack<T> prev) {
        NodeStack<T> node = prev.next;
        if (node.next == null) {
            prev.next = null;
        } else {
            prev.next = node.next;
        }
        size--;
    }

    public void show() {
        NodeStack<T> item = head;
        for (int i = 0; i < size; i++) {
            System.out.print(item.data + " ");
            item = item.next;
        }
        System.out.println();
    }

}
