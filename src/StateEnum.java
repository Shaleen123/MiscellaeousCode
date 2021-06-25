public enum StateEnum {
    MAHARASHTRA("MH", "411027"),
    MADHYAPRADESH("MP", "482001"),
    JAMMU("Sri", "12345");


    private String capital;
    private String code;


    StateEnum(String capital, String code) {
        this.capital = capital;
        this.code = code;
    }

    public String getCapital() {
        return capital;

    }

    public String getCode() {
        return capital;

    }
}

