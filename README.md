# quarkus-kube

(simple) Quarkus and Kubernetes (docker-desktop) project

Prerequisites:
* Java 21
* Maven 3.9.x
* Quarkus CLI
* Docker Desktop with Kubernetes enabled
* Kubectl

Install Ingress Controller:

```shell
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.6.4/deploy/static/provider/cloud/deploy.yaml
```

Add the following entry to your /etc/hosts file:

```markdown
127.0.0.1 server.quarkus-kube.internal client.quarkus-kube.internal
```

Build and deploy the quarkus application:
```shell
quarkus build --native --no-tests && quarkus deploy kubernetes --namespace default --offline
```

Access the client that fetches content from the server (@RestClient):

```http request
http://client.quarkus-kube.internal/hello

Server: Hello from RESTEasy Reactive
```


https://federico.is/posts/2020/08/01/setup-crc-with-internal-image-registry/#instruct-crc-to-accept-an-insecure-registry

@ToDo: PullSecret hinzufügen