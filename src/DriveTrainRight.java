package org.usfirst.frc2791.MyRobot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import org.usfirst.frc2791.MyRobot.RobotMap;
import org.usfirst.frc2791.MyRobot.commands.JoystickRight;

public class DriveTrainRight extends PIDSubsystem
{

    public DriveTrainRight()
    {
        super("DriveTrainRight", 0.5D, 200D, 0.0050000000000000001D);
        rightMotor1 = RobotMap.driveTrainRightRightMotor1;
        quadratureEncoderRight = RobotMap.driveTrainRightQuadratureEncoderRight;
        setAbsoluteTolerance(30D);
        getPIDController().setContinuous(false);
        getPIDController().setInputRange(0.0D, 2000D);
        getPIDController().setOutputRange(-1D, 1.0D);
    }

    public void initDefaultCommand()
    {
        setDefaultCommand(new JoystickRight());
    }

    protected double returnPIDInput()
    {
        return quadratureEncoderRight.pidGet();
    }

    protected void usePIDOutput(double output)
    {
        rightMotor1.pidWrite(output);
    }

    Victor rightMotor1;
    Encoder quadratureEncoderRight;
}