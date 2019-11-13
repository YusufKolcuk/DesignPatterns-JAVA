package Prototype2;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String,Color> colorMap=new HashMap<String, Color>();
    static
    {
        colorMap.put("blue",new blueColor());
        colorMap.put("black",new blackColor());
        colorMap.put("red", new redColor());
    }
    public static Color getColor(String colorName){
        return (Color) colorMap.get(colorName).clone();
    }
    public static void printColorMap(){
        for (Map.Entry<String,Color> entry:colorMap.entrySet()){
            String key=entry.getKey();
            Color value=entry.getValue();
            System.out.println(key);
            System.out.println("   ");
            System.out.println(value);
        }
    }
}
