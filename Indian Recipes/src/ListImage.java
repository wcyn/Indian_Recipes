/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wasonga
 */

import com.sun.lwuit.Component;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.list.ListCellRenderer;
import com.sun.lwuit.plaf.Border;
import java.io.IOException;


public class ListImage extends Label implements ListCellRenderer {

    private Image[] images;
    
    /** Creates a new instance of MyListRenderer */
    public ListImage()

    {
        super("");
        images = new Image[4];
       /*final String[] persons={"John Hagee","Martyn Lloyd","George Mueller","John Stott","Elisabeth Elliot",
           "Corrie Ten Boom",
                      "R.C. Sproul","Adrian Rogers","Andrew Murray","Hudson Taylor","Chuck Swindoll","Billy Graham",
                      "Smith Wigglesworth","Martin Luther King","Rick Warren","Oswald Chambers","Leonard Ravenhill",
                      "Ravi Zacharias","John Piper","Watchman Nee","John MacAuthur","D.L. Moody","Max Lucado",
                      "A.W. Tozer",
                      "Charles Spurgeon","C.S. Lewis","Joyce Meyer","TD Jakes"};*/
        try {
            images[0] =Image.createImage("/images/mainpic2.jpg");
            images[1] =Image.createImage("/images/snackicon1.jpg");
            images[2] =Image.createImage("/images/drinkicon1.jpg");
            
 

          
        } catch (IOException ex){
            Dialog.show("Error", "Images could not load", "Ok", "Cancel");
            ex.printStackTrace();
        }

    }

    public Component getListCellRendererComponent(List list, Object value, int index, boolean isSelected) {
        setText(value.toString());
        //getStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD,Font.SIZE_MEDIUM));
        if (index==0) {
            
            setIcon(images[0]);
             getStyle().setBgColor(0xffffff);
           // getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xD7DF01, true));
            //getStyle().setBgTransparency(100);
            
        } 
        if(index==1){
            
           setIcon(images[1]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xD7DF01, true));
            //getStyle().setBgTransparency(255);
        }
        if (index==2) {
            
           setIcon(images[2]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xD7DF01, true));
            //getStyle().setBgTransparency(255);
            
        }
        if (index==3) {
            
            setIcon(images[3]);
            getStyle().setBgColor(0xffffff);
            //getStyle().setFgColor(0x000000);
            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
            //getStyle().setBgTransparency(255);
            
        }
//        if (index==4) {
//
//            setIcon(images[0]);
//            getStyle().setBgColor(0xffffff);
//            //getStyle().setFgColor(0x000000);
//            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
//            //getStyle().setBgTransparency(255);
//
//        }
//         if (index==5) {
//
//            setIcon(images[0]);
//            getStyle().setBgColor(0xffffff);
//            //getStyle().setFgColor(0x000000);
//            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
//            //getStyle().setBgTransparency(255);
//
//        }
//        if (index==6) {
//
//            setIcon(images[0]);
//            getStyle().setBgColor(0xffffff);
//            //getStyle().setFgColor(0x000000);
//            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
//            //getStyle().setBgTransparency(255);
//
//        }
//                if (index==7) {
//
//            setIcon(images[0]);
//            getStyle().setBgColor(0xffffff);
//            //getStyle().setFgColor(0x000000);
//            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
//            //getStyle().setBgTransparency(255);
//
//        }
//                if (index==8) {
//
//            setIcon(images[0]);
//            getStyle().setBgColor(0xffffff);
//            //getStyle().setFgColor(0x000000);
//            getStyle().setBorder(Border.createRoundBorder(15, 15, 0xffcc99, true));
//            //getStyle().setBgTransparency(255);
//
//        }
  
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

