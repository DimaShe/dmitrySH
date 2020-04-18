package HelloWorld;
import javafx.concurrent.Worker;
public class Main {

    public static void main(String[] args) {
	worker w1 = new worker("Ivanov", 35000,47);
	worker w2 = new worker("Petrov",27000,25);
	worker w3 = new worker("Stepanov",30000,40);
	worker w4 = new worker("Sidorov", 20000, 24);
	worker w5 = new worker("Akimov", 60000, 53);
	printWorkerInfo(w1);
	printWorkerInfo(w2);
	printWorkerInfo(w3);
	printWorkerInfo(w4);
	printWorkerInfo(w5);
	arr();
	}
    private static void printWorkerInfo(worker w1) {
        System.out.printf("worker %s, age %d \n", w1.getName(),w1.getAge());
    }
	//Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
	public static void arr(){
		worker[] workers = new worker[5];
		workers[0] = new worker("Ivanov",35000,47);
		workers[1] = new worker("Petrov",27000,25);
		workers[2] = new worker("Stepanov",30000,41);
		workers[3] = new worker("Sidorov",20000,24);
		workers[4] = new worker("Akimov",60000,53);
		for (int i = 0; i < workers.length; i++) {
			if(workers[i].getAge() > 40){
				workers[i].printInfo();
			}
		}
		//* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
		for (int i = 0; i < workers.length; i++) {
			if (workers[i].getAge() > 45){
				workers[i].printInfo2();
			}
		}
		/*Подсчитать средние арифметические зарплаты и возраста. ТАК И НЕ ПОНЯЛ. БУДУ ДАЛЬШЕ РАЗБИРАТЬСЯ.
		int sum = 0;
		for (int i = 0; i < workers.length; i++) {
			sum += workers[i].getPay();
			workers[i].printInfo3();
		} */
	}
}

