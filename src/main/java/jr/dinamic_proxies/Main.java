package jr.dinamic_proxies;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // create an original object
        Man man = new Man("Greg", 33, "St.Petersburg", "Russia");

        // retrieve classloader from the original object
        ClassLoader cl = man.getClass().getClassLoader();

        // get all interfaces that the object implements
        Class[] interfaces = man.getClass().getInterfaces();

        // create a proxy for our object man
        Person proxyMan = (Person) Proxy.newProxyInstance(cl, interfaces, new PersonInvocationHandler(man));

        // call one of the original object's methods
        proxyMan.introduce(man.getName());

    }
}
