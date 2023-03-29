package model;

import interfaces.Observer;
import interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;

    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
        if (msg == null)
            System.out.println(name + " Não existem mensagens novas neste tópico!");
        else
            System.out.println(name + " Obtendo mensagem: " + msg);

    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;

    }
}

