package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();


    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String s) {
        List<Mail> fromList = new ArrayList<>();

        if(s.substring(0,5).equals("from:")){
            for (Mail m : mails){
                if (s.equals("from:" + m.getFrom().getEmail())){
                    fromList.add(m);
                }
            }

        }else if(s.substring(0,3).equals("to:")){
            for (Mail m : mails){
                if (s.equals("to:" + m.getFrom().getName())){
                    fromList.add(m);
                }
            }

        }
        return fromList;
    }
}
