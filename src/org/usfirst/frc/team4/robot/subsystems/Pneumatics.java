package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
    
    private Compressor compressor = new Compressor();
    private DoubleSolenoid RightArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_RIGHT_BWD, RobotMap.PNEUMATICS_ARM_RIGHT_FWD);
    private DoubleSolenoid LeftArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_LEFT_BWD, RobotMap.PNEUMATICS_ARM_LEFT_FWD);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    //Compressor Start
	public void compStart() {
		compressor.start();		
	}

	//Compressor Stop
	public void compStop() {
		compressor.stop();		
	}

	//OPEN Right and Left Arms
	public void rightArmOpen(){
		RightArm.set(DoubleSolenoid.Value.kForward);
	}
	
	public void leftArmOpen(){
		LeftArm.set(DoubleSolenoid.Value.kForward);
	}
	
	//CLOSE Right and Left Arms
	public void rightArmClose(){
		RightArm.set(DoubleSolenoid.Value.kReverse);
	}

	public void leftArmClose(){
		RightArm.set(DoubleSolenoid.Value.kReverse);
	}
	
	//Neutral Arms 
	public void armsNeutral(){
		RightArm.set(DoubleSolenoid.Value.kOff);
		LeftArm.set(DoubleSolenoid.Value.kOff);
	}
	
}