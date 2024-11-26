public class HTMLFormatter implements Formatter{
    @Override
    public String format(String content) {
        return  "<html>\n" +
                "<head>\n" +
                "<h3>" + content + "</h3>\n" +
                "</head>\n" +
                "</html>";
    }
}
