package org.mule.modules.checkweather;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.checkweather.config.ConnectorConfig;

@Connector(name="check-weather", friendlyName="CheckWeather", minMuleVersion = "3.7")
public class CheckWeatherConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}