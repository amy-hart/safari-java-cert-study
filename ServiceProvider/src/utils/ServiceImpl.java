package utils;

import myservice.spi.ServiceAPI;

public class ServiceImpl implements ServiceAPI {
  @Override
  public String getMessage() {
    return "Message from my amazing service";
  }
}
