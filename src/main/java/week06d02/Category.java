package week06d02;

public enum Category {
    FROZEN("Frozen"), DAIRY("Dairy"),BAKEDGOODS("Bakedgoods"),OTHER("Other");

    private final String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
