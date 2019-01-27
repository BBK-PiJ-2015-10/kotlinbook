package com.palacios.chapter7.annotations;

public class JavaScript {

    public static void main(String[] args) {

        HasStaticFuncs.INSTANCE.steteroids();

        HasStaticFuncs.INSTANCE.steteroids("Sharapova");

        HasStaticFuncs.INSTANCE.steteroids("Maria","Sharapova");


    }

}
