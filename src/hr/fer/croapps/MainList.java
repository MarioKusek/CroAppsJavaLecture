package hr.fer.croapps;

import java.util.LinkedList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<Integer>();

        int x = 12;

        integerList.add( x );
        int y = integerList.get( 0 );

    }
}
