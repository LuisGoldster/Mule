
package org.mule.modules.checkweather.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.common.MuleVersion;
import org.mule.config.MuleManifest;
import org.mule.config.i18n.CoreMessages;
import org.mule.modules.checkweather.CheckWeatherConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A <code>CheckWeatherConnectorLifecycleInjectionAdapter</code> is a wrapper around {@link CheckWeatherConnector } that adds lifecycle methods to the pojo. This adapter also allows the injection of several Mule facilities when a MuleContext is set.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-04-17T07:57:22+07:00", comments = "Build UNNAMED.2762.e3b1307")
public class CheckWeatherConnectorLifecycleInjectionAdapter
    extends CheckWeatherConnectorMetadataAdapter
    implements MuleContextAware, Disposable, Initialisable, Startable, Stoppable
{


    @Override
    public void start()
        throws MuleException
    {
    }

    @Override
    public void stop()
        throws MuleException
    {
    }

    @Override
    public void initialise()
        throws InitialisationException
    {
        Logger log = LoggerFactory.getLogger(CheckWeatherConnectorLifecycleInjectionAdapter.class);
        MuleVersion connectorVersion = new MuleVersion("3.7");
        MuleVersion muleVersion = new MuleVersion(MuleManifest.getProductVersion());
        if (!muleVersion.atLeastBase(connectorVersion)) {
            throw new InitialisationException(CoreMessages.minMuleVersionNotMet(this.getMinMuleVersion()), this);
        }
    }

    @Override
    public void dispose() {
    }

    @Override
    public void setMuleContext(MuleContext context) {
    }

}
