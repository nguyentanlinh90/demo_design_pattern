package com.ntl.designpattern.creational_patterns.abstract_factory_method;

import com.ntl.designpattern.creational_patterns.abstract_factory_method.listener.Laptop;
import com.ntl.designpattern.creational_patterns.abstract_factory_method.listener.Phone;
import com.ntl.designpattern.creational_patterns.abstract_factory_method.util.Segment;

public class ClientTest {

    public static void main(String[] args) {

        ElectronicDeviceAbstractFactory midRange = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);
        Laptop midLaptop = midRange.getLaptop();
        Phone midPhone = midRange.getPhone();

        ElectronicDeviceAbstractFactory highRange = ElectronicDeviceFactory.getFactory(Segment.HIGH_RANGE);
        Laptop highLaptop = highRange.getLaptop();
        Phone highPhone = highRange.getPhone();
    }
}
