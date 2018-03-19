package com.monsanto.mbt;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShipmentTest {

    @Test
    public void testShipment_Sorted_By_Color(){
        //Implement your solution to get list of shipments
        
        List<Widget> list = new ArrayList<Widget>();
        List l2 = WidgetsUtils.getSampleWidgets();
        Collections.sort(list ,l2);
        

    }

    @Test
    public void testShipment_Sorted_By_Date(){
        //Implement your solution to get list of shipments


    }


}
