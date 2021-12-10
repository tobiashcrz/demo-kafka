package br.com.tobiashcrz.demokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class DemoKafkaApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoKafkaApplication.class, args);
    }

}
