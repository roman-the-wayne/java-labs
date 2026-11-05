package org.example;

class Singer extends Artist{
    private String voiceType;

    public Singer(String name, int age, String genre, String voiceType) {
        super(name, age, genre);
        this.voiceType = voiceType;
    }

    public void setVoiceType(String voiceType) {
        this.voiceType = voiceType;
    }

    public String getVoiceType() {
        return voiceType;
    }

    public void singSong() {
        System.out.println("Певец исполняет сольную песню");
    }

    @Override
    public void perform  () {
        System.out.println("Поет пенсню");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип голоса: " + voiceType);
    }

}
