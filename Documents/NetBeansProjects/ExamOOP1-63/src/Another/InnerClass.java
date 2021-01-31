package Another;
public class InnerClass {
    public void cal1(){
        System.out.println("cal 1");
    }
    public void cal2(){
        System.out.println("Cal 2");
    }

    
    static class Inner1{
        public void cal1(){
            System.out.println("Inner1 cal1");
        }
        static class Inner1_1{
            public void cal1_1(){
                System.out.println("Inner 1_1 cal1_1");
            }
        }
    }
    
    static class Inner2{
        public void cal2(){
            System.out.println("Inner2 cal2");
        }
    }
}

class Runclass{
    public static void main(String[] args) {
        InnerClass i1 = new InnerClass();
        i1.cal1();
        InnerClass obj = new InnerClass();
        obj.cal2();
        InnerClass.Inner1 obj1 = new InnerClass.Inner1();
        InnerClass.Inner2 obj2 = new InnerClass.Inner2();
        InnerClass.Inner1.Inner1_1 obj3 = new InnerClass.Inner1.Inner1_1();
        std621320104.Calculate obj4 = new std621320104.Calculate();
    }
}
