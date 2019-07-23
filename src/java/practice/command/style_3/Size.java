package practice.command.style_3;

public enum Size {

    SMALL("small"),NORMALL("normal");

    private String title;

    Size(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
