import com.thierryleroy.modulejava.helloworld.ISayHello;
import com.thierryleroy.modulejava.helloworld.priv.SayHelloEnglish;
module com.thierryleroy.modulejava.helloworld {

    exports com.thierryleroy.modulejava.helloworld;
    uses ISayHello;
    provides ISayHello with SayHelloEnglish;
}
