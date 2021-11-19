package java_generic;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.StringDatatypeValidator;

public class MyDataApp {

    public static void main(String[] args) {
        //=============================INVARIANT============================================
        //        MyData<String> stringData = new MyData<>("Elisa");//Operator Diamond
        ////        MyData<Object> objectData=stringData;//Error, karena default Generic yaitu invariant jadi <String> tidak dapat diturunkn ke Object, walaupun String merupakan turunan dari Object
        //
        //        System.out.println("Nama :" + stringData.getData());
        //
        //        MyData<Object> objectData = new MyData<>(100);//Operator Diamond
        ////        MyData<Integer> integerObject= objectData;//Error, karena invariant, walaupun Integer merupakan
        ////        doit(objectData);Error jufa
        //        System.out.println("Umur :" + objectData.getData());

        //    public static void doit(MyData<String> stringMyData) {
        //    }
        //============================COVARIANT============================================
        //Kebalikan dari Contravariant
        //Aman kalo get Data, tapi kalo set data belum tentu aman
        //        MyData<String> stringdata = new MyData<String>("Septiani");
        //        MyData<? extends Object> objectData = stringdata;
        //        MyData<Integer> integerData = new MyData<Integer>(21);
        //
        //        Generic<String, Integer> genericData = new Generic<>("Elisa Septiani Lubis", 22);
        //
        //        System.out.println(
        //                "Nama :" + objectData.getData());
        //        doitCovariant(integerData);
        //
        //        doitCovariant2(genericData);

        //    public static void doitCovariant(MyData<? extends Object> objectMyData) {
        //        System.out.println("Umur :" + objectMyData.getData());
        //    }
        //
        //    public static void doitCovariant2(Generic<? extends Object, ? extends Object> objectGeneric) {
        //        System.out.println("NAMA LENGKAP :" + objectGeneric.getName());
        //        System.out.println("UMUR SEKARANG :" + objectGeneric.getUmur());
        //    }

        //===========================CONTRAVARIANT=======================================
        //Kebalikan dari COVARIANT
        //Aman nge set data tapi kalo belum tentu aman, bisa juga error kalo get data

        MyData<Object> objectData = new MyData<>("Elisa");
        MyData<Object> objectDataInt = new MyData<>(23);
        MyData<? super String> stringData= objectData;
     
        
        System.out.println("Nama :"+stringData.getData());
        doitContravarian(objectDataInt);
    }
    
    public static void doitContravarian(MyData<? super Integer> integerMydata){
        
        Integer integerOurData= (Integer) integerMydata.getData();
        System.out.println("Umur :"+integerMydata.getData());
        System.out.println("Umurku :"+integerOurData);
    
    }
}
