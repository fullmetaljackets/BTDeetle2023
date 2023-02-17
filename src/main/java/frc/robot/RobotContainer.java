// RobotBuilder Version: 5.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: RobotContainer.

package frc.robot;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command.InterruptionBehavior;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.*;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// The robot's subsystems
   
    public final Intake m_intake = new Intake();
    public final Arm m_arm = new Arm();
    public final Elevator m_elevator = new Elevator();
    public final DriverTrain m_driverTrain = new DriverTrain();

// Joysticks
private final XboxController coDriverControler = new XboxController(1);
private final XboxController driverControler = new XboxController(0);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  
  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
  * The container for the robot.  Contains subsystems, OI devices, and commands.
  */
  private RobotContainer() {
    //hello
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Smartdashboard Subsystems


    // SmartDashboard Buttons
    SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    SmartDashboard.putData("ElevatorRaise", new ElevatorRaise( m_elevator ));
    SmartDashboard.putData("ElevatorLower", new ElevatorLower( m_elevator ));
    SmartDashboard.putData("ArmRaise", new ArmRaise( m_arm ));
    SmartDashboard.putData("ArmLower", new ArmLower( m_arm ));
    SmartDashboard.putData("IntakeCube: Default", new IntakeCube(1, m_intake));
    SmartDashboard.putData("IntakeCone: Default", new IntakeCone(1, m_intake));
    SmartDashboard.putData("Intake Eject: Default", new IntakeEject(-1, m_intake));
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    SmartDashboard.putData("AutoScoreAndDrive", new AutoScoreAndDrive( m_driverTrain , m_intake));
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
        // _BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND
    m_driverTrain.setDefaultCommand(new DriverWithJoy(() -> -driverControler.getRawAxis(1), 
                                                      () -> -driverControler.getRawAxis(4), m_driverTrain));


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND

    // Configure autonomous sendable chooser
    m_chooser.addOption("AutoScoreAndDrive", new AutoScoreAndDrive( m_driverTrain, m_intake ));
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.setDefaultOption("Autonomous Command", new AutonomousCommand());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
// Create some buttons
final JoystickButton armLowerPB = new JoystickButton(coDriverControler, XboxController.Button.kY.value);        
armLowerPB.onTrue(new ArmLower( m_arm ).withInterruptBehavior(InterruptionBehavior.kCancelSelf));
                        
final JoystickButton armRaisePB = new JoystickButton(coDriverControler, XboxController.Button.kX.value);        
armRaisePB.onTrue(new ArmRaise( m_arm ).withInterruptBehavior(InterruptionBehavior.kCancelSelf));
                        
final JoystickButton elevatorLowerPB = new JoystickButton(coDriverControler, XboxController.Button.kB.value);        
elevatorLowerPB.onTrue(new ElevatorLower( m_elevator ).withInterruptBehavior(InterruptionBehavior.kCancelSelf));
                        
final JoystickButton elevatorRaisePB = new JoystickButton(coDriverControler, XboxController.Button.kA.value);        
elevatorRaisePB.onTrue(new ElevatorRaise( m_elevator ).withInterruptBehavior(InterruptionBehavior.kCancelSelf));
                        
final JoystickButton shifterTogglePB = new JoystickButton(driverControler, XboxController.Button.kX.value);        
shifterTogglePB.onTrue(new ShifterToggle( m_driverTrain ).withInterruptBehavior(InterruptionBehavior.kCancelSelf));
                        
final JoystickButton intakeEjectPB = new JoystickButton(driverControler, XboxController.Button.kA.value);        
intakeEjectPB.whileTrue(new IntakeEject(-1, m_intake).withInterruptBehavior(InterruptionBehavior.kCancelSelf));
                        
final JoystickButton intakeConePB = new JoystickButton(driverControler, XboxController.Button.kRightBumper.value);        
intakeConePB.whileTrue(new IntakeCone(1, m_intake).withInterruptBehavior(InterruptionBehavior.kCancelSelf));
                        
final JoystickButton intakeCubePB = new JoystickButton(driverControler, XboxController.Button.kLeftBumper.value);        
intakeCubePB.whileTrue(new IntakeCube(1, m_intake).withInterruptBehavior(InterruptionBehavior.kCancelSelf));
                        


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
  }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public XboxController getDriverControler() {
      return driverControler;
    }

public XboxController getCoDriverControler() {
      return coDriverControler;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
  

}

