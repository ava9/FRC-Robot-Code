package org.usfirst.frc2791.MyRobot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc2791.MyRobot.commands.AutonomousCommand;
import org.usfirst.frc2791.MyRobot.commands.ForwardAll300;
import org.usfirst.frc2791.MyRobot.commands.ForwardLeft;
import org.usfirst.frc2791.MyRobot.commands.ForwardLeft300;
import org.usfirst.frc2791.MyRobot.commands.ForwardRight300;
import org.usfirst.frc2791.MyRobot.commands.ForwardRight600;
import org.usfirst.frc2791.MyRobot.commands.JoystickLeft;
import org.usfirst.frc2791.MyRobot.commands.JoystickRight;

public class OI
{

    public OI()
    {
        joystick2 = new Joystick(2);
        joystick1 = new Joystick(1);
        joystick3 = new Joystick(3);
        JoystickButton Button1 = new JoystickButton(joystick1, 1);
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("JoystickRight", new JoystickRight());
        SmartDashboard.putData("JoystickLeft", new JoystickLeft());
        SmartDashboard.putData("ForwardLeft", new ForwardLeft());
        SmartDashboard.putData("ForwardRight300", new ForwardRight300());
        SmartDashboard.putData("ForwardRight600", new ForwardRight600());
        SmartDashboard.putData("ForwardAll300", new ForwardAll300());
        SmartDashboard.putData("ForwardLeft300", new ForwardLeft300());
    }

    public Joystick getJoystick1()
    {
        return joystick1;
    }

    public Joystick getJoystick2()
    {
        return joystick2;
    }

    public Joystick getJoystick3()
    {
        return joystick3;
    }

    public static Joystick joystick1;
    public static Joystick joystick2;
    public static Joystick joystick3;
}