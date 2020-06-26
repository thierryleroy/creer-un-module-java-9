package com.thierryleroy.modulejava.french.priv;
import com.thierryleroy.modulejava.helloworld.ISayHello;
public class SayHelloFrench implements ISayHello {

    @Override
    public void sayHello() {
	System.out.println("Bonjour !");
    }
}