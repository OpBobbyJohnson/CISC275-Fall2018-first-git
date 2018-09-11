import java.util.*;

public class Animal{
    public String name;
    public int legs;
    public String getName(){
        return this.name;
    }
    public int getLegs(){
        return this.legs;
    }
    public void setLegs(int numOfLegs){
        this.legs = numOfLegs;
    }
    public void setName(String aName){
        this.name = aName;
    }
}