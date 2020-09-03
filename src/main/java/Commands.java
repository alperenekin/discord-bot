import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String []args = event.getMessage().getContentRaw().split("\\s+");
        if(args[0].equalsIgnoreCase(Main.prefix+ "info")){
            System.out.println("We received a messaged from" + event.getAuthor().getName() + ":" + event.getMessage().getContentDisplay());
            event.getChannel().sendTyping().queue();
             event.getChannel().sendMessage("Hello it is bot.").queue();
        }
    }
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println("We received a messaged from" + event.getAuthor().getName() + ":" + event.getMessage().getContentDisplay());
        if(event.getMessage().getContentRaw().equals("!Hello")){
            event.getChannel().sendMessage("Hello").queue();
        }
    }
}
