    
public class Cat {
String name;
String colour;
double age;
double weight;
int hp;
int energy;
String food;
int mood;
    public String meow(){
     String say = ("Meeeoow");
     mood ++;
     return say;
    }
    public void run(){
        hp ++;
        weight -= 0.2;
        energy -= 20;
        mood --;
    }
    public void eat(){
        if (food.equals("sweet")) {
            mood++;
            weight += 0.3;
        }
        if (food.equals("fruits"))
            weight +=0.1;
        mood--;
    }
    public void sleep(){
        energy = 100;
        mood ++;
    }
}
