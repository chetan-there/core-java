package OOP.src.Constuctors;

public class Human {

    String name;
    int age;
    double weight;

    //this is point to the current instance

     Human(String name,int age,double weight){

        this.name=name;
        this.age=age;
        this.weight=weight;

     }

     void eat(){
        System.out.println(this.name+" is eating. ");
     }

     void drink(){
        System.out.println(this.name+" is drinking. ");
     }

}
