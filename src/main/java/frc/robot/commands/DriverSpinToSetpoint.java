// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.DriverTrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class DriverSpinToSetpoint extends PIDCommand {
  /** Creates a new DriverSpinToSetpoint. */
  public DriverSpinToSetpoint(double setpoint, DriverTrain drivertrain) {
    super(
        // The controller that the command will use
        new PIDController(.05, 0, 0),
        // This should return the measurement
        drivertrain::getHeading,
        // This should return the setpoint (can also be a constant)
        setpoint,
        // This uses the output
        output -> drivertrain.my_DriveArchade(0.0,output));
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivertrain);
    // Configure additional PID options by calling `getController` here.
     // Set the controller to be continuous (because it is an angle controller)
     getController().enableContinuousInput(-180, 180);

     getController().setTolerance(2, 10);

  }

  @Override
  public boolean isFinished() {
    // End when the controller is at the reference.
    return getController().atSetpoint();
  }
}
