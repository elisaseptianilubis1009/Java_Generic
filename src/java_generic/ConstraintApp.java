package java_generic;

public class ConstraintApp {

    public static void main(String[] args) {
        
        BoundedType<Integer> integerBound= new BoundedType<>(1);
        BoundedType<Long> longBound= new BoundedType<>(1L);
        BoundedType<Float> floatBound= new BoundedType<Float>(12.6f);
        BoundedType<Double> doubleBound= new BoundedType<Double>(12.3);
        
//        BoundedType<String> doubleBound= new BoundedType<String>("Elisa");// Error
        
        System.out.println("Float Angka :"+floatBound.getData());
        System.out.println("Double angka :"+doubleBound.getData());

    }

}

class BoundedType<T extends Number> {
    
    private T data;

    public BoundedType(T data) {
        this.data = data;
    }
    

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    

}
