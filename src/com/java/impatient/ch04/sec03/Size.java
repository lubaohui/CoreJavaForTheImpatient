package com.java.impatient.ch04.sec03;

/**
 * 
 * @ClassName Size
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 17:10
 * @Version 1.0
 */
public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    /**
     *
     */
    private String abbreviation;

    /**
     *
     * @param abbreviation
     */
    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     *
     * @return
     */
    public String getAbbreviation() { return abbreviation; }
}