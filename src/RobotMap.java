package org.usfirst.frc2791.MyRobot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap
{

    public RobotMap()
    {
    }

    public static void init()
    {
        driveTrainLeftQuadratureEncoderLeft = new Encoder(1, 2, 1, 1, false, edu.wpi.first.wpilibj.CounterBase.EncodingType.k4X);
        LiveWindow.addSensor("DriveTrainLeft", "Quadrature Encoder Left", driveTrainLeftQuadratureEncoderLeft);
        driveTrainLeftQuadratureEncoderLeft.setDistancePerPulse(1.0D);
        driveTrainLeftQuadratureEncoderLeft.setPIDSourceParameter(edu.wpi.first.wpilibj.Encoder.PIDSourceParameter.kRate);
        driveTrainLeftQuadratureEncoderLeft.start();
        driveTrainLeftLeftMotor2 = new Victor(1, 9);
        driveTrainLeftLeftMotor = new Victor(1, 2);
        LiveWindow.addActuator("DriveTrainLeft", "LeftMotor", driveTrainLeftLeftMotor);
        driveTrainRightRightMotor1 = new Victor(1, 3);
        driveTrainRightRightMotor2 = new Victor(1, 1);
        LiveWindow.addActuator("DriveTrainRight", "RightMotor", driveTrainRightRightMotor1);
        driveTrainRightQuadratureEncoderRight = new Encoder(1, 4, 1, 3, false, edu.wpi.first.wpilibj.CounterBase.EncodingType.k4X);
        LiveWindow.addSensor("DriveTrainRight", "Quadrature Encoder Right", driveTrainRightQuadratureEncoderRight);
        driveTrainRightQuadratureEncoderRight.setDistancePerPulse(1.0D);
        driveTrainRightQuadratureEncoderRight.setPIDSourceParameter(edu.wpi.first.wpilibj.Encoder.PIDSourceParameter.kRate);
        driveTrainRightQuadratureEncoderRight.start();
        shooterWheelClose = new Victor(1, 7);
        shooterWheelFar = new Victor(1, 8);
        compressor = new Compressor(6, 1);
        solenoid1 = new Solenoid(1);
        solenoid2 = new Solenoid(2);
        armEncoder = new Encoder(1, 7, 1, 8, false, edu.wpi.first.wpilibj.CounterBase.EncodingType.k4X);
        armEncoder.start();
        armMotor = new Victor(1, 6);
        limitSwitch = new DigitalInput(5);
        VexMotor = new Victor(1, 4);
        timz = new Timer();
        timz2 = new Timer();
        timz3 = new Timer();
        timz4 = new Timer();
    }

    public static Encoder driveTrainLeftQuadratureEncoderLeft;
    public static Victor driveTrainLeftLeftMotor2;
    public static Victor driveTrainLeftLeftMotor;
    public static Victor driveTrainRightRightMotor1;
    public static Victor driveTrainRightRightMotor2;
    public static Victor shooterWheelClose;
    public static Victor shooterWheelFar;
    public static Encoder driveTrainRightQuadratureEncoderRight;
    public static Compressor compressor;
    public static Solenoid solenoid1;
    public static Solenoid solenoid2;
    public static Victor VexMotor;
    public static Encoder armEncoder;
    public static Victor armMotor;
    public static DigitalInput limitSwitch;
    public static Timer timz;
    public static Timer timz2;
    public static Timer timz3;
    public static Timer timz4;
}