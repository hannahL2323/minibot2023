/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.shuffleboard.*;
import frc.robot.Robot;


/**
 * Add your docs here
 */
public class OI {
    public static XboxController Driver = new XboxController(0);
    public static double getSpeed () {
        return ((Driver.getRightTriggerAxis() - Driver.getLeftTriggerAxis()) * Robot.m_Chooser.getSelected());
    }

    public static double getTurn () {
        return (Driver.getRawAxis(0)) * 0.75;
    }

    public static boolean getSlow () {
        return Driver.getXButton();

    

    }

}
