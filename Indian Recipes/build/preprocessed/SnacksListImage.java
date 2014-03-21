
import com.sun.lwuit.Component;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.list.ListCellRenderer;
import com.sun.lwuit.plaf.Border;
import java.io.IOException;


public class SnacksListImage extends Label implements ListCellRenderer {

    private Image[] images;
    
    /** Creates a new instance of MyListRenderer */
    public SnacksListImage()

    {
        super("");
        images = new Image[7];
      try {
            images[0] =Image.createImage("/images/bhelpuri.jpg");
            images[1] =Image.createImage("/images/Bonda.JPG");
            images[2] =Image.createImage("/images/tnw_almond_til_chikki.jpg");
            images[3] =Image.createImage("/images/Thattai.jpg");
            images[4] =Image.createImage("/images/samosas.jpg");
            images[5] =Image.createImage("/images/indian-pudding.jpg");
            
        } catch (IOException ex){
            Dialog.show("Error", "Images could not load", "Ok", "Cancel");
            ex.printStackTrace();
        }
    }
//"Bhelpuri" /*"Ada (Adai)", "Category Three"*/, "Bonda", "Almond Til Chikki", "Thattai"
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
