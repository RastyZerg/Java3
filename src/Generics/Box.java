package Generics;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{

    List<T> fruits = new ArrayList<T>();

    public Box(List<T> fruits){
        this.fruits = fruits;
    }

    public float getWeight(){
        return fruits.size() * fruits.getFirst().getWeight();
    }

    public void add(T fruit){
        fruits.add(fruit);
    }

    public boolean compare(Box box){
        return this.getWeight() == box.getWeight();
    }

    public void join(Box box){
        if (box.fruits.getFirst().getClass() == this.fruits.getFirst().getClass()){
            box.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
        else {
            System.out.println("Fruits are different");
        }
    }
}
