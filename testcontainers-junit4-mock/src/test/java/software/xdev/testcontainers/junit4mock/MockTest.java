/*
 * Copyright © 2024 XDEV Software (https://xdev.software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
