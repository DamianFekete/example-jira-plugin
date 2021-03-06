package it.com.zuhlke.training.jira;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner;
import com.zuhlke.training.jira.api.MyPluginComponent;
import com.atlassian.sal.api.ApplicationProperties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(AtlassianPluginsTestRunner.class)
public class MyComponentWiredTest
{
    private final ApplicationProperties applicationProperties;
    private final MyPluginComponent myPluginComponent;

    public MyComponentWiredTest(ApplicationProperties applicationProperties, MyPluginComponent myPluginComponent)
    {
        this.applicationProperties = applicationProperties;
        this.myPluginComponent = myPluginComponent;
    }

    @Test
    public void testMyName()
    {
        assertEquals("names do not match!", "myComponent:" + applicationProperties.getDisplayName(),myPluginComponent.getName());
        assertTrue("applicationProperties should be instance of ApplicationProperties", applicationProperties instanceof ApplicationProperties);
        assertTrue("myPluginComponent should be instance of MyPluginComponent", myPluginComponent instanceof MyPluginComponent);
    }
}