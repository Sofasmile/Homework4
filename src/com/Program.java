import collection.MyArrayList;
import collection.MyLinkedList;
import collection.MyStack;

public class Program {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.show();
        list.remove(5);
        list.show();
        System.out.println(list.get(4));
        list.clear();
        list.show();
        System.out.println("--------------------");

        MyLinkedList<String> link = new MyLinkedList<>();
        link.add("a");
        link.add("b");
        link.add("c");
        link.add("d");
        link.add("e");
        link.show();
        link.remove(2);
        link.show();
        System.out.println(link.size());
        link.clear();
        System.out.println(link.size());
        link.show();

        System.out.println("--------------------");
        MyStack<String> steck = new MyStack<>();
        steck.push("a");
        steck.push("b");
        steck.push("c");
        steck.push("d");
        steck.push("e");
        steck.push("f");
        steck.show();
        System.out.println(steck.size());
        System.out.println(steck.peek());
        steck.pop();
        steck.show();
        steck.clear();
        steck.show();

    }
}
