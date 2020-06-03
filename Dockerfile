FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package -Dmaven.test.skip=true

FROM jboss/wildfly

COPY --from=MAVEN_TOOL /tmp/target/interop-server-1.0.war /opt/jboss/wildfly/standalone/deployments/

RUN /opt/jboss/wildfly/bin/add-user.sh admin Admin#70365 --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]