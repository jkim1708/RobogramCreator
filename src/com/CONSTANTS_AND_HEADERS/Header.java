package com.CONSTANTS_AND_HEADERS;

public class Header {
    StringBuilder headerBuilder= new StringBuilder();
     private static final String starLine = "!*******************************";
    String headerTitle;
    String description;

    public Header() {
    }

    public Header(String headerTitle) {
        this.headerTitle = headerTitle;;
        headerBuilder.append(starLine+System.lineSeparator());
        headerBuilder.append(headerTitle+System.lineSeparator());
        headerBuilder.append("description:"+System.lineSeparator());
        headerBuilder.append(""+System.lineSeparator());
        headerBuilder.append(starLine+System.lineSeparator());
    }

    public Header(String headerTitle, String description) {
        this.headerTitle = headerTitle;
        this.description = description;

        headerBuilder.append(starLine+System.lineSeparator());
        headerBuilder.append(headerTitle+System.lineSeparator());
        headerBuilder.append("description:"+System.lineSeparator());
        headerBuilder.append(description+System.lineSeparator());
        headerBuilder.append(starLine+System.lineSeparator());
    }

    public Header createHeader(String headerTitle){

        return new Header(headerTitle);
    }

    public Header createHeader(String headerTitle, String description){
        return new Header(headerTitle,description);
    }

    @Override
    public String toString() {
        return headerBuilder.toString();
    }
}
