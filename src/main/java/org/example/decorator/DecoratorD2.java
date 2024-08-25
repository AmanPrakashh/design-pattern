package org.example.decorator;

public class DecoratorD2 extends  BaseDecorator {

    public DecoratorD2(BaseInterface baseInterface) {
        super(baseInterface);
    }

    @Override
    public void functionToBeDecorated() {
        super.functionToBeDecorated();
        System.out.println("Decorator D2 implementation");
    }
}
