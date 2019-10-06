package lab15_part2;

public class Post implements MailSender {
    public Post() {
        createMail("Hello");
        sendMail("Email was sent");
    }

    @Override
    public String createMail(String a) {
        System.out.println("Post is creating mail");
        return a;
    }

    @Override
    public void sendMail(String b) {
        System.out.println("Post is sending mail");
    }
}
