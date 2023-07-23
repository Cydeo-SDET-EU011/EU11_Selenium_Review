package week3;

import com.github.javafaker.*;

public class JavaFaker {



    public static void main(String[] args) {

        Faker faker = new Faker();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(faker.name().firstName());
//            System.out.println(faker.name().lastName());
//            System.out.println(faker.name().username());
//            System.out.println("*********************");
//        }

        System.out.println(faker.address().fullAddress());
    }
}
