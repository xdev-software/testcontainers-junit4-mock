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
