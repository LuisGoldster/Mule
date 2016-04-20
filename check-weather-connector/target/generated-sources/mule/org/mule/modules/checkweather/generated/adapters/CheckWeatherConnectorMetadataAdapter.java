
package org.mule.modules.checkweather.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.checkweather.CheckWeatherConnector;


/**
 * A <code>CheckWeatherConnectorMetadataAdapter</code> is a wrapper around {@link CheckWeatherConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-04-17T07:57:22+07:00", comments = "Build UNNAMED.2762.e3b1307")
public class CheckWeatherConnectorMetadataAdapter
    extends CheckWeatherConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "CheckWeather";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.8.0";
    private final static String DEVKIT_BUILD = "UNNAMED.2762.e3b1307";
    private final static String MIN_MULE_VERSION = "3.7";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
