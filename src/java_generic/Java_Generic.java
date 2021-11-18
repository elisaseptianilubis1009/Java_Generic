
package java_generic;


public class Java_Generic {

    public static void main(String[] args) {
//============================ Generic Class================================
//        Generic<String, Integer> stringGeneric= new Generic<String, Integer>("Julia", 21);
//        
//        System.out.println("Nama :"+stringGeneric.getName());
//        System.out.println("Umur :"+stringGeneric.getName());
//        
//        stringGeneric.setName("Elisa Septiani Lubis");
//        stringGeneric.setUmur(22);
//        
//        System.out.println("Nama :"+stringGeneric.getName());
//        System.out.println("Umur :"+ stringGeneric.getUmur());

//========================= Generic Method =================================
    String [] stringArray={"Elisa","Septiani","Lubis"};
    Integer[] integerArray={3,4,5,7};
    
        System.out.println(ArrayHelper.<String>count(stringArray));
        System.out.println(ArrayHelper.count(integerArray));
    }
    
}
