import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static JDA jda;
    public static String prefix = "!";
    public static void main(String[] args) throws LoginException {
        jda = (JDA) new JDABuilder(AccountType.BOT).setToken("NzQyNDQ5ODYyMDA3NzE3OTU5.XzGSUQ.3aoRPVwDOrKBSJ5NXi0lZIdmcwc").build();
        jda.getPresence().setStatus(OnlineStatus.IDLE);
        jda.addEventListener(new Main(),new Commands());
        /*JDABuilder builder = new JDABuilder();
         String token = "NzQyNDQ5ODYyMDA3NzE3OTU5.XzGSUQ.3aoRPVwDOrKBSJ5NXi0lZIdmcwc";
        builder.setToken(token);
        builder.addEventListeners(new Main());
        builder.build();*/
    }
}
