package com.ntl.designpattern.creational_patterns.abstract_factory_method;

import com.ntl.designpattern.creational_patterns.abstract_factory_method.listener.Laptop;
import com.ntl.designpattern.creational_patterns.abstract_factory_method.listener.Phone;

public abstract class ElectronicDeviceAbstractFactory {

    abstract Phone getPhone();

    abstract Laptop getLaptop();
}
