import javax.swing.*;
import java.util.Scanner;

public class Medication {

    private Patient patient;
    public String medicationName;
    public int concentration;
    String[] medicationsList = {"Amoxicillin", "Clindamycin", "Keflex", "Zofran", "None of the listed"};

    //CONSTRUCTOR
    public Medication(String medicationName, int concentration) {
        this.medicationName = medicationName; //read from excel
        this.concentration = concentration; //read from excel
    }

    //DEFAULT CONSTRUCTOR
    public Medication(){

    }

    @Override
    public String toString() {
        return "Medication{" +
                "medicationName='" + medicationName + '\'' +
                ", concentration=" + concentration +
                '}';
    }

    public String getMedicationName() {
         return medicationName;
    }

    public void setMedicationName() {
        this.medicationName = (String) JOptionPane.showInputDialog(
                null,
                "What's the medication?",
                "Choose Medication",
                JOptionPane.QUESTION_MESSAGE,
                null,
                medicationsList,
                medicationsList[4]);
    }

    public int getDosage(Medication medication, Patient patient) {
        String patientCondition = patient.getCondition();
        String medicationName = medication.medicationName;

        int properDosage = 0;

        if(medicationName.equals("amoxicillin") && patientCondition.equals("ear infection")){
            properDosage = 40;
        }
        if(medicationName.equals("amoxicillin") && patientCondition.equals("step")){
            properDosage = 30;
        }
        return properDosage;
    }

    //return Dosage based on weight of patient and concentration of medication
    public int calculateCC(Medication medication, Patient patient) {

        int calculatedCC = 0;
        int patientWeight = patient.getWeight();

        return calculatedCC;
    }

}
