package com.example.springjsonpractice.practice;

import java.util.Optional;

public class practiceOpt {

    public static void main(String[] args) throws Exception {
        Optional<String> optEmptyName = getOptionalEmpty();
//        if (optName.isPresent()) {
//            String name = optName.get();
//            System.out.println(name);
//        } else {
//            System.out.println(optName);
//        }
//        System.out.println(optEmptyName.orElseGet(() -> "Optionalの中が空でした"));
//        optEmptyName.orElseThrow(() -> new IllegalArgumentException("orElseThrowによる例外です"));

        Optional<String> optName = getOptionalName();
//        String orElseReciever = optEmptyName.orElse("String型");
//        System.out.println(orElseReciever);
//
//        String orElseGetReciever = optEmptyName.orElseGet(() -> "String型");
//        System.out.println(orElseGetReciever);
//
//        optEmptyName.orElseThrow(() -> {
//            System.out.println("orElseThrowのlamdaの中です");
//            return new Exception("orElseThrowの例外です");
//        });


        optName.ifPresent(name -> {
            System.out.println("Optionalの中は" + name + "でした");
            return "string返したい";
        });
        optEmptyName.ifPresent(name -> System.out.println("Optionalの中は" + name + "でした"));

    }

    static Optional<String> getOptionalEmpty() {
//        Optional<String> name = Optional.empty();
        Optional<String> name = Optional.ofNullable(null);
        return name;
    }

    static Optional<String> getOptionalName() {
        Optional<String> name = Optional.of("くさの");
        return name;
    }

}
