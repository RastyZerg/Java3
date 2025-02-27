package Generics;

public class Fruit {
    private String type;
    private static final float appleWeight = 1f;
    private static final float orangeWeight = 1.5f;

    public Fruit(String type){
    }

    public float getWeight(){
        switch (this.type){
            case "Apple": return appleWeight;
            case "Orange": return orangeWeight;
            default: throw new RuntimeException("Unexpected fruit type");
        }

    }
}
