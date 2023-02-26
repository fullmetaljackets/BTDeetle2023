// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import javax.swing.text.StyleContext.SmallAttributeSet;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriverTrain;

public class DriveToSetpoint_Distance extends CommandBase {
  private final DriverTrain m_drivertrain;
  private double m_speed;
  private double m_distance;

  /** Creates a new DriveToSetpoint_Distance. */
  public DriveToSetpoint_Distance(double speed, double distance, DriverTrain drivertrain) {
    m_speed =  speed;
    m_distance = Math.abs(distance);
    m_drivertrain = drivertrain;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivertrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_drivertrain.my_resetRightEncoder();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    SmartDashboard.putNumber("Current Speed", m_speed);
    m_drivertrain.my_DriveArchade(m_speed, 0.0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivertrain.my_DriveArchade(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_distance <= Math.abs( m_drivertrain.my_get_Distance_Inch());
  }
}
