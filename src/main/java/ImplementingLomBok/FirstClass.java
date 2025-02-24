package ImplementingLomBok;

public class FirstClass {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.setName("PoisonMan");
        secondClass.setAge(25);
        System.out.println(secondClass.toString());
    }
}
