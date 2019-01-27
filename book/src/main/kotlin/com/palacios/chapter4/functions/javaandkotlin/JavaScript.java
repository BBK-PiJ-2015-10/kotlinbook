package com.palacios.chapter4.functions.javaandkotlin;

import com.palacios.chapter4.functions.generics.MyUtis;
import com.palacios.chapter4.functions.MyUtilities;

import java.io.IOException;

public class JavaScript {

    public static void main(String[] args) {

        String result  = MyUtis.choose("ale","palac","otero");
        System.out.println(result);

        ExampleDefaults function = new ExampleDefaults();
        //function.join();

        Console.INSTANCE.clear();

        Console.unclear();


        Console.INSTANCE.printMeIntegers(null);
        Console.INSTANCE.printMeStrings(null);

        Console.INSTANCE.createDirectory(null);

        try {
            Console.INSTANCE.createDirect(null);
        } catch (IOException e){
            System.out.println("I am catching a Kotlin annotated exception");
        }

    }

}
