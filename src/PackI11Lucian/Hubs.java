package PackI11Lucian;

import java.util.Arrays;

public class Hubs {
    private Container [][] containers;

    private static final int MAX_ROWS = 10;
    private static final int MAX_COLUMNS = 12;

    private Hubs(){
        containers = new Container[MAX_ROWS][MAX_COLUMNS];
    }

    public Hubs(Container[][] hub){
        this.containers = hub;
    }

    public Container[][] getHub() {
        return containers;
    }

    public void setHub(Container[][] hub) {
        this.containers = hub;
    }

    @Override
    public String toString() {
        return "Hubs{" + "hub=" + Arrays.toString(containers) + '}';

    }

    public void emptyHub() {
        int rows = this.containers.length;
        int columns = this.containers[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                setDefaultValues(this.containers[i][j]);
            }
        }
    }

    private void setDefaultValues(Container element) {
        if (element == null) {
            element = new Container();
        } else {
            element.identifier = -1;
            element.contentDescription = "Empty";
            element.priority = 0;
            element.weight = 0;
            element.countryOfOrigin = "None";
            element.companySend = "None";
            element.companyReceives = "None";
            element.customs = false;
        }
    }
    public String printHubOccupancy() { //toString method we can use this or the one created with the Array toString
        StringBuilder stringHub = new StringBuilder();
        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j < MAX_COLUMNS; j++) {
                if (containers[i][j] == null) {
                    stringHub.append("F ");//Free
                } else if (containers[i][j] != null) {
                    stringHub.append("O ");//Ocupated
                }
            }
            stringHub.append("\n");
        }
        return stringHub.toString();
    }

    public void setContainer(Container cont) {
        if (cont == null) {
            System.out.println("Container cannot be null");
        }

        if (cont.priority == 1) {
            for (int i = 9; i >= 0; i--) {
                if (containers[i][0] == null) {
                    containers[i][0] = cont;
                    System.out.println("Successful");
                    return;
                }
            }
        } else if (cont.priority == 2) {
            for (int i = 9; i >= 0; i--) {
                if (containers[i][1] == null) {
                    containers[i][1] = cont;
                    System.out.println("Successful");
                    return;
                }
            }
        } else if (cont.priority == 3) {
            for (int i = 2; i < MAX_COLUMNS; i++) {
                for (int j = 9; j >= 0; j--) {
                    if (containers[j][i] == null) {
                        containers[j][i] = cont;
                        System.out.println("Successful");
                        return;
                    }
                }
            }
        }
    }

    public void deleteContainer(int column) {
        for (int i = 0; i < MAX_ROWS; i++) {
            if (containers[i][column - 1] != null) {
                containers[i][column - 1] = null;
                System.out.println("Unstack successful");
                return;
            }
        }
        System.out.println("There are no containers in this column");
    }
    public String getContainerDescriptionById(int ID) {
        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j < MAX_COLUMNS; j++) {
                if (containers[i][j] != null && containers[i][j].getIdentifier() == ID)
                    return containers[i][j].toString();
            }
        }
        return "There is no container with ID " + ID;
    }
    public int countContainers(String country){
        int count=0;
        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j < MAX_COLUMNS; j++) {
                if(containers[i][j] != null && containers[i][j].getCountryOfOrigin().equals(country)){
                    count++;
                }
            }
        }
        return count;
    }
}
