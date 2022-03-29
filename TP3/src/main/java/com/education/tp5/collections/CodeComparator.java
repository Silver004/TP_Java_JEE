package com.education.tp5.collections;

import java.util.Comparator;

public class CodeComparator implements Comparator<Client> {
    @Override
    public int compare(Client c1, Client c2){
        return c1.code-c2.code;
    }
}
