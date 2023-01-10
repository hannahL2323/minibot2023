/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends SubsystemBase {

  public boolean slow;
  
  Talon Left1 = new Talon(RobotMap.Left1);
  Talon Left2 = new Talon(RobotMap.Left2);
  Talon Right1 = new Talon(RobotMap.Right1);
  Talon Right2 = new Talon(RobotMap.Right2);

  public void initDefaultCommand() {
    slow = false;
  }
  

  public void TankDrive (double left, double right) {

    if (slow) {
      left *= 1.00;
      right *= 1.00;
    }

    // Drive the left and right sides of the talons
    Left1.set(-left);
    Left2.set(-left);
    Right1.set(right);
    Right2.set(right);
    //System.out.println("Running Left:" + left + "\tRunning Right:" + right);
  }

  public void ArcadeDrive (double speed, double turn) {
    TankDrive((speed - turn), (speed + turn));
  }

}
