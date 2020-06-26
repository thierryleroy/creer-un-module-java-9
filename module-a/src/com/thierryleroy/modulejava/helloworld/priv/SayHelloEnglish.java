package com.thierryleroy.modulejava.helloworld.priv;
import com.thierryleroy.modulejava.helloworld.ISayHello;
public class SayHelloEnglish implements ISayHello {

    @Override
    public void sayHello() {
	System.out.println("Hello!");
    }
}