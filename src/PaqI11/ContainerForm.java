package PaqI11;

import PackI11Lucian.Container;
import PackI11Lucian.Hubs;
import PackI11Lucian.InvalidColumnException;

import java.util.ArrayList;
import java.util.List;

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

    private List<Hubs> hubsList;
    private JComboBox hubsComboBox;
    private JTextArea stateHubsTextArea1;
    private JTextArea stateHubsTextArea2;
    private JLabel chooseHub;

    public JComboBox getHubsComboBox() {
        return hubsComboBox;
    }

    public void setHubsComboBox(JComboBox hubsComboBox) {
        this.hubsComboBox = hubsComboBox;
    }

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

        hubsList = new ArrayList<>();
        hubsList.add(new Hubs());
        hubsList.add(new Hubs());
        hubsList.add(new Hubs());

        // Set up action listeners for buttons
        setUpPileButtonActionListener();
        setUpUnpileButtonActionListener();
        setUpNumberOfContainersButtonActionListener();
        setUpContainerDescriptionButtonActionListener();


    }

    private void setUpContainerDescriptionButtonActionListener() {
        containerDescriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tfIdNumber.getText());
                Hubs hub = hubsList.get(getHub());
                showDescriptionTextArea.setText(hub.getContainerDescriptionById(id));
            }
        });
    }

    private void setUpNumberOfContainersButtonActionListener() {
        // Add ActionListener for a button to display the number of containers from a specific country
        numberOfContainersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == numberOfContainersButton) {
                    String country = (String) countriesComboBox2.getSelectedItem();
                    Hubs hub = hubsList.get(getHub());
                    int count = hub.countContainers(country);
                    numberOfContainersTextField.setText("" + count);
                }
            }
        });
    }

    private void setUpUnpileButtonActionListener() {
        unpileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int column = Integer.parseInt(columnNumberTextField.getText());
                    Hubs hub = hubsList.get(getHub());
                    hub.deleteContainer(column);
                    updateHubsStatus();
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, "Column number should be an integer", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (InvalidColumnException exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, exception.getMessage(), "Invalid Column Number", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void setUpPileButtonActionListener() {
        pileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int priority = checkPriority();


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
                    container.setPriority(priority);

                    /*if (radioButton1.isSelected()) {
                        container.setPriority(1);
                    } else if (radioButton2.isSelected()) {
                        container.setPriority(2);
                    } else if (radioButton3.isSelected()) {
                        container.setPriority(3);
                    }*/

                    for(Hubs hub : hubsList){

                        if (!hub.isFull(priority)){
                            hub.addContainer(container);
                            updateHubsStatus();
                            break;
                            //stateHubsTextArea.setText(hub.printHubOccupancy());
                        }
                    }

                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, "ID Number and Weight should be integers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(ContainerForm.this, exception.getMessage(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Read Hubs Combo Box and get hub id for hubsList
    private int getHub(){
        int hubNumber = 0;
        if(hubsComboBox.getSelectedItem() == "Hub 1"){
            hubNumber = 0;
        } else if (hubsComboBox.getSelectedItem() == "Hub 2") {
            hubNumber = 1;
        } else if (hubsComboBox.getSelectedItem() == "Hub 3") {
            hubNumber = 2;
        }
        return hubNumber;
    }

    private int checkPriority() {
        int priority = 0;

        if (radioButton1.isSelected()) {
            priority = 1;
        } else if (radioButton2.isSelected()) {
            priority = 2;
        } else if (radioButton3.isSelected()) {
            priority = 3;
        }

        return priority;
    }

    private void updateHubsStatus(){
        stateHubsTextArea.setText(hubsList.get(0).printHubOccupancy());
        stateHubsTextArea1.setText(hubsList.get(1).printHubOccupancy());
        stateHubsTextArea2.setText(hubsList.get(2).printHubOccupancy());
    }

    public static void main(String[] args) {
        ContainerForm myContainer = new ContainerForm();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        imageLogo = new JLabel(new ImageIcon("logo.png"));
    }
}
