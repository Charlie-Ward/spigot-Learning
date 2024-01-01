package com.charlie.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class testCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            // if first argument == "hello" send hello back
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("hello")) {
                    ((Player) sender).sendMessage("Hello my friend!");
                }
            }
        }

        return false;
    }
}
