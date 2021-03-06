// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc3620.FRC36202013RobotRedo;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc3620.FRC36202013RobotRedo.commands.*;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton liftExtend;
    public JoystickButton liftRetract;
    public JoystickButton driveTurboEnable;
    public JoystickButton driveDirectionToggle;
    public JoystickButton harvesterToggleOnOff;
    public Joystick driveJoystick;
    public JoystickButton flipperButton2;
    public JoystickButton flipperForward;
    public JoystickButton flipperBackward;
    public JoystickButton beltIn;
    public JoystickButton beltOut;
    public JoystickButton harvesterWheelIn;
    public JoystickButton harvesterWheelOutButton;
    public JoystickButton augerUp;
    public JoystickButton augerDown;
    public Joystick controlPanel;
    public JoystickButton flipperButton1;
    public JoystickButton augerIndex;
    public JoystickButton shooterOn;
    public JoystickButton shooterFaster;
    public JoystickButton shooterSlower;
    public JoystickButton shooterTiltToggle;
    public JoystickButton shooterTiltUp;
    public JoystickButton shooterTiltDown;
    public Joystick shooterJoystick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterJoystick = new Joystick(2);
        
        shooterTiltDown = new JoystickButton(shooterJoystick, 6);
        shooterTiltDown.whenPressed(new ShooterTiltBumpAngleDownCommand());
        shooterTiltUp = new JoystickButton(shooterJoystick, 7);
        shooterTiltUp.whenPressed(new ShooterTiltBumpAngleUpCommand());
        shooterSlower = new JoystickButton(shooterJoystick, 2);
        shooterSlower.whenPressed(new ShooterSlowerCommand());
        shooterFaster = new JoystickButton(shooterJoystick, 3);
        shooterFaster.whenPressed(new ShooterFasterCommand());
        shooterOn = new JoystickButton(shooterJoystick, 4);
        shooterOn.whileHeld(new ShooterOnCommand());
        augerIndex = new JoystickButton(shooterJoystick, 5);
        augerIndex.whenPressed(new AugerIndexCommand());
        flipperButton1 = new JoystickButton(shooterJoystick, 1);
        flipperButton1.whenPressed(new FlipperFlipCommand());
        controlPanel = new Joystick(3);
        
        augerDown = new JoystickButton(controlPanel, 9);
        augerDown.whileHeld(new AugerDownCommand());
        augerUp = new JoystickButton(controlPanel, 10);
        augerUp.whileHeld(new AugerUpCommand());
        harvesterWheelOutButton = new JoystickButton(controlPanel, 6);
        harvesterWheelOutButton.whileHeld(new HarvesterWheelOutManualCommand());
        harvesterWheelIn = new JoystickButton(controlPanel, 5);
        harvesterWheelIn.whileHeld(new HarvesterWheelInManualCommand());
        beltOut = new JoystickButton(controlPanel, 4);
        beltOut.whileHeld(new HarvesterBeltOutManualCommand());
        beltIn = new JoystickButton(controlPanel, 3);
        beltIn.whileHeld(new HarvesterBeltInManualCommand());
        flipperBackward = new JoystickButton(controlPanel, 7);
        flipperBackward.whileHeld(new FlipperBackwardCommand());
        flipperForward = new JoystickButton(controlPanel, 8);
        flipperForward.whileHeld(new FlipperForwardCommand());
        flipperButton2 = new JoystickButton(controlPanel, 1);
        flipperButton2.whenPressed(new FlipperFlipCommand());
        driveJoystick = new Joystick(1);
        
        harvesterToggleOnOff = new JoystickButton(driveJoystick, 1);
        harvesterToggleOnOff.whenPressed(new HarvesterToggleCommand());
        driveDirectionToggle = new JoystickButton(driveJoystick, 8);
        driveDirectionToggle.whenPressed(new DriveToggleReverseCommand());
        driveTurboEnable = new JoystickButton(driveJoystick, 3);
        driveTurboEnable.whileHeld(new DriveArcadeCommand());
        liftRetract = new JoystickButton(driveJoystick, 7);
        liftRetract.whileHeld(new LiftRetractCommand());
        liftExtend = new JoystickButton(driveJoystick, 6);
        liftExtend.whileHeld(new LiftExtendCommand());
	    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterTiltToggle = new JoystickButton(shooterJoystick, 8);
        shooterTiltToggle.whenPressed(new ShooterTiltToggleCommand());
        // SmartDashboard Buttons
        SmartDashboard.putData("AutonomousBoxCommand", new AutonomousBoxCommand());
        SmartDashboard.putData("AutonomousShoot3Command", new AutonomousShoot3Command());
        SmartDashboard.putData("HarvesterRunCommand", new HarvesterRunCommand());
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveJoystick() {
        return driveJoystick;
    }
    public Joystick getControlPanel() {
        return controlPanel;
    }
    public Joystick getShooterJoystick() {
        return shooterJoystick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
