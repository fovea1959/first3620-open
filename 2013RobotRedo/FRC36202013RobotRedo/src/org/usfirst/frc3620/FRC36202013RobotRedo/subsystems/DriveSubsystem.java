// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc3620.FRC36202013RobotRedo.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3620.FRC36202013RobotRedo.RobotMap;
import org.usfirst.frc3620.FRC36202013RobotRedo.commands.*;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftDriveController = RobotMap.driveSubsystemLeftDriveController;
    SpeedController rightDriveController = RobotMap.driveSubsystemRightDriveController;
    RobotDrive primaryDrive = RobotMap.driveSubsystemPrimaryDrive;
    SpeedController leftTurboController = RobotMap.driveSubsystemLeftTurboController;
    SpeedController rightTurboController = RobotMap.driveSubsystemRightTurboController;
    RobotDrive secondaryDrive = RobotMap.driveSubsystemSecondaryDrive;
    Gyro gyro = RobotMap.driveSubsystemGyro;
    Encoder driveEncoder = RobotMap.driveSubsystemDriveEncoder;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveArcadeCommand());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

