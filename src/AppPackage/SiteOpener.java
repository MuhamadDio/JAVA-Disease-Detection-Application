
package AppPackage;

import java.io.IOException;
import javax.swing.JOptionPane;


public class SiteOpener {
    public void OpenWebsite(String sitelink){
    
        try{
            Process P;
            P = Runtime.getRuntime().exec("cmd /c start " + sitelink);
            
        }
        catch(IOException e){
           JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
}
}
