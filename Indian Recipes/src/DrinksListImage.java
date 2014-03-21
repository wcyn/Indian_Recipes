
import com.sun.lwuit.Component;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.list.ListCellRenderer;
import com.sun.lwuit.plaf.Border;
import java.io.IOException;


public class DrinksListImage extends Label implements ListCellRenderer {

    private Image[] images;
    
    /** Creates a new instance of MyListRenderer */
    public DrinksListImage()

    {
        super("");
        images = new Image[6];
      try {
            images[0] =Image.createImage("/images/Angoori-Lassi2.jpg");
            images[1] =Image.createImage("/images/Easy_Mango_lassi2.jpg");
            images[2] =Image.createImage("/images/Masala_chai2.jpg");
            images[3] =Image.createImage("/images/Badam_milk.jpg");
            images[4] =Image.createImage("/images/kharbhooja_sharbat.jpg");
            
        } catch (IOException ex){
            Dialog.show("Error", "Images could not load", "Ok", "Cancel");
            ex.printStackTrace();
        }
    }
//"Angoori lassi", "Easy Mango Lassi"/*, "Category Three"*/, "Masala Chai", "Badam Milk", "Kharbhooja Sharbat"
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
