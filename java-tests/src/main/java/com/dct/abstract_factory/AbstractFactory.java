package com.dct.abstract_factory;

public abstract class AbstractFactory {

    abstract GeometricShape getShape(ShapeType name);

}