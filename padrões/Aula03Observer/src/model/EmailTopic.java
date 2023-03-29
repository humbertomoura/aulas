package model;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic  implements Subject {

    private List<Observer> observers;
    private String mensagem;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Objeto Observer Nulo");

        if (!observers.contains(observer))
            observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
             observer.update();
        }

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.mensagem;
    }

    public void postMessage(String msg) {
        System.out.println("Menssagem postada para meu tópico : " + msg);
        this.mensagem = msg;
        notifyObservers();
    }
}
