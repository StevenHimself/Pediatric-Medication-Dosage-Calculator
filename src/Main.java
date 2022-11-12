import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient();
        Medication medication = new Medication();

        patient.setCondition();
        medication.setMedicationName();
        patient.setWeight();

        System.out.println(patient);
        System.out.println(medication);

    }
}
