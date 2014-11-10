
package planet.simulate;

import planet.commonapi.exception.InitializationException;


public interface ISimulator {
	
	public void run(int steps) throws InitializationException;
	public void stop();
	

}
