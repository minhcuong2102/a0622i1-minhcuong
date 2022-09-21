package bai_10.bai_tap.trien_khai_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("hello");
        list.add("code");
        list.add("gym");

        print(list.getElements());
        System.out.println(list.indexOf("hello"));
        System.out.println(list.indexOf("code"));
        list.remove(1);
        list.add("nhé", 2);
        print(list.getElements());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("code"));
        System.out.println(clone.contains("gym"));
        System.out.println(clone.get(3));
        System.out.println(clone.getSize());
        clone.clear();
        System.out.println(clone.getSize());
        print(clone.getElements());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println();
    }
}
