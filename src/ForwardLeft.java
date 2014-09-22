package org.usfirst.frc2791.MyRobot.commands;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2791.MyRobot.Robot;
import org.usfirst.frc2791.MyRobot.RobotMap;
import org.usfirst.frc2791.MyRobot.subsystems.DriveTrainLeft;

public class ForwardLeft extends Command
{

    public ForwardLeft()
    {
        requires(Robot.driveTrainLeft);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        Robot.driveTrainLeft.enable();
        Robot.driveTrainLeft.setSetpoint(300D);
    }

    protected boolean isFinished()
    {
        return Robot.driveTrainLeft.onTarget();
    }

    protected void end()
    {
        RobotMap.driveTrainLeftLeftMotor.set(0.0D);
    }

    protected void interrupted()
    {
        end();
    }
}