package com.example.configurationproperties.order;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private static  Map<String,List<Item>> listMap = new HashMap<>();

    static {
        List<Item> items = Arrays.asList(new Item("apple",32F,12),
                new Item("graps",42F,22),
                new Item("chiku",3F,82));
        listMap.put("123098-551",items);

    }

    public static void main (String[] args) {
        //calling
        System.out.println(getOrder("123098-551"));
    }

    private static List<Item> getOrder(String orderNum){

        return listMap.get(orderNum);
    }
}
