package io.polarian.config.client

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TestConfiguration {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    fun getDataSourceProperties():DataSourceProperties {
        return DataSourceProperties()
    }
}

class DataSourceProperties {
    lateinit var url: String
    lateinit var driverClass: String
    lateinit var username: String
    lateinit var password: String
}