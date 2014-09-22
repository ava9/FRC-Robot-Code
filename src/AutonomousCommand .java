package org.usfirst.frc2791.MyRobot.commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2791.MyRobot.Robot;
import org.usfirst.frc2791.MyRobot.RobotMap;

public class AutonomousCommand extends Command
{

    public AutonomousCommand()
    {
    }

    protected void initialize()
    {
        RobotMap.timz2.reset();
        RobotMap.timz2.start();
    }

    protected void execute()
    {
        Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser4, 1, "LimitSwitch: " + RobotMap.limitSwitch.get() + "                                             ");
        Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser5, 1, "ArmEncoder: " + RobotMap.armEncoder.get() + "                                           ");
        Robot.ds.updateLCD();
        RobotMap.shooterWheelClose.set(1.0D);
        RobotMap.shooterWheelFar.set(1.0D);
        while(RobotMap.timz2.get() < 4D) 
            if(RobotMap.limitSwitch.get())
            {
                RobotMap.armMotor.set(-0.10000000000000001D);
            } else
            {
                RobotMap.armMotor.set(0.0D);
                RobotMap.armEncoder.reset();
            }
        while(RobotMap.timz2.get() > 4D && RobotMap.timz2.get() < 7D) 
            if(RobotMap.armEncoder.get() > -195)
                RobotMap.armMotor.set(0.40000000000000002D);
            else
                RobotMap.armMotor.set(0.0D);
        for(; RobotMap.timz2.get() > 7D && RobotMap.timz2.get() < 7.5D; RobotMap.solenoid2.set(true));
        for(; RobotMap.timz2.get() < 8D && RobotMap.timz2.get() > 7.5D; RobotMap.solenoid2.set(false));
        for(; RobotMap.timz2.get() < 9D && RobotMap.timz2.get() > 8D; RobotMap.VexMotor.set(1.0D));
        for(; RobotMap.timz2.get() < 9.5D && RobotMap.timz2.get() > 9D; RobotMap.VexMotor.set(0.0D));
        for(; RobotMap.timz2.get() < 10D && RobotMap.timz2.get() > 9.5D; RobotMap.solenoid2.set(true));
        for(; RobotMap.timz2.get() < 10.5D && RobotMap.timz2.get() > 10D; RobotMap.solenoid2.set(false));
        for(; RobotMap.timz2.get() < 11.5D && RobotMap.timz2.get() > 10.5D; RobotMap.VexMotor.set(1.0D));
        for(; RobotMap.timz2.get() < 12D && RobotMap.timz2.get() > 11.5D; RobotMap.VexMotor.set(0.0D));
        for(; RobotMap.timz2.get() < 12.5D && RobotMap.timz2.get() > 12D; RobotMap.solenoid2.set(true));
        for(; RobotMap.timz2.get() < 13D && RobotMap.timz2.get() > 12.5D; RobotMap.solenoid2.set(false));
    }

    protected boolean isFinished()
    {
        return false;
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }
}