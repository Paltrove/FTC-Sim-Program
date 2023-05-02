//Allows Robot To Move With Little Code In Main
public void drive(int powerL,int powerR, int time){
  motorLeft.setPower(powerL);
  motorRight.setPower(powerR);
  sleep(time);
  motorLeft.setPower(0);
  motorRight.setPower(0);
  sleep(300);
}
