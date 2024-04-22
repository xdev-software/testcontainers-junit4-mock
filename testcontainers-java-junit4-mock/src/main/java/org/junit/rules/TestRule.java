package org.junit.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;


@Deprecated
@SuppressWarnings("all")
public interface TestRule
{
	Statement apply(Statement base, Description description);
}
