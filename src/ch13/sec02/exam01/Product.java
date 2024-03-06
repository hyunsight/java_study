package ch13.sec02.exam01;

//< > 내 타입 여러개 지정할 수 있음
public class Product<K, M> {
    private K kind; //Tv 타입
    private M model; //String 타입

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}

