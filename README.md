## 相关issues


## 部署至wildfly

```bash
[standalone@localhost:9990 /] deploy resteasy-wildfly/target/resteasy-wildfly.war --force
```

## RESTEASY-2519

正常访问：

```bash
$ curl "localhost:8080/resteasy-wildfly/ok"
```

访问有问题的服务：

```bash
$ http "http://localhost:8080/resteasy-wildfly/ok"
```

