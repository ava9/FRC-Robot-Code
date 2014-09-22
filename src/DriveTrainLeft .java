package org.usfirst.frc2791.MyRobot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import org.usfirst.frc2791.MyRobot.RobotMap;
import org.usfirst.frc2791.MyRobot.commands.JoystickLeft;

public class DriveTrainLeft extends PIDSubsystem
{

    public DriveTrainLeft()
    {
        super("DriveTrainLeft", 50D, 0.0D, 0.0D);
        quadratureEncoderLeft = RobotMap.driveTrainLeftQuadratureEncoderLeft;
        leftMotor1 = RobotMap.driveTrainLeftLeftMotor;
        setAbsoluteTolerance(20D);
        getPIDController().setContinuous(false);
        getPIDController().setInputRange(0.0D, 2000D);
        getPIDController().setOutputRange(-1D, 1.0D);
    }

    public void initDefaultCommand()
    {
        setDefaultCommand(new JoystickLeft());
    }

    protected double returnPIDInput()
    {
        return quadratureEncoderLeft.pidGet();
    }

    protected void usePIDOutput(double output)
    {
        leftMotor1.pidWrite(output);
    }

    Encoder quadratureEncoderLeft;
    Victor leftMotor1;
}