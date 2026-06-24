package net.turevo.rpghudmanafied.gui.hud;

import net.minecraft.client.Minecraft;
import net.turevo.rpghudmanafied.gui.hud.element.HudElement;
import net.turevo.rpghudmanafied.gui.hud.element.hotbar.*;

public class HudHotbarWidget extends HudDefault {

	public HudHotbarWidget(Minecraft mc, String hudKey, String hudName) {
		super(mc, hudKey, hudName);
		this.chatOffset = -22;
	}

	@Override
	public HudElement setElementArmor() {
		return new HudElementArmorHotbar();
	}

	@Override
	public HudElement setElementFood() {
		return new HudElementManaHotbar();
	}

	@Override
	public HudElement setElementHealth() {
		return new HudElementHealthHotbar();
	}

	@Override
	public HudElement setElementHealthMount() {
		return new HudElementHealthMountHotbar();
	}

	@Override
	public HudElement setElementLevel() {
		return new HudElementLevelHotbar();
	}

	@Override
	public HudElement setElementWidget() {
		return new HudElementWidgetHotbar();
	}

	@Override
	public HudElement setElementHotbar() {
		return new HudElementHotbarHotbar();
	}
}
