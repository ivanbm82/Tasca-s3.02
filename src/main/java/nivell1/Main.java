package nivell1;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Crear el Stock Broker
		StockBroker broker = new StockBroker();

		// Crear las agencias de bolsa
		StockAgency agency1 = new StockAgency("Agencia 1");
		StockAgency agency2 = new StockAgency("Agencia 2");
		StockAgency agency3 = new StockAgency("Agencia 3");

		// Registrar las agencias de bolsa como Observers del Stock Broker
		broker.attachAll(Arrays.asList(agency1, agency2, agency3));

		// Actualizar el estado del mercado y notificar a las agencias de bolsa
		broker.updateMarketState(true);

		// Esperado: Las agencias 1, 2 y 3 recibirán la notificación de que la bolsa está subiendo
		broker.detach(agency2);

		// Actualizar el estado del mercado y notificar a las agencias de bolsa
		broker.updateMarketState(false);

		// Esperado: Las agencias 1 y 3 recibirán la notificación de que la bolsa está bajando
	}
}