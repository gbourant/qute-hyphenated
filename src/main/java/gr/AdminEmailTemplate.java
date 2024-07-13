package gr;

import io.quarkus.mailer.MailTemplate;
import io.quarkus.qute.CheckedTemplate;

@CheckedTemplate(basePath = "emails", defaultName = CheckedTemplate.HYPHENATED_ELEMENT_NAME)
public class AdminEmailTemplate {
    public static native MailTemplate.MailTemplateInstance copyright();
    public static native MailTemplate.MailTemplateInstance verifyPhone(String token);
}
