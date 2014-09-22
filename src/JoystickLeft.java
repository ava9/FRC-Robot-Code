package org.usfirst.frc2791.MyRobot.commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2791.MyRobot.*;

public class JoystickLeft extends Command
{

    public JoystickLeft()
    {
        requires(Robot.driveTrainLeft);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        RobotMap.driveTrainLeftLeftMotor2.set(OI.joystick1.getY());
        RobotMap.driveTrainLeftLeftMotor.set(OI.joystick1.getY());
        Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser1, 1, "encoderLeft: " + RobotMap.driveTrainLeftQuadratureEncoderLeft.get() + "                             ");
        Robot.ds.updateLCD();
        if(!RobotMap.limitSwitch.get())
            RobotMap.armEncoder.reset();
        Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser4, 1, "LimitSwitch: " + RobotMap.limitSwitch.get() + "                                             ");
        Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser3, 1, "ZValue: " + OI.joystick3.getZ());
        Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser5, 1, "ArmEncoder: " + RobotMap.armEncoder.get() + "                                           ");
        Robot.ds.updateLCD();
        if(RobotMap.limitSwitch.get())
        {
            if(!OI.joystick3.getRawButton(10))
                RobotMap.armMotor.set(0.40000000000000002D * OI.joystick3.getY());
            else
                RobotMap.armMotor.set(0.59999999999999998D * OI.joystick3.getY());
        } else
        {
            RobotMap.armMotor.set(0.40000000000000002D * Math.abs(OI.joystick3.getY()));
        }
        if(OI.joystick3.getRawButton(3))
        {
            RobotMap.shooterWheelClose.set(1.0D);
            RobotMap.shooterWheelFar.set(1.0D);
        } else
        {
            RobotMap.shooterWheelClose.set(0.0D);
            RobotMap.shooterWheelFar.set(0.0D);
        }
        if(RobotMap.timz.get() >= 0.65000000000000002D)
        {
            RobotMap.VexMotor.set(0.0D);
            Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser6, 1, "VexMotor is Spinning! ");
            RobotMap.timz.reset();
        }
        if(OI.joystick3.getRawButton(2))
        {
            RobotMap.timz.start();
            RobotMap.VexMotor.set(1.0D);
        }
        if(RobotMap.timz3.get() >= 0.32000000000000001D)
        {
            RobotMap.VexMotor.set(0.0D);
            Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser6, 1, "VexMotor is Spinning HALF! ");
            RobotMap.timz3.reset();
        }
        if(OI.joystick3.getRawButton(4))
        {
            RobotMap.timz3.start();
            RobotMap.VexMotor.set(1.0D);
        }
        if(RobotMap.timz4.get() >= 0.14999999999999999D)
        {
            RobotMap.VexMotor.set(0.0D);
            RobotMap.timz4.reset();
        }
        if(OI.joystick3.getRawButton(5))
        {
            RobotMap.timz4.start();
            Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser6, 1, "VexMotor is Reverse! ");
            RobotMap.VexMotor.set(-1D);
        }
        RobotMap.compressor.start();
        if(OI.joystick3.getTrigger())
            RobotMap.solenoid2.set(true);
        if(!OI.joystick3.getTrigger())
            RobotMap.solenoid2.set(false);
    }

    protected boolean isFinished()
    {
        return false;
    }

    protected void end()
    {
        RobotMap.driveTrainLeftLeftMotor.set(0.0D);
        RobotMap.driveTrainLeftLeftMotor2.set(0.0D);
    }

    protected void interrupted()
    {
        end();
    }
}