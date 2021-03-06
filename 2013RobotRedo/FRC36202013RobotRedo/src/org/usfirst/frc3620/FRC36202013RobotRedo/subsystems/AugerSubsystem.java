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

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.*;
import org.usfirst.frc3620.FRC36202013RobotRedo.*;


/**
 *
 */
public class AugerSubsystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    AnalogChannel augerEncoder = RobotMap.augerSubsystemAugerEncoder;
    DigitalInput augerLimitSwitch = RobotMap.augerSubsystemAugerLimitSwitch;
    SpeedController augerController = RobotMap.augerSubsystemAugerController;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
      
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
  public boolean isAugerNeutral() {
        double encoderValue = augerEncoder.getAverageVoltage();
        System.out.println(encoderValue);
       if((1.5 < encoderValue) && (1.7 > encoderValue)) {
           return true;
            }
       else{
           return false;
       }
 
      
  }
  public void augerUp(){
      System.out.println("in motor on");
      augerController.set(.5);
  }
  public void augerHault(){
      augerController.set(0);
  }
  public void augerDown(){
      augerController.set(-.5);
  }
  public boolean readAugerLimitSwitch(){
      return augerLimitSwitch.get();
  }
  
  
    }


