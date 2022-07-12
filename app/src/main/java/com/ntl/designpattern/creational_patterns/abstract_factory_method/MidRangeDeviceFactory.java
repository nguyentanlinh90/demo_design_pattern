package com.ntl.designpattern.creational_patterns.abstract_factory_method;

import com.ntl.designpattern.creational_patterns.abstract_factory_method.listener.Laptop;
import com.ntl.designpattern.creational_patterns.abstract_factory_method.listener.MidRangeLaptop;
import com.ntl.designpattern.creational_patterns.abstract_factory_method.listener.MidRangePhone;
import com.ntl.designpattern.creational_patterns.abstract_factory_method.listener.Phone;

public class MidRangeDeviceFactory extends ElectronicDeviceAbstractFactory {
    @Override
    Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    Laptop getLaptop() {
        return new MidRangeLaptop();
    }
}
