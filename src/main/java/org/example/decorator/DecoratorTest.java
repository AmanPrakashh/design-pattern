package org.example.decorator;

public class DecoratorTest {
    public static void main(String[] args) {


        BaseConcreteClass baseConcreteClass = new BaseConcreteClass();
        baseConcreteClass.functionToBeDecorated();

        BaseDecorator baseDecorator = new BaseDecorator(new BaseConcreteClass());
        baseDecorator.functionToBeDecorated();
        System.out.println("*********************************************************");
        BaseInterface decoratorD1 = new DecoratorD1(new BaseConcreteClass());
        decoratorD1.functionToBeDecorated();

        System.out.println("**********************************************************");

        BaseInterface decoratorD2 = new DecoratorD2(new DecoratorD1(new BaseConcreteClass()));
        decoratorD2.functionToBeDecorated();
    }
}
