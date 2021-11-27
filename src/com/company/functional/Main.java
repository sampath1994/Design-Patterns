package com.company.functional;

import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.function.Function;
/**
 * compare using lambda expression vs the normal way
 * */
public class Main {
    public static void main(String[] args) {
        //Without using lambda expressions
        Function<String, String> greet = new Greet();
        System.out.println(greet.apply("Promod"));

        //Without using lambda expressions - inner class
        Function<String, String> greetInner = new Function<String, String>(){
            @Override
            public String apply(String s) {
                return "Hello "+s;
            }
        };
        System.out.println(greetInner.apply("Promod inner"));

        //With using lambda expressions
        Function<String, String> fGreet = name -> "Hello "+name;
        System.out.println(fGreet.apply("Promod arg"));

        //lambda expression As argument
        argCheck(name -> "Hii "+name);

        //Method reference
        argCheck(name -> name.toLowerCase()); // When lambda expression does nothing but call an existing method...
        argCheck(String::toLowerCase);  //So we can use method reference

        //Effectively final variable usage
        String text = "Hii ";
//        text="new text";   //This line makes 'text' variable not effectively final
        argCheck(name -> text +name);
    }

    public static void argCheck(Function<String, String> greet){
        System.out.println(greet.apply("Sam"));
    }
}
