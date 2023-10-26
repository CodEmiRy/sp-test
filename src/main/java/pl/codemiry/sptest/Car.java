package pl.codemiry.sptest;

public class Car {

    private String model;
    private String marka;

    public Car(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}
