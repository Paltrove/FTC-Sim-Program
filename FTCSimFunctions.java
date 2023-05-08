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



/***********************************************************************
*                                                                      *
* OnbotJava Editor is still : beta! Please inform us of any bugs      *
* on our discord channel! https://discord.gg/e7nVjMM                   *
* Only BLOCKS code is submitted when in Arena                          *
*                                                                      *
***********************************************************************/


public class MyFIRSTJavaOpMode extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    ColorSensor color1;
    DistanceSensor distance1;
    BNO055IMU imu;
    boolean Data1 = false;
    boolean Data2 = false;

@Override
    public void runOpMode() {
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        color1 = hardwareMap.get(ColorSensor.class, "color1");
        distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
        imu = hardwareMap.get(BNO055IMU.class, "imu");
        // Put initialization blocks here
        waitForStart();
        // Put run blocks here
        drive(-1,1,150);
        drive(1,1,150);
        drive(-1,1,330);
        while (opModeIsActive()) {
            if (color1.red() == 255) {
                Data1 = true;
            }
            if (color1.blue() == 255) {
                Data1 = false;
            }
            drive(-0.5,-0.5,1);
            drive(1,-1,650);
            if (color1.red() == 255) {
                Data2 = true;
            }
            if (color1.blue() == 255) {
                Data2 = false;
            }
            break;
        }
        if (Data1 == 1 && Data2 == 1){
            drive(-1,1,475);
            drive(-1,-1,149);
            drive(-0.5,-0.5,1);
            drive(-1,1,475);
        }
    }
    
    public void drive(int powerL,int powerR, int time){
        motorLeft.setPower(powerL);
        motorRight.setPower(powerR);
        sleep(time);
        motorLeft.setPower(0);
        motorRight.setPower(0);
        sleep(300);
    }
}
