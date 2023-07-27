package br.design.pattern;

import br.design.pattern.facade.Facade;
import br.design.pattern.singleton.SingletonEager;
import br.design.pattern.singleton.SingletonLazy;
import br.design.pattern.singleton.SingletonLazyHolder;
import br.design.pattern.strategy.*;

public class PatternApplication {

    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agresssivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(agresssivo);

        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "10226684");

    }
}
