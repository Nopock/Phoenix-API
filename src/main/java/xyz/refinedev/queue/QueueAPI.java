package xyz.refinedev.queue;

import xyz.refinedev.queue.queue.impl.Queue;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 8/24/2022
 * Project: pxQueue
 */
public class QueueAPI {

    public static QueueAPI INSTANCE;

    public QueueAPI() {
        INSTANCE = this;
    }

    public boolean isInQueue(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Queue getPlayerQueue(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Queue getByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
