package sample;

public class EnglishTranslator implements Translator {

  public void processMessage(String message) {
    System.out.println("EnglishTranslator "+message);
  }

}
