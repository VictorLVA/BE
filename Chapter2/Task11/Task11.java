public class Task11 {
    public static void main (String[] args) {
        AllTheColorsOfTheRainbow color = new AllTheColorsOfTheRainbow();
        color.changeTheHueOfTheColor((int)(1+ Math.random()*7));
        System.out.println("Current color is "+color.anIntegerRepresentingColors);
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor (int newHue) {
        anIntegerRepresentingColors = newHue;
    }
}