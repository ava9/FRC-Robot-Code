package org.usfirst.frc2791.MyRobot.commands;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2791.MyRobot.Robot;
import org.usfirst.frc2791.MyRobot.RobotMap;
import org.usfirst.frc2791.MyRobot.subsystems.DriveTrainLeft;

public class ForwardLeft300 extends Command
{

    public ForwardLeft300()
    {
        requires(Robot.driveTrainLeft);
    }

    protected void initialize()
    {
        Robot.driveTrainLeft.enable();
        Robot.driveTrainLeft.setSetpoint(-1000D);
    }

    protected void execute()
    {
        Robot.driveTrainLeft.enable();
        Robot.driveTrainLeft.setSetpoint(1.0D);
    }

    protected boolean isFinished()
    {
        return Robot.driveTrainLeft.onTarget();
    }

    protected void end()
    {
        Robot.driveTrainLeft.disable();
        RobotMap.driveTrainLeftLeftMotor.set(0.0D);
    }

    protected void interrupted()
    {
        end();
    }

    private double setpoint;
}