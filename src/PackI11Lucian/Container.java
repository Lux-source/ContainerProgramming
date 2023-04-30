package PackI11Lucian;

public class Container {
    protected int identifier;
    protected int weight;
    protected String countryOfOrigin;
    protected boolean customs;
    protected int priority;
    protected String contentDescription;
    protected String sendingCompany;
    protected String receivingCompany;

    // Constructors, getters, setters

    public Container(int identifier, int weight, String countryOfOrigin, boolean customs, int priority, String contentDescription, String sendingCompany, String receivingCompany, String stateDescription) {
        this.identifier = identifier;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.customs = customs;
        this.priority = priority;
        this.contentDescription = contentDescription;
        this.sendingCompany = sendingCompany;
        this.receivingCompany = receivingCompany;
    }

    public Container() {
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

    public boolean isCustoms() {
        return customs;
    }

    public void setCustoms(boolean customs) {
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

    @Override
    public String toString() {
        return "Container {" +
                "\n  identifier: " + identifier +
                "\n  weight: " + weight +
                "\n  origin country: " + countryOfOrigin +
                "\n  custom inspection: " + customs +
                "\n  priority: " + priority +
                "\n  content description: " + contentDescription +
                "\n  sending company: " + sendingCompany +
                "\n  receiving company: " + receivingCompany +
                "\n}";
    }
}