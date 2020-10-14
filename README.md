## 相关issues

* https://issues.redhat.com/browse/RESTEASY-2519
* [WFLY-7419 Include RESTEasy WADL module - Red Hat Issue Tracker](https://issues.redhat.com/browse/WFLY-7419)
* [RESTEasy: RESTEasy WADL Grammar Support| JBoss.org Content Archive (Read Only)](https://developer.jboss.org/en/resteasy/blog/2018/10/31/resteasy-wadl-grammar-support)


## 部署至wildfly

```bash
[standalone@localhost:9990 /] deploy resteasy-wildfly/target/resteasy-wildfly.war --force
```

## RESTEASY-2519

正常访问：

```bash
$ http "localhost:8080/resteasy-wildfly/rest/users?paging=1"
```

访问有问题的服务：

```bash
$ http "http://localhost:8080/resteasy-wildfly/rest/users?paging=0%2c-1sp137%3Cscript%3Ealert(1)%3C%2fscript%3Emzx4u"
```

