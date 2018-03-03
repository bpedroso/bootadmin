/*
* Copyright 2018 Platform Builders
*************************************************************
*Nome     : BootAdminApplication.java
*Autor    : brunopedroso
*Data     : 03/03/2018
*Empresa  : Platform Builders
*************************************************************
*/
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
