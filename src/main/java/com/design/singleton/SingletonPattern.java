package com.design.singleton;

public class SingletonPattern {

    private SingletonPattern(){
        System.out.println("super.method theouter");
    }

    private static class SingleTonPatternholder{

        private static final SingletonPattern singletonPattern = new SingletonPattern();
    }

    public static SingletonPattern getInstancee(){
        System.out.println("getInstance");
        return SingleTonPatternholder.singletonPattern;
    }

    public static void main(String[] args) {
        System.out.println("start test syschnorice");
        SingletonPattern sp = SingletonPattern.getInstancee();

        System.out.println("end  syschmore");

    }
}
