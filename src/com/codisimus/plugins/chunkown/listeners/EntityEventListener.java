package com.codisimus.plugins.chunkown.listeners;

import com.codisimus.plugins.chunkown.ChunkOwn;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.painting.PaintingPlaceEvent;

/**
 * Listens for griefing events
 * 
 * @author Codisimus
 */
public class EntityEventListener extends EntityListener {

    /**
     * Paintings can only be placed within an OwnedChunk by the owner, a coowner, or an admin
     * 
     * @param event The PaintingPlaceEvent that occurred
     */
    @Override
    public void onPaintingPlace (PaintingPlaceEvent event) {
        if (!ChunkOwn.canBuild(event.getPlayer(), event.getBlock()))
            event.setCancelled(true);
    }
}