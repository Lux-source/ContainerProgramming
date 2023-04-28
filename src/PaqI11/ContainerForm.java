package PaqI11;

import PackI11Lucian.Container;
import PackI11Lucian.ContainerHub;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContainerForm extends JFrame {
    private JTextField tfIdentifierTextField;
    private JTextField tfWeightTextField;
    private JLabel Weight;
    private JCheckBox checkBoxcustoms;
    private JComboBox<String> countryOfOrigin;
    private JTextArea tfContentDescriptionTextField;
    private JTextField tfcompanySendTextField;
    private JTextField tfcompanyReceivesTextField;
    private JButton btnOK;
    private JButton btnClear;
    private JPanel MainPanel;
    private JLabel ID;
    private JTextArea taOutput;
    private JButton btnCountContainers;
    private JButton btnFindContainer;

    private ContainerHub containerHub;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    ImageIcon imageIcon = new ImageIcon("Docker_(container_engine)_logo.png");
    JLabel icono = new JLabel(imageIcon);
    private JTextArea stateDescription;
    private JButton btnShowDescription;


    public ContainerForm() {

        setContentPane(MainPanel);
        setTitle("Container Port");
        setSize(1400, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        containerHub = new ContainerHub();

        btnShowDescription = new JButton("Show Container Description");


        taOutput = new JTextArea();
        taOutput.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taOutput);
        scrollPane.setPreferredSize(new Dimension(400, 200));

        MainPanel.setLayout(new BorderLayout());
        MainPanel.add(scrollPane, BorderLayout.CENTER);

        ButtonGroup priorityGroup = new ButtonGroup();

        priorityGroup.add(radioButton1);
        priorityGroup.add(radioButton2);
        priorityGroup.add(radioButton3);



        // Serializar los botones de prioridad


        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int identifier = Integer.parseInt(tfIdentifierTextField.getText());
                    int weight = Integer.parseInt(tfWeightTextField.getText());
                    String countryOfOrigin = ContainerForm.this.countryOfOrigin.getSelectedItem().toString();
                    boolean customs = checkBoxcustoms.isSelected();
                    int priority;
                    if (radioButton1.isSelected()) {
                        priority = 1;
                    } else if (radioButton2.isSelected()) {
                        priority = 2;
                    } else {
                        priority = 3;
                    }
                    String contentDescription = ContainerForm.this.tfContentDescriptionTextField.getText();
                    String companySend = tfcompanySendTextField.getText();
                    String companyReceives = tfcompanyReceivesTextField.getText();
                    String stateDescription = ContainerForm.this.stateDescription.getText();

                    Container container = new Container(identifier, weight, countryOfOrigin, customs, priority,
                            contentDescription, companySend, companyReceives, stateDescription);
                    boolean isAdded = containerHub.addContainer(container);

                    if (isAdded) {
                        taOutput.append("Container added:\n" + container.toString() + "\n");
                    } else {
                        taOutput.append("Container could not be added. Storage is full for this priority.\n");
                    }

                    tfIdentifierTextField.setText("");
                    tfWeightTextField.setText("");
                    ContainerForm.this.countryOfOrigin.setSelectedIndex(0);
                    checkBoxcustoms.setSelected(false);
                    tfContentDescriptionTextField.setText("");
                    tfcompanySendTextField.setText("");
                    tfcompanyReceivesTextField.setText("");
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, "Please enter the valid numbers for Identifiers and Weight fields.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfIdentifierTextField.setText("");
                tfWeightTextField.setText("");
                ContainerForm.this.countryOfOrigin.setSelectedIndex(0);
                checkBoxcustoms.setSelected(false);
                tfContentDescriptionTextField.setText("General Description Here");
                tfcompanySendTextField.setText("");
                tfcompanyReceivesTextField.setText("");
                stateDescription.setText("State Description Here");
                taOutput.setText("");
            }
        });

        // Add ActionListener for a button to display the number of containers from a specific country
        btnCountContainers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String country = ContainerForm.this.countryOfOrigin.getSelectedItem().toString();
                int count = containerHub.countContainersFromCountry(country);
                taOutput.append("Number of containers from " + country + ": " + count + "\n");
            }
        });

        // Add ActionListener for a button to display container details based on its identifier
        btnFindContainer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int identifier = Integer.parseInt(tfIdentifierTextField.getText());
                    Container container = containerHub.findContainer(identifier);
                    if (container != null) {
                        taOutput.append("Container found:\n" + container.toString() + "\n");
                    } else {
                        taOutput.append("Container with identifier " + identifier + " not found.\n");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ContainerForm.this, "Please enter a valid number for Identifier field.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnShowDescription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container selectedContainer = containerHub.findContainer(Integer.parseInt(tfIdentifierTextField.getText()));
                if (selectedContainer != null) {
                    String description = selectedContainer.getContentDescription();
                    taOutput.append("Container Description: " + description + "\n");
                } else {
                    taOutput.append("No container found with the given identifier.\n");
                }
            }
        });
    }


    public static void main(String[] args) {
        ContainerForm myContainer = new ContainerForm();
    }


}
