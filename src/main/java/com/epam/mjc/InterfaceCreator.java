package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list1 -> {
            List<Integer> list2 = new ArrayList<>();
            for (Integer number : list1) {
                list2.add(number/divider);
            }
            return list2;
        };
    }
}
