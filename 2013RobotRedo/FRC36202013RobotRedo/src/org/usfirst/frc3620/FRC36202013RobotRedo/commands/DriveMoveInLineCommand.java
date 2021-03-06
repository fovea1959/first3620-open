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
import org.usfirst.frc3620.FRC36202013RobotRedo.*;
import org.usfirst.frc3620.FRC36202013RobotRedo.subsystems.*;
/**
 *
 */
public class  DriveMoveInLineCommand extends Command {
    DriveSubsystem driveSubsystem = Robot.driveSubsystem;
    
    private double howFar;
    
    private long t0;
    
    public DriveMoveInLineCommand(double meters) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveSubsystem);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
        howFar = meters;
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        driveSubsystem.resetEncoder();
        t0 = System.currentTimeMillis();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double howFast = 0.4;
        if (howFar > 0) {
            //driveSubsystem.autonomousTankDrive(-howFast, -howFast);
            driveSubsystem.autonomousDrive(-howFast, 0);
        } else {
            //driveSubsystem.autonomousTankDrive(howFast, howFast);
            driveSubsystem.autonomousDrive(howFast, 0);
        }
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        System.out.println("encoder = " + driveSubsystem.readEncoder());
        //if (System.currentTimeMillis() - t0 > 3000) return true;
        if (howFar > 0) {
            return driveSubsystem.readEncoder() > howFar;
        } else {
            return driveSubsystem.readEncoder() < howFar;
        }
    }
    // Called once after isFinished returns true
    protected void end() {
        driveSubsystem.halt();
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
