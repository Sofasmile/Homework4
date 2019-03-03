package collection;

public class MyLinkedList<T> implements List<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyLinkedList() {
        first = new Node<>(null, null, null);
        last = first;
        size = 0;
    }

    //addLast
    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(last, item, null);
        if (size == 0) {
            first = newNode;
        }
        last.next = newNode;
        last = newNode;
        size++;
    }

    @Override
    public void remove(int i) {
        try {
            Node<T> x = getNode(i);
            if (x != null) {
                remove(x);
            }
        } catch (Exception e) {
            System.out.println("Can't remove element with this index");
        }
    }

    private void remove(Node<T> node) {
        Node<T> prev = node.prev;
        Node<T> next = node.next;
        if (prev.data == null) {
            first = node.next;
        } else if (next == null) {
            last = node.prev;
        } else {
            prev.next = next;
            next.prev = prev;
            node.next = null;
            node.prev = null;
        }
        node.data = null;
        size--;

    }

    private Node<T> getNode(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index is out of bound!");
        } else if (index < size / 2) {
            Node<T> item = first;
            for (int i = 0; i < index; i++) {
                item = item.next;
            }
            return item;
        } else {
            Node<T> item = last;
            for (int i = size - 1; i > index; i--) {
                item = item.prev;
            }
            return item;
        }
    }

    @Override
    public void clear() {
        int oldSize = size;
        for (int i = 0; i < oldSize; i++) {
            remove(0);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int i) {
        try {
            return getNode(i).data;
        } catch (Exception e) {
            System.out.println("Can't remove element with this index");
            return null;
        }
    }

    public void show() {
        Node<T> iterator = first;
        for (int i = 0; i < size; i++) {
            System.out.print("" + iterator.data + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }
}
