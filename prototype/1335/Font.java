public class Font {
    private String font_name;
    private int font_size;

    public Font(){}
    public Font(String font_name, int font_size){
        this.font_name = font_name;
        this.font_size = font_size;
    }

    public Font(String font_name){
        this.font_name = font_name;
    }

    public String getFont_name() {
        return font_name;
    }

    public void setFont_name(String font_name) {
        this.font_name = font_name;
    }

    public int getFont_size() {
        return font_size;
    }

    public void setFont_size(int font_size) {
        this.font_size = font_size;
    }
}
