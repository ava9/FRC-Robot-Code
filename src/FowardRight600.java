package org.usfirst.frc2791.MyRobot.commands;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2791.MyRobot.Robot;
import org.usfirst.frc2791.MyRobot.RobotMap;
import org.usfirst.frc2791.MyRobot.subsystems.DriveTrainRight;

public class ForwardRight600 extends Command
{

    public ForwardRight600()
    {
        requires(Robot.driveTrainRight);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        Robot.driveTrainRight.enable();
        Robot.driveTrainRight.setSetpoint(600D);
    }

    protected boolean isFinished()
    {
        return Robot.driveTrainRight.onTarget();
    }

    protected void end()
    {
        RobotMap.driveTrainRightRightMotor1.set(0.0D);
    }

    protected void interrupted()
    {
        end();
    }
}