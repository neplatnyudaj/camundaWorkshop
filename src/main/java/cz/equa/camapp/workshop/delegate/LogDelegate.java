package cz.equa.camapp.workshop.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class LogDelegate implements JavaDelegate {
	Logger LOG = LoggerFactory.getLogger(LogDelegate.class);

	private Expression message;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOG.info("LOG: {}", message.getValue(execution));
	}
}
