package ru.mirea.pr1;

public class Dog {
    private String name = " ";
    private int age = 0;
    private char gender = 'n';

    public Dog(String n, int a, char g){
        name = n;
        age = a;
        gender = g;
    }

    public Dog(String n){
        name = n;
    }

    public Dog(String n, int a){
        name = n;
        age = a;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}