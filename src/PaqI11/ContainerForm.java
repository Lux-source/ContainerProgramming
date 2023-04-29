package PaqI11;

import PackI11Lucian.Container;
import PackI11Lucian.Hubs;
import PackI11Lucian.InvalidColumnException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContainerForm extends JFrame {
    private JPanel mainPanel;
    private JLabel idNumberLabel;
    private JLabel weightLabel;
    private JLabel sendingCompanyLabel;
    private JLabel receiverCompanyLabel;
    private JTextField tfIdNumber;
    private JTextField tfWeight;
    private JTextField tfSendingCompany;
    private JTextField tfReceiverCompany;
    private JButton pileButton;
    private JButton unpileButton;
    private JLabel operationsLabel;
    private JButton containerDescriptionButton;
    private JButton numberOfContainersButton;
    private JLabel countryLabel;
    private JLabel priorityLabel;
    private JLabel descriptionLabel;
    private JTextArea tfContentDescription;
    private JLabel stateHubLabel;
    private JCheckBox customCheckBox;
    private JTextField columnNumberTextField;
    private JTextArea showDescriptionTextArea;
    private JComboBox countriesComboBox2;
    private JComboBox countriesComboBox1;
    private JRadioButton radioButton1;
    private JTextArea stateHubsTextArea;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JTextField numberOfContainersTextField;
    private JLabel imageLogo;
    private JTextArea taOutput;


    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JLabel getIdNumberLabel() {
        return idNumberLabel;
    }

    public void setIdNumberLabel(JLabel idNumberLabel) {
        this.idNumberLabel = idNumberLabel;
    }

    public JLabel getWeightLabel() {
        return weightLabel;
    }

    public void setWeightLabel(JLabel weightLabel) {
        this.weightLabel = weightLabel;
    }

    public JLabel getSendingCompanyLabel() {
        return sendingCompanyLabel;
    }

    public void setSendingCompanyLabel(JLabel sendingCompanyLabel) {
        this.sendingCompanyLabel = sendingCompanyLabel;
    }

    public JLabel getReceiverCompanyLabel() {
        return receiverCompanyLabel;
    }

    public void setReceiverCompanyLabel(JLabel receiverCompanyLabel) {
        this.receiverCompanyLabel = receiverCompanyLabel;
    }

    public JTextField getTfIdNumber() {
        return tfIdNumber;
    }

    public void setTfIdNumber(JTextField tfIdNumber) {
        this.tfIdNumber = tfIdNumber;
    }

    public JTextField getTfWeight() {
        return tfWeight;
    }

    public void setTfWeight(JTextField tfWeight) {
        this.tfWeight = tfWeight;
    }

    public JTextField getTfSendingCompany() {
        return tfSendingCompany;
    }

    public void setTfSendingCompany(JTextField tfSendingCompany) {
        this.tfSendingCompany = tfSendingCompany;
    }

    public JTextField getTfReceiverCompany() {
        return tfReceiverCompany;
    }

    public void setTfReceiverCompany(JTextField tfReceiverCompany) {
        this.tfReceiverCompany = tfReceiverCompany;
    }

    public JButton getPileButton() {
        return pileButton;
    }

    public void setPileButton(JButton pileButton) {
        this.pileButton = pileButton;
    }

    public JButton getUnpileButton() {
        return unpileButton;
    }

    public void setUnpileButton(JButton unpileButton) {
        this.unpileButton = unpileButton;
    }

    public JLabel getOperationsLabel() {
        return operationsLabel;
    }

    public void setOperationsLabel(JLabel operationsLabel) {
        this.operationsLabel = operationsLabel;
    }

    public JButton getContainerDescriptionButton() {
        return containerDescriptionButton;
    }

    public void addContainerDescriptionButton(JButton containerDescriptionButton) {
        this.containerDescriptionButton = containerDescriptionButton;
    }

    public JButton getNumberOfContainersButton() {
        return numberOfContainersButton;
    }

    public void setNumberOfContainersButton(JButton numberOfContainersButton) {
        this.numberOfContainersButton = numberOfContainersButton;
    }

    public JLabel getCountryLabel() {
        return countryLabel;
    }

    public void setCountryLabel(JLabel countryLabel) {
        this.countryLabel = countryLabel;
    }

    public JLabel getPriorityLabel() {
        return priorityLabel;
    }

    public void setPriorityLabel(JLabel priorityLabel) {
        this.priorityLabel = priorityLabel;
    }

    public JLabel getDescriptionLabel() {
        return descriptionLabel;
    }

    public void setDescriptionLabel(JLabel descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    public JTextArea getTfContentDescription() {
        return tfContentDescription;
    }

    public void setTfContentDescription(JTextArea tfContentDescription) {
        this.tfContentDescription = tfContentDescription;
    }

    public JLabel getStateHubLabel() {
        return stateHubLabel;
    }

    public void setStateHubLabel(JLabel stateHubLabel) {
        this.stateHubLabel = stateHubLabel;
    }

    public JCheckBox getCustomCheckBox() {
        return customCheckBox;
    }

    public void setCustomCheckBox(JCheckBox customCheckBox) {
        this.customCheckBox = customCheckBox;
    }

    public JTextField getColumnNumberTextField() {
        return columnNumberTextField;
    }

    public void setColumnNumberTextField(JTextField columnNumberTextField) {
        this.columnNumberTextField = columnNumberTextField;
    }

    public JTextArea getShowDescriptionTextArea() {
        return showDescriptionTextArea;
    }

    public void setShowDescriptionTextArea(JTextArea showDescriptionTextArea) {
        this.showDescriptionTextArea = showDescriptionTextArea;
    }

    public JComboBox getCountriesComboBox2() {
        return countriesComboBox2;
    }

    public void setCountriesComboBox2(JComboBox countriesComboBox2) {
        this.countriesComboBox2 = countriesComboBox2;
    }

    public JComboBox getCountriesComboBox1() {
        return countriesComboBox1;
    }

    public void setCountriesComboBox1(JComboBox countriesComboBox1) {
        this.countriesComboBox1 = countriesComboBox1;
    }

    public JRadioButton getRadioButton1() {
        return radioButton1;
    }

    public void setRadioButton1(JRadioButton radioButton1) {
        this.radioButton1 = radioButton1;
    }

    public JTextArea getStateHubsTextArea() {
        return stateHubsTextArea;
    }

    public void setStateHubsTextArea(JTextArea stateHubsTextArea) {
        this.stateHubsTextArea = stateHubsTextArea;
    }

    public JRadioButton getRadioButton2() {
        return radioButton2;
    }

    public void setRadioButton2(JRadioButton radioButton2) {
        this.radioButton2 = radioButton2;
    }

    public JRadioButton getRadioButton3() {
        return radioButton3;
    }

    public void setRadioButton3(JRadioButton radioButton3) {
        this.radioButton3 = radioButton3;
    }

    public JTextField getNumberOfContainersTextField() {
        return numberOfContainersTextField;
    }

    public void setNumberOfContainersTextField(JTextField numberOfContainersTextField) {
        this.numberOfContainersTextField = numberOfContainersTextField;
    }

    public JTextArea getTaOutput() {
        return taOutput;
    }

    public void setTaOutput(JTextArea taOutput) {
        this.taOutput = taOutput;
    }


    ImageIcon logoIcon = new ImageIcon("src/PaqI11/Icons/logo.png");


    public ImageIcon getLogoIcon() {
        return logoIcon;
    }

    public void setLogoIcon(ImageIcon logoIcon) {
        this.logoIcon = logoIcon;
    }


    public ContainerForm() {

        setContentPane(mainPanel);
        setTitle("Container Hub");
        setSize(1400, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Hubs hub = new Hubs();

        // Set up action listeners for buttons
        setUpPileButtonActionListener(hub);
        setUpUnpileButtonActionListener(hub);
        setUpNumberOfContainersButtonActionListener(hub);
        setUpContainerDescriptionButtonActionListener(hub);

    }

    private void setUpContainerDescriptionButtonActionListener(Hubs hub) {
        containerDescriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tfIdNumber.getText());
                showDescriptionTextArea.setText(hub.getContainerDescriptionById(id));
            }
        });
    }

    private void setUpNumberOfContainersButtonActionListener(Hubs hub) {
        // Add ActionListener for a button to display the number of containers from a specific country
        numberOfContainersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == numberOfContainersButton) {
                    String country = (String) countriesComboBox2.getSelectedItem();
                    int count = (int) hub.countContainers(country);
                    numberOfContainersTextField.setText("" + count);
                }
            }
        });
    }

    private void setUpUnpileButtonActionListener(Hubs hub) {
        unpileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int column = Integer.parseInt(columnNumberTextField.getText());
                    hub.deleteContainer(column);
                    stateHubsTextArea.setText(hub.printHubOccupancy());
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, "Column number should be an integer", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (InvalidColumnException exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, exception.getMessage(), "Invalid Column Number", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void setUpPileButtonActionListener(Hubs hub) {
        pileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int idNumber = Integer.parseInt(tfIdNumber.getText());
                    int weight = Integer.parseInt(tfWeight.getText());

                    if (!radioButton1.isSelected() && !radioButton2.isSelected() && !radioButton3.isSelected()) {
                        throw new Exception("Priority not assessed");
                    }
                    Container container = new Container();
                    container.setIdentifier(Integer.parseInt(tfIdNumber.getText()));
                    container.setWeight(Integer.parseInt(tfWeight.getText()));
                    container.setContentDescription(tfContentDescription.getText());
                    container.setSendingCompany(tfSendingCompany.getText());
                    container.setReceivingCompany(tfReceiverCompany.getText());
                    container.setCountryOfOrigin((String) countriesComboBox1.getSelectedItem());
                    container.setCustoms(customCheckBox.isSelected());
                    if (radioButton1.isSelected()) {
                        container.setPriority(1);
                    } else if (radioButton2.isSelected()) {
                        container.setPriority(2);
                    } else if (radioButton3.isSelected()) {
                        container.setPriority(3);
                    }

                    hub.addContainer(container);
                    stateHubsTextArea.setText(hub.printHubOccupancy());
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, "ID Number and Weight should be integers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, exception.getMessage(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


    public static void main(String[] args) {
        ContainerForm myContainer = new ContainerForm();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        imageLogo = new JLabel(new ImageIcon("logo.png"));
    }
}
