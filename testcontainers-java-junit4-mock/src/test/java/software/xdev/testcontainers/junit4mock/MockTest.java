package software.xdev.testcontainers.junit4mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;


class MockTest
{
	@Test
	@SuppressWarnings({"rawtypes", "resouce"})
	void canInstantiateContainer()
	{
		Assertions.assertDoesNotThrow(() -> new GenericContainer("alpine:3"));
	}
	
	@Test
	void junitNotPresent()
	{
		Assertions.assertThrows(ClassNotFoundException.class, () -> Class.forName("org.junit.Assert"));
	}
}
