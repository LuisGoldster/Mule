
package org.mule.modules.checkweather.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.checkweather.CheckWeatherConnector;


/**
 * A <code>CheckWeatherConnectorCapabilitiesAdapter</code> is a wrapper around {@link CheckWeatherConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-04-17T07:57:22+07:00", comments = "Build UNNAMED.2762.e3b1307")
public class CheckWeatherConnectorCapabilitiesAdapter
    extends CheckWeatherConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
