package PackI11Lucian;

public class Container {
    private int identifier;
    private int weight;
    private String countryOfOrigin;
    private boolean inspected;
    private int priority;
    private String contentDescription;
    private String sendingCompany;
    private String receivingCompany;
    private String stateDescription;

    // Constructors, getters, setters, and other methods will be implemented here

    // Add this inside the Container class
    public Container(int identifier, int weight, String countryOfOrigin, boolean inspected, int priority,
                     String contentDescription, String sendingCompany, String receivingCompany, String stateDescription) {
        this.identifier = identifier;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.inspected = inspected;
        this.priority = priority;
        this.contentDescription = contentDescription;
        this.sendingCompany = sendingCompany;
        this.receivingCompany = receivingCompany;
        this.stateDescription = stateDescription;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public boolean isInspected() {
        return inspected;
    }

    public void setInspected(boolean inspected) {
        this.inspected = inspected;
    }

    public int getPriority() {
        return priority;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getSendingCompany() {
        return sendingCompany;
    }

    public void setSendingCompany(String sendingCompany) {
        this.sendingCompany = sendingCompany;
    }

    public String getReceivingCompany() {
        return receivingCompany;
    }

    public void setReceivingCompany(String receivingCompany) {
        this.receivingCompany = receivingCompany;
    }

    public String toString() {
        return "Container{" +
                "identifier=" + identifier +
                ", weight=" + weight +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", inspected=" + inspected +
                ", priority=" + priority +
                ", contentDescription='" + contentDescription + '\'' +
                ", sendingCompany='" + sendingCompany + '\'' +
                ", receivingCompany='" + receivingCompany + '\'' +
                ", stateDescription='" + stateDescription + '\'' +
                '}';
    }
}