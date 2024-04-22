package software.xdev;

import org.slf4j.LoggerFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.output.Slf4jLogConsumer;


public final class Application
{
	@SuppressWarnings({"rawtypes", "resouce"})
	public static void main(final String[] args)
	{
		try(final GenericContainer container = new GenericContainer("alpine:3")
			.withCommand("/bin/sh", "-c", "echo \"I don't need JUnit 4 to run\"")
			.withLogConsumer(new Slf4jLogConsumer(LoggerFactory.getLogger("container.demo"))))
		{
			container.start();
		}
	}
	
	private Application()
	{
	}
}
