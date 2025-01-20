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
package org.junit.rules;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;


@Deprecated
@SuppressWarnings("all")
public abstract class ExternalResource implements TestRule
{
	@Override
	public Statement apply(final Statement base, final Description description)
	{
		return this.statement(base);
	}
	
	private Statement statement(final Statement base)
	{
		return new Statement()
		{
			@Override
			public void evaluate() throws Throwable
			{
				ExternalResource.this.before();
				
				final List<Throwable> errors = new ArrayList<>();
				try
				{
					base.evaluate();
				}
				catch(final Throwable t)
				{
					errors.add(t);
				}
				finally
				{
					try
					{
						ExternalResource.this.after();
					}
					catch(final Throwable t)
					{
						errors.add(t);
					}
				}
			}
		};
	}
	
	protected void before() throws Throwable
	{
		// do nothing
	}
	
	protected void after()
	{
		// do nothing
	}
}
