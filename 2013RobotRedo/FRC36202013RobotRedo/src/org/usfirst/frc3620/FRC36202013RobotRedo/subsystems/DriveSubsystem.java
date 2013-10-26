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
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc3620.FRC36202013RobotRedo.Robot;
import org.usfirst.frc3620.FRC36202013RobotRedo.RobotMap;
import org.usfirst.frc3620.FRC36202013RobotRedo.RobotMode;
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
    public DriveSubsystem() {
        super();
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveArcadeCommand());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    private boolean reverseMode = false;
    /**
     *
     * @param hid
     * @param turbo
     */
    public void arcadeDrive(GenericHID hid, boolean turbo) {
        double x = hid.getX();
        double y = hid.getY();
        if (reverseMode) {
            x = -x;
            y = -y;
        }
        primaryDrive.arcadeDrive(x, y);
        if (turbo) {
            secondaryDrive.arcadeDrive(x, y);
        } else {
            secondaryDrive.drive(0, 0);
        }
    }
    /**
     * Drive under autonomous, using primaryDrive only.
     *
     * @param outputMagnitude
     * @param curve
     */
    public void drive(double outputMagnitude, double curve) {
        //primaryDrive.drive(outputMagnitude, curve);
        //secondaryDrive.drive(0, 0);
        System.out.println("Drive is broken");
    }
    public void driveCorrectly(double x, double y) {
        primaryDrive.arcadeDrive(x, y);
        secondaryDrive.drive(0, 0);
    }
    /**
     * Halt all drive motors.
     */
    public void halt() {
        primaryDrive.drive(0, 0);
        secondaryDrive.drive(0, 0);
    }
    public void resetGyro() {
        gyro.reset();
    }
    public double readGyro() {
        return gyro.getAngle();
    }
    public void resetEncoder() {
        driveEncoder.reset();
    }
    public double readEncoder() {
        return driveEncoder.getDistance() * 0.001; //reverses sign because encoders were all muggered(put on backwards)
    }
    public void toggleReverseMode() {
        synchronized (this) {
            reverseMode = !reverseMode;
        }
    }
    public void setReverseMode(boolean reverse) {
        this.reverseMode = reverse;
    }
    public boolean getReverseMode() {
        return reverseMode;
    }
    
    // TODO make sure we do the same for the secondary drive
        boolean savedDriveSafety = primaryDrive.isSafetyEnabled();
    public void onRobotModeChange (RobotMode robotMode) {
        if (robotMode == RobotMode.TEST) {
            savedDriveSafety = primaryDrive.isSafetyEnabled();
            System.out.println("disabling drive safety");
            primaryDrive.setSafetyEnabled(false);
        } else {
            System.out.println("put drive safety back: " + savedDriveSafety);
            primaryDrive.setSafetyEnabled(savedDriveSafety);
        }
     }
    
    public void periodic (RobotMode robotMode) {
        SmartDashboard.putNumber ("drive.l", Robot.driveSubsystem.leftDriveController.get());
        SmartDashboard.putNumber ("drive.r", Robot.driveSubsystem.rightDriveController.get());
    }
}
