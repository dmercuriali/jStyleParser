/**
 * TermColorKeywordImpl.java
 * Created on 25.12.2016 by burgetr
 */
package cz.vutbr.web.csskit;

import cz.vutbr.web.css.TermColor;

/**
 * A TermColor implementation that represents a color created using a special
 * keyword.
 * @author Radek Burget
 */
public class TermColorKeywordImpl extends TermImpl<Color> implements TermColor {

    private Keyword keyword;

    protected TermColorKeywordImpl(Keyword keyword, int r, int g, int b, int a) {
        this.keyword = keyword;
        this.value = new Color(r, g, b, a);
    }

    @Override
    public Keyword getKeyword() {
        return keyword;
    }

    @Override
    public boolean isTransparent() {
        return (keyword == Keyword.TRANSPARENT) || (value.getAlpha() == 0);
    }

    @Override
    public String toString() {
        String operatorValue = operator == null
            ? ""
            : operator.value();

        String keywordStr = keyword == null
            ? ""
            : keyword.toString();

        return operatorValue + keywordStr;
    }

}
