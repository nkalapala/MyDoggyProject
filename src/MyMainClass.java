public class MyMainClass {
    public static void main(String[] args) {
        Dog dogObj1 = new Dog();
        Dog dogObj2 = new Dog();
        Dog dogObj3 = new Dog();

        dogObj1.setBreed("PUG");
        dogObj1.setColor("Black");

        dogObj2.setBreed("rottweiler");
        dogObj2.setColor("Brown");

        dogObj3.setAge(4);
        dogObj3.setAge(6);

        System.out.println(dogObj1.getBreed() + dogObj1.getColor());
        System.out.println(dogObj2.getBreed() + dogObj2.getColor());
    }

}
