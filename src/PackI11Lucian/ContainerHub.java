package PackI11Lucian;

import java.util.ArrayList;
import java.util.List;
public class ContainerHub {
    private Container[][] containers;
    private static final int ROWS = 10;
    private static final int COLUMNS = 12;

    public ContainerHub() {
        containers = new Container[ROWS][COLUMNS];
    }

    // Methods for adding, removing, and finding containers will be implemented here

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (containers[row][col] != null) {
                    sb.append(containers[row][col].toString());
                } else {
                    sb.append("Empty");
                }
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean addContainer(Container container) {
        int priorityColumn = container.getPriority() - 1;
        if (priorityColumn > 1) {
            priorityColumn = 2;
        }

        for (int row = 0; row < ROWS; row++) {
            if (containers[row][priorityColumn] == null) {
                containers[row][priorityColumn] = container;
                return true;
            }
        }
        return false;
    }

    public Container removeContainer(int column) {
        for (int row = 0; row < ROWS; row++) {
            if (containers[row][column] != null) {
                Container removedContainer = containers[row][column];
                containers[row][column] = null;
                return removedContainer;
            }
        }
        return null;
    }

    public Container findContainer(int identifier) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (containers[row][col] != null && containers[row][col].getIdentifier() == identifier) {
                    return containers[row][col];
                }
            }
        }
        return null;
    }

    public int countContainersFromCountry(String country) {
        int count = 0;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (containers[row][col] != null && containers[row][col].getCountryOfOrigin().equalsIgnoreCase(country)) {
                    count++;
                }
            }
        }
        return count;
    }


}
