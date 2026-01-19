package model;

public class RadioCar implements Radio {
    
    private boolean on;
    private String mode; // AM or FM
    private float frequency;
    private float[] fmButtons;
    private float [] amButtons;

    public RadioCar(){
        this.on = false;
        this.mode = "FM";
        this.frequency = 87.9f;
        this.fmButtons = new float[12];
        this.amButtons = new float[12];

    }

    @Override
    public void turnOn(){
        on = true;
    }

    @Override
    public void turnOff(){
        on = false;
    }

    @Override
    public boolean isOn(){
        return on;
    }





}
