package org.usfirst.frc.team4183.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	public static int leftMotor1 = 2;
	public static int leftMotor2 = 1;
	public static int rightMotor1 = 9;
	public static int rightMotor2 = 10;

	public static int rollMotor = 5;
	
	public static int shootMotor1 = 4;
	public static int shootMotor2 = 6;
	
	public static int winchMotor1 = 12;
	public static int winchMotor2 = 7;
	public static int winchServo = 0;
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}