package Test;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            //Welcome User
            String name = JOptionPane.showInputDialog("Please enter your name: ");
            JOptionPane.showMessageDialog(null, "Welcome " + name + "!" + "\nPlease click OK to continue.");
            
            // Place validation if user input is int ||||||  try {
            // int inputInt = Integer.parseInt(name);
            //}
            /*catch(NumberFormatException e){
                JOptionPane intError = new JOptionPane("You have entered an integer as a name. Please try again!", JOptionPane.ERROR_MESSAGE);
                JDialog integerInput = intError.createDialog("NumberFormatException: Input is integer");
                integerInput.setAlwaysOnTop(true);
                integerInput.setVisible(true);
                */
            //}

            //Enter users age
            try {
                String age = JOptionPane.showInputDialog("Please enter your age: ");
                //Convert string to int
                int userAge = Integer.parseInt(age);
                //If user is underage of 18 display error message and close the program
                if (userAge < 18) {
                    JOptionPane optionPane = new JOptionPane("You do not have the age requirement to continue! Click OK to exit program.", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error: Underage");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    System.exit(0);
                }
                //If user is 18 and above, continue with program.
                else if (userAge >= 18) {

                    // Users location
                    String[] places = { "US East", "US West", "Europe", "Asia" +
                            ""};
                    String input = (String) JOptionPane.showInputDialog(
                            null, "Select your location: ", "Location Select"
                    , JOptionPane.QUESTION_MESSAGE, null, places, places[1]);


                    //Radio buttons
                    JPanel panel = new JPanel();
                    panel.add(new JRadioButton("Male"));
                    panel.add(new JRadioButton("Female"));
                    panel.add(new JRadioButton("Other"));
                    JOptionPane.showOptionDialog(null, panel,
                            "Sex", JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                    //Thanks for completing this survey
                    JOptionPane optionPane = new JOptionPane("Thank You for completing this survey. More coming soon!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Thank You!");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);

                }// All the code before this bracket
            } catch (NullPointerException e) {
                System.out.println("You have exited the program.");
                System.exit(0);
            }
        //Catches the error of typing in a string instead of an int starting from age verification
        } catch (NumberFormatException e) {
            JOptionPane stringNotInt = new JOptionPane("You have entered a string instead of an int!", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = stringNotInt.createDialog("Error: NumberFormatException");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            System.exit(0);
        }
    }
}
