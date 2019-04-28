package mate.academy.homework12.myArrayList;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class List<U> {
    public static void main(String[] args) {
        ArrayList putNuber = new ArrayList();
        Date start = new Date();
        LinkedList enterNumber = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            putNuber.add(0, i);
        }
        Date finish = new Date();
        long arrayListTime = finish.getTime() - start.getTime();
        System.out.println(arrayListTime);
        Date startLinked = new Date();
        for (int j = 0; j < 10000; j++) {
            enterNumber.add(0,j);
        }
        Date finishLinked = new Date();
        long arrLinked = finishLinked.getTime() - startLinked.getTime();
        System.out.println(arrLinked);
    }
}
