package Lesson_5;

public class Horse extends Animal {
    protected int swim;
    protected int jump;

    public Horse(String name, int run, int swim,int jump) {
        super(name, run);
        this.swim = swim;
        this.jump = jump;
    }
    public void InfHorse(){
        System.out.println("Имя Лошади:"+ name + "Пробежал:" + run + "Метров"+"Проплыл:"+ swim +"Прыгнул:"+ jump +"Метров");
    }
}

