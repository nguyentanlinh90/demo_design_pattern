package com.ntl.interview.pattern.creational_patterns.abstract_factory_method;

import com.ntl.interview.pattern.creational_patterns.abstract_factory_method.util.Segment;

public class ElectronicDeviceFactory {
    public static ElectronicDeviceAbstractFactory getFactory(Segment segment) {
        switch (segment) {
            case MID_RANGE:
                return new MidRangeDeviceFactory();

            case HIGH_RANGE:
                return new HighRangeDeviceFactory();

            default:
                throw new UnsupportedOperationException("No support");
        }
    }
}
