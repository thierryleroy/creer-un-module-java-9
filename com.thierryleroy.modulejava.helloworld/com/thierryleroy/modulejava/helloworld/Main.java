package com.thierryleroy.modulejava.helloworld;
import java.util.ServiceLoader;
public class Main {

    public static void main(String[] args) {
	final ServiceLoader<ISayHello> serviceLoader = ServiceLoader.load(ISayHello.class);
	for (final ISayHello sayHello : serviceLoader) {
	    sayHello.sayHello();
	}
    }
}