package com.ntl.interview.pattern.creational_patterns.abstract_factory_method;

import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.listener.Laptop;
import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.listener.MidRangeLaptop;
import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.listener.MidRangePhone;
import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.listener.Phone;

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
