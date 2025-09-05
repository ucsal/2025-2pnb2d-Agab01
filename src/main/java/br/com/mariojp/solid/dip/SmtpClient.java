package br.com.mariojp.solid.dip;

public class SmtpClient implements MailSender {
	private final SmtpClient smtp = new SmtpClient();

	@Override
	public void send(String to, String subject, String body) {
		smtp.send(to, subject, body);
	}
}
