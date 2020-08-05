package myclient;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import myservice.Useful;
import myservice.spi.ServiceAPI;

// Build client, option one:
// javac -d modules --module-path modules --module-source-path "./*/src" --module Client
// javac -d modules -p modules --module-source-path "./*/src" -m Client

// Running as "all modular"
// java -p modules -m Client/myclient.Client
// -p ==> --module-path
// -m ==> --module

// When client is non-modular, must add (at least the first) dependency module
// manually to the graph:
// java -cp classpath/ -p modules --add-modules ServiceProvider myclient.Client
// Code on classpath is in "unnamed" module...
// plain jar (no module-info.class) on MODULE-PATH, becomes "automatic module"
// module's name is taken from jar name
// ZERO requires .... must add them manually (--add-modules)
// MUST be a jar (not directory structure)

public class Client {
  public static void main(String[] args) throws Throwable {
    String message =  Useful.message;
    System.out.println(message);
    Useful.showSecret();
    Class<?> cl = myservice.Useful.class;
    Field f = cl.getDeclaredField("secretMessage");
    f.setAccessible(true);
    String secret = (String)(f.get(null));
    System.out.println("Secret Message is " + secret);

    f.set(null, "Bwahahahahaha! You have been owned!");
    Useful.showSecret();

    // non-exported packages are effectively invisible and actually inaccessible to us.
//    utils.MyStuff.showInternals();

    ServiceLoader<ServiceAPI> loader = ServiceLoader.load(ServiceAPI.class);
    for (ServiceAPI sapi : loader) {
      System.out.println("Found an implementation, class is "
          + sapi.getClass().getName());
      System.out.println("Message is " + sapi.getMessage());
    }
  }
}
