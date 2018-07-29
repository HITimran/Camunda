package my.camunda.org.exploration;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.Execution;

public class CheckWeather implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Random rand=new Random();
		
		execution.setVariable("name", "Imran");
		execution.setVariable("weatherOk", rand.nextBoolean());

	}

}
