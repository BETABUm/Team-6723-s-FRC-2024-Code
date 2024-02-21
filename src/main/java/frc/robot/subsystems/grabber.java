package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.RobotMap;
import frc.robot.commands.*;

public class grabber extends SubsystemBase{

    private Value ched;
    private boolean fdisabled;
    private boolean rdisabled;

    public grabber() {
        //kungstructor
    }

    public void init() {

    }

    public void toggleGrabber() {
        System.out.println("toggling the grabber");
        ched = RobotMap.han_solonoid.get();
        if (ched == kReverse) {
            System.out.println("grabber detected in reverse");
            //fdisabled = RobotMap.han_solonoid.isFwdSolenoidDisabled();
            //System.out.println("fwd solenoid disabled:");
            //System.out.println(fdisabled);
            RobotMap.han_solonoid.set(DoubleSolenoid.Value.kForward);
            System.out.println("grabber set to forward");
        } else if (ched == kForward) {
            System.out.println("grabber detected in forward");
            //rdisabled = RobotMap.han_solonoid.isRevSolenoidDisabled();
            //System.out.println("rev solenoid disabled:");
            //System.out.println(rdisabled);
            RobotMap.han_solonoid.set(DoubleSolenoid.Value.kReverse);
            System.out.println("grabber set to reverse");
        } else {
            System.out.println("grabber off");
            RobotMap.han_solonoid.set(DoubleSolenoid.Value.kReverse);
            System.out.println("grabber set to forward");
        }

    }

    public void openGrabber() {
        RobotMap.han_solonoid.set(DoubleSolenoid.Value.kForward);
    }

    public void stopGrabber() {
        //System.out.println("stopping grabber");
        //RobotMap.han_solonoid.set(kOff);
    }
    
}