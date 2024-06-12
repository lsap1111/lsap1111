//Class and object's
/*import java.util.*;
public class day20 {
    public static void main(String[] args) {
        Student s1 = new Student(); // created a student obj by the name s1
        s1.setMarks(89, 99, 78);
        System.out.println(s1.Marks);
        Pen p1 = new Pen();
        p1.setcolor("green");
        System.out.println(p1.color);
        p1.settip(9);
        System.out.println(p1.tip);
        Bank B1 = new Bank();
        B1.setPwd("adfla");
        B1.setuserName("okkkk");
    }
}

class Pen {
    String name;
    String color;
    int tip;

    void setname(String newname){
        name = newname;
    } 
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}

class Student {
    String Name;
    float Marks;
    int Rollno;

    Scanner as = new Scanner(System.in);
    void setMarks(int phy, int maths, int science){
        Marks = (phy + maths + science) / 3;
    }
}

class Bank{
    public String userName;
    private String password;
    public void setPwd(String Pwd){
        password = Pwd;
    }
    void setuserName(String newuserName){
        userName = newuserName;
    }
}*/

//Getter and setter;
 //get : use to return the value; 
 // setter are used to modify the value;
public class day20{
    public static void main(String[] args) {
        Pen p1 = new Pen();
       p1.setcolor("yellow");
       System.out.println(p1.getColor());
       p1.setTip(5);
       System.out.println(p1.getTip());
       Pen p2 = new Pen();
       p2.setcolor("pink "); 
    }
}

class Pen {
    String color;
    int tip;

    String getColor(){  //returning the color value; this refer to the current obj
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        color = newcolor;
    }
    void setTip(int tip/* its a external tip*/){
        this.tip /*this is a current class tip */= tip;//this is a external tip;
    }
}