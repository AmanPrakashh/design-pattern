package org.example.decorator;

public class BaseDecorator extends  BaseConcreteClass{
    protected BaseInterface baseInterface;

    public BaseDecorator (BaseInterface baseInterface)
    {
        this.baseInterface= baseInterface;
    }


    @Override
    public void functionToBeDecorated() {
        this.baseInterface.functionToBeDecorated();
    }
}
