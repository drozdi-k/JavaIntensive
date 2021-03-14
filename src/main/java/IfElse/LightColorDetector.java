package IfElse;

public class LightColorDetector {

    public static String detect(int wavelength) {
        if(wavelength>=380 && wavelength<=449) return "Фиолетовый (Violet)";
        if(wavelength>=450 && wavelength<=494) return "Синий (Blue)";
        if(wavelength>=495 && wavelength<=569) return "Зеленый (Green)";
        if(wavelength>=570 && wavelength<=589) return "Желтый (Yellow)";
        if(wavelength>=590 && wavelength<=619) return "Оранжевый (Orange)";
        if(wavelength>=620 && wavelength<=750) return "Красный (Red)";
        else return "невидимый спектр (Invisible Light)";

    }
}
