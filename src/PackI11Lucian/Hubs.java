package PackI11Lucian;

import java.util.Arrays;

public class Hubs {
    private Container[][] containers;

    private static final int MAX_ROWS = 10;
    private static final int MAX_COLUMNS = 12;

    public Hubs() {
        containers = new Container[MAX_ROWS][MAX_COLUMNS];
    }

    public Hubs(Container[][] hub) {
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
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < MAX_COLUMNS; column++) {
                setDefaultValues(containers[row][column]);
            }
        }
    }

    private void setDefaultValues(Container container) {
        if (container == null) {
            container = new Container();
        } else {
            container.setIdentifier(-1);
            container.setContentDescription("Empty");
            container.setPriority(0);
            container.setWeight(0);
            container.setCountryOfOrigin("None");
            container.setSendingCompany("None");
            container.setReceivingCompany("None");
            container.setCustoms(false);
        }
    }

    // printHubOccupancy shows the matrix with the Free (F) and Occupied (O) allocations
    public String printHubOccupancy() {
        StringBuilder hubString = new StringBuilder();
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < MAX_COLUMNS; column++) {
                hubString.append(containers[row][column] == null ? "F " : "O ");
            }
            hubString.append("\n");
        }
        return hubString.toString();
    }

    public void addContainer(Container container) {
        if (container == null) {
            System.out.println("Container cannot be null");
        }

        if (container.priority == 1) {
            for (int i = 9; i >= 0; i--) {
                if (containers[i][0] == null) {
                    containers[i][0] = container;
                    System.out.println("Successful");
                    return;
                }
            }
        } else if (container.priority == 2) {
            for (int i = 9; i >= 0; i--) {
                if (containers[i][1] == null) {
                    containers[i][1] = container;
                    System.out.println("Successful");
                    return;
                }
            }
        } else if (container.priority == 3) {
            for (int i = 2; i < MAX_COLUMNS; i++) {
                for (int j = 9; j >= 0; j--) {
                    if (containers[j][i] == null) {
                        containers[j][i] = container;
                        System.out.println("Successful");
                        return;
                    }
                }
            }
        }
    }

    public void deleteContainer(int column) throws InvalidColumnException {
        if (column > MAX_COLUMNS) {
            throw new InvalidColumnException("Column number is greater than the maximum existing columns");
        }
        for (int row = 0; row < MAX_ROWS; row++) {
            if (containers[row][column - 1] != null) {
                containers[row][column - 1] = null;
                System.out.println("Unstack successful");
                return;
            }
        }
        System.out.println("There are no containers in this column");
    }

    public String getContainerDescriptionById(int id) {
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < MAX_COLUMNS; column++) {
                if (containers[row][column] != null && containers[row][column].getIdentifier() == id)
                    return containers[row][column].toString();
            }
        }
        return "There is no container with ID " + id;
    }

    public int countContainers(String country) {
        int containerCount = 0;
        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j < MAX_COLUMNS; j++) {
                if (containers[i][j] != null && containers[i][j].getCountryOfOrigin().equals(country)) {
                    containerCount++;
                }
            }
        }
        return containerCount;
    }

    public boolean isFull(int priority) {
        if (priority == 1) {
            if (containers[0][0] != null)
                return true;
        } else if (priority == 2) {
            if (containers[0][1] != null)
                return true;
        } else if (priority == 3) {
            if (containers[0][MAX_COLUMNS - 1] != null)
                return true;
        }
        return false;
    }
}
