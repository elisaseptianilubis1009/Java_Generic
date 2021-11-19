
package java_generic;


public class MyData <T>{
    
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    MyData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    
}
