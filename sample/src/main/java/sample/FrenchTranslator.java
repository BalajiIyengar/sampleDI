package sample;

public class FrenchTranslator implements Translator {

  public void processMessage(String message) {
    System.out.println("FrenchTranslator "+message);
  }

}
