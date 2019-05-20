package cz.equa.camapp.workshop.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class MyDelegate implements JavaDelegate {

	volatile boolean result;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("result", result = !result);
	}
}
