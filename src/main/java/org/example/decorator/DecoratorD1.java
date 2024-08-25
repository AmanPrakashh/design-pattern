package org.example.decorator;

public class DecoratorD1 extends BaseDecorator{
    public DecoratorD1(BaseInterface baseInterface) {
        super(baseInterface);
    }

    @Override
    public void functionToBeDecorated() {
        super.functionToBeDecorated();
        System.out.println("Decorator D1 implementation");
    }
}
