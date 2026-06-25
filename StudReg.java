import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class StudReg extends JFrame {

    JLabel message;
    JLabel nameLabel, dobLabel, genderLabel, addressLabel;
    JLabel mailIdLabel, mobileNoLabel;
    JLabel passwordLabel, rePasswordLabel, passYearLabel;
    JLabel passInstituteLabel, parentPhnLabel;
    JLabel branchLabel, semesterLabel;

    JTextField nameField, passInstituteField;
    JTextField parentPhnField, mailIdField, mobileNoField;

    JTextArea addressField;

    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;

    JPasswordField passwordField, rePasswordField;

    JComboBox<Integer> dobDate;
    JComboBox<Integer> dobMonth;
    JComboBox<Integer> dobYear;
    JComboBox<Integer> passYear;

    JComboBox<String> branchList;
    JComboBox<String> semesterList;

    JButton registerButton;
    Container container;

    public StudReg() {

        message = new JLabel("Register a New Student");
        message.setFont(new Font("Courier", Font.BOLD, 20));

        nameLabel = new JLabel("Full Name:");
        nameField = new JTextField();

        dobLabel = new JLabel("DOB:");

        dobDate = new JComboBox<>();
        for (int i = 1; i <= 31; i++) {
            dobDate.addItem(i);
        }

        dobMonth = new JComboBox<>();
        for (int i = 1; i <= 12; i++) {
            dobMonth.addItem(i);
        }

        dobYear = new JComboBox<>();
        for (int i = 2023; i >= 1900; i--) {
            dobYear.addItem(i);
        }

        genderLabel = new JLabel("Gender:");
        genderMale = new JRadioButton("Male");
        genderFemale = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);

        mailIdLabel = new JLabel("Mail Id:");
        mailIdField = new JTextField();

        mobileNoLabel = new JLabel("Mobile No:");
        mobileNoField = new JTextField();

        parentPhnLabel = new JLabel("Parent Mobile No:");
        parentPhnField = new JTextField();

        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        rePasswordLabel = new JLabel("Re Password:");
        rePasswordField = new JPasswordField();

        addressLabel = new JLabel("Address:");
        addressField = new JTextArea();

        passInstituteLabel = new JLabel("Passing Institute:");
        passInstituteField = new JTextField();

        passYearLabel = new JLabel("Passing Year:");

        passYear = new JComboBox<>();
        for (int i = 2023; i >= 2000; i--) {
            passYear.addItem(i);
        }

        branchLabel = new JLabel("Branch:");

        branchList = new JComboBox<>();
        branchList.addItem("---Select a Branch---");
        branchList.addItem("Computer Science and Engineering");
        branchList.addItem("Electronics and Telecommunications Engineering");
        branchList.addItem("Information Technology Engineering");
        branchList.addItem("Mechatronics Engineering");
        branchList.addItem("Mechanical Engineering");
        branchList.addItem("Civil Engineering");

        semesterLabel = new JLabel("Semester:");

        semesterList = new JComboBox<>();
        semesterList.addItem("Select a Sem");
        semesterList.addItem("1");
        semesterList.addItem("2");
        semesterList.addItem("3");
        semesterList.addItem("4");
        semesterList.addItem("5");
        semesterList.addItem("6");

        registerButton = new JButton("Register");

        container = getContentPane();
        container.setLayout(null);

        setBounds();
        addComponents();

        this.setTitle("Student Register Form");
        this.setBounds(700, 10, 500, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
    }

    public void setBounds() {

        message.setBounds(50, 10, 300, 30);

        nameLabel.setBounds(50, 60, 100, 30);
        nameField.setBounds(130, 60, 200, 30);

        dobLabel.setBounds(50, 110, 100, 30);
        dobDate.setBounds(130, 110, 50, 30);
        dobMonth.setBounds(190, 110, 50, 30);
        dobYear.setBounds(250, 110, 80, 30);

        genderLabel.setBounds(50, 160, 100, 30);
        genderMale.setBounds(130, 160, 100, 30);
        genderFemale.setBounds(240, 160, 100, 30);

        mailIdLabel.setBounds(50, 210, 100, 30);
        mailIdField.setBounds(130, 210, 200, 30);

        mobileNoLabel.setBounds(50, 260, 100, 30);
        mobileNoField.setBounds(130, 260, 200, 30);

        parentPhnLabel.setBounds(50, 310, 120, 30);
        parentPhnField.setBounds(180, 310, 200, 30);

        passwordLabel.setBounds(50, 360, 100, 30);
        passwordField.setBounds(130, 360, 200, 30);

        rePasswordLabel.setBounds(50, 410, 100, 30);
        rePasswordField.setBounds(130, 410, 200, 30);

        addressLabel.setBounds(50, 460, 100, 30);
        addressField.setBounds(130, 460, 250, 70);

        passInstituteLabel.setBounds(50, 560, 120, 30);
        passInstituteField.setBounds(180, 560, 200, 30);

        passYearLabel.setBounds(50, 610, 120, 30);
        passYear.setBounds(180, 610, 80, 30);

        branchLabel.setBounds(50, 660, 100, 30);
        branchList.setBounds(130, 660, 250, 30);

        semesterLabel.setBounds(50, 710, 100, 30);
        semesterList.setBounds(130, 710, 100, 30);

        registerButton.setBounds(130, 800, 200, 30);
    }

    public void addComponents() {

        container.add(message);
        container.add(nameLabel);
        container.add(nameField);
        container.add(dobLabel);
        container.add(dobDate);
        container.add(dobMonth);
        container.add(dobYear);
        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);
        container.add(mailIdLabel);
        container.add(mailIdField);
        container.add(mobileNoLabel);
        container.add(mobileNoField);
        container.add(parentPhnLabel);
        container.add(parentPhnField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(rePasswordLabel);
        container.add(rePasswordField);
        container.add(addressLabel);
        container.add(addressField);
        container.add(passInstituteLabel);
        container.add(passInstituteField);
        container.add(passYearLabel);
        container.add(passYear);
        container.add(branchLabel);
        container.add(branchList);
        container.add(semesterLabel);
        container.add(semesterList);
        container.add(registerButton);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            StudReg frame = new StudReg();
            frame.setVisible(true);
        });
    }
}
