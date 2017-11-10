package us.mattmarion.redditlinks;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class RedditChatListener implements Listener {
    
    private final String subredditUrl = "https://www.reddit.com/r/";
    
    @EventHandler
    public void on(AsyncPlayerChatEvent event) {
	if (!event.getPlayer().hasPermission("reddit.chat")) {
	    return;
	}
	
	String message = event.getMessage();
	
	if (!message.contains("/r/")) {
	    return;
	}
	
	event.setMessage(message.replace("/r/", subredditUrl));
    }

}
