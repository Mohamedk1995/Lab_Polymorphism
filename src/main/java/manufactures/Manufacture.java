package manufactures;

public class Manufacture {

    String description;
    boolean isComplete;

    Manufacture(String descriptions) {
        this.description = descriptions;
        this.isComplete = false;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isComplete() {
        return this.isComplete;
    }

    public void setIsComplete(boolean complete){
        this.isComplete = complete;
    }
}
