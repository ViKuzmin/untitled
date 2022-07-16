public class Main {

    private String name = "Man";

    public static void main(String[] args) {


        Main main = new Main();
        main.setName("Goga");

        main.sayHello();
        main.sayBy();

    }

    public void sayHello() {

        System.out.println("Hello " + this.name + "!");
    }

    public void sayBy() {

        System.out.println("Bye " + this.name + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
