package ru.mirea.pr1;

public class Test {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", 3, 'm');
        Dog dog2 = new Dog("Mary", 2);
        Dog dog3 = new Dog("Jessie");

        dog2.setGender('f');
        dog3.setAge(5);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3 + "\n");

        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
        System.out.println();

        Ball ball1 = new Ball("Red", 7);
        Ball ball2 = new Ball("Blue");
        Ball ball3 = new Ball(15);

        ball2.setWeight(10);
        ball3.setColor("White");

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3 + "\n");

        Book book1 = new Book(250, "Horror");
        Book book2 = new Book(420);
        Book book3 = new Book("Adventure");

        book2.setGenre("Comedy");
        book3.setPages(150);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3 + "\n");
    }
}
