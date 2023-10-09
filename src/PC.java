public class PC extends Computer { // первый саб класс
    private String ram;
    private String hdd;
    private String cpu; // наши вариаблс

    public PC(String ram, String hdd, String cpu){ // инициализация наших переменных
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
    @Override
    public String getHDD() {
        return this.hdd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
}