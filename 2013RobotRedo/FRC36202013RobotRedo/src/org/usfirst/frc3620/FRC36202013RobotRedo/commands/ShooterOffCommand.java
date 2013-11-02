// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc3620.FRC36202013RobotRedo.commands;

import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc3620.FRC36202013RobotRedo.*;

/**
 *
 */
public class  ShooterOffCommand extends Command {

    public ShooterOffCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooterSubsystem);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.shooterSubsystem.initCounter();
        Robot.shooterSubsystem.setFastShooterPower(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.shooterSubsystem.setFastShooterPower(0);
        System.out.println(Robot.shooterSubsystem.returnRPM());
        System.out.println(Robot.shooterSubsystem.getCount());
        SmartDashboard.putNumber("RPM", Robot.shooterSubsystem.returnRPM());
        SmartDashboard.putNumber("Count", Robot.shooterSubsystem.getCount());
        SmartDashboard.putNumber("Period", Robot.shooterSubsystem.getPeriod());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.shooterSubsystem.setFastShooterPower(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
