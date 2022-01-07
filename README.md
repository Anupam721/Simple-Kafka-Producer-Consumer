Steps for setup:
1. Download kafka from kafka website.
2. Unzip folder :
      tar -xzf kafka_2.13-3.0.0.tgz
      cd kafka_2.13-3.0.0
      
 #Start zookeeper service
3. bin/zookeeper-server-start.sh config/zookeeper.properties

# Start the Kafka broker service
4. bin/kafka-server-start.sh config/server.properties

#create a new Topic: I'm creating : "NewTopic"
5. bin/kafka-topics.sh --create --partitions 1 --replication-factor 1 --topic NewTopic --bootstrap-server localhost:9092

6. To write events via Kafka Command Line, 
bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
