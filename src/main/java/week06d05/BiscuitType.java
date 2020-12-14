package week06d05;

public enum BiscuitType {
    PILOTA("Pilóta"), HIT("Hit"), ZABFALAT("Zabfalat");

    private final String value;

    BiscuitType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
