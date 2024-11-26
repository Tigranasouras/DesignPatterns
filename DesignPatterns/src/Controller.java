public class Controller {
    public static void main(String[] args) {
        TextFormatter editor = new TextFormatter();
        editor.setContent("Testing 1 2 3"); //initializer


        //PlainText
        Formatter plainTextFormatter = new PlainTextFormatter();
        editor.setFormatter(plainTextFormatter);
        System.out.println("Formatted Content: " + editor.formatContent(plainTextFormatter));


        //HTML
        Formatter htmlFormatter = new HTMLFormatter();
        editor.setFormatter(htmlFormatter);
        System.out.println("HTML Output:\n" + editor.formatContent(htmlFormatter));

        //Markdown
        Formatter markdownFormatter = new Markdown();
        editor.setFormatter(markdownFormatter);
        System.out.println("Markdown Output:\n" + editor.formatContent(markdownFormatter));



    }

}
