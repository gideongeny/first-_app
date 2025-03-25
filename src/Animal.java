public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println(name + "makes a sound");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}
