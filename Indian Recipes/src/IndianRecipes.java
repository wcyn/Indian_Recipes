
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nokia.lwuit.GestureHandler;
import com.nokia.mid.ui.CategoryBar;
import com.nokia.mid.ui.ElementListener;
import com.nokia.mid.ui.IconCommand;

//import com.sun.lwuit.Button;
import com.nokia.mid.ui.gestures.GestureEvent;
import com.nokia.mid.ui.gestures.GestureInteractiveZone;

import com.sun.lwuit.Command;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.animations.CommonTransitions;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.plaf.Border;
//import com.sun.lwuit.plaf.UIManager;
import java.io.IOException;
//import java.util.Vector;
import javax.microedition.midlet.*;

/**
 * @author wasonga
 */
public class IndianRecipes extends MIDlet {

    Form home, main, help, about, mainDishes,snacks,drinks, backMain,backDrinks;
    Form backSnacks;
    String[] recipes;
    int pos; //tracking the position
    TextArea taDisplay;
    String clickedItem;
    CategoryBar cb;
    IconCommand homei, abouti, helpi;
    Dialog progress;

    public void startApp() {
        splash();// splash screen method should be called first

        Display.init(this);
//        try {
//            Resources res = Resources.open("/test.res");
//            UIManager.getInstance().setThemeProps(res.getTheme("Cynanim"));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
            
        home();
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void home(){

        home = new Form("Home");
        String[] cats = {"Main Dishes", "Snacks"/*, "Category Three"*/, "Drinks"/*, "Online"*/};
        final List list= new List(cats);
        list.setListCellRenderer(new ListImage());
        list.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                int selected = list.getSelectedIndex();
                switch(selected)
                {

                    case 0:
                        clickedItem = "Main Dishes";
                        //recipes = null;
                        //recipes = new String[]{"una macho red ukiangalia nyama inaiva "," una kichwa delicate, ukifikiria maskio zinaingia ndanikichwa yako kubwa hadi inaappear kwa ID both sides itoshee "," ati meno zako zina spaces mob mpaka ulimi yako inakaa ni kama iko kwa jela "," Manzi yako mnono, mnono, ukimchinjia, lazima umuingize box tatu "," nyumba yenu ni ndogo mpaka nyi hutake turns kubreathe "," ati mko wengi design nyi hulala kwa kitanda mkiwa mmejipanga ka vibiriti "," Mlango ya hao yenu ni soo nyinyi hufungua wall instead "," naskia haukuzaliwa ulitangazwa kwa radio "," wewe ni mrefu mpaka skin yako ina ishia kwa magoti "," TV yenu ni nzee mpaka mnaizima na maji "," unajipaka make up mob ukilia unaacha erosion "," Ati wewe ni mkonda,mpaka ukienda toile unatumia uzi badala ya tissue!!! "," Wewe ni mzee hadi id numba yako iko na roman numberz….. "," haga ya dame wako ni small mpaka unamdara na tweezer "," ati mbuyu wa u ni mstingy ye uphotocopy socks zake ndio asave wode ya kuosha "," manzi yako ana ulimi ingine rough mpaka akiongea yeye huskip kama CD "," Manzi yako amekonda akifanya helikopta anatake off "," ati wewe ni mkondi hadi ukishuta una sikia uchungu "," Ati wewe ni mfupi mpaka unakata cabbage na ngazi? "," dame wako ni mshake hadi ulipomnunulia radio ya kwanza, alibanjuka hadi newz "," wewe ni mwizi mpaka unaji ibia kutoka kwa mfuko ya right una weka kwa ya left "," Kwenu ni ocha mpaka mathree hutandika vitambaa kwa viti "," Ati computer yako ni slow hadi wewe huiwasha asubuhi ili uweze kuwatch movie usiku "," Umezoea kutuma plis call mpaka mathegi walikuja kwenu ukatuma*130*999# "," wewe ni mnono watu hufanya tizi by runnin around u "," Mbuyu wako ni mnono akikalia hashu, akiamka inakuwa kobole mbili "," Ati ngozi yako mbaya inakaa kama combat! "," una kichwa kubwa mpaka ukikimbia unabaki umefloat "," Budako fala ulimtuma kitabu ya class 8 akaleta mbili za class 4 "," ati wee ni m old hadi marks zako za kcpe ziliandikwa kwa stone tablets "," Dame yako ana lips kubwa mpaka anatumia roll on ka lip balm "," We ni mgalenjin orichinol hadi chogoo zenu huwiga ‘gogorigooo’ "," Ati nyumba yenyu ni kombo mpaka ukilala asubuhi unajipata nnje "," Ati una sura mbaya ukilia machozi zinaenda juu "," Ngotha yako chuma ikiingia lunch unaitoa na spark "," Ati wewe mkonde ukiinua mkono unaona maminyoo zikikatiana "," Nyinyi ni mababi mpaka mnaweka sufuria zenyu kwa saucer "," Nyinyi ni mababi mpaka muna hao ya glass ambayo ina madirisha ya mawe "," Ati wewe ni mfupi sana hadi uki pigwa picha, lazima camera man alale kwa floor "," Ati nyanyako ni mblack design venye alijoin ma brownie, yeye alibaki ame itwa blackie "," Kwenu nyi ni mafala hadi mna patia kuku zenu maji moto ati ndio zitoe mayai boilo "," Nyumba yenu ni round lakini mnafight kulala back left "," Gari yeni ni noma siku za mvua inavaa gumboots "};
                        mainDishes();
                        break;
                    case 1:
                        clickedItem = "Snacks";
                        //recipes = null;
                        //recipes = new String[]{" Mobile 4n yako ni kali mpaka inamixx ma ringtones "," Sura kama sufuria ya ocha "," Mko wadosi mpaka ng’ombe zenu huvalishwa Trust condoms zikienda kulala "," ati maskio zako ni soo watu wa GTV walikuwa wanazitumia ka dish huko kwenu? "," Ati wewe ni slim mpaka mtu anaeza kufikiri wewe ni toothpeak. "," wewe ni fala tu sana mpaka ukido exam pekee yako bado unakuwa number two. "," ati manzi yako ni mkonde ana rasa moja "," Kwenyu nyinyi ni wengi mpaka muko na number plates "," Ati we ni mtall mpaka ukivaa trao by the time ifike kwa waist imeisha fashion "," Wewe nywele zako ni ngumu kabla uchanue wewe humeza Panadol. "," Ati TV yenu ni small mpaka nyi huwatch na jicho moja "," Nyinyi kwenu ni wablack mkiingia kwa moti yenyu dirisha zinakuwa tinted "," Wewe ni mnono ukiingia class unakaa next to everyone "," TV yenyu ni old mukiwasha Kasavuli bado yuko kipindi cha watoto "," We mfupi jo unashuka kwa basi na parachute "," Budako ni fala mpaka ye hucover newspaper "," TV yenu ndogo mpaka news huanza…’je munatuona?’ "," Wewe ni mshamba mpaka the first time ulipanda mathree ulitandika vitambaa. "," Kwenyu nyi ni wengi badala ya sofasets muko na viti za stadi (stadium) "," TV yenu ni nzee mpaka mna izima na maji ","Ati umejipaka cologne mob hadi ukipita karibu na sparks unawaka moto ","Kwenu kumejaa mpaka mende zinacommit suicide. ","Ati guka yako mzee mpaka chest yake imeandikwa ‘THE END’ ","Ati kwenu kuchafu hadi mende wanavaa slipers! ","Ati Tv yenu ni small mpaka ina scrollbars. ","hao yenyu ndogo, ukiingia umetoka. ","Walls za kwenyu ni thin neighbour akikata kitunguu mnaanza kulia ","Ati budako ni mjinga mpaka alipo ingia kwa buu aliambia konda amshikie chuma ndio atoe pesa. ","Wacha kujisikia na kwenyu Easter mulikula Patco na mapera. ","Doggy yenu noma, inabark na tweng ","Budako mrefu mpaka anauza mahindi kwa watu kwa plane ","TV yenu small, mpaka Katherine Kasavuli ana inama kusema news. ","ati wewe mweusi mpaka unaacha fingerprints zako kwa makaa ","we ni mweusi mpaka mabeste wakikupita wanasemahaiya cheki shortcut! ","TV yenu nzee mpaka channel zake zinaonesha wakati wa akina noah! ","Wewe ni mlafi mpaka ukimaliza kuvuta fegi unalamba vidole ","Nasikia kwenu mume endelea ,hadi mko na teabags za uji. ","Wewe ni fala hadi una-rewind CD na biro ","Doggy yenu imekonda hadi ikpewa jina in collapse juu ya mzigo ","Grandbuda yako ni mzee,alikuwa shamba boy was Garden of Eden ","TV yenu ni deadly ,ukiiwasha in sema Please insert Pin Code ","Ati wewe ni mjinga,mamako aki kutuma ukanunwe coour tv ,una muuliza Ya colour gani ","Nyumba yenu ni ya nyasi,sa wezi wakicome wanashout fungua ama tulete ngombe ","Umeunga vinoma ,mpaka we hupeel maembe kama njugu ","Mshuto yako ni kali hadi mende za kwenu zina sema afadhali doom ","We ni fala uli pika chapo na Fair and Lovely ndio zitoke Light and Soft "};
                        snacks();
                        break;
                    case 2:
                        clickedItem = "Drinks";
                       // recipes = null;
                        //recipes = new String[]{"Angoori lassi\nIngredients\n 1.Cumin seeds (1/2 tsp)\n 2.Creamy unsweetened    yoghurt (1 ½ glass)\n 3.Crushed ice (1 cup)\n 4.Grapes (1 cup, seedless)\n 5.Sugar (4 tbsp)\n 6.Salt\nMethod\n 1.Roast the cumin seeds in a pan, and then grind it into a fine powder.\n 2.Keep a small amount of this powder aside for garnishing.\n 3.Now, blend rest of the powder with the unsweetened yogurt, crushed ice, grapes, sugar and a pinch of salt.\n 4.Serve the chilled lassi in glasses and garnish it with remaining cumin powder and finely chopped grapes.\n ","Ati manzi wako ana mdomo chafu ,aki tema mate ina geuka mbolea ","Nyanya yenu ni mzee ,mpak gav ika mnyaganya ID ","Ati first time yako kubuy gari ulisema ufungiweunaenda mbali "," Naskia mko advanced mpaka nyi huenda loo viabluetooth ","Ati naskia nyi ni wengi mpaka nyi hukunywa chai na sprinkler ","First time uliona soda,ulifinya finya kujua gani ni ripe ","Nilikupata umezubaa ukiangalia chupa ya orange ","juice…ati juu imeandikwa concentrate…. ","Naskia ulienda para sunday school ","Naskia simu yako iko na slot ya coins….. ","Una kichwa sooo ukithink kuna echo….! ","Ati you r so ugly vile ulizaliwa uliwekwa kwaincubator tinted ndio usi shtue watoiwengine…..ha,haaaaa!! ","Ati umekonda mpaka ukivaa vest bado unakunjasleeves ","Ati Mtoy wenu ni dotcom, badala ya kulia yeye huvibrate.. ","Ati guka yako ni mzee mpaka chest yake imeandikwa ‘THE END’ ","Ati TV yenu ni small mpaka iko na scrollbars. ","Wewe mweusi mpaka ukirushiwa mawe, mawe inarudi kuitisha torch ","Wewe mgondi mpaka ukishikilia ten bob Moi anabaki na vest peke yake ","Budako ni fala alienda airport akauliza kama kuna ndege pick-up ","Budako fala alipaint aerial ya TV yenu ndiyo ireceive color ","Paka wenu ni mnoma mpaka aki shika panya inaitisha chumvi ","Nyinyi ni mababi mpaka mnapikanga chapo na Robb ndio zikue chapo menthol ","Ngombe yenu ni mzee mpaka inatoanga yogurt. ","Nyinyi kwenu mmesota mpaka mna-kunywanga chai kwa kifuniko ya Bic. ","Budako ni fala, alienda kubuy ngombe akaona ikikojoa akasema, sitaki hiyo, imetoboka. ","Nyanyako mzee mpaka chawa za nywele yake hutembea na bakora. ","TV yenyu ndogo mpaka mkiwatch 100m athletics mnamalizia kuiona kwa ma Neighbours. ","Ati mathako mnono akivaa nguo ya yellow watu hufikiria ni taxi ","Brother yako ako na skin tight mpaka aki-wink mguu moja inainuka ","Hao yenu bigi mpaka ukifungua mlango ya nyuma unatokea ocha ","Nyinyi wengi kwenyu budako uwanga na ‘Buda press unit’ ","Kwenyu mko wengi mpaka mkipika Chapo mnaziphotocopy ndio zitoshe. ","ati Kwenyu ni kuchafu mpaka mende zinavalia slippers. "," manzi yako mnono ,ukimpeleka kwa cinema, ana sit next to everybody! ","Ati wewe ni mzee badala ya ku die, utabomoka ","ati spectacles zako ni thick mpaka ukiangalia atlas, una ona watu waki wave! ","Ati wee ni mweusi mpaka wameandika …SCRATCH TO REVEAL …..kwa I.D yako ya shule ","Nyumba yenu imetengezwa na nyasi wezi wakikuja wao husema fungua mlango au tulete ng’ombe. ","Ati wewe ni mwizi excess mpaka ukishika ten bob prezzo anabaki na vest ","Ati dogi yenu ni mzee ikiona wagondi lazima ijishikilie kwa ukuta ndio ibark ","naskianga ati dem wako ni mhairy hadi ako na afro kwa nipples. ","Ati manzi yako amesota hadi yutumia SOMETIMEZ badala ya ALWAYS ","we ni m ugly mathako alikudrop tao akashikwa na kanjo for littering "};
                        drinks();
                        break;
//                    case 3:
//                        clickedItem = "Category Four";
//                        recipes = null;
//                        recipes = new String[]{"Nasikia chali yako mrefu, yeye huride bike magoti kwa pedals ","Nasikia kwenu ni unsafe mende hutembea wawili wawili ","Nasikia mtaa yenu ni unsafe gate hulala kwa nyumba ","umekonda hadi ukivaa jacket ya green unakaa miwa! ","Nasikia wewe ni mchafu ukipita karibu na toilet hujiflash ","Wewe ni fala mpaka ulienda cyber ukaulizia stamp ati ndio uweke kwa email ","Ati budako huenda job mapema ndio aswing kwa gate. ","Nasikia phone yako ni mzee iki vibrate SMS zote zinamwagika chini ","Ati mko wengi kwenu mpaka mwenye amelala poa ameshikilia bulb ","Ati we ni mkonde pyjamas zako zina stripe moja ","Manzi yako ana sura ugly tu sana, akiwa mtoi mathake alikuwa anamvalisha rubber band watu wafikirie ni mask amevaa ","Nasikia uko na kichwa bigi, ukifikiria unasikia echo ","Wewe una kichwa kubwa ukienda salon kusukwa nywele, mwenye kukusuka akimaliza side moja huchukua taxi kwenda hiyo side ingine ","Uko na masikio bigi, ukiingia hoteli alafu u turn, chakula zote zinapoa ","TV yenu ni ndogo, Swaleh Mdoe huingia ki gully creepa ","We ni mnono uko na your own gravitational pull"};
//                        main();
//                        break;

//                     case 4:
//                        clickedItem = "Online";
//                       // loadData();
//                        main();
//                        break;
                }
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        home.addComponent(list);
        home.show();

        try {
            javax.microedition.lcdui.Image img1 = javax.microedition.lcdui.Image.createImage("/images/three.png");
            javax.microedition.lcdui.Image img2 = javax.microedition.lcdui.Image.createImage("/images/four.png");
            javax.microedition.lcdui.Image img3 = javax.microedition.lcdui.Image.createImage("/images/two.png");

            homei = new IconCommand("Home", img1, img1, javax.microedition.lcdui.Command.SCREEN, 3);
            abouti = new IconCommand("About", img2, img2, javax.microedition.lcdui.Command.SCREEN, 3);
            helpi = new IconCommand("Help", img3, img3, javax.microedition.lcdui.Command.SCREEN, 3);

        } catch (IOException ex) {
           // ex.printStackTrace();
            System.out.println("Failed to attach image!");
        }

        IconCommand[] ics = {homei, abouti, helpi};
        cb = new CategoryBar(ics, true);
        cb.setVisibility(true);//make sure it can be displayed on the screen

        //easiest way of handling this
        cb.setElementListener(new ElementListener() {

            public void notifyElementSelected(CategoryBar cb, int i) {
                switch(i)
                {
                    
                    case 0:
                        home();
                        break;
                    case 1:
                        about();
                        //loadData(); //help load data faster, fast wifi ---loading wont show
                        break;
                    case 2:
                        help();
                        break;

                }
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    public void backMain()
    {
     pos = 1;
        backMain = new Form(clickedItem);
        //Button next = new Button("Next Recipe");
        //Button prev = new Button("Previous Recipe");
        taDisplay = new TextArea(70,20);
        taDisplay.setEditable(false);
        taDisplay.setText("Swipe the screen to view the recipe.");




//        next.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent ae) {
//                moveNext();
//               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
//
//        prev.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent ae) {
//                movePrev();
//               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
       // main.addComponent(next);
       // main.addComponent(prev);
        backMain.addComponent(taDisplay);


        Command back = new Command("Back"){

            public void actionPerformed(ActionEvent evt) {
                mainDishes();
               // super.actionPerformed(evt); //To change body of generated methods, choose Tools | Templates.
            }

        };

        backMain.setBackCommand(back);

        GestureHandler handler = new GestureHandler() {

            public void gestureAction(GestureEvent ge) {

                switch(ge.getType())
                {

                    case GestureInteractiveZone.GESTURE_FLICK:
                        if(ge.getFlickSpeedX() > 0)
                        {
                        moveNext();
                        }else if(ge.getFlickSpeedX() < 0 ){
                        movePrev();
                        }
                        break;

                }

               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //GestureRegistrationManager.register(handler, null);
        GestureHandler.setFormGestureHandler(backMain, handler);
        backMain.show();

    }
    public void mainDishes()
    {
    mainDishes = new Form("Main Dishes");
    String[] cats = {"Mushroom galouti kebab", "Paneer korma"/*, "Category Three"*/, "Mint raita", "Indian-Style Beef... Kebabs With Cilantro Sauce", "Soy-Balsamic Roa...sted Chicken With Rosemary","Chicken Curry in ... a Hurry", "Slow-Cooker Chic...ken Tikka Masala" , "Curried Eggplant... With Tomatoes and Basil","Slow-Cooker Tusc...an Pot Roast","Spiced Chicken Sa...lad With Plums and Chickpeas"};
    final List list= new List(cats);
    list.setListCellRenderer(new MaindishListImage());
    
        list.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                int selected = list.getSelectedIndex();
                switch(selected)
                {

                    case 0:
                        clickedItem = "Mushroom galouti kebab";
                        recipes = null;
                        recipes = new String[] {"Mushroom galouti kebab:\n\nIngredients\n\nButton mushrooms (600 gms)\nTurmeric powder (1 tsp)\nCumin seeds (1/2 tsp)\nGinger-garlic paste (2 tbsp)\nChopped green chillies (2-3)\nCooking Oil (1tbsp)\nBoiled and grated potatoes (2 small)\nClove powder (1/4 tsp)\nRoasted chana dal powder (3 tbsp)\n\nInstructions\n\n 1.Parboil the button mushrooms with turmeric powder, and then blend them until finely chopped.\n 2.Saute the cumin seeds, ginger-garlic paste and chopped green chillies in oil (1tbsp).\n 3.Add mushrooms and cook till the moisture evaporates.\n 4.Add the boiled and grated potatoes, and cook till the oil starts leaving the sides of the pan.\n 5.Add salt (to taste), clove powder and roasted chana dal powder in the mixture.\n 6.Lastly, shape them into tikkis and deep fry till golden brown.\n 7.Serve hot with mint chutney."};
                          backMain();
                        break;
                    case 1:
                        clickedItem = "Paneer korma";
                        recipes = null;
                        recipes = new String[]{" Paneer korma\n\nIngredients\n\nOnions (3 small)\nGinger (1 inch long)\nGreen chillies (2-3)\nClarified butter (2 tbsp)\nGrated mava (1 cup)\nCream (1 cup)\nSalt (to taste)\nRed chilli powder (1/2 tsp)\nTurmeric (1/4 tsp)\nGaram masala (1/2 tsp)\nPaneer (cut into one-inch dices)\n\nInstructions\n\n 1.Grind the onions, ginger and green chillies in a mixer.\n 2.Cook them in the clarified butter till the oil begins to separate.\n 3.Add the grated mava and cream to it.\n 4.Cook it on a low flame for two minutes.\n 5.Add salt (to taste), red chilli powder, turmeric and garam masala in the paste.\n 6.At last, put the paneer with water (1/2 cup).\n 7.Let it cook till the gravy thickens.\n 8.Serve it hot with paratha or chappatti."};
                        backMain();
                        break;
                    case 2:
                        clickedItem = "Mint raita";
                        recipes = null;
                        recipes = new String[]{"Mint Raita \n \nIngredients \n \n-Mint leaves (1 cup) \n-Whipped curd (3 cups) \n-Green chilli (1) \n-Roasted cumin seeds powder (1/2 tsp) \n-Crushed black pepper (1/2 tsp) \n-Sugar (1 tsp) \n-black rock salt (1/4 tsp) \n-salt (to taste) \nInstructions \n \n1.Take mint leaves and make a paste using water. \n2.Add this paste to the whipped curd along with green chilli (1). \n3.Add the roasted cumin seeds powder, crushed black pepper, sugar, black rock salt and salt (to taste) in the curd. \n4.Mix it well and serve chilled. "};
                        backMain();
                        break;
                        case 3:
                        clickedItem = "Indian-Style Beef Kebabs With Cilantro Sauce";
                        recipes = null;
                        recipes = new String[]{"Indian-Style Beef Kebabs With Cilantro Sauce \nIngredients \n \n-1 bunch fresh cilantro (about 2 cups cilantro leaves) \n-1 small onion, peeled \n-2 cloves garlic, peeled \n-1 small green chili pepper, trimmed and halved, with seeds \n-1 2-inch piece fresh ginger, peeled \n-1 1/4 teaspoons kosher salt \n-4 tablespoons vegetable oil \n-3 tablespoons fresh lime juice \n-½ teaspoon curry powder \n-1 ½ pounds rib-eye steak, cut into 24 one-inch chunks \n-1 medium red onion, peeled \n-1 cup mango chutney \n-4 pieces naan bread (optional) \n \nInstructions \n \n1.Place the cilantro, yellow onion, garlic, chili, ginger, and salt with 3 tablespoons of the oil in a food processor fitted with a metal blade. \n2.Process until a paste is formed. Transfer to a large bowl. \n3.Put 2 tablespoons of the paste in a small bowl and stir in the lime juice to make the cilantro sauce. Cover and set aside. \n4.Stir the curry powder into the rest of the paste. \n5.Add the steak and coat well. \n6.Cover and marinate at room temperature for 20 minutes. \n7.Cut the red onion into 6 wedges and separate each wedge into 2 layers. \n8.Thread the beef and onion chunks onto eight 9-inch skewers. \n9.Brush a grill pan with the remaining oil. \n10.Preheat grill pan, then grill the kebabs for 8 to 10 minutes, turning the skewers every 2 minutes. \n11.Serve with the cilantro sauce, chutney, and naan, if desired."};
                        backMain();
                        break;
                        case 4:
                        clickedItem = "Soy-Balsamic Roasted Chicken With Rosemary";
                        recipes = null;
                        recipes = new String[]{"Soy-Balsamic Roasted Chicken With Rosemary \n \nIngredients \n \n-1/4 cup balsamic vinegar \n-1/4 cup soy sauce \n-1/4 cup fresh rosemary leaves \n-1/4 cup honey \n-black pepper \n-One 3½ to 4-pound chicken, cut into 10 pieces \n-8 shallots, peeled \n-1 tablespoon olive oil \n \nInstructions \n \n1.Heat oven to 425° F. \n2.Combine the vinegar, soy sauce, rosemary, honey, and ½ teaspoon pepper in a 9-by-13-inch or another shallow 3-quart baking dish. \n3.Add the chicken, turn to coat, and place skin-side down. \n4.Toss the shallots with the oil in a medium bowl and arrange on top of the chicken. \n5.Roast the chicken for 30 minutes. \n6.Turn the pieces skin-side up and continue to roast, basting occasionally, until the shallots are tender, the chicken is glazed, and a thermometer inserted in the thickest part of a thigh registers 165° F, 15 to 20 minutes more. (Tent the dish loosely with foil if the chicken browns too quickly.)"};
                        backMain();
                        break;
                        case 5:
                        clickedItem = "Chicken Curry in a Hurry";
                        recipes = null;
                        recipes = new String[]{"Chicken Curry in a Hurry \nIngredients \n \n-1 cup white rice \n-1½ tablespoons olive oil \n-1 small yellow onion, thinly sliced \n-2 teaspoons curry powder \n-1/2 cup plain yogurt \n-3/4 cup heavy cream \n-1/2 teaspoon kosher salt \n-1/4 teaspoon black pepper \n-1 14.5-ounce can diced tomatoes, drained (optional) \n-meat from 1 rotisserie chicken, sliced or shredded \n-1/4 cup fresh cilantro leaves, roughly chopped \n \nInstructions \n \n1.Cook the rice according to the package directions. \n2.Heat the oil in a skillet over medium-low heat. Add the onion and cook, stirring occasionally, for 7 minutes. \n3.Sprinkle with the curry powder and cook, stirring, for 1 minute. \n4.Add the yogurt and cream and simmer gently for 3 minutes. Stir in the salt, pepper, and tomatoes (if desired). Remove from heat. \n5.Divide the rice and chicken among individual bowls, spoon the sauce over the top, and sprinkle with the cilantro.\n "};
                        backMain();
                        break;
                        case 6:
                        clickedItem = "Slow-Cooker Chicken Tikka Masala";
                        recipes = null;
                        recipes = new String[]{"Slow-Cooker Chicken Tikka Masala \n \nIngredients \n \n-1 15-ounce can crushed tomatoes \n-1 medium onion, chopped \n-2 cloves garlic, chopped \n-2 tablespoons tomato paste \n-2 teaspoons garam masala (Indian spice blend) \n-kosher salt and black pepper \n-1 1/2 pounds boneless, skinless chicken thighs (about 8) \n-1/2 English cucumber, halved and thinly sliced \n-1/4 cup fresh cilantro leaves \n-1 tablespoon fresh lemon juice \n-1 cup basmati or some other long-grain white rice \n-1/2 cup heavy cream \n \nInstructions \n \n1.In a 4- to 6-quart slow cooker, combine the tomatoes, onion, garlic, tomato paste, garam masala, 3 teaspoon salt, and 1/4 teaspoon pepper. \n2. Place the chicken on top of the vegetables, cover, and cook until the chicken is tender, on low for 7 to 8 hours or on high for 3 to 4 hours (this will shorten total recipe time). \n3.In a small bowl, toss the cucumber and cilantro with the lemon juice and 1/4 teaspoon each salt and pepper. Cover and refrigerate for up to 8 hours. \n4.Twenty minutes before serving, cook the rice according to the package directions. \n5.Just before serving, stir the cream into the chicken tikka masala. \n6.Serve over the rice with the cucumber relish.\n "};
                        backMain();
                        break;
                        case 7:
                        clickedItem = "Curried Eggplant With Tomatoes and Basil";
                        recipes = null;
                        recipes = new String[]{"Curried Eggplant With Tomatoes and Basil \n \nIngredients \n \n-1 cup white basmati rice \n-kosher salt and black pepper \n-1 tablespoon olive oil \n-1 onion, chopped \n-2 pints cherry tomatoes, halved \n-1 eggplant (about 1 pound), cut into 1/2-inch pieces \n-1 1/2 teaspoons curry powder \n-1 15.5-ounce can chickpeas, rinsed \n-1/2 cup fresh basil \n-1/4 cup plain low-fat yogurt (preferably Greek), optional \n \nInstructions \n \n1.In a medium saucepan with a tight-fitting lid, combine the rice, 1½ cups water, and ½ teaspoon salt and bring to a boil. \n2.Stir the rice once, cover, and reduce heat to low. \n3.Simmer for 18 minutes. \n4.Remove from heat and let stand, covered, for 5 minutes. \n5.Meanwhile, heat the oil in a saucepan over medium-high heat. Add the onion and cook, stirring occasionally, until softened, 4 to 6 minutes. \n6.Stir in the tomatoes, eggplant, curry powder, 1 teaspoon salt, and ¼ teaspoon black pepper. \n7.Cook, stirring, until fragrant, about 2 minutes. \n8.Add 2 cups water and bring to a boil. Reduce heat and simmer, partially covered, until eggplant is tender, 12 to 15 minutes. \n9.Stir in the chickpeas and cook just until heated through, about 3 minutes. \n10.Remove the vegetables from heat and stir in the basil. \n11.Fluff the rice with a fork. \n12.Serve the vegetables over the rice with yogurt, if using.\n "};
                        backMain();
                        break;
                        case 8:
                        clickedItem = "Slow-Cooker Tuscan Pot Roast";
                        recipes = null;
                        recipes = new String[]{"Slow-Cooker Tuscan Pot Roast \nIngredients \n \n-1/3 cup olive oil \n-One 2 1/2- to 3-pound bottom-round pot roast \n-2 large onions, quartered \n-2 celery stalks, thinly sliced (2 cups) \n-2 large carrots, thinly sliced (2 cups) \n-3 garlic cloves, minced \n-One 6-ounce can tomato paste \n-1 cup dry red wine \n-1 1/2-ounce package dried mushrooms (such as portobello) \n-1 tablespoon kosher salt \n-1 teaspoon dried oregano \n-One 28-ounce can whole plum tomatoes, chopped, liquid reserved \n \nInstructions \n \n1.Heat the oil in a large skillet over medium-high heat and brown the roast on all sides. \n2.Transfer the roast to a 4- to 6-quart slow cooker. \n3.To the fat remaining in the skillet, add the onions, celery, carrots, and garlic. \n4.Cook, stirring frequently, until tender, about 10 minutes. \n5.Add the tomato paste and stir to coat the vegetables; transfer to the cooker. \n6.Pour the wine into the skillet and scrape up any browned bits; add the contents of the skillet to the cooker, along with the mushrooms, salt, oregano, and tomatoes (plus 1 cup of their liquid). \n7.Cook 8 hours on low heat, or 4 hours on high heat."};
                        backMain();
                        break;
                        case 9:
                        clickedItem = "Spiced Chicken Salad With Plums and Chickpeas";
                        recipes = null;
                        recipes = new String[]{"Spiced Chicken Salad With Plums and Chickpeas \n \nServes 4| Hands-On Time: 30m| Total Time: 1hr 30m \nIngredients \n \n-1 small red onion, half coarsely chopped and half sliced \n-2 cloves garlic \n-2 teaspoons garam masala or curry powder \n-3/4 cup low-fat Greek yogurt \n-1/4 cup plus 2 tablespoons red wine vinegar \n-kosher salt and black pepper \n-1 pound boneless, skinless chicken breasts (2 to 3) \n-2 tablespoons olive oil \n-1 large head romaine lettuce, torn \n-1 15.5-ounce can chickpeas, rinsed \n-1/4 cup sliced dried apricots \n-1 plum, pitted and thinly sliced \n \nInstructions \n \n1.In a blender, puree the chopped onion and the garlic with the garam masala,½ cup of the yogurt,¼ cup of the vinegar, ½ teaspoon salt, and ¼ teaspoon pepper. \n2.Transfer to a medium bowl, add the chicken, and turn to coat. \n3.Let it marinate in the refrigerator for at least 1 hour and up to 1 day. \n4.Heat 1 tablespoon of the oil in a large nonstick skillet over medium heat. \n5.Shake the excess marinade off the chicken. Cook the chicken until browned and cooked through, 6 to 7 minutes per side. \n6.Let rest for 5 minutes before slicing. \n7.Meanwhile, in a large bowl, whisk together the remaining ¼ cup of yogurt, 2 tablespoons of vinegar, and 1 tablespoon of oil with 1 tablespoon water, ½ teaspoon salt, and ¼ teaspoon pepper. \n8.Add the lettuce, chickpeas, and sliced onion and toss to combine. \n9.Top with the chicken, apricots, and plum.\n"};
                        backMain();
                        break;
//                    case 3:
//                        clickedItem = "Category Four";
//                        recipes = null;
//                        recipes = new String[]{"Nasikia chali yako mrefu, yeye huride bike magoti kwa pedals ","Nasikia kwenu ni unsafe mende hutembea wawili wawili ","Nasikia mtaa yenu ni unsafe gate hulala kwa nyumba ","umekonda hadi ukivaa jacket ya green unakaa miwa! ","Nasikia wewe ni mchafu ukipita karibu na toilet hujiflash ","Wewe ni fala mpaka ulienda cyber ukaulizia stamp ati ndio uweke kwa email ","Ati budako huenda job mapema ndio aswing kwa gate. ","Nasikia phone yako ni mzee iki vibrate SMS zote zinamwagika chini ","Ati mko wengi kwenu mpaka mwenye amelala poa ameshikilia bulb ","Ati we ni mkonde pyjamas zako zina stripe moja ","Manzi yako ana sura ugly tu sana, akiwa mtoi mathake alikuwa anamvalisha rubber band watu wafikirie ni mask amevaa ","Nasikia uko na kichwa bigi, ukifikiria unasikia echo ","Wewe una kichwa kubwa ukienda salon kusukwa nywele, mwenye kukusuka akimaliza side moja huchukua taxi kwenda hiyo side ingine ","Uko na masikio bigi, ukiingia hoteli alafu u turn, chakula zote zinapoa ","TV yenu ni ndogo, Swaleh Mdoe huingia ki gully creepa ","We ni mnono uko na your own gravitational pull"};
//                        main();
//                        break;

//                     case 4:
//                        clickedItem = "Online";
                       // loadData();
                        //main();
                        //break;
                }
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
           

        

        });

        mainDishes.addComponent(list);
        mainDishes.show();

        try {
            javax.microedition.lcdui.Image img1 = javax.microedition.lcdui.Image.createImage("/images/three.png");
            javax.microedition.lcdui.Image img2 = javax.microedition.lcdui.Image.createImage("/images/four.png");
            javax.microedition.lcdui.Image img3 = javax.microedition.lcdui.Image.createImage("/images/two.png");

            homei = new IconCommand("Home", img1, img1, javax.microedition.lcdui.Command.SCREEN, 3);
            abouti = new IconCommand("About", img2, img2, javax.microedition.lcdui.Command.SCREEN, 3);
            helpi = new IconCommand("Help", img3, img3, javax.microedition.lcdui.Command.SCREEN, 3);

        } catch (IOException ex) {
           // ex.printStackTrace();
            System.out.println("Failed to attach image!");
        }
        Command back=new Command("Back"){

            public void actionPerformed(ActionEvent evt)
            {
                home();
            }

        };
        mainDishes.setBackCommand(back);
        IconCommand[] ics = {homei, abouti, helpi};
        cb = new CategoryBar(ics, true);
        cb.setVisibility(true);//make sure it can be displayed on the screen

        //easiest way of handling this
        cb.setElementListener(new ElementListener() {

            public void notifyElementSelected(CategoryBar cb, int i) {
                switch(i)
                {
                    case 0:
                        home();
                        break;
                    case 1:
                        about();
                        //loadData(); //help load data faster, fast wifi ---loading wont show
                        break;
                    case 2:
                        help();
                        break;

                }
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }
     public void backSnacks()
    {
     pos = 1;
        backSnacks = new Form(clickedItem);
        //Button next = new Button("Next Recipe");
        //Button prev = new Button("Previous Recipe");
        taDisplay = new TextArea(80,20);
        taDisplay.setEditable(false);
        taDisplay.setText("Swipe the screen to view the recipe.");




//        next.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent ae) {
//                moveNext();
//               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
//
//        prev.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent ae) {
//                movePrev();
//               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
       // main.addComponent(next);
       // main.addComponent(prev);
        backSnacks.addComponent(taDisplay);


        Command back = new Command("Back"){

            public void actionPerformed(ActionEvent evt) {
                snacks();
               // super.actionPerformed(evt); //To change body of generated methods, choose Tools | Templates.
            }

        };

        backSnacks.setBackCommand(back);

        GestureHandler handler = new GestureHandler() {

            public void gestureAction(GestureEvent ge) {

                switch(ge.getType())
                {

                    case GestureInteractiveZone.GESTURE_FLICK:
                        if(ge.getFlickSpeedX() > 0)
                        {
                        moveNext();
                        }else if(ge.getFlickSpeedX() < 0 ){
                        movePrev();
                        }
                        break;

                }

               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //GestureRegistrationManager.register(handler, null);
        GestureHandler.setFormGestureHandler(backSnacks, handler);
        backSnacks.show();

    }
    public void snacks()
    {
    snacks = new Form("Snacks");
String[] cats = {"Bhelpuri" /*"Ada (Adai)", "Category Three"*/, "Bonda", "Almond Til Chikki", "Thattai","Easy Samosas","Indian Pudding"};
    final List list= new List(cats);
    list.setListCellRenderer(new SnacksListImage());//SnacksListImage
        list.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                int selected = list.getSelectedIndex();
                switch(selected)
                {

                    case 0:
                        clickedItem = "Bhelpuri";
                        recipes = null;
                        recipes = new String[]{"Bhelpuri \n \nIngredients: \n \n-3 cups puffed rice (available at Indian stores) \n-A handful of roasted and salted peanuts \n-2 potatoes boiled, peeled and chopped into tiny cubes \n-1 large onion chopped fine \n-1 large tomato chopped fine \n-Half a bunch of coriander chopped fine (approximately 50 gms/ 0.10 lbs) \n-2 green chillies chopped fine \n-Tamarind chutney to taste \n-Mint-coriander chutney to taste \n-A handful of coarsely crushed papdi (savoury biscuits made from flour) \n-1 cup sev (vermicelli-like snack made from gram flour and available at Indian stores) \n \nInstructions \n \n1.Mix the puffed rice, peanuts, potato, onion, tomato, coriander and green chillies together in a large bowl. \n2.Add the tamarind chutney and mint-coriander chutney according to your own taste preferences (that's the beauty of bhelpuri!) \n3.Mix well, garnish with plenty of sev and papdi. \n4.Serve and eat immediately.\n "};
                        backSnacks();
                        break;
//                    case 1:
//                        clickedItem = "Adai(Adai)";
//                        recipes = null;
//                        recipes = new String[]{" Mobile 4n yako ni kali mpaka inamixx ma ringtones "," Sura kama sufuria ya ocha "," Mko wadosi mpaka ng’ombe zenu huvalishwa Trust condoms zikienda kulala "," ati maskio zako ni soo watu wa GTV walikuwa wanazitumia ka dish huko kwenu? "," Ati wewe ni slim mpaka mtu anaeza kufikiri wewe ni toothpeak. "," wewe ni fala tu sana mpaka ukido exam pekee yako bado unakuwa number two. "," ati manzi yako ni mkonde ana rasa moja "," Kwenyu nyinyi ni wengi mpaka muko na number plates "," Ati we ni mtall mpaka ukivaa trao by the time ifike kwa waist imeisha fashion "," Wewe nywele zako ni ngumu kabla uchanue wewe humeza Panadol. "," Ati TV yenu ni small mpaka nyi huwatch na jicho moja "," Nyinyi kwenu ni wablack mkiingia kwa moti yenyu dirisha zinakuwa tinted "," Wewe ni mnono ukiingia class unakaa next to everyone "," TV yenyu ni old mukiwasha Kasavuli bado yuko kipindi cha watoto "," We mfupi jo unashuka kwa basi na parachute "," Budako ni fala mpaka ye hucover newspaper "," TV yenu ndogo mpaka news huanza…’je munatuona?’ "," Wewe ni mshamba mpaka the first time ulipanda mathree ulitandika vitambaa. "," Kwenyu nyi ni wengi badala ya sofasets muko na viti za stadi (stadium) "," TV yenu ni nzee mpaka mna izima na maji ","Ati umejipaka cologne mob hadi ukipita karibu na sparks unawaka moto ","Kwenu kumejaa mpaka mende zinacommit suicide. ","Ati guka yako mzee mpaka chest yake imeandikwa ‘THE END’ ","Ati kwenu kuchafu hadi mende wanavaa slipers! ","Ati Tv yenu ni small mpaka ina scrollbars. ","hao yenyu ndogo, ukiingia umetoka. ","Walls za kwenyu ni thin neighbour akikata kitunguu mnaanza kulia ","Ati budako ni mjinga mpaka alipo ingia kwa buu aliambia konda amshikie chuma ndio atoe pesa. ","Wacha kujisikia na kwenyu Easter mulikula Patco na mapera. ","Doggy yenu noma, inabark na tweng ","Budako mrefu mpaka anauza mahindi kwa watu kwa plane ","TV yenu small, mpaka Katherine Kasavuli ana inama kusema news. ","ati wewe mweusi mpaka unaacha fingerprints zako kwa makaa ","we ni mweusi mpaka mabeste wakikupita wanasemahaiya cheki shortcut! ","TV yenu nzee mpaka channel zake zinaonesha wakati wa akina noah! ","Wewe ni mlafi mpaka ukimaliza kuvuta fegi unalamba vidole ","Nasikia kwenu mume endelea ,hadi mko na teabags za uji. ","Wewe ni fala hadi una-rewind CD na biro ","Doggy yenu imekonda hadi ikpewa jina in collapse juu ya mzigo ","Grandbuda yako ni mzee,alikuwa shamba boy was Garden of Eden ","TV yenu ni deadly ,ukiiwasha in sema Please insert Pin Code ","Ati wewe ni mjinga,mamako aki kutuma ukanunwe coour tv ,una muuliza Ya colour gani ","Nyumba yenu ni ya nyasi,sa wezi wakicome wanashout fungua ama tulete ngombe ","Umeunga vinoma ,mpaka we hupeel maembe kama njugu ","Mshuto yako ni kali hadi mende za kwenu zina sema afadhali doom ","We ni fala uli pika chapo na Fair and Lovely ndio zitoke Light and Soft "};
//                        main();
//                        break;
                    case 1:
                        clickedItem = "Bonda";
                        recipes = null;
                        recipes = new String[]{"Bonda \n \nIngredients: \n \n-Potato boiled and mashed-1cup \n-Pepper / green chili- finely chopped- 2ts \n-Cumin seeds-few \n-Crushed garlic -1/2 ts \n-Ajwain- few \n-Salt to tate \n-Basin / Gram Flour-1cup \n-Real little pinch of turmeric \n-Oil for deep frying \n \nInstructions \n \n1.Mix Basin + salt + cumin seeds + ajwain with water, the consistency of the batter should be thin. \n2.Now mix potato+green chili+garlic+salt+ cumin seeds+turmeric +ajwain in one bowl. \n3.Make small balls out of the potato mixture and arrange them in a plate. \n4.Heat the oil for deep fry in a pan \n5.Take the potato dumpling with hand and drop it in a gram flour mixture and make sure that the dumpling is well coated with it on all side and deep fry it. \n6.Remove the dumplings when they turn golden brown. \n7.Enjoy these crispy potato balls with Mint chutney.\n "};
                        backSnacks();
                        break;
                        case 2:
                        clickedItem = "Almond Til Chikki";
                        recipes = null;
                        recipes = new String[]{"Almond Til Chikki \n \nPreparation Time: 10 Minutes \nCooking Time: 10 Minutes \nMakes 10 pieces. \n \nIngredients \n \n-1/4 cup black sesame seeds (kala til) \n-1/2 cup powdered almonds (badam) \n-1/3 cup grated jaggery (gur) \n-1 tsp ghee \n-1/2 tsp ghee for greasing \n \nInstructions \n \n1.Heat a non-stick pan, add the sesame seeds and almonds and roast over a slow flame till they turn light golden in colour. Remove and keep aside to cool. \n2.Heat the ghee in the same pan, add the jaggery and simmer over a slow flame while stirring continuously, till the jaggery melts and caramelizes and forms a hard ball when you add a drop in a bowlful of cold water. Remove from the flame. \n3.Add the roasted sesame seeds and almonds and mix thoroughly. \n4.When slightly cool, divide the mixture into 10 equal pieces and shape each portion into rounds or mould into desire shapes, using different moulds or cookie cutters as shown in the picture. \n5.Cool completely and store in an air-tight container.\n "};
                        backSnacks();
                        break;
                        case 3:
                        clickedItem = "Thattai";
                        recipes = null;
                        recipes = new String[]{"Thattai \n \nIngredients \n \n-2 cup Rice Flour (sifted) \n-2 tbsp Urad Dal flour \n-Chilli powder as per requirement \n-2 tbsp Bengal gram/Channa Dal/Kadalaparuppu \n-Few curry leaves chopped into small pieces \n-Salt to taste \n-1/4 tsp Asafoetida \n-2 tsp Butter \n-Oil for frying. \n \nInstructions \n \n1. Soak the bengal gram for 1 hour, remove it and dry it. \n2. In a kadai, add rice flour, urad dal four, chilli powder, bengal gram, curry leaves, salt, asafoetida, butter and mix well. \n3. Add water little by little and make a pliable dough. \n4. Take a small ball of small lime size and flatten the same on a piece of cloth. (or you can apply little oil on a plastic sheet and make the same on top of it. You should be able to flatten the same without breaking.) \n5. Prick the same with a fork. Remove slowly and deep fry the same in slow flame till you find it is crisp. \n6. Remove it on an absorbent paper. When cool, keep it in airtight container. Your prasad is ready.\n "};
                        backSnacks();
                        break;
                        case 4:
                        clickedItem = "Easy Samosas";
                        recipes = null;
                        recipes = new String[]{"Easy Samosas \n \nMakes 12| Hands-On Time: 25m| Total Time: 55m \n \nIngredients \n \n-1 tablespoon olive oil \n-1 medium onion, chopped \n-1½ teaspoons curry powder \n-Kosher salt and black pepper \n-2 cups store-bought refrigerated mashed or frozen mashed potatoes, thawed (about 16 ounces) \n-1 10-ounce package frozen peas, thawed \n-1 15-ounce package refrigerated piecrusts \n-1 jar mango chutney (optional) \n \nDirections \n \n1.Heat oven to 375°F. Heat the oil in a large saucepan over medium heat. \n2.Add the onion and cook, stirring occasionally, until soft and golden brown, 10 to 12 minutes. \n3.Add the curry powder, ¾ teaspoon salt, and ½ teaspoon pepper and cook, stirring, until fragrant, about 1 minute. \n4.Stir in the potatoes and peas. \n5.Unroll the piecrusts and cut each into 6 triangles. \n6.Place a heaping tablespoon of the potato mixture in the center of each piece. \n7.Gather the corners of the dough and pinch to form a point. \n8.Pinch the seams to seal. Transfer to a baking sheet. \n9.Bake the samosas until golden, 22 to 25 minutes. Serve with the mango chutney, if using. "};
                        backSnacks();
                        break;
                        case 5:
                        clickedItem = "Indian Pudding";
                        recipes = null;
                        recipes = new String[]{"Indian Pudding \n \nServes 8-12| Hands-On Time: 25m| Total Time: 3hr 30m \n \nIngredients \n \n-4 cups whole milk \n-2/3 cup finely ground cornmeal \n-1/2 cup molasses \n-4 tablespoons unsalted butter, plus more for the dish \n-1/4 cup light or dark brown sugar \n-1/2 teaspoon kosher salt \n-1 teaspoon ground ginger \n-1 teaspoon ground cinnamon \n-1/4 teaspoon ground nutmeg, plus more for garnishing \n-1 teaspoon vanilla extract \n-2 cups (1 pint) heavy cream, whipped to firm peaks \n \nInstructions \n \n1.Heat oven to 350° F. \n2.In a large saucepan, over medium-high heat, bring 3 cups of the milk to a boil. \n3.In a small bowl, whisk together the remaining milk and the cornmeal. \n4.Whisking constantly, slowly add the mixture to the boiling milk. \n5.Reduce heat and simmer gently, stirring frequently, for 15 minutes. \n6.Remove from heat. \n7.Stir in the molasses, butter, brown sugar, salt, ginger, cinnamon, nutmeg, and vanilla. \n8.Transfer to a buttered 1 1/2-quart casserole dish. Set the casserole in a roasting pan, pull the oven rack out halfway, and place the pan on it. Carefully add enough hot water to the pan to reach halfway up the casserole. Cover both pans with a single large sheet of foil. Bake for 1 hour. Remove foil. Bake until the pudding is almost set but still wobbly,1 1/2 hours more. Transfer casserole to a wire rack for at least 30 minutes. Spoon onto plates. Serve with the whipped cream and sprinkle with nutmeg. \n\n "};
                        backSnacks();
                        break;
                        
//                    case 3:
//                        clickedItem = "Category Four";
//                        recipes = null;
//                        recipes = new String[]{"Nasikia chali yako mrefu, yeye huride bike magoti kwa pedals ","Nasikia kwenu ni unsafe mende hutembea wawili wawili ","Nasikia mtaa yenu ni unsafe gate hulala kwa nyumba ","umekonda hadi ukivaa jacket ya green unakaa miwa! ","Nasikia wewe ni mchafu ukipita karibu na toilet hujiflash ","Wewe ni fala mpaka ulienda cyber ukaulizia stamp ati ndio uweke kwa email ","Ati budako huenda job mapema ndio aswing kwa gate. ","Nasikia phone yako ni mzee iki vibrate SMS zote zinamwagika chini ","Ati mko wengi kwenu mpaka mwenye amelala poa ameshikilia bulb ","Ati we ni mkonde pyjamas zako zina stripe moja ","Manzi yako ana sura ugly tu sana, akiwa mtoi mathake alikuwa anamvalisha rubber band watu wafikirie ni mask amevaa ","Nasikia uko na kichwa bigi, ukifikiria unasikia echo ","Wewe una kichwa kubwa ukienda salon kusukwa nywele, mwenye kukusuka akimaliza side moja huchukua taxi kwenda hiyo side ingine ","Uko na masikio bigi, ukiingia hoteli alafu u turn, chakula zote zinapoa ","TV yenu ni ndogo, Swaleh Mdoe huingia ki gully creepa ","We ni mnono uko na your own gravitational pull"};
//                        main();
//                        break;

//                     case 4:
//                        clickedItem = "Online";
                       // loadData();
                        //main();
                        //break;
                }
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }




        });

        snacks.addComponent(list);
        snacks.show();

        try {
            javax.microedition.lcdui.Image img1 = javax.microedition.lcdui.Image.createImage("/images/three.png");
            javax.microedition.lcdui.Image img2 = javax.microedition.lcdui.Image.createImage("/images/four.png");
            javax.microedition.lcdui.Image img3 = javax.microedition.lcdui.Image.createImage("/images/two.png");

            homei = new IconCommand("Home", img1, img1, javax.microedition.lcdui.Command.SCREEN, 3);
            abouti = new IconCommand("About", img2, img2, javax.microedition.lcdui.Command.SCREEN, 3);
            helpi = new IconCommand("Help", img3, img3, javax.microedition.lcdui.Command.SCREEN, 3);

        } catch (IOException ex) {
           // ex.printStackTrace();
            System.out.println("Failed to attach image!");
        }

        IconCommand[] ics = {homei, abouti, helpi};
        cb = new CategoryBar(ics, true);
        cb.setVisibility(true);//make sure it can be displayed on the screen

        //easiest way of handling this
        cb.setElementListener(new ElementListener() {

            public void notifyElementSelected(CategoryBar cb, int i) {
                switch(i)
                {
                    case 0:
                        drinks();
                        break;
                    case 1:
                       about();
                        //loadData(); //help load data faster, fast wifi ---loading wont show
                        break;
                    case 2:
                       help();
                        break;

                }
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    Command back=new Command("Back"){

            public void actionPerformed(ActionEvent evt)
            {
                home();
            }

        };
        snacks.setBackCommand(back);
    }
    public void backDrinks()
    {
     pos = 1;
        backDrinks = new Form(clickedItem);
        //Button next = new Button("Next Recipe");
        //Button prev = new Button("Previous Recipe");
        taDisplay = new TextArea(70,20);
        taDisplay.setEditable(false);
        taDisplay.setText("Swipe the screen to view the recipe.");




//        next.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent ae) {
//                moveNext();
//               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
//
//        prev.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent ae) {
//                movePrev();
//               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
       // main.addComponent(next);
       // main.addComponent(prev);
        backDrinks.addComponent(taDisplay);


        Command back = new Command("Back"){

            public void actionPerformed(ActionEvent evt) {
                drinks();
               // super.actionPerformed(evt); //To change body of generated methods, choose Tools | Templates.
            }

        };

        backDrinks.setBackCommand(back);

        GestureHandler handler = new GestureHandler() {

            public void gestureAction(GestureEvent ge) {

                switch(ge.getType())
                {

                    case GestureInteractiveZone.GESTURE_FLICK:
                        if(ge.getFlickSpeedX() > 0)
                        {
                        moveNext();
                        }else if(ge.getFlickSpeedX() < 0 ){
                        movePrev();
                        }
                        break;

                }

               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //GestureRegistrationManager.register(handler, null);
        GestureHandler.setFormGestureHandler(backDrinks, handler);
        backDrinks.show();

    }
    public void drinks()
    {
    drinks = new Form("Drinks");
    String[] cats = {"Angoori lassi", "Easy Mango Lassi"/*, "Category Three"*/, "Masala Chai", "Badam Milk", "Kharbhooja Sharbat"};
    final List list= new List(cats);
    list.setListCellRenderer(new DrinksListImage());

        list.addActionListener(new ActionListener() {
//private Image[] images;
            public void actionPerformed(ActionEvent ae) {
                int selected = list.getSelectedIndex();
                switch(selected)
                {

                    case 0:
                        clickedItem = "Angoori lassi";
                        //images = new Image[2];
//                try {
//                    images[0] = Image.createImage("/images/Mushroom_Galouti_Kebab.jpg");
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
                        //Image.createImage(images);
                        recipes = null;
                        recipes = new String[]{"Angoori lassi\n\nIngredients\n 1.Cumin seeds (½ tsp)\n 2.Creamy unsweetened yoghurt (1 ½ glass)\n 3.Crushed ice (1 cup)\n 4.Grapes (1 cup, seedless)\n 5.Sugar (4 tbsp)\n 6.Salt\nMethod\n 1.Roast the cumin seeds in a pan, and then grind it into a fine powder.\n 2.Keep a small amount of this powder aside for garnishing.\n 3.Now, blend rest of the powder with the unsweetened yogurt, crushed ice, grapes, sugar and a pinch of salt.\n 4.Serve the chilled lassi in glasses and garnish it with remaining cumin powder and finely chopped grapes.\n"};
                        backDrinks();
                        break;
                    case 1:
                        clickedItem = "Easy Mango Lassi";
                        recipes = null;
                        recipes = new String[]{" Easy Mango Lassi\n\nPreparation time: 45-60 minutes\nCooking time : 30-45 minutes\nMakes: 25-28 pcs.\nLasts for 2-3 weeks if kept in airtight container\n\nIngredients\nOriginal recipe makes 4 cups Change Servings\n\n-2 cups plain whole milk yogurt\n-1 cup milk\n-3 mangoes - peeled, seeded, and chopped\n-4 teaspoons white sugar, or to taste\n-1/8 teaspoon ground cardamom\n\nInstructions\n 1.Place the yoghurt, milk, mangoes, white sugar, and cardamom into the jar of a blender and blend until smooth, about 2 minutes.\n 2.Chill in the refrigerator for 1 hour or until cold\n 3.serve sprinkled with a little ground cardamom."};
                        backDrinks();
                        break;
                    case 2:
                        clickedItem = "Masala Chai";
                        recipes = null;
                        recipes = new String[]{"Masala Chai\n\nOriginal recipe makes 1 serving Change Servings\n1 cup water\n1 1/2 teaspoons sugar\n1 whole cardamom pod\n1 whole clove\n2 black peppercorns\n3 teaspoons black tea leaves\n1/2 cup warm milk\n\nInstructions\n 1.Combine the water and sugar in a small saucepan, and bring to a boil.\n 2.Add the cardamom pod, clove, peppercorns and tea leaves.\n 3.Remove from heat, and let the mixture steep for 2 to 3 minutes.\n 4.Strain into a cup, and fill cup the rest of the way with milk.\n 5.Sit back, relax, and enjoy! "};
                        backDrinks();
                        break;
                        case 3:
                        clickedItem = "Badam Milk";
                        recipes = null;
                        recipes = new String[]{"Badam Milk\n\nThis recipe makes roughly 4 glasses of Badam Milk.\nIngredients\n\n1 cup almonds\n1 cup pistachios\n3 cups chilled/ warm milk\nSugar to taste\n 2/3 tsp cardamom powder\n2 tbsps kewra essence (available at Indian groceries) - optional\n2 tsps rose water\nInstructions\n\n1.Grind the almonds and pistachios to a smooth paste in your food processor. Add a little milk to do this. A lot of people like to remove the skin from the almonds before grinding them. I don't do this as the skin contains many nutrients. You can do it if you wish, by soaking the almonds in hot water for 5 minutes. When soaked, press the almonds between your thumb and index finger. The skin will slip off quite easily.\n 2.Add the milk, sugar, cardamom powder, kewra essence (if using) and rose water. Blend well.\n 3.Serve chilled/ warm in a tall glass.\n "};
                        backDrinks();
                        break;
                        case 4:
                        clickedItem = "Kharbhooja Sharbat";
                        recipes = null;
                        recipes = new String[]{"Kharbhooja Sharbat\n\nIngredients\n4 small or 2 large Honeydew Melons (Kharbooja)\n1/2 cup strained fresh Orange Juice (Santra Ka Raas)\n1/4th cup fresh Lemon Juice (Nimbu Ka Raas)\n4 drops Khus Essence\nInstructions\n\n1.If using small melons, slice off the top of each as a lid, if using large melons, cut them into half.\n2.Cut the edges into zigzag pattern.\n3.Cut a thin slice off the bottom so that the melon stands upright without tipping (take care not to cut through the shell).\n 4.Scoop out the seeds and discard.\n5.Scoop out the flesh and process in a blender, along with the remaining ingredients, until smooth.\n 6.Chill well and serve in the shells, if desired, with reversed lids and a straw.\n "};
                        backDrinks();
                        break;
                        
//                    case 3:
//                        clickedItem = "Category Four";
//                        recipes = null;
//                        recipes = new String[]{"Nasikia chali yako mrefu, yeye huride bike magoti kwa pedals ","Nasikia kwenu ni unsafe mende hutembea wawili wawili ","Nasikia mtaa yenu ni unsafe gate hulala kwa nyumba ","umekonda hadi ukivaa jacket ya green unakaa miwa! ","Nasikia wewe ni mchafu ukipita karibu na toilet hujiflash ","Wewe ni fala mpaka ulienda cyber ukaulizia stamp ati ndio uweke kwa email ","Ati budako huenda job mapema ndio aswing kwa gate. ","Nasikia phone yako ni mzee iki vibrate SMS zote zinamwagika chini ","Ati mko wengi kwenu mpaka mwenye amelala poa ameshikilia bulb ","Ati we ni mkonde pyjamas zako zina stripe moja ","Manzi yako ana sura ugly tu sana, akiwa mtoi mathake alikuwa anamvalisha rubber band watu wafikirie ni mask amevaa ","Nasikia uko na kichwa bigi, ukifikiria unasikia echo ","Wewe una kichwa kubwa ukienda salon kusukwa nywele, mwenye kukusuka akimaliza side moja huchukua taxi kwenda hiyo side ingine ","Uko na masikio bigi, ukiingia hoteli alafu u turn, chakula zote zinapoa ","TV yenu ni ndogo, Swaleh Mdoe huingia ki gully creepa ","We ni mnono uko na your own gravitational pull"};
//                        main();
//                        break;

//                     case 4:
//                        clickedItem = "Online";
                       // loadData();
                        //main();
                        //break;
                }
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }




        });

        drinks.addComponent(list);
        drinks.show();

        try {
            javax.microedition.lcdui.Image img1 = javax.microedition.lcdui.Image.createImage("/images/three.png");
            javax.microedition.lcdui.Image img2 = javax.microedition.lcdui.Image.createImage("/images/four.png");
            javax.microedition.lcdui.Image img3 = javax.microedition.lcdui.Image.createImage("/images/two.png");

            homei = new IconCommand("Home", img1, img1, javax.microedition.lcdui.Command.SCREEN, 3);
            abouti = new IconCommand("About", img2, img2, javax.microedition.lcdui.Command.SCREEN, 3);
            helpi = new IconCommand("Help", img3, img3, javax.microedition.lcdui.Command.SCREEN, 3);

        } catch (IOException ex) {
           // ex.printStackTrace();
            System.out.println("Failed to attach image!");
        }

        IconCommand[] ics = {homei, abouti, helpi};
        cb = new CategoryBar(ics, true);
        cb.setVisibility(true);//make sure it can be displayed on the screen

        //easiest way of handling this
        cb.setElementListener(new ElementListener() {

            public void notifyElementSelected(CategoryBar cb, int i) {
                switch(i)
                {
                    case 0:
                        home();
                        break;
                    case 1:
                       about();
                        //loadData(); //help load data faster, fast wifi ---loading wont show
                        break;
                    case 2:
                        help();
                        break;

                }
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        Command back=new Command("Back"){

            public void actionPerformed(ActionEvent evt)
            {
                home();
            }

        };
        drinks.setBackCommand(back);

    }
    public void main(){

        pos = 1;
        main = new Form(clickedItem);
        //Button next = new Button("Next Recipe");
        //Button prev = new Button("Previous Recipe");
        taDisplay = new TextArea(70,20);
        taDisplay.setEditable(false);
        taDisplay.setText("Swipe the screen to view the recipe.");
        
        
        

//        next.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent ae) {
//                moveNext();
//               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
//
//        prev.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent ae) {
//                movePrev();
//               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
       // main.addComponent(next);
       // main.addComponent(prev);
        main.addComponent(taDisplay);
        

        Command back = new Command("Back"){

            public void actionPerformed(ActionEvent evt) {
                home();
               // super.actionPerformed(evt); //To change body of generated methods, choose Tools | Templates.
            }

        };

        main.setBackCommand(back);

        GestureHandler handler = new GestureHandler() {

            public void gestureAction(GestureEvent ge) {

                switch(ge.getType())
                {

                    case GestureInteractiveZone.GESTURE_FLICK:
                        if(ge.getFlickSpeedX() > 0)
                        {
                        moveNext();
                        }else if(ge.getFlickSpeedX() < 0 ){
                        movePrev();
                        }
                        break;

                }

               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //GestureRegistrationManager.register(handler, null);
        GestureHandler.setFormGestureHandler(main, handler);
        main.show();

    }
    //Help info
      public void help()
    {
       help=new Form("Help");
       TextArea lb4=new TextArea("Learn how to make short delicious Indian dishes. A collection of the best ",4,20);
       lb4.setEditable(false);
       //lb4.getStyle().setBgColor(0xff0000);
       TextArea lb5=new TextArea("Simply click on a title and follow the simple instructions given.",4,20);
       lb5.setEditable(false);
       TextArea lb7=new TextArea("BEWARE: These recipes are bound to leave your people begging for more.",3,20);
       lb7.setEditable(false);
       help.addComponent(lb4);
       help.addComponent(lb5);
      // help.addComponent(lb6);
       help.addComponent(lb7);
       Command back=new Command("Back"){

            public void actionPerformed(ActionEvent evt) {
               // super.actionPerformed(evt);
                home();
            }

        };
       help.setBackCommand(back);
       help.show();
    }

    //About Developer
    public void about()
    {
        about=new Form("About");
        TextArea lbln=new TextArea("Name: Indian Recipes",1,20);
        TextArea lbl=new TextArea("Vendor: Cynthia Wasonga",1,20);
        TextArea lb2=new TextArea("Version: 1.0",1,20);

        TextArea lb4=new TextArea(2,20);
        lb4.setEditable(false);
        lb4.setText("Learn the simplest and most delicious Indian recipes");
        about.addComponent(lbln);
        about.addComponent(lbl);
        about.addComponent(lb2);
        //
        about.addComponent(lb4);
       Command back=new Command("Back"){

            public void actionPerformed(ActionEvent evt)
            {
                home();
            }

        };
        about.setBackCommand(back);
        about.show();

    }
    //Navigation
    public void moveNext(){

        if (pos < recipes.length) {

            taDisplay.setText(recipes[pos]);
            pos = pos + 1;

        }else{

            pos = 0;
            taDisplay.setText(recipes[pos]);

        }
        taDisplay.repaint();

    }

    public void movePrev(){

         if (pos > 0 && pos < recipes.length) {

            taDisplay.setText(recipes[pos]);
            pos =  pos - 1;

        }else{

            pos = recipes.length - 1;
            taDisplay.setText(recipes[pos]);
        }

         taDisplay.repaint();

    }

//     public String go_Online(String dURL)
//     {
//        HttpConnection http =null;
//        InputStream is= null;
//        String result = null;
//        StringBuffer sb=null;
//
//
//        try
//        {
//          // open a connection
//          http = (HttpConnection) Connector.open(dURL);
//
//          // set the request method as GET
//          http.setRequestMethod(HttpConnection.GET);
//
//          // server response
//          System.out.println(http.getResponseCode());
//
//          if (http.getResponseCode() == HttpConnection.HTTP_OK)
//            {
//                 sb = new StringBuffer();
//                 int ch;
//                 is = http.openInputStream();
//                 while ((ch = is.read()) != -1)
//                 sb.append((char) ch);
//            }
//          else
//            {
//              Dialog.show("Connection", "Connection not available. "
//                      + "Please check your internet settings.", "OK", "Cancel");
//
//            }
//        }
//
//         catch (Exception e )
//        {
//             Dialog.show("Connection", "Connection not available. "
//                     + "Please check your internet settings.", "OK", "Cancel");
//        }
//        finally
//        {
//         if (is != null){
//                try {
//                    is.close();
//                } catch (IOException ex) {
////                    ex.printStackTrace();
//
//                }
//         }
//         if (sb != null){
//            result = sb.toString();
//         }
//         if (http != null){
//                try {
//                    http.close();
//                } catch (IOException ex) {
////                    ex.printStackTrace();
//                }
//         }
//
//        } //end finally
//		return result;
//}

//    public String[] split(String original, String separator)
//     {
//
//       Vector nodes = new Vector();
//       System.out.println("split start...................");
//        // Parse nodes into vector
//        int index = original.indexOf(separator);
//        while(index>=0) {
//            nodes.addElement( original.substring(0, index) );
//            original = original.substring(index+separator.length());
//            index = original.indexOf(separator);
//        }
//        // Get the last node
//        nodes.addElement( original );
//
//        // Create splitted string array
//        String[] result = new String[ nodes.size() ];
//        if( nodes.size()>0 ) {
//            for(int loop=0; loop<nodes.size(); loop++)
//            {
//                result[loop] = (String)nodes.elementAt(loop);
//                System.out.println(result[loop]);
//            }
//        }
//        return result;
//    }

    public void loadData()
    {
                progress = new Dialog();
                progress.getDialogStyle().setBorder(Border.createRoundBorder(6, 6, 0xe3ef5a));
                progress.setTransitionInAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_VERTICAL, true, 400));
                progress.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_VERTICAL, false, 400));
                progress.addComponent(new Label("Fetching teasers."));
        try {
            progress.addComponent(new InfiniteProgressIndicator(Image.createImage("/images/wait-circle.png")));
        } catch (IOException ex) {
            //ex.printStackTrace();
            System.out.println("Error processbar");
        }
                int height = Display.getInstance().getDisplayHeight() - (progress.getContentPane().getPreferredH() + progress.getTitleComponent().getPreferredH());
                height /= 2;
                progress.show(height, height, 20, 20, true, false);

    new Thread(){

//        public void run(){
//
//            String results = go_Online("http://kpac.co.ke/walter/test.php");
//            recipes = split(results, "#");
//            progress.dispose();
//        }

    }.start();
    }

    public void splash(){

        LoadingBarSplash splash = new LoadingBarSplash();
        javax.microedition.lcdui.Display.getDisplay(this).setCurrent(splash);

        try {

            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error!");
            //ex.printStackTrace();
        }
    }
}
