package planet.commonapi.behaviours;

import java.util.*;

public interface BehavioursRoleSelector extends java.io.Serializable {
	/**
	 * This methods selects malicious nodes from the overlay according to a percentage and
	 * distribution of them along the network.
	 * @param network Iterator of all ids. 
	 * @param percentage Percentage of faulty nodes.
	 * @param distribution Distribution's type of faulty nodes: chain or uniform.
	 * @throws ClassCastException if <b>network</b> is not a collection of id's objects. 
	 * @return Returns a set with Ids of malicious nodes.
	 */
	public Set select(Iterator network, double percentage, int distribution);
}
