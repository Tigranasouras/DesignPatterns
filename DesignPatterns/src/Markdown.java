public class Markdown implements Formatter{
    @Override
    public String format(String content){
        return "**" + content + "** _" + content + "_";//bold and italic

    }
}
