package Project2Package;

import java.io.*;
import java.lang.*;
import java.util.*;
//Question 7
class Emp {
    String name, dpt;
    int age;
    
    public Emp(String name,int age, String dpt){
        this.age = age;
        this.name = name;
        this.dpt = dpt;
    }
    
    public String printOut(){
        return this.name + " " + this.age + " " + this.dpt;
    }
    
}

class AgeSort implements Comparator<Emp>{
    public int compare(Emp x, Emp y){
        return x.age-y.age;
    }
    
}

class NameSort implements Comparator<Emp>{
    public int compare(Emp x, Emp y){
        return x.name.compareTo(y.name);
    }
}

class DptSort implements Comparator<Emp>{
    public int compare(Emp x, Emp y){
        return x.dpt.compareTo(y.dpt);
    }
}

public class ComparatorUse {
	public static void main(String[] args)
    {
          ArrayList<Emp> container = new ArrayList<Emp>();
          container.add(new Emp("John",34,"Design"));
          container.add(new Emp("Ben",30,"Coding"));
          container.add(new Emp("Hasan",25,"Marketing"));
          
          Collections.sort(container, new AgeSort());
          Collections.sort(container, new NameSort());
          Collections.sort(container, new DptSort());
  }
}
