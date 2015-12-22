package com.example.infra.controllers;

import com.example.domain.FizzBuzz;
import com.example.infra.dto.FizzBuzzResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzRest {

    @RequestMapping(method = RequestMethod.GET, value = "/fizzbuzz/{input}")
    public FizzBuzzResult getAllPromotionForCampagneId(@PathVariable Integer input) {
        final String fizzOrBuzz = new FizzBuzz(input).fizzOrBuzz();
        return new FizzBuzzResult(fizzOrBuzz);
    }

}
