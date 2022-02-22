package pgdp.pinguracing;

import static pgdp.MiniJava.*; //Diesen Import nicht löschen! Do not delete this import!

public class PinguRacing {
    public static void main(String[] args) {
        int Speed_A = 0;
        int Pose_A = readInt("Alan starting position:");
        int Speed_B = 0;
        int Pose_B = readInt("Bjarne starting position:");
        int Time = readInt("Race duration:");


        while (Time < 0) {
            Time = readInt("Please do not enter a negative number:");
        }

        for (int i = 0; i <= (Time / 2) - 1; i++) {
            if (Time == 0) {
                break;
            }

            if (String.valueOf(Pose_A).endsWith("4")) {
                Speed_A = (Speed_A / 2) + 1;
            } else {
                Speed_A = Speed_A + 7;
            }
            if (Speed_A > 128) {
                Speed_A = 128;
            }
            Pose_A = Pose_A + Speed_A;

            if (Pose_B % 13 == 0) {
                Speed_B = (Speed_B * 2) + 1;
            } else {
                Speed_B = Speed_B + 3;
            }
            if (Speed_B > 128) {
                Speed_B = 128;
            }

            Pose_B = Pose_B + Speed_B;

            write("t = " + i +
                    "\nAlan position = " + Pose_A + "; " + "speed = " + Speed_A + "\nBjarne position = " + Pose_B + "; " + "speed = " + Speed_B);
            
        
        }
        for (int i = Time / 2; i < Time; i++) {
            if (i == Time * 3 / 5 || i == Time * 4 / 5) {
                Speed_A /= 4;
            } else {
                Speed_A = Speed_A + 1;
            }
            if (Speed_A > 128) {
                Speed_A = 128;

            } else if (Speed_A < 0) {
                Speed_A = 0;
            }
            Pose_A = Pose_A + Speed_A;

            if (i >= Time - 13) {
                Speed_B /= 2;
            } else {
                Speed_B -= 1;
            }
            if (Speed_B > 128) {
                Speed_A = 128;

            } else if (Speed_B < 0) {
                Speed_A = 0;
            }

            Pose_B = Pose_B + Speed_B;

            write("t = " + i +
                    "\nAlan position = " + Pose_A + "; " + "speed = " + Speed_A + "\nBjarne position = " + Pose_B + "; " + "speed = " + Speed_B);
        }

        if (Pose_A > Pose_B) {
            write("Alan wins!");
        } else if (Pose_B > Pose_A) {
            write("Bjarne wins!");
        } else {
            write("Draw!");
        }
        

    }
}


