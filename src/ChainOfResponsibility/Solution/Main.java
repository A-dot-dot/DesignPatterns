package ChainOfResponsibility.Solution;


public class Main {
    // Issue : This code voilates Open Closed Principal.
    // This client code is too tightly coupled with the actual implementations
    // of validator, logger, encryptor;
    // If we want to add/remove a new responsibility tomorrow we would have to come here
    // and add that.
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest();

        // validators
        Handler encryptor = new HttpEncryptor(null);
        Handler logger = new HttpLogger(encryptor);
        Handler validator = new HttpValidator(logger);

        validator.handle();
    }
}

