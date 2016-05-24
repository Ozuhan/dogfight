package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {

	public UserOrder(final int player) {
		super();
		this.player = player;
	}

	private final int player;

	public void UserOrder(final int player, final UserOrder order) {

	}

	@Override
	public int getPlayer() {
		return this.player;
	}

	@Override
	public void getOrder() {
		final Order order = new Order;
	}

}
