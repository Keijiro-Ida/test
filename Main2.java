package test;

import java.util.Date;
import java.util.Properties;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Main2{
  static String msgText = "This is a message body.¥nHere's the second line.";

  public static void main(String[] args){
    if (args.length != 4){
      usage();
      System.exit(1);
    }

    System.out.println();

    String to = args[0];
    String from = args[1];
    String host = args[2];
    boolean debug = Boolean.valueOf(args[3]).booleanValue();

    Properties props = new Properties();
    props.put("mail.smtp.host", host);
    if (debug){
      props.put("mail.debug", args[3]);
    }

    Session session = Session.getInstance(props, null);
    session.setDebug(debug);
    
    try{
      Message msg = new MimeMessage(session);
      msg.setFrom(new InternetAddress(from));
      InternetAddress[] address = {new InternetAddress(args[0])};
      msg.setRecipients(Message.RecipientType.TO, address);
      msg.setSubject("JavaMail APIs Test");
      msg.setSentDate(new Date());
      msg.setText(msgText);

      Transport.send(msg);
    }catch(MessagingException mex){
      System.out.println("¥n--Exception handling in msgsendsample.java");
      mex.printStackTrace();
    }
  }

  private static void usage(){
    System.out.println("usage: java msgsendsample <to> <from> <smtp> true|false");
  }
}