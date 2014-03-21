
import com.sun.lwuit.Component;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.list.ListCellRenderer;
import com.sun.lwuit.plaf.Border;
import java.io.IOException;


public class MaindishListImage extends Label implements ListCellRenderer {

    private Image[] images;
    
    /** Creates a new instance of MyListRenderer */
    public MaindishListImage()

    {
        super("");
        images = new Image[11];
      try {
            images[0] =Image.createImage("/images/Mushroom_Galouti_Kebab.jpg");
            images[1] =Image.createImage("/images/Paneer_Korma.jpg");
            images[2] =Image.createImage("/images/Mint_Raita.jpg");
            images[3] =Image.createImage("/images/indian_beef_kebabs.jpg");
            images[4] =Image.createImage("/images/soy_balsamic_chicken.jpg");
            images[5] =Image.createImage("/images/chicken_curry.jpg");
            images[6] =Image.createImage("/images/tikka_masala.jpg");
            images[7] =Image.createImage("/images/eggplant_basil.jpg");
            images[8] =Image.createImage("/images/pot_roast.jpg");
            images[9] =Image.createImage("/images/chicken-salad-plumbs.jpg");
        } catch (IOException ex){
            Dialog.show("Error", "Images could not load", "Ok", "Cancel");
            ex.printStackTrace();
        }
    }
//"Mushroom galouti kebab", "Paneer korma"/*, "Category Three"*/, "Mint raita", "Indian-Style Beef Kebabs With Cilantro Sauce", "Soy-Balsamic Roasted Chicken With Rosemary","Chicken Curry in a Hurry", "Slow-Cooker Chicken Tikka Masala" , "Curried Eggplant With Tomatoes and Basil","Slow-Cooker Tuscan Pot Roast"
    public Component getListCellRendererComponent(List list, Object value, int index, boolean isSelected) {
        setText(value.toString());
        //getStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD,Font.SIZE_MEDIUM));
        if (index==0) {
            
            setIcon(images[0]);
             getStyle().setBgColor(0xffffff);
           // getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        } 
        if(index==1){
            
            setIcon(images[1]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
        }
        if (index==2) {
            
           setIcon(images[2]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        }
        if (index==3) {
            
            setIcon(images[3]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        }
        if (index==4) {
            
           setIcon(images[4]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        }
         if (index==5) {
            
            setIcon(images[5]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        }
        if (index==6) {
            
            setIcon(images[6]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        }
                if (index==7) {
            
           setIcon(images[7]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        }
        if (index==8) {
            
            setIcon(images[8]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        }
        if (index==9) {

            setIcon(images[9]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);

        }
          

        return this;
    }

    public Component getListFocusComponent(List list) {
        
        setText("");
        getStyle().setBgColor(0x0000ff);//no effect
        setFocus(true);
        getStyle().setBgTransparency(100);
        return this;
    }

}
