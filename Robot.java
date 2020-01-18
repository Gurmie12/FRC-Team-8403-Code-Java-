/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

**
 /* The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  

// This function initializes the objects to hold new instances of the seperate motor controllers, pistons and controllers.
// Each object class is derived from the FRC class.

  @Override
  public void robotInit() {
  
 Victor SP driveLeft1 = new VictorSP(0);
 Victor SP driveLeft2 = new VictorSP(1);
 Victor SP driveRight1 = new VictorSP(2);
 Victor SP driveRight2 = new VictorSP(3);
 Joystick controller1 = new Joystick(0);
 Solenoid intakePistonIn = new Solenoid(0);
 Solenoid IntakepistonOut = new solenoid(1);

}

  @Override
  public void autonomousInit() {
     long timeThatAutoStarted = System.curremtTimeMillis();
  }

  @Override
  public void autonomousPeriod() {
    long TimeSinceAutoStarted = System.curremtTimeMillis() - timeThatAutoStarted;

    if(timeSinceAutoStarted <1000){
      driveLeft1.setDrive(-.2);
    }else if(timeSinceAutoStarted < 3000){
      intakePistonIn.set(true);
      intakePistonOut.set(false);
    }
    else if (timeSinceAutoStarted <4000)
    setDrive(.2);
    intakePistonIn.set(true);
    intakePistonOut.set(false);
     else {
    setDrive(0):
    }
  }
  void setDrive(double speed){
    driveLeft1.set(speed);
    driveLeft2.set(speed);
    driveRight1.set(-speed);
    driveRight2.set(-speed);
  }
  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
  
  double controllerY = -controller1.getRawAxis(1);
  double controllerX = controller1.getRawAxis(0);
  
  driveLeft1.set(controllerY + controllerX);
  driveLeft2.set(controllerY + controllerX);
  driveRight1.set(9-1 *(controllerY - controllerX);
  driveRight2.set(-1 *(controllerY - controllerX);

  if (controller1.getRawButton(1) = true){
    intakePistonOut.set(true);
    intakePistonIn.set(false);
  }
  else if (controller1.getRawbutton(2) == true){
      intakePistonOut.set(false);
      intakePistonIn.set(true);
      system.out.printIn("Intake should go up now")
}

 }
  
  @Override
  public void testInit() {
  }

  @Override
  public void testPeriod() {
  }

}
