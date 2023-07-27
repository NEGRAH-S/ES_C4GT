from kafka import KafkaProducer
import json

# Kafka broker address
bootstrap_servers = 'localhost:9092'
# Kafka topic to send data to
topic = 'my-topic'

# Create Kafka producer
producer = KafkaProducer(bootstrap_servers=bootstrap_servers,
                         value_serializer=lambda v: json.dumps(v).encode('utf-8'))

# Produce data
data1 = {'firstname': 'Negrah', 'lastname': 's','DOB':'23/03/2003','age': 19, 'adress' 'pincode': 201310, 'state': 'UP'}
data2 = {'firstname': 'Janvi', 'lastname': 'Singh','DOB':'20/11/2001','age': 21, 'adress' 'pincode': 110032, 'state': 'Delhi'}

# Send data to the Kafka topic
producer.send(topic, value=data1)
producer.send(topic, value=data2)

# Close the producer
producer.close()
