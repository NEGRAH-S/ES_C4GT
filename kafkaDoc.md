<h1 align="center"> Apache Kafka working </h1>

<h2 align="left"> Dependencies required </h2>

[x] Confluent kafka 
[x] Setup it including seting up of global varianble and path 

<h3 align="left"> Steps to work </h3>

- To start kafka and other required dependencies 
+
[source,bash]
----
➜ confluent local services start

- Kafka Producer code (In below exam "test-topic" is created kafka topic)
+
[source,bash]
----
➜ kafka-console-producer --topic test-topic --broker-list localhost:9092

- Kafka Consumer code (In below exam "test-topic" is created kafka topic)
+
[source,bash]
----
➜ kafka-console-consumer --topic test-topic --bootstrap-server localhost:9092 --from-beginning

- To close the console 
+
[source,bash]
----
➜ confluent local services stop

- In case we want to reset all the topics created
+
[source,bash]
----
➜ confluent local destroy

