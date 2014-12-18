package dp.lab.objectadapter;

import java.util.Vector;

/**
 * @author dpitt
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class CalculatorMemory {

	Vector mementos = new Vector();
	
	public void remember(Calculator calc) {
		
		mementos.addElement(calc.produceMemento());
	}
	
	public void recall(Calculator calc) {
		
		if (!mementos.isEmpty())
		{	
			Object o = mementos.elementAt(0);
			calc.applyMemento(o);
			mementos.removeElementAt(0);
		}
		
	}
		

}
