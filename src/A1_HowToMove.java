//public: visible to everyone
//class: template
//After class we say the name of the class which in this case is A1_HowToMove
//extends World: inventory

public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    //void:returnType which is null in this case (null of nothing)

    public void go(){
        shape(20, 90, 50);
    }

    public void shape (int i, int j,int n){
        for(int Z=100; Z<900; Z=Z+90) {
            plane.teleport(Z+50,200);
    plane.trailWidth=5;
    plane.isTrail = true;
    plane.startingAngle(90);
    plane.move(i);
    plane.turn(j);
    plane.move(n);
    plane.turn(j);
    plane.move(i);
    plane.turn(j);
    plane.move(n);
    plane.turn(j);


//        System.out.println("This message will be printed to the window below.");
//        System.out.println("That window is called the dos window");
//        //Word before fullstop refers to an object/class
//        //Word after fullstop refers to a method/variable
//        //Method has parenthesis after it
//        //Variable does not have parenthesis after it but it has =
//        //Hence plane.pausetime refers to a variable in an object called plane
//        plane.pausetime = 2;
//        plane.startingAngle(25);
//        plane.isTrail = true;
//        plane.move(200);
//        plane.isTrail = false;
//        plane.move(300);
//        plane.isTrail = true;
//        plane.move(150);

//int- integer 1,2,3, etc.
        //char- character A, B, C, etc
        //string- words/sentence "hello", etc
        //booleans- true/false
    }

} }

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/