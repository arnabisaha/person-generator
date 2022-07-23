package src.main.java;

class PersonGeneratorApp {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Arnabi");
        p1.setAge(20);
        p1.setGender('F');
        p1.setHeight(5.1);
        p1.setWeight(54);

        System.out.println(p1);

        Person p2 = new Person();
        p2.setName("Arnab");
        p2.setAge(21);
        p2.setGender('M');
        p2.setHeight(5.2);
        p2.setWeight(55);

        System.out.println(p2);
    }

}