package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        //<K, M>으로 K: Tv 타입, M: String 타입으로 지정
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv()); //Kind는 Tv타입으로 지정했기 때문에 Tv 객체 set (Tv 객체만 줄 수 있음)
        product1.setModel("스마트 Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
