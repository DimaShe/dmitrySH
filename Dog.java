package Lesson_5;

public class Dog extends Animal{

    protected int swim;
    protected float jump;

    public Dog(String name, int run, int swim,float jump) {
        super(name, run);
        this.swim = swim;
        this.jump = jump;
    }
    public void InfDog(){
        System.out.println("Имя Собаки:"+ name + "Пробежал:" + run + "Метров"+"Проплыл:"+ swim +"Прыгнул:"+ jump +"Метров");
    }
}
