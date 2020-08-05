package myclient;

import java.lang.reflect.Field;
import myservice.Useful;

// Build client, option one:
// javac -d modules --module-path modules --module-source-path "./*/src" --module Client
// javac -d modules -p modules --module-source-path "./*/src" -m Client

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

  }
}
