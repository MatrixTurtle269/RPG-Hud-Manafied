package net.turevo.rpghudmanafied.gui.hud;

import net.minecraft.client.Minecraft;
import net.turevo.rpghudmanafied.gui.hud.element.HudElement;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementAirDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementArmorDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementExperienceDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementFoodDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementHealthDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementHealthMountDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementHotbarDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementJumpBarDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementLevelDefault;
import net.turevo.rpghudmanafied.gui.hud.element.defaulthud.HudElementWidgetDefault;

public class HudDefault extends HudVanilla {

	public HudDefault(Minecraft mc, String hudKey, String hudName) {
		super(mc, hudKey, hudName);
	}

	@Override
	public HudElement setElementAir() {
		return new HudElementAirDefault();
	}

	@Override
	public HudElement setElementArmor() {
		return new HudElementArmorDefault();
	}

	@Override
	public HudElement setElementExperience() {
		return new HudElementExperienceDefault();
	}

	@Override
	public HudElement setElementLevel() {
		return new HudElementLevelDefault();
	}

	@Override
	public HudElement setElementFood() {
		return new HudElementFoodDefault();
	}

	@Override
	public HudElement setElementHealth() {
		return new HudElementHealthDefault();
	}

	@Override
	public HudElement setElementHealthMount() {
		return new HudElementHealthMountDefault();
	}

	@Override
	public HudElement setElementJumpBar() {
		return new HudElementJumpBarDefault();
	}

	@Override
	public HudElement setElementHotbar() {
		return new HudElementHotbarDefault();
	}

	@Override
	public HudElement setElementWidget() {
		return new HudElementWidgetDefault();
	}
}
