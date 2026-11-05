package org.example;

class Textbook extends Literature {
    private String subject;

    public Textbook(String title, String author, int pages, String subject) {
        super(title, author, pages);
        this.subject = subject;
    }

    @Override
    public String getGenre() {
        return "Учебник";
    }

    @Override
    public String getSummary() {
        return "Краткое содержание учебника";
    }
}