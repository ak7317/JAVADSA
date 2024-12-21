public class abstractclass {
  public static void main(String args[]){
    Horse h= new Horse();
    h.eat();
    h.walk();
    Chicken c=new Chicken();
    c.eat();
    c.walk();
    System.out.println(h.color);
    // System.out.println(h.changecolor());
  }
    
}
abstract  class  Animal {
  String color;
 
   Animal(){
    color="brown";

   }
  void eat(){
    System.out.println("eat");
  }
  abstract void walk();
}
class Horse extends Animal{
  void changecolor(){
    color="dark brown";
  }
    

    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
  void changecolor(){
    color="yellow";
  }
  void walk(){
    System.out.println("walk on 2 legs ");
  }
}

