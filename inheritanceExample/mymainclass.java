import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }

  interface Bark {
      public void dogBark();
  }
  
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Animal implements Bark {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }

    public void dogBark(){
        System.out.println("dog bark");
    }
  }
  
  class mymainclass {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();  // Create a Animal object
      Animal myPig = new Pig();  // Create a Pig object
      Pig myPigg = new Pig();
      Animal myDog = new Dog();  // Create a Dog object
      Dog myDogg = new Dog();
    
  
      myAnimal.animalSound();

      myPig.animalSound();
      myPigg.animalSound();

      myDog.animalSound();
      myDogg.animalSound();
      //myDog.dogBark();  //does not work
      myDogg.dogBark(); 

      //creating an polymorphic array of animal class
      Animal animalarray[] = new Animal[2];
      animalarray[0] = new Pig();
      animalarray[1] = new Dog();

      for (Animal ani : animalarray) {
        ani.animalSound();
      }

      Date cd = new Date();
      //long time = cd.getTime();
      System.out.println(cd);

      LocalDateTime ld = LocalDateTime.now();
      System.out.println(ld);

    }
  }