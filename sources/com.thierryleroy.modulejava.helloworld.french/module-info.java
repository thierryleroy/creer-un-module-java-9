import com.thierryleroy.modulejava.helloworld.french.priv.SayHelloFrench;
import com.thierryleroy.modulejava.helloworld.ISayHello;
module com.thierryleroy.modulejava.helloworld.french {

    requires com.thierryleroy.modulejava.helloworld;
    provides ISayHello with SayHelloFrench;
}
