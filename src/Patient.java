import javax.swing.*;
import java.util.Arrays;

public class Patient {

    private int weight; //weight of patient
    private String condition; //condition of the patient
    public String[] conditionsList = {"Ear Infection", "Strep", "None of the listed"};

    //CONSTRUCTOR
    public Patient(String condition, int weight) {
        this.condition = condition;
        this.weight = weight;
    }

    //DEFAULT CONSTRUCTOR
    public Patient(){

    }

    @Override
    public String toString() {
        return "Patient{" +
                "weight=" + weight +
                ", condition='" + condition + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = 0;
        while(this.weight <= 0) {
            try {
                this.weight = Integer.parseInt(JOptionPane.showInputDialog("Please enter the patient's weight (kg)"));

                if(this.weight <= 0) {
                    throw new NumberFormatException();
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid weight.",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition() {
        condition = (String) JOptionPane.showInputDialog(
                null,
                "What's the patient's condition?",
                "Choose Condition",
                JOptionPane.QUESTION_MESSAGE,
                null,
                conditionsList,
                conditionsList[1]);
    }


}
