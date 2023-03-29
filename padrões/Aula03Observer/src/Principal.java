import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

public class Principal {


	public static void main(String[] args) {

		EmailTopic topic = new EmailTopic();

		Observer firstObserver = new EmailTopicSubscriber("PrimeiroObserver");

		Observer secondObserver = new EmailTopicSubscriber("SegundoObserver");

		Observer thirdObserver = new EmailTopicSubscriber("TerceiroObserver");

		//Registra 
		topic.register(firstObserver);
		topic.register(secondObserver);
		topic.register(thirdObserver);

		// Atribui observer ao assunto
		firstObserver.setSubject(topic);
		secondObserver.setSubject(topic);
		thirdObserver.setSubject(topic);


		// Verifica por atualizações
		firstObserver.update();
		thirdObserver.update();


		//Provider / Subject (broadcaster)
		topic.postMessage("Olá Assinantes!");

		topic.unregister(firstObserver);

		topic.postMessage("Olá Assinantes!");



	}

}

