package jcVistaButtons;
import java.awt.Image;
import java.beans.*;
public class jcVistaButtonsBeanInfo extends SimpleBeanInfo{
 Image icon;
 Image icon32;
 Image iconM;
 Image icon32M;
 
 public jcVistaButtonsBeanInfo(){
 icon = loadImage("/ico/16C.png");
 icon32 = loadImage("/ico/32C.png");
 iconM = loadImage("/ico/16M.png");
 icon32M = loadImage("/ico/32M.png");
 }
 
 @Override
 public Image getIcon(int i){
 switch(i)
 {
 case 1:
 return icon;
 case 2:
 return icon32;
 case 3:
 return iconM;
 case 4:
 return icon32M;
 }
 return null;
 }
}
