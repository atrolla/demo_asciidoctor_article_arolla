package com.example.domain;

public class FizzBuzz {

    public FizzBuzz(int input) {
        this.input = input;
    }

    public final int input;

    // tag::implementation[]
    public String fizzOrBuzz() {
        if (input % 15 == 0) {
            return "FizzBuzz";
        }
        if (input % 3 == 0) {
            return "Fizz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(input);
    }
    // end::implementation[]

}
