//Allows Robot To Move With Little Code In Main
public void drive(int powerL,int powerR, int time){
  motorLeft.setPower(powerL);
  motorRight.setPower(powerR);
  sleep(time);
  motorLeft.setPower(0);
  motorRight.setPower(0);
  sleep(300);
}

//Color Detection
while (opModeIsActive()) {
  if (color1.red() == 255) {
    //Do Stuff
    }
  if (color1.blue() == 255) {
    //Do Stuff
  }
  if (color1.green() == 255) {
    //Do Stuff
  }
  break;
}
