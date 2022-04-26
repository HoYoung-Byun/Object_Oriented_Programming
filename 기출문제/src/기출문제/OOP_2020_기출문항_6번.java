package 기출문제;

public class OOP_2020_기출문항_6번 {

	
	private static String[] carName = {"BMW", "Ford", "Kia", "Mini", "Tesla", "Benz"};
	private static int[] carPower = {120, 110, 110, 90, 80, 130};  

	public static void main(String[] args) {
		
		Car[] car = new Car[7]; 
		
		car[0] = null; 
		System.out.println("car[0]: " + car[0]); 
		
		for (int i = 0; i < 6; i++) {
			car[i+1] = new Car(carName[i], carPower[i]); 
			System.out.println("car[" + (i+1) + "]: " + car[i+1]);
		}
		
		Person p1 = new Person("Tom", 35);
		Person p2 = new Person("Jane", 25); 
		
		System.out.println("p1: " + p1); 
		System.out.println("p2: " + p2); 
		
		for (int i = 0; i < 5; i++) {
			p1.addCar(car[i]); 
			p2.addCar(car[i+2]);
		}
		
		System.out.println("p1: " + p1); 
		System.out.println("p2: " + p2); 
		
		p2.addCar(car[1]); 
		System.out.println("p2: " + p2); 
		
		
		
		for (int i = 2; i < 7; i++) {

			p1.deleteCar(car[i]);
			p2.deleteCar(car[i-2]);
		}
		
		System.out.println("p1: " + p1); 
		System.out.println("p2: " + p2); 
		
		p2.deleteCar(new Car("Tesla", 80)); 
		System.out.println("p2: " + p2); 
	}
}


class Car{
	
	private String name;
	private int power;
	
	public Car() {
		this.name = "noname";
		this.power = 0;
	}
	
	public Car(String name, int power) {
		this.name = name;
		this.power = power;
	}
	
	public Car(Car car) {
		this.name = car.name;
		this.power = car.power;
	}
	
	public String getName() {
		return name;
	}
	public int getPower() {
		return power;
	}
	
	public String toString() {
		
		return name + "(" + power + ")";
	}
	
	public boolean equals(Car car) {
		return (this.name.equals(car.getName())&& this.power == car.power);
	}
}

class Person{
	
	private String name;
	private int age;
	private Car[] carlist = new Car[5];
	private int numOfCar = 0;
	
	public Person() {
		this.name = "noname";
		this.age = -1;
		numOfCar = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		numOfCar = 0;
	}
	
	public void deleteCar(Car car) {
		
		if(car == null) {
			return;
		}
		int i;
		for(i=0; i<numOfCar ;i++) {
			if(carlist[i].equals(car)) {
				
				int k;
				for(k=i+1; k<numOfCar ; k++) {
					carlist[k-1] = carlist[k];
				}
				carlist[numOfCar-1] = new Car();
				numOfCar--;
				break;
				
			}
		}
		
		
	}
	
	public void addCar(Car car) {
		
		int i;
		if(numOfCar == 5) {
			return;
		} 
		
		if(car == null) {
			carlist[numOfCar] = null;
		} else {
			carlist[numOfCar] = new Car(car);
			numOfCar++;
		}
	}
	
	public String toString() {
		String returnString = String.format("%s(%d)(%d) ",name,age,numOfCar);
		int i;
		for(i=0; i<numOfCar; i++) {
			returnString += String.format("%s(%d) ",carlist[i].getName(),carlist[i].getPower());
		}
		returnString.trim();
		return returnString;
	}
}












