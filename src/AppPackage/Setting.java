
package AppPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class Setting {
    public static Properties prop = new Properties();
    
    public void WriteWallpaper(String wallID){
        try{
            prop.setProperty("Wallpaper", wallID);
            prop.store(new FileOutputStream("config.properties"), null);
                    
        }
        catch(IOException e){
            
        }
    }
    public String ReadWallpaper(){
        String line = "";
        try{
            prop.load(new FileInputStream("config.properties"));
            line = prop.getProperty("Wallpaper");
            
                    
        }
        catch(IOException e){
            
        }
        
        return line;
    }
}
