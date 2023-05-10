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

//Proper Spaceing

/***********************************************************************
*                                                                      *
* OnbotJava Editor is still : beta! Please inform us of any bugs       *
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
        while (opModeIsActive()) {
            // Put loop blocks here
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

//Puzzle 2 Bridge

/***********************************************************************
*                                                                      *
* OnbotJava Editor is still : beta! Please inform us of any bugs       *
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

@Override
    public void runOpMode() {
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        color1 = hardwareMap.get(ColorSensor.class, "color1");
        distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
        imu = hardwareMap.get(BNO055IMU.class, "imu");
        // Put initialization blocks here
        waitForStart();
        drive(1,1,150);
        drive(-1,1,375);
        drive(-1,-1,150);
        drive(-1,1,750);
        drive(-1,-1,150);
        drive(-0.5,0.5,500);
        drive(0.5,-0.5,400);
        drive(-1,-1,149);
        drive(-1,1,780);
        drive(1,1,150);
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
