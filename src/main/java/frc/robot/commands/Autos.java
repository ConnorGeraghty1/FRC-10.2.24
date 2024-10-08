// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.PWMDrivetrain;

// import frc.robot.subsystems.CANDrivetrain;

public final class Autos {
  public static Command exampleAuto(PWMDrivetrain drivetrain) {
    /**
     * RunCommand is a helper class that creates a command from a single method, in this case we
     * pass it the arcadeDrive method to drive straight back at half power. We modify that command
     * with the .withTimeout(1) decorator to timeout after 1 second, and use the .andThen decorator
     * to stop the drivetrain after the first command times out
     .withTimeout(1)
        .andThen(new RunCommand(() -> drivetrain.arcadeDrive(0, 0), drivetrain));


        IMPORTANT METHOD(S)
          *  drivetrain.arcadeDrive( forward/backward velocity , CW/CCW velocity )    //sets position and angle
          *  .withTimeout(seconds) waits a set amount of seconds - NEVER USE IN RELATION TO POSITION
          *  .andThen(command) does the next command 
          
        
     */
    /*
    return new RunCommand(() -> something.method(argument, argument))
      .withTimeout(10)
      .andThen(new RunCommand(() -> something.method(argument, argument))
    */
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
