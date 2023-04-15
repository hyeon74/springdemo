package com.example.springdemo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class JspControllerTest {

    @Test
    void test5() {
        System.out.println("JspControllerTest::::::::");
        /*
        List<HashMap> cardLst = new ArrayList<HashMap>();

        HashMap<String, String> tmpCard = new HashMap<String, String>();

        tmpCard = new HashMap<String, String>();
        tmpCard.put("value", "aaa");
        cardLst.add(tmpCard);

        tmpCard = new HashMap<String, String>();
        tmpCard.put("value", "bbb");
        cardLst.add((HashMap)tmpCard.clone());

        tmpCard = new HashMap<String, String>();
        tmpCard.put("value", "ccc");
        cardLst.add(tmpCard);

        tmpCard = new HashMap<String, String>();
        tmpCard.put("value", "ddd");
        cardLst.add(tmpCard);

        for(HashMap<String, String> tmpInfo : cardLst){
            String strInfo = tmpInfo.get("value");
            System.out.println("strInfo:" + strInfo);
        }

        */

        List<String> items = new ArrayList<>();
        items.add("Paris");
        items.add("Seoul");
        items.add("Tokyo");
        items.add("Washington");

        items.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        items.forEach(name -> System.out.println(name));

        items.forEach(System.out::println);



    }
}