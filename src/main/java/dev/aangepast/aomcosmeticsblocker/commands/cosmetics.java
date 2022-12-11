package dev.aangepast.aomcosmeticsblocker.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cosmetics implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            sender.sendMessage(ChatColor.RED + "Something went wrong while executing this command.");
        }


        return true;
    }
}
