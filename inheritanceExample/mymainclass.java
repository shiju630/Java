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
      //myDog.dogBark();  //does not work
      myDogg.animalSound();
      myDogg.dogBark(); 

      Date cd = new Date();
      //long time = cd.getTime();
      System.out.println(cd);

      LocalDateTime ld = LocalDateTime.now();
      System.out.println(ld);

    }
  }