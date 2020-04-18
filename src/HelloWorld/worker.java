package HelloWorld;

public class worker {
    public String name;
    public int pay;
    public int age;

    public worker(String name, int pay, int age){
        this.name = name;
        this.pay = pay;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getPay() { return pay; }
    public int getAge() {
        return age;
    }

    public void printInfo(){
        System.out.println("worke-" + name + "\t pay-" + pay + "\t age-" + age);
    }
    public void printInfo2(){
        int b =5000;
        System.out.println("worker-" + name + "\t pay-" + (pay+b));
    }
    /*
    public void printInfo3(){
        System.out.println("average" getpay) + pay);

    }
     */
}
