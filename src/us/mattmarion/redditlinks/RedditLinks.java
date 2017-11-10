package us.mattmarion.redditlinks;

import org.bukkit.plugin.java.JavaPlugin;

public class RedditLinks extends JavaPlugin {
    
    public final void onEnable() {
	getServer().getPluginManager().registerEvents(new RedditChatListener(), this);
    }
}
