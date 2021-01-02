package week07d05;

public abstract class Vehicle {

    int numberOfGears = 5;
    TransmissionType transmissionType = TransmissionType.MANUAL;

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

}
