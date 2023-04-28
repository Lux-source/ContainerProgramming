package PackI11Lucian;

public class Container {
    protected int identifier;
    protected int weight;
    protected String countryOfOrigin;
    protected boolean customs;
    protected int priority;
    protected String contentDescription;
    protected String companySend;
    protected String companyReceives;

    // Constructors, getters, setters, and other methods will be implemented here

    // Add this inside the Container class
    public Container(int identifier, int weight, String countryOfOrigin, boolean customs, int priority,
                     String contentDescription, String companySend, String companyReceives, String stateDescription) {
        this.identifier = identifier;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.customs = customs;
        this.priority = priority;
        this.contentDescription = contentDescription;
        this.companySend = companySend;
        this.companyReceives = companyReceives;
    }

    public Container() {}

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

    public boolean iscustoms() {
        return customs;
    }

    public void setcustoms(boolean customs) {
        this.customs = customs;
    }

    public int getPriority() {
        return priority;
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

    public String getcompanySend() {
        return companySend;
    }

    public void setcompanySend(String companySend) {
        this.companySend = companySend;
    }

    public String getcompanyReceives() {
        return companyReceives;
    }

    public void setcompanyReceives(String companyReceives) {
        this.companyReceives = companyReceives;
    }

    public String toString() {
        return "Container{" +
                "identifier=" + identifier +
                ", weight=" + weight +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", customs=" + customs +
                ", priority=" + priority +
                ", contentDescription='" + contentDescription + '\'' +
                ", companySend='" + companySend + '\'' +
                ", companyReceives='" + companyReceives + '\'' +
                ", stateDescription='" + '\'' +
                '}';
    }
}