module ServiceProvider {
  exports myservice;
  opens myservice to Client, NonExistent; // available for runtime reflection
}