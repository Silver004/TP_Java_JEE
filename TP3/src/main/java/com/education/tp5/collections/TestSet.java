package com.education.tp5.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<String>();
        set1.add("ABC1");
        set1.add("ABC2");
        set1.add("ABC3");
        set1.add("ABC1");
        set1.add("ABC4");
        set1.add("ABC5");
        set1.forEach(i-> System.out.println(i));
        //spacing
        System.out.println();

        //Create hashset of clients
        Set<Client> set2 = new HashSet<Client>();
        set2.add(new Client(1,"Linus"));
        set2.add(new Client(1, "Linus"));
        set2.add(new Client(2,"Richard"));
        set2.forEach(i-> System.out.println(i));
        System.out.println();

        //create a TreeSet, the TreeSet will sort our numbers in this case
        Set<Integer> set3 = new TreeSet<>();
        set3.add(22);
        set3.add(11);
        set3.add(15);
        set3.add(9);
        set3.forEach(i-> System.out.println(i));
        System.out.println();

        //create a TreeSet of clients
        Set<Client> set4 = new TreeSet<>();
        set4.add(new Client(1, "Dennis"));
        set4.add(new Client(3, "Linus"));
        set4.add(new Client(2, "Richard"));
        set4.forEach(i->System.out.println(i));
    }
}
