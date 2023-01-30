package com.itea.andrii.lecture8.lesson8;


public class Program {
    public static void main(String[] args) {
        Account acc1 = new <String>Account("2234", 6000);

        String acc1Id = acc1.getId();
        double sum = acc1.getSum();

        System.out.printf("IdL %s Sum: %f \n", acc1Id, sum);

//        System.out.println(acc1Id);
//
//        Account<String, String> acc2 = new Account<>("sid5523", "5000");
//        System.out.println(acc2.getId());

//        Printer printer = new Printer();
//
//        String[] people = {q
//                "Tom",
//                "Alice",
//                "Sam",
//                "Kate",
//                "Bob",
//                "Helen"
//        };
//
//        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};

//        var trees = new Tree[]{
//                new Tree(),
//                new Tree()
//        };

//        Tree[] trees = {
//                new Tree(),
//                new Tree()
//        };
//
//        printer.print(people);
//        printer.print(numbers);
//
//        printer.print(trees);
    }
}
