package FactoryMethod;

public class Server extends Computer { // второй саб класс, наследует три метода getRAM, GetHDD, getCPU
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){ // конструктор
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }   // наши методы которые были унаследованы
    @Override
    public String getHDD() {
        return this.hdd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
}