package Lesson_5;

public class Bird extends Animal {
    protected boolean swim;
    protected float jump;

    public Bird(String name, int run, boolean swim, float jump) {
        super(name, run);
        this.swim = swim;
        this.jump = jump;
    }
    public void InfBird(){
        System.out.println("Имя Птицы:"+ name + "Пробежал:" + run + "Метров"+"Проплыл:"+ swim +"Прыгнул:"+ jump +"Метров");
    }
}

