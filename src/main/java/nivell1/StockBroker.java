package nivell1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StockBroker implements Subject {
	private final Set<Observer> agencies = new HashSet<>();
	private boolean marketGoingUp; // Estado del mercado

	// Método para registrar Observers
	public void attach(Observer observer) {
		agencies.add(observer);
	}

	// Método para eliminar Observers
	public void detach(Observer observer) {
		if (agencies.contains(observer)) {
			agencies.remove(observer);
		} else {
			System.err.println("Error: el observador no está registrado");
		}
	}

	// Método para notificar a los Observers
	public void notifyObservers() {
		String message = marketGoingUp ? "la bolsa está subiendo" : "la bolsa está bajando";
		for (Observer observer : agencies) {
			observer.update(message);
		}
	}

	// Método para actualizar el estado del mercado
	public void updateMarketState(boolean marketGoingUp) {
		this.marketGoingUp = marketGoingUp;
		notifyObservers();
	}

	// Método para registrar múltiples Observers
	public void attachAll(List<? extends Observer> observers) {
		agencies.addAll(observers);
	}

	// Método para eliminar múltiples Observers
	public void detachAll(List<? extends Observer> observers) {
		agencies.removeAll(observers);
	}

	// Método getter para el campo marketGoingUp
	public boolean isMarketGoingUp() {
		return marketGoingUp;
	}
}