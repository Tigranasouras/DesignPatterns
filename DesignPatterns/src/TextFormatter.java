public class TextFormatter {
    private String content;

    public TextFormatter() {
        this.content = ""; //initializer of content
    }

    public void setContent(String content){
        this.content = content; //sets content
    }

    public String getContent(){
        return content; //returns content
    }

    public String formatContent(Formatter formatter){
        return formatter.format(content); //strategy Pattern implementation
    }




}
