package org.example;

class Novel extends Literature {
    private String genre;

    public Novel(String title, String author, int pages, String genre) {
        super(title, author, pages);
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String getSummary() {
        return "Краткое содержание романа";
    }
}