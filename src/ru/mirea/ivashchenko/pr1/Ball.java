package ru.mirea.pr1;

public class Ball {
    private String color = " ";
    private int weight = 0;

    public Ball(String c, int w){
        color = c;
        weight = w;
    }

    public Ball(String c){
        color = c;
    }

    public Ball(int w){
        weight = w;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getColor(){
        return color;
    }

    public int getWeight(){
        return weight;
    }

    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}