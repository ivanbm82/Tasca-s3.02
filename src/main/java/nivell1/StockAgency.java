
package nivell1;

public class StockAgency implements Observer {
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + ", su agente de bolsa le notifica que " + message);
    }
}