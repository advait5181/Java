package OOPS;

abstract class RBI {
    abstract int getRateOfInterest();
}

class CBN extends RBI{
    @Override
    int getRateOfInterest() {
        return 6;
    }
}

class KNY extends RBI{
    @Override
    int getRateOfInterest() {
        return 9;
    }
}

class TestRBI{
    public static void main(String[] args) {
        RBI b;
        b = new CBN();
        System.out.println("Rate of Interest"+b.getRateOfInterest()+"%");
        b= new KNY();
        System.out.println("Rate of Interest"+b.getRateOfInterest()+"%");
    }
}