// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc3620.FRC36202013Doug1;
    
import edu.wpi.first.wpilibj.Accelerometer;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController motorSubsystemMotorController;
    public static Accelerometer motorSubsystemAnalogAccelerometer;
    public static SpeedController driveSubsystemLeftDriveController;
    public static SpeedController driveSubsystemRightDriveController;
    public static RobotDrive driveSubsystemRobotDrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static Accelerometer2 motorSubsystemAccelerometer2;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        motorSubsystemMotorController = new Victor(1, 6);
	LiveWindow.addActuator("MotorSubsystem", "MotorController", (Victor) motorSubsystemMotorController);
        
        motorSubsystemAnalogAccelerometer = new Accelerometer(1, 1);
	LiveWindow.addSensor("MotorSubsystem", "AnalogAccelerometer", motorSubsystemAnalogAccelerometer);
        motorSubsystemAnalogAccelerometer.setSensitivity(1.0);
        motorSubsystemAnalogAccelerometer.setZero(2.5);
        driveSubsystemLeftDriveController = new Victor(1, 1);
	LiveWindow.addActuator("DriveSubsystem", "LeftDriveController", (Victor) driveSubsystemLeftDriveController);
        
        driveSubsystemRightDriveController = new Victor(1, 2);
	LiveWindow.addActuator("DriveSubsystem", "RightDriveController", (Victor) driveSubsystemRightDriveController);
        
        driveSubsystemRobotDrive = new RobotDrive(driveSubsystemLeftDriveController, driveSubsystemRightDriveController);
	
        driveSubsystemRobotDrive.setSafetyEnabled(true);
        driveSubsystemRobotDrive.setExpiration(0.1);
        driveSubsystemRobotDrive.setSensitivity(0.5);
        driveSubsystemRobotDrive.setMaxOutput(1.0);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        motorSubsystemAccelerometer2 = new Accelerometer2();
    }
}
