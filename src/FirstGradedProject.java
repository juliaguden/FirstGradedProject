public class FirstGradedProject extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {

        plane.loadBackGround("RAINBOW.jpg");          //*** new method to load a diffrent JPG
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());




        for (int row = 1; row < plane.getBackGroundHeight(); row++)    //*** this is using new getBackground
        {
            for (int col = 1; col < plane.getBackGroundWidth(); col++)    //*** this is using new getBackgroun
            {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();


                if (red > 85 && green > 100 && blue > 180) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(255, 192, 203);
                }

                if ((red > 96 && green > 38 && blue > 140) && (red < 108 && green < 51 && blue < 148)) {
                    plane.setPixelColor(250, 0, 0);
                }
                if ((red > 1 && green > 165 && blue > 215) && (red < 5 && green < 170 && blue < 230)) {
                    plane.setPixelColor(255, 165, 0);
                }
                if ((red > 140 && green > 180 && blue > 65) && (red < 150 && green < 195 && blue < 80)) {
                    plane.setPixelColor(255, 255, 0);
                }
                {
                    if ((red > 245 && green > 225 && blue > 38) && (red < 265 && green < 236 && blue < 50)) {
                        plane.setPixelColor(0, 255, 0);
                    }
                }
                if ((red > 230 && green > 120 && blue > 40) && (red < 250 && green < 135 && blue < 55)) {
                    plane.setPixelColor(0, 0, 255);
                }

                if ((red > 225 && green > 38 && blue > 50) && (red < 240 && green < 48 && blue < 65)) {
                    plane.setPixelColor(128, 0, 128);
                }
            }
        }
        plane.teleport(6, 5);

        plane.isTrail = true;
        plane.pausetime = 1;
        plane.trailWidth = 5;
        plane.move(480);
        plane.turn(90);
        plane.move(590);
        plane.turn(90);
        plane.move(480);
        plane.turn(90);
        plane.move(590);

        rowOfSquares();




                }

    public void drawSquare(){
        for (int i=0; i<=3;i=i+1){
            plane.isTrail=true;
            plane.trailWidth=3;
            plane.move(30);
            plane.turn(90);

        }

    }

    public void rowOfSquares(){
        for(int s=1;s<250;s=s+10){
            for(int f=1;f<250;f=f+10) {
                plane.teleport(s*2.5 , f*2.5);
                plane.setColor(200,f,s);

                drawSquare();
            }
        }
    }
            }


