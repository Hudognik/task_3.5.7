public class NewTest {
    public static void main(String[] args) {
        TextAnalyzer[] analyzers = {new SpamAnalyzer(new String[]{"1канал", "похудеть без диеты", "ставки на спорт"}), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(20)};
        String text = " gf 323 fsf f sdvk :";
        System.out.println(new NewTest().checkLabels(analyzers, text));
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer a : analyzers) {
            if (!a.processText(text).equals(Label.OK)) {
                return a.processText(text);
            }
        }//Твой код здесь
        return Label.OK;
    }
}
