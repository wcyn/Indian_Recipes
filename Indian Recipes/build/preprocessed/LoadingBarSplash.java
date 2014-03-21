//import com.sun.lwuit.Font;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class LoadingBarSplash extends Canvas implements Runnable {


   private Thread scrollingBarThread = null;
   private Image imgMathLogo = null;
   private static final String IMG_MATH_LOGO = "/images/splash2.png";

   public LoadingBarSplash() {
      setFullScreenMode(true);
      /* load the mathLogo image */
   try {
         imgMathLogo = Image.createImage(IMG_MATH_LOGO);
      } catch (Exception e) {
         System.out.println("Unable to load splash Image");
         e.printStackTrace();
      }
      scrollingBarThread = new Thread(this);
      scrollingBarThread.start();
   }
   protected void paint(Graphics g) {
      showNotify();
      /* draw the image at the center of screen */
      if (imgMathLogo != null) {
         g.drawImage(imgMathLogo, 0, 0, Graphics.TOP | Graphics.LEFT);
      }
      System.gc();
   }
   public void run() {
          repaint();
   }
   protected void showNotify() {
        this.setFullScreenMode(true);

    }


}
