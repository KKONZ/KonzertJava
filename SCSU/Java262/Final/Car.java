public class Car
{
 private String make;
 private int speed;
 private int yearModal;
 public Car(String make,int yearModal)
 {
  this.make = make;
  this.speed= speed;
  this.speed = 0;
  this.yearModal = yearModal;
 }
  
 public String setCarMake(String make)
 {
  this.make = make;
  return make;
 }
  
 public String getCarMake()
 {
  return make;
 }
  
 public int setyearModal(String model)
 {
  this.yearModal = yearModal;
  return yearModal;
 }
 
 public int getyearModal()
 {
 return yearModal;
 } 
  
 public int getSpeed()
 {
  return speed;
 }
  
 public int setSpeed()
 {
  this.speed = speed;
  return speed;
 }
 
  public int accelerate(){
  speed = speed + 5;
  return speed;
  }
  
  public int brake(){
  speed = speed - 5;
  return speed;
  }
  
 public String toString()
 {
  return "Car make: " + make + "\n" +
  "model year: " + yearModal; 
  }
 
 public static void main (String[] args)
 {
  Car car1 = new Car(" Mazda ", 2000);
  
  System.out.println("\n" + car1);
  System.out.println("\nCurrently your car is parked, your speed is: " + car1.speed);
  System.out.println("\nGet ready, your " + car1.yearModal + " " + car1.make + " is about to accelerate. ");
  System.out.println("\nYour new speed is: " + car1.accelerate());
  System.out.println("Your new speed is: " + car1.accelerate());
  System.out.println("Your new speed is: " + car1.accelerate());
  System.out.println("Your new speed is: " + car1.accelerate());
  System.out.println("Your new speed is: " + car1.accelerate());
  
  System.out.println("\nWow that was fun lets start braking now!");
  System.out.println("\nYour new speed is: " + car1.brake());
  System.out.println("Your new speed is: " + car1.brake());
  System.out.println("Your new speed is: " + car1.brake());
  System.out.println("Your new speed is: " + car1.brake());
  System.out.println("Your new speed is: " + car1.brake());
  }
}