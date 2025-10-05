package com.interfaces;

public class Branch2 implements MrChai{
    @Override
    public void makeTea() {
        System.out.println("This tea is from Branch2");
    }

    @Override
    public void makeLassi() {
        System.out.println( "This Lassi is from Branch2");
    }

    @Override
    public void makeCoffe() {
        System.out.println("This coffee is from Branch2");
    }

    @Override
    public void usePrintedCups() {
        System.out.println("This cups from Branch2");
    }

    public void sandWich(){
        System.out.println("This sandwich from branch 2");
    }
}
