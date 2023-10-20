public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go(){
        rowOfSquares();

    }
    public void Countdown(){
        for(int f=7; f>=1;f=f-1) {
            System.out.println(f);
        }



        }
        public void drawSquare(){
            for (int i=0; i<=3;i=i+1){
                plane.isTrail=true;
                plane.trailWidth=5;
                plane.move(30);
                plane.turn(90);

            }

        }

        public void rowOfSquares(){
            for(int s=1;s<250;s=s+10){
                for(int f=1;f<250;f=f+10) {
                    plane.teleport(s*3 , f*3);
                    plane.setColor(200,f,s);

                    drawSquare();
                }
            }
        }

       // for (int row=0; row<=5; row=row+1){
          //  for(int stars=1; stars<=row; stars=stars+1){
            //    System.out.print('*');


           // System.out.println("");



}
