package com.interfaces;

public class Branch1 implements MrChai{

    @Override
    public void makeTea() {
        System.out.println("This tea is from Branch 1");
    }

    @Override
    public void makeLassi() {
        System.out.println("This lassi is from Branch 1");
    }

    @Override
    public void makeCoffe() {
        System.out.println("This coffee is from branch1");
    }

    @Override
    public void usePrintedCups() {
        System.out.println("This cups are from branch1");
    }

    public void makeSamosa(){
        System.out.println("This Samosa from Branch 1");
    }

}
