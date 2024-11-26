public class TextFormatter {
    private String content;
    private Formatter currentFormatter;


    public TextFormatter() {
        this.content = ""; //initializer of content
        this.currentFormatter = null; //
    }

    public void setContent(String content){
        this.content = content; //sets content
    }

    public String getContent(){
        return content; //returns content
    }

    public void setFormatter(Formatter formatter){
        this.currentFormatter = formatter;
    }

    public String formatContent(Formatter formatter){
        return currentFormatter.format(content); //strategy Pattern implementation
    } //throw for null, but I can't be bothered to look up how to do this





}
