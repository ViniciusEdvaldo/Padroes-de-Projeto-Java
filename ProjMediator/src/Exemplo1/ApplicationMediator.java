package Exemplo1;
import java.util.ArrayList;
public class ApplicationMediator implements Mediator {

	private ArrayList<Colleague> colleagues;
	
    public ApplicationMediator() {
    	colleagues = new ArrayList<Colleague>();
    }
    
    public void addColleague(Colleague c) {
    	this.colleagues.add(c);
    }
    public void send(String message, Colleague originator) {
    	
    	for(Colleague colleague: colleagues) {
    		if(colleague != originator) {
    			colleague.receiver(message);
    		}
    	}
    }
}
