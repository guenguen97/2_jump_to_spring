package com.example.demo;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@RequiredArgsConstructor
@Getter

public class HellowLombok {

    private final String hello;
    private final int lombok;

    public static void main(String[] args){
        HellowLombok hellowLombok = new HellowLombok("헬로" ,5);


        System.out.println(hellowLombok.getHello());
    }
}
