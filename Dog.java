import java.util.*;


public class Dog extends Animal implements Comparable<Dog>{
   public String toString(){
       return this.name;
   }
   public int compareTo(Dog d1){
        if(this.legs == d1.legs){
            return 0;
        }
        else if (this.legs > d1.legs){
            return 1;
        }else{
            return -1;
        }
   }
   public Dog(String aName, int numOfLegs){
       this.name = aName;
       this.legs = numOfLegs;
   }
}