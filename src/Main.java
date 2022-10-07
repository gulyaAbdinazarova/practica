public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("kisya");
        cat.setColor(" white");
        cat.setAge(3);
        cat.setWeight("salmagy 8");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(cat.getWeight());

        Dog dog = new Dog();
        dog.setName("Hatico");
        dog.setBreed("akulduular tibine kiret");
        dog.setColor("sveti kuron ");
        dog.setCan("kutkondu bilet");
        dog.setAge( 7);
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println(dog.getCan());
        System.out.println(dog.getColor());
        System.out.println(dog.getAge());


        Fish fish = new Fish();
        fish.setName("balyktyn aty Forel");
        fish.setGroup("oinoochular turuno kiret");
        fish.setAge( 2);
        fish.setCan("al suuda suzot");
        System.out.println(fish.getName());
        System.out.println(fish.getGroup());
        System.out.println(fish.getCan());
        System.out.println(fish.getAge());

        Popugay popugay = new Popugay();
        popugay.setName("popugaydyn aty Nastya");
        popugay.setAge(18);
        popugay.setColor("svety kyzyl");
        popugay.setPrice("baasy 15000");
        popugay.setCan("suylogondu kaytalayt");
        System.out.println(popugay.getName());
        System.out.println(popugay.getPrice());
        System.out.println(popugay.getCan());
        System.out.println(popugay.getAge());
        System.out.println(popugay.getColor());



    }}