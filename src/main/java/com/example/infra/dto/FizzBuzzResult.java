package com.example.infra.dto;

import com.example.domain.FizzBuzz;

public class FizzBuzzResult {

    private String result;

    public FizzBuzzResult() {
    }

    public FizzBuzzResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
