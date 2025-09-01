package com.dio.design;

import com.dio.design.singleton.Settings;
import com.dio.design.factory.DocumentFactory;
import com.dio.design.factory.Printable;
import com.dio.design.abstractfactory.GUIFactory;
import com.dio.design.abstractfactory.MacFactory;
import com.dio.design.builder.Person;
import com.dio.design.strategy.PaymentContext;
import com.dio.design.strategy.CreditCardPayment;
import com.dio.design.observer.NewsPublisher;
import com.dio.design.observer.Subscriber;
import com.dio.design.decorator.BasicCoffee;
import com.dio.design.decorator.MilkDecorator;
import com.dio.design.adapter.AudioPlayer;
import com.dio.design.command.RemoteControl;
import com.dio.design.command.Light;
import com.dio.design.template.CSVDataProcessor;
import com.dio.design.state.TrafficLight;
import com.dio.design.proxy.ExpensiveService;
import com.dio.design.proxy.ServiceProxy;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Singleton ---");
        Settings s1 = Settings.getInstance();
        Settings s2 = Settings.getInstance();
        s1.set("theme","dark");
        System.out.println("same instance? " + (s1==s2) + ", theme=" + s2.get("theme"));

        System.out.println("\n--- Factory Method ---");
        Printable doc = DocumentFactory.create("pdf");
        doc.print();

        System.out.println("\n--- Abstract Factory ---");
        GUIFactory factory = new MacFactory();
        factory.createButton().paint();
        factory.createWindow().paint();

        System.out.println("\n--- Builder ---");
        Person p = new Person.Builder("Danillo").age(28).city("João Pessoa").build();
        System.out.println(p);

        System.out.println("\n--- Strategy ---");
        PaymentContext pc = new PaymentContext(new CreditCardPayment("1234-5678-9012"));
        pc.pay(100.0);

        System.out.println("\n--- Observer ---");
        NewsPublisher publisher = new NewsPublisher();
        Subscriber sub = new Subscriber("Joao");
        publisher.register(sub);
        publisher.postNews("Novo curso DIO publicado!");

        System.out.println("\n--- Decorator ---");
        BasicCoffee coffee = new BasicCoffee();
        System.out.println(new MilkDecorator(coffee).getDescription() + " => " + new MilkDecorator(coffee).cost());

        System.out.println("\n--- Adapter ---");
        AudioPlayer player = new AudioPlayer();
        player.play("mp3","song.mp3");
        player.play("mp4","video.mp4");

        System.out.println("\n--- Command ---");
        Light light = new Light();
        RemoteControl rc = new RemoteControl();
        rc.setCommand(() -> light.toggle());
        rc.press();

        System.out.println("\n--- Template Method ---");
        CSVDataProcessor proc = new CSVDataProcessor();
        proc.process("id,name\n1,Danillo");

        System.out.println("\n--- State ---");
        TrafficLight tl = new TrafficLight();
        tl.next(); tl.next(); tl.next();

        System.out.println("\n--- Proxy ---");
        ExpensiveService real = new ExpensiveService();
        ServiceProxy proxy = new ServiceProxy(real);
        System.out.println(proxy.fetch()); // first loads
        System.out.println(proxy.fetch()); // cached
    }
}
