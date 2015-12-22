package com.example.domain;

import cucumber.api.CucumberOptions;
import cucumber.api.java8.Fr;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/fizzbuzz.json"},
        features = "src/test/resources/fizzbuzz.features")
public class FizzBuzzTests implements Fr {

    FizzBuzz fizzOrBuzz;
    int entier;

    public FizzBuzzTests() {
        Soit("^un entier (\\d+)$", (Integer input) -> {
            entier = input;
        });
        Lorsqu("^on vérifie le résultat de fizzbuzz sur cet entier$", () -> {
            fizzOrBuzz = new FizzBuzz(entier);
        });

        Alors("^le fizzbuzz retourne \"([^\"]*)\"$", (String ouput) -> {
            assertThat(fizzOrBuzz.fizzOrBuzz()).isEqualTo(ouput);
        });
    }
}