module ServiceProvider {
  exports myservice;
  exports myservice.spi;
  provides myservice.spi.ServiceAPI with utils.ServiceImpl;
  opens myservice to Client, NonExistent; // available for runtime reflection
}