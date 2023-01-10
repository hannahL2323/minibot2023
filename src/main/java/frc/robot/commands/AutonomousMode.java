// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.TimedRobot;

public class AutonomousMode extends CommandBase {
  int count = 0;
  public final Timer m_timer = new Timer();
  /** Creates a new AutonomousMode. */
  public AutonomousMode() {
    addRequirements(Robot.DriveSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    
    m_timer.reset();
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  
    if(m_timer.get() < 2.0)
    {
      
      Robot.DriveSubsystem.TankDrive(0.6, 0.6);
    }

    /*
    if (m_timer.get() > 1.0 && m_timer.get() < )
    {
      Robot.DriveSubsystem.TankDrive(0.3, -0.3);
    }
    */

    if(m_timer.get() > 2.0)
    {
      Robot.DriveSubsystem.TankDrive(0.0, 0.0);
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
