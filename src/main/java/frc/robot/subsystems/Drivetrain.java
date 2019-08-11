package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team88.swerve.SwerveChassis;

public class Drivetrain extends Subsystem {

    private SwerveChassis swerveChassis;

    public Drivetrain() {
        swerveChassis = new SwerveChassis();
        swerveChassis.update();
    }

    @Override
    protected void initDefaultCommand() {

    }

}