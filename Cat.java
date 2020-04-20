package Lesson_5;

public  class Cat extends Animal {
    protected boolean swim;
    protected int jump;

    public Cat(String name, int run, boolean swim, int jump) {
        super(name, run);
        this.swim = swim;
        this.jump = jump;
    }
    public void InfCat(){
        System.out.println("Имя Кота:"+ name + "Пробежал:" + run + "Метров"+"Проплыл:"+ swim +"Прыгнул:"+ jump +"Метров");
    }
}
