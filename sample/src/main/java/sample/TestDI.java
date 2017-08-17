package sample;

public class TestDI {

  public static void main(String[] args) {
    TranslateMessage.translateMessage(new FrenchTranslator(), " French msg");

    TranslateMessage.translateMessage(new EnglishTranslator(), " English msg");
  }
}
