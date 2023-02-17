// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.DriverTrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class DriveResetEncoders extends InstantCommand {
  private final DriverTrain m_driverTrain;
  public DriveResetEncoders(DriverTrain subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_driverTrain = subsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_driverTrain.my_resetRightEncoder();
  }
  @Override
    public boolean runsWhenDisabled() {
        
        return true;

   
    }
}
