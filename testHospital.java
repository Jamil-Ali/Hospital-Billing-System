//import java.io.FileWriter;
//import java.io.IOException;
import java.util.Scanner;
//import java.io.File;
import java.io.*;

public class testHospital {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean done = false;
        while(done == false) {
            // get patient name, and ID
            System.out.print("Enter patient's ID: ");
            int patient_id = input.nextInt();
            System.out.print("Enter patient's first name: ");
            String pfname = input.next();
            System.out.print("Enter patient's last name: ");
            String plname = input.next();


            // get patient DOB
            System.out.print("Enter Patient DOB(day/month/year): ");
            String dob = input.next();
            // create a new array, and we split it based on the slash mark /
            String dobArr[] = dob.split("[/ -]");
            // patient birth-day is equal to arr[0]
            int pday = Integer.parseInt(dobArr[0]);
            // patient birth-month
            int pmonth = Integer.parseInt(dobArr[1]);
            // patient birth-year
            int pyear = Integer.parseInt(dobArr[2]);

            // Ask user for doctor name and specialty
            System.out.print("Enter doctor's first name: ");
            String dfname = input.next();
            System.out.print("Enter doctor's last name: ");
            String dlname = input.next();
            System.out.print("Enter doctor's specialty: ");
            String specialty = input.next();


            // will parse input based on slash mark
            System.out.print("Enter Admit Date(day/month/year): ");
            String S = input.next();
            String nos[] = S.split("[/ -]");
            int a = Integer.parseInt(nos[0]);
            int b = Integer.parseInt(nos[1]);
            int c = Integer.parseInt(nos[2]);

            /// will parse input based on slash mark
            System.out.print("Enter Discharge Date(day/month/year): ");
            String dis = input.next();
            String dis_date[] = dis.split("[/]");
            int dday = Integer.parseInt(dis_date[0]);
            int dmonth = Integer.parseInt(dis_date[1]);
            int dyear = Integer.parseInt(dis_date[2]);

            // create doctor object
            Doctor doctor = new Doctor(dfname, dlname, specialty);

            // Create a patient object
            Patient patient = new Patient(pfname, plname, patient_id, new Date(pday, pmonth, pyear), doctor, new Date(a, b, c), new Date(dday, dmonth, dyear));

            // Create bill object
            System.out.print("Enter Pharmacy Charges: ");
            double pharm_charge = input.nextDouble();
            System.out.print("Enter Room Charges: ");
            double room_charge = input.nextDouble();
            System.out.print("Enter Doctor Fee");
            double doctorFee = input.nextDouble();


            // create Bill Object
            Bill bill = new Bill(patient.getPatientID(), pharm_charge, room_charge, doctorFee);

            // print patient data
            System.out.println(patient);
            System.out.println("\n" + bill);

            // create output file
            String filename = patient.getFirst() + patient.getLast() + ".txt";

            try {
                FileWriter fw = new FileWriter(new File(filename));

                // write patient info to file
                fw.write(patient.toString() + "\n");
                fw.write("\n" + bill);

                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (done == false)
            {
                System.out.print("Would you like to go again? 1 for Yes , 0 for No");
                int userInput = input.nextInt();
                if (userInput == 1) {
                    break;
                }
                else {
                    done = true;
                }

            }
        }
    }
}
