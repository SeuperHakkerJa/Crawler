public class Main {


  public static void main(String[] args) {

    String url = "https://act.ucsd" +
      ".edu/scheduleOfClasses/scheduleOfClassesStudent.htm";

    Bot bot = new Bot(url);
    bot.start();

  }
}