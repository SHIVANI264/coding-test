

package com.monsanto.mbt;

public class Shipment implements Comparator<Widget>
{


  public void sorted_by_color()
  {
    @Override
   public int compare(Widget o1, Widget o2) 
   {
   return o1.getColor() - o2.getColor();
   }
 }     
    
public void sort_ByDATE()
{

@Override
public int compare(Widget w1, Widget w2) 
{
return o1.getDate() - o2.getDate();
}
}

}
      

    
  
