package Lesson_6;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] Name = {"Dima", "Andey", "Oleg", "Stepan", "Dima", "Pavel", "Ivan", "Andrey", "Dima", "Nicolas", "Egor","Anton","Pavel","Evgeny","Harry","Tod","Ivan","Mishel","Oleg","Egor"};
        HashMap<String, Integer> name = new HashMap<>();
        for (String x : Name) {
            name.put(x, name.getOrDefault(x,0)+1);
        }
        System.out.println(name);
    }
// Сессия в вузе, не успеваю разобраться со вторым заданием, постараюсь приложить его к след дз.
}
