import java.util.Properties
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object KafkaScalaProducer {
  def main(args: Array[String]): Unit = {
    // Kafka broker address
    val brokers = "localhost:9092"
    // Kafka topic to send data to
    val topic = "my-topic"

    // Kafka producer properties
    val props = new Properties()
    props.put("bootstrap.servers", brokers)
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

    // Create Kafka producer
    val producer = new KafkaProducer[String, String](props)

    try {
      // Produce data
      val data1 = new ProducerRecord[String,String,String,integer,integer,String,](topic, "Negrah", "S","23/03/2003",19,201310,"UP")
      val data2 = new ProducerRecord[String,String,String,integer,integer,String,](topic, "Janvi", "Singh","20/11/2001",21,110032,"Delhi")
      // Send data to the Kafka topic
      producer.send(data1)
      producer.send(data2)

    } catch {
      case ex: Exception =>
        ex.printStackTrace()
    } finally {
      // Close the producer
      producer.close()
    }
  }
}

