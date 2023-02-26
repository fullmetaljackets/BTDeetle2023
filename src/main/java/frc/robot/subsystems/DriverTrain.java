// RobotBuilder Version: 5.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// -BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX; import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriverTrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

private WPI_TalonFX leftTalonFXEnhanced1;
private WPI_TalonFX leftTalonFXEnhanced2;
private WPI_TalonFX leftTalonFXEnhanced3;
private MotorControllerGroup leftMotorGroup;
private WPI_TalonFX rightTalonFXEnhanced4;
private WPI_TalonFX rightTalonFXEnhanced5;
private WPI_TalonFX rightTalonFXEnhanced6;
private MotorControllerGroup rightMotorGroup;
private DifferentialDrive differentialDrive1;
private AnalogGyro gyro;

   
    final int kUnitsPerRevolution = 2048;
    final double kGear_Low = 7.8;
    final double kGear_High = 4.5;
    final double kWheel_Diameter = 6.0;

    private DoubleSolenoid shifterValve;
    
    /**
    *
    */
    public DriverTrain() {
        gyro = new AnalogGyro(0);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
leftTalonFXEnhanced1 = new WPI_TalonFX(1);
 
    /* Factory default hardware to prevent unexpected behavior */
leftTalonFXEnhanced1.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
leftTalonFXEnhanced1.setInverted(false);
leftTalonFXEnhanced1.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
leftTalonFXEnhanced1.configNominalOutputForward(0, 30);
leftTalonFXEnhanced1.configNominalOutputReverse(0, 30);
leftTalonFXEnhanced1.configPeakOutputForward(1, 30);
leftTalonFXEnhanced1.configPeakOutputReverse(-1, 30);
        


leftTalonFXEnhanced2 = new WPI_TalonFX(2);
 
    /* Factory default hardware to prevent unexpected behavior */
leftTalonFXEnhanced2.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
leftTalonFXEnhanced2.setInverted(false);
leftTalonFXEnhanced2.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
leftTalonFXEnhanced2.configNominalOutputForward(0, 30);
leftTalonFXEnhanced2.configNominalOutputReverse(0, 30);
leftTalonFXEnhanced2.configPeakOutputForward(1, 30);
leftTalonFXEnhanced2.configPeakOutputReverse(-1, 30);
        


leftTalonFXEnhanced3 = new WPI_TalonFX(3);
 
    /* Factory default hardware to prevent unexpected behavior */
leftTalonFXEnhanced3.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
leftTalonFXEnhanced3.setInverted(false);
leftTalonFXEnhanced3.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
leftTalonFXEnhanced3.configNominalOutputForward(0, 30);
leftTalonFXEnhanced3.configNominalOutputReverse(0, 30);
leftTalonFXEnhanced3.configPeakOutputForward(1, 30);
leftTalonFXEnhanced3.configPeakOutputReverse(-1, 30);
        


leftMotorGroup = new MotorControllerGroup(leftTalonFXEnhanced1, leftTalonFXEnhanced2, leftTalonFXEnhanced3 );
 addChild("LeftMotorGroup",leftMotorGroup);
 

rightTalonFXEnhanced4 = new WPI_TalonFX(4);
 
    /* Factory default hardware to prevent unexpected behavior */
rightTalonFXEnhanced4.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
rightTalonFXEnhanced4.setInverted(true);
rightTalonFXEnhanced4.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
rightTalonFXEnhanced4.configNominalOutputForward(0, 30);
rightTalonFXEnhanced4.configNominalOutputReverse(0, 30);
rightTalonFXEnhanced4.configPeakOutputForward(1, 30);
rightTalonFXEnhanced4.configPeakOutputReverse(-1, 30);
        


rightTalonFXEnhanced5 = new WPI_TalonFX(5);
 
    /* Factory default hardware to prevent unexpected behavior */
rightTalonFXEnhanced5.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
rightTalonFXEnhanced5.setInverted(true);
rightTalonFXEnhanced5.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
rightTalonFXEnhanced5.configNominalOutputForward(0, 30);
rightTalonFXEnhanced5.configNominalOutputReverse(0, 30);
rightTalonFXEnhanced5.configPeakOutputForward(1, 30);
rightTalonFXEnhanced5.configPeakOutputReverse(-1, 30);
        


rightTalonFXEnhanced6 = new WPI_TalonFX(6);
 
    /* Factory default hardware to prevent unexpected behavior */
rightTalonFXEnhanced6.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
rightTalonFXEnhanced6.setInverted(true);
rightTalonFXEnhanced6.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
rightTalonFXEnhanced6.configNominalOutputForward(0, 30);
rightTalonFXEnhanced6.configNominalOutputReverse(0, 30);
rightTalonFXEnhanced6.configPeakOutputForward(1, 30);
rightTalonFXEnhanced6.configPeakOutputReverse(-1, 30);
        


rightMotorGroup = new MotorControllerGroup(rightTalonFXEnhanced4, rightTalonFXEnhanced5 , rightTalonFXEnhanced6 );
 addChild("RightMotorGroup",rightMotorGroup);
 

differentialDrive1 = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
 addChild("Differential Drive 1",differentialDrive1);
 differentialDrive1.setSafetyEnabled(true);
differentialDrive1.setExpiration(0.1);
differentialDrive1.setMaxOutput(1.0);



shifterValve = new DoubleSolenoid(8, PneumaticsModuleType.REVPH, 0, 1);
 addChild("ShifterValve", shifterValve);
 


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    my_shiftLowGear();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        SmartDashboard.putNumber("Right Encoder Rotations", my_getRight_Motor_Rotation_Value());
        SmartDashboard.putNumber("Right Encoder Inches", my_get_Distance_Inch());
        SmartDashboard.putBoolean("Shifter is High Gear", get_Higear());
        SmartDashboard.putNumber("Gyro", getHeading());
        differentialDrive1.feed();

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void my_DriveArchade(double speed, double rotation){
        differentialDrive1.arcadeDrive(speed,rotation,true);
    }

    private double my_getRight_Motor_Rotation_Value(){
        return rightTalonFXEnhanced4.getSelectedSensorPosition(0) / kUnitsPerRevolution; 
    }

    public void my_resetRightEncoder(){
        rightTalonFXEnhanced4.setSelectedSensorPosition(0);
    }

    public double my_get_Distance_Inch(){
        if(get_Higear()){
            return (my_getRight_Motor_Rotation_Value()/kGear_High)*(kWheel_Diameter * Math.PI);
        }else{
            return (my_getRight_Motor_Rotation_Value()/kGear_Low)*(kWheel_Diameter * Math.PI);
        }
    }

    public void my_shiftHighGear() {
        shifterValve.set(Value.kForward);
    }
    public void my_shiftLowGear() {
        shifterValve.set(Value.kReverse);
    }
    public void my_shifterToggle() {
        if(shifterValve.get() == Value.kOff){
            my_shiftLowGear();
        }else{
            shifterValve.toggle();
        }
    }
    private boolean get_Higear(){
        return shifterValve.get() == Value.kForward;
    }

    public double getHeading(){
        return gyro.getAngle();
    }

    public void resetGyro(){
        gyro.reset();
    }
}

