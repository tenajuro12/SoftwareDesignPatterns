package AbstractFactoryMethod;

public class ComputerFactory { //фабрика для создания обьектов класса
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}