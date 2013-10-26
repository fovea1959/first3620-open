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

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3620.FRC36202013RobotRedo.Robot;

/**
 *
 */
public class FlipperFlipCommand extends Command {

    long startTime;
    long elapsedTime;
    long timeOut = 1000;
    long timeStopped = 500 + timeOut;
    long timeIn = 1000 + timeStopped;

    public FlipperFlipCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.flipperSubsystem);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        startTime = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        elapsedTime = System.currentTimeMillis() - startTime;
        if (elapsedTime <= timeOut) {
            Robot.flipperSubsystem.flipperForward();
        } else if (elapsedTime > timeOut && elapsedTime <= timeStopped) {
            Robot.flipperSubsystem.flipperStop();
        } else if (elapsedTime <= timeIn) {
            Robot.flipperSubsystem.flipperBackward();
        } else {
            Robot.flipperSubsystem.flipperStop();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (elapsedTime > timeIn) {
            return true;
        } else {
            return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.flipperSubsystem.flipperStop();

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
