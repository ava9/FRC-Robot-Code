package org.usfirst.frc2791.MyRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

// Referenced classes of package org.usfirst.frc2791.MyRobot.commands:
//            ForwardLeft300, ForwardRight300

public class ForwardAll300 extends CommandGroup
{

    public ForwardAll300()
    {
        addParallel(new ForwardLeft300());
        addSequential(new ForwardRight300());
    }

    private void addsequential(ForwardLeft300 forwardleft300)
    {
    }
}