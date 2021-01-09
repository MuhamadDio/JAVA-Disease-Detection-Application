
package AppPackage;

import static AppPackage.MenuUtama.jLabel1;
import javax.swing.ImageIcon;


public class SetWallpaper {

    
    public void SetWallpaper(){
        Setting S = new Setting();
        
        if(S.ReadWallpaper().equals("Wall1")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background.png"));
            jLabel1.setIcon(I1);
        }
        else if(S.ReadWallpaper().equals("Wall2")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background2.png"));
            jLabel1.setIcon(I1); 
        }
        else if(S.ReadWallpaper().equals("Wall3")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background3.png"));
            jLabel1.setIcon(I1);
        }
        else if(S.ReadWallpaper().equals("Wall4")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background4.png"));
            jLabel1.setIcon(I1);
        }
        else if(S.ReadWallpaper().equals("Wall5")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background5.png"));
            jLabel1.setIcon(I1);
        }
        else if(S.ReadWallpaper().equals("Wall6")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background6.png"));
            jLabel1.setIcon(I1);
        }
        else if(S.ReadWallpaper().equals("Wall7")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background7.png"));
            jLabel1.setIcon(I1);
        }
        else if(S.ReadWallpaper().equals("Wall8")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background8.png"));
            jLabel1.setIcon(I1);
        }
        else if(S.ReadWallpaper().equals("Wall9")){
            
            ImageIcon I1 = new ImageIcon(getClass().getResource("/ImageBackground/Background9.png"));
            jLabel1.setIcon(I1);
        }
        
    }
}
