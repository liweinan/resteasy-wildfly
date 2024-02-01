To see how the project works, run the following command:

```bash
$ mvn verify
```

The above command will execute the following steps:

- Build the project.
- Generate a provisioned WildFly server and start the server.
- Deploy the project to the server.
- Run the integration tests.
- After the tests are finished, stop the server.

If you want to run the project manually, you can run with the following command:

```bash
$ mvn wildfly:run
```

The above command will provision and start the WildFly server, and it will deploy the project to the server. To access the service provided by the project, run the following command:

```bash
➤ curl localhost:8080/resteasy-wildfly/ok
OK⏎  
```

If everything goes fine, the service will return `OK` as shown above.


