

package com.monsanto.mbt;

public class Shipment {


  public void sorted_by_date()
  {
    List <Widgets> l1 = new ArrayList<Widget>();
    
    Collections.sort(l1, new Comparator<Widget>() {
		@Override
		public int compare(Widget o1, Widget o2) {
			return o1.getColor() - o2.getColor();
		}
      
    }
                     }

    
  
