public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords = {":(","=(",":|"};

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}
