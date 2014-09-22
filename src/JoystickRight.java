package org.usfirst.frc2791.MyRobot.commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2791.MyRobot.*;

public class JoystickRight extends Command
{

    public JoystickRight()
    {
        requires(Robot.driveTrainRight);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        RobotMap.driveTrainRightRightMotor1.set(-OI.joystick2.getY());
        RobotMap.driveTrainRightRightMotor2.set(-OI.joystick2.getY());
        Robot.ds.println(edu.wpi.first.wpilibj.DriverStationLCD.Line.kUser2, 1, "encoderRight: " + RobotMap.driveTrainRightQuadratureEncoderRight.get() + "                             ");
        Robot.ds.updateLCD();
    }

    protected boolean isFinished()
    {
        return false;
    }

    protected void end()
    {
        RobotMap.driveTrainRightRightMotor1.set(0.0D);
        RobotMap.driveTrainRightRightMotor2.set(0.0D);
    }

    protected void interrupted()
    {
        end();
    }
}