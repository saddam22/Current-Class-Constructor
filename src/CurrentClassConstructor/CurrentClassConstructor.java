
package CurrentClassConstructor;

public class CurrentClassConstructor {
    
    int id;
    String name;
    
    CurrentClassConstructor(){
        System.out.println("Default Constructor is invoked");
    }
    CurrentClassConstructor(int id, String name){
    
        this();//it is used to invoked current class constructor
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    
    public static void main(String[] args) {
        
        CurrentClassConstructor s1 = new CurrentClassConstructor(1, "Wan Sornolota IT");
        CurrentClassConstructor s2 = new CurrentClassConstructor(2, "Wan Online Quiz Contest");
        
        s1.display();
        s2.display();
    }
}
