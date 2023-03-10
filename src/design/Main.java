package design;

import design.singleton.Aclazz;
import design.singleton.Bclazz;
import design.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {

        Aclazz aclazz = new Aclazz();
        Bclazz bclazz = new Bclazz();

        SocketClient aClient = aclazz.getSocketClient();
        SocketClient bClient = bclazz.getSocketClient();

        System.out.println("두 객체가 동일한가");
        System.out.println(aClient.equals(bClient));
    }
}
