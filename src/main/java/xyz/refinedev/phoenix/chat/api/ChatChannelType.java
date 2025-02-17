package xyz.refinedev.phoenix.chat.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 8/26/2022
 * Project: Phoenix
 */

@Getter
@RequiredArgsConstructor
public abstract class ChatChannelType {
    public abstract String getName();

    public abstract boolean canUse(Player player);

    public abstract int getPriority();

    public abstract String getFormat();

    public abstract boolean acceptRecipient(Player player, Player other);
}
