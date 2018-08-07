INSERT INTO PROPERTIES (application, profile, label, key, value) VALUES('service-client', 'production', 'latest', 'server.port', '80');
INSERT INTO PROPERTIES (application, profile, label, key, value) VALUES('service-client', 'production', 'latest', 'spring.datasource.url', 'jdbc:mysql://localhost:3306/production?useUnicode=true&characterEncoding=utf8');
INSERT INTO PROPERTIES (application, profile, label, key, value) VALUES('service-client', 'production', 'latest', 'spring.datasource.driverClass', 'com.mysql.jdbc.Driver');
INSERT INTO PROPERTIES (application, profile, label, key, value) VALUES('service-client', 'production', 'latest', 'spring.datasource.username', 'production');
INSERT INTO PROPERTIES (application, profile, label, key, value) VALUES('service-client', 'production', 'latest', 'spring.datasource.password', '{cipher}4560f389df088579e8ed952174d88a77bf0729fbbae118e16c784ac1bc2bb4f0');
INSERT INTO PROPERTIES (application, profile, label, key, value) VALUES('service-client', 'production', 'latest', 'spring.application.name', 'service-client');
INSERT INTO PROPERTIES (application, profile, label, key, value) VALUES('service-client', 'production', 'latest', 'eureka.client.service-url.defaultZone', 'http://localhost:8888/eureka');