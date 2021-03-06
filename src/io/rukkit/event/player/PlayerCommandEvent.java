package io.rukkit.event.player;

import io.rukkit.entity.*;
import io.rukkit.event.*;
import io.rukkit.event.player.*;

public class PlayerCommandEvent extends PlayerEvent
{
	private static ListenerList list = new ListenerList(PlayerCommandEvent.class);

	public static ListenerList getListenerList() {
		return list;
	}

	private Player player;
	private String message;

	public PlayerCommandEvent(Player p, String message) {
		this.player = p;
		this.message = message;
	}

	public String getCommandMessage() {
		return this.message;
	}

	public Player getPlayer() {
		return this.player;
	}
}
