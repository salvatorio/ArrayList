import java.util.Iterator;

/**
 * Created on 17. June. 16.
 *
 * @author Evgeniy
 */

public class MainArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            arrayList.add(i);
        }

        System.out.println("Input ArrayList:");
        System.out.println(arrayList);

        arrayList.add(5,100);
        System.out.println("After addition 100: \n" + arrayList);

        System.out.println("After deletion:\n" + arrayList.remove(5));
        System.out.println(arrayList);

        System.out.println("LastIndexOf: " + arrayList.lastIndexOf(0));
        System.out.println("Set: " + arrayList.set(5,100));
        System.out.println(arrayList);

        System.out.println("Remove (object) " + arrayList.remove( new Integer("10")));
        System.out.println(arrayList);
        System.out.println("Contains Object: " + arrayList.contains(10));

        Iterator iterator = arrayList.iterator();
        System.out.print("Iterator: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next() + "; ");
//            iterator.remove();
        }

        System.out.println();
        System.out.println("============================================");

        System.out.println(arrayList);
        System.out.println("============================================");
    }
}
