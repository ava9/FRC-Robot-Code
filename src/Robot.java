package org.usfirst.frc2791.MyRobot;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc2791.MyRobot.commands.AutonomousCommand;
import org.usfirst.frc2791.MyRobot.subsystems.DriveTrainLeft;
import org.usfirst.frc2791.MyRobot.subsystems.DriveTrainRight;

// Referenced classes of package org.usfirst.frc2791.MyRobot:
//            OI, RobotMap

public class Robot extends IterativeRobot
{

    public Robot()
    {
    }

    public void robotInit()
    {
        RobotMap.init();
        driveTrainLeft = new DriveTrainLeft();
        driveTrainRight = new DriveTrainRight();
        oi = new OI();
        autonomousCommand = new AutonomousCommand();
    }

    public void autonomousInit()
    {
        if(autonomousCommand != null)
            autonomousCommand.start();
    }

    public void autonomousPeriodic()
    {
        Scheduler.getInstance().run();
    }

    public void teleopInit()
    {
        if(autonomousCommand != null)
            autonomousCommand.cancel();
    }

    public void teleopPeriodic()
    {
        Scheduler.getInstance().run();
    }

    public void testPeriodic()
    {
        LiveWindow.run();
    }

    Command autonomousCommand;
    public static OI oi;
    public static DriveTrainLeft driveTrainLeft;
    public static DriveTrainRight driveTrainRight;
    public static DriverStationLCD ds = DriverStationLCD.getInstance();

}