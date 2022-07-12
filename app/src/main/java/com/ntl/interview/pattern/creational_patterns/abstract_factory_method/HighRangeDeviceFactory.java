package com.ntl.interview.pattern.creational_patterns.abstract_factory_method;

import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.listener.HighRangeLaptop;
import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.listener.HighRangePhone;
import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.listener.Laptop;
import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.listener.Phone;

public class HighRangeDeviceFactory extends ElectronicDeviceAbstractFactory {
    @Override
    Phone getPhone() {
        return new HighRangePhone();
    }

    @Override
    Laptop getLaptop() {
        return new HighRangeLaptop();
    }
}
