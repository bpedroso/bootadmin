package io.platformbuilders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class BootAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootAdminApplication.class, args);
  }

}
