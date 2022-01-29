package tests;

import java.io.File;
import javax.imageio.*;
public class DetectDarkImage {

    public static void main(String[] args) throws Exception {
        java.awt.image.BufferedImage img = ImageIO.read(new File("c:/temp/img4.jpg"));
        int height = img.getHeight();
        int width = img.getWidth();
    
        System.out.println(height + "  " + width + " " + img.getRGB(30, 30));
 
        int count = 0;
        int all = 0;
        for (int h = 0; h < height; h++) {
          for (int w = 0; w < width; w++) {
            int rgb = img.getRGB(w, h);

            int red = (rgb >> 16) & 0x000000FF;
            int green = (rgb >> 8) & 0x000000FF;
            int blue = (rgb) & 0x000000FF;
    
            all++;
            if (red <= 60 && green <= 60 && blue <= 60)
               count++;
            
          }
        }

        System.out.println(all + "-Black:" + count + "::" + count*100/all);
      }    
}
