package test;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//時刻の格納
import java.util.Timer;
import java.util.TimerTask;

public class Main {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    String date = now.format(dtf2).toString();

    String hour = "10";
    String minute = "05";
    String time = hour + ":" + minute;
    String datetime = date + " " + time;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    LocalDateTime ldt = LocalDateTime.parse(datetime,dtf);

    Timestamp timestamp = Timestamp.valueOf(ldt);

    System.out.println(timestamp);

    //現在時刻の格納
    LocalDateTime nowTime = LocalDateTime.now();
    Timestamp ts = Timestamp.valueOf(nowTime);
    Long timerTime = timestamp.getTime() - ts.getTime();
    if( timerTime > 0) {
      Timer timer = new Timer();
      timer.schedule(new TimerTask(){
       public void run() {
        System.out.println("メールを送信しました。");
        }
      },timerTime);
    }
  }
}
