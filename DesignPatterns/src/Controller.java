public class Controller {
    public static void main(String[] args) {
        TextFormatter editor = new TextFormatter();
        editor.setContent("Testing 1 2 3");


        //PlainText
        Formatter plainTextFormatter = new PlainTextFormatter();
        String formattedContent = editor.formatContent(plainTextFormatter);
        System.out.println("Formatted Content: " + formattedContent);


        //HTML
        Formatter htmlFormatter = new HTMLFormatter();
        System.out.println("HTML Output:\n" + editor.formatContent(htmlFormatter));


    }

}
