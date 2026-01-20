import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.RadioCar;

public class RadioCarTest {

    @Test
    public void pruebaEncenderRadio() {
        RadioCar radio = new RadioCar();
        radio.turnOn();
        assertTrue(radio.isOn());
    }

    @Test
    public void pruebaCambiarModoAM(){
        RadioCar radio = new RadioCar();
        radio.changeMode("AM");
        assertEquals("AM", radio.getMode());

    }

    @Test
    public void pruebaSubirFrecuenciaFM(){
        RadioCar radio = new RadioCar();
        radio.changeMode("FM");
        float inicial = radio.getFrequency();
        radio.levelUpFrequency();
        assertTrue(radio.getFrequency()> inicial);
    }



}



