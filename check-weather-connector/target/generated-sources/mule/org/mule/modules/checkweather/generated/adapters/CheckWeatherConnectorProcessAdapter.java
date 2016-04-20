
package org.mule.modules.checkweather.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.checkweather.CheckWeatherConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>CheckWeatherConnectorProcessAdapter</code> is a wrapper around {@link CheckWeatherConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-04-17T07:57:22+07:00", comments = "Build UNNAMED.2762.e3b1307")
public class CheckWeatherConnectorProcessAdapter
    extends CheckWeatherConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<CheckWeatherConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, CheckWeatherConnectorCapabilitiesAdapter> getProcessTemplate() {
        final CheckWeatherConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,CheckWeatherConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, CheckWeatherConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, CheckWeatherConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
