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
if (color1.red() == 255) {
}
if (color1.blue() == 255) {
}
  
//Distance Detection
if (distance1.getDistance(DistanceUnit.CM) < 225) {
}

//Prints To Terminal
telemetry.addData("Distance", (distance1.getDistance(DistanceUnit.CM)));
telemetry.update();
