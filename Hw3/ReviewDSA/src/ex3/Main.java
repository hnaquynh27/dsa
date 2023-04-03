package ex3;

public class Main {
    public static void main(String[] args) {
        SimpleArrayList arr = new SimpleArrayList();
        arr.add(7);
        arr.add(11);
        arr.add(22);
        arr.add(33);
        arr.add(73);
        arr.add(7);
        arr.add(8);
        arr.printArray();
        System.out.println();

        System.out.println(arr.get(4));

        arr.set(4, 99);
        arr.printArray();
        System.out.println();

        arr.remove(7);
        arr.printArray();
        System.out.println();

        System.out.println(arr.isContain(8));
        System.out.println(arr.isContain(0));

        System.out.println(arr.size());
    }
}
