package _0503_.basic;

public class HybridCar implements ElectronicCar, FuelCar{

    @Override
    public void charge() {
        System.out.println("충전합니다.");
    }

    @Override
    public void speedUp() {
    System.out.println("속도를 높입니다.");
    }

    @Override
    public void speedDown() {
    System.out.println("속도를 낮춥니다.");
    }

    @Override
    public void addFuel() {
    System.out.println("기름을 넣습니다.");
    }
}
