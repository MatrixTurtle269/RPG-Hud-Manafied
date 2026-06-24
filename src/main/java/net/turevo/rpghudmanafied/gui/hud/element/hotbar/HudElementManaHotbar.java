package net.turevo.rpghudmanafied.gui.hud.element.hotbar;

import io.redspace.ironsspellbooks.player.ClientMagicData;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.GuiGraphics;
import net.turevo.rpghudmanafied.gui.hud.element.HudElement;
import net.turevo.rpghudmanafied.gui.hud.element.HudElementType;
import net.turevo.rpghudmanafied.settings.Settings;

import static io.redspace.ironsspellbooks.api.registry.AttributeRegistry.MAX_MANA;

public class HudElementManaHotbar extends HudElement {

    public HudElementManaHotbar() {
        super(HudElementType.FOOD, 0, 0, 0, 0, true);
        parent = HudElementType.WIDGET;
    }

    @Override
    public boolean checkConditions() {
        return !this.mc.options.hideGui;
    }

    @Override
    public void drawElement(GuiGraphics gg, float zLevel, DeltaTracker partialTicks, int scaledWidth, int scaledHeight) {
        if (this.mc.player == null) return;
        int maxMana = (int) this.mc.player.getAttributeValue(MAX_MANA);
        int mana = ClientMagicData.getPlayerMana();

        int height = scaledHeight + this.settings.getPositionValue(Settings.hunger_position)[1];
        int posX = (this.settings.getBoolValue(Settings.render_player_face) ? 49 : 25) + this.settings.getPositionValue(Settings.hunger_position)[0];

        drawCustomBar(gg, posX, height - 26, 200, 10, mana / (double) maxMana * 100.0D, -1, -1, this.settings.getIntValue(Settings.color_food), offsetColorPercent(this.settings.getIntValue(Settings.color_food), OFFSET_PERCENT));

        String manaString = mana + "/" + maxMana;
        if (this.settings.getBoolValue(Settings.show_numbers_food))
            gg.drawCenteredString( this.mc.font, manaString, posX + 100, height - 25, -1);
    }

}
