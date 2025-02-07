package com.discord.bot.commands.admincommands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.io.File;

public class LogsCommand extends AdminCommand {
    @Override
    void operate(SlashCommandInteractionEvent event) {
        File logs = new File("logs.log");
        event.replyFile(logs).queue();
    }
}
