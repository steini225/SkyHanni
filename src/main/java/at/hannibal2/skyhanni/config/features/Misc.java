package at.hannibal2.skyhanni.config.features;

import at.hannibal2.skyhanni.config.core.config.Position;
import at.hannibal2.skyhanni.config.core.config.annotations.ConfigEditorBoolean;
import at.hannibal2.skyhanni.config.core.config.annotations.ConfigEditorButton;
import at.hannibal2.skyhanni.config.core.config.annotations.ConfigOption;
import com.google.gson.annotations.Expose;

public class Misc {

    @Expose
    @ConfigOption(name = "Pet Display", desc = "Show the currently active pet.")
    @ConfigEditorBoolean
    public boolean petDisplay = false;

    @Expose
    @ConfigOption(name = "Pet Display Position", desc = "")
    @ConfigEditorButton(runnableId = "petDisplay", buttonText = "Edit")
    public Position petDisplayPos = new Position(10, 10, false, true);

    @Expose
    @ConfigOption(name = "Exp Bottles", desc = "Hides all the experience bottles lying on the ground.")
    @ConfigEditorBoolean
    public boolean hideExpBottles = false;

    @Expose
    @ConfigOption(name = "Skytils Damage Splash", desc = "Fixing the custom damage splash feature from skytils.")
    @ConfigEditorBoolean
    public boolean fixSkytilsDamageSplash = true;

    @Expose
    @ConfigOption(name = "Config Button", desc = "Add a button to the pause menu to configure SkyHanni.")
    @ConfigEditorBoolean
    public boolean configButtonOnPause = true;

    @Expose
    @ConfigOption(name = "Real Time", desc = "Show the real time. Useful while playing in full screen mode")
    @ConfigEditorBoolean
    public boolean realTime = false;

    @Expose
    @ConfigOption(name = "Real Time Position", desc = "")
    @ConfigEditorButton(runnableId = "realTime", buttonText = "Edit")
    public Position realTimePos = new Position(10, 10, false, true);

    @Expose
    @ConfigOption(name = "Voidling Extremist Color", desc = "Highlight the voidling extremist in pink color")
    @ConfigEditorBoolean
    public boolean voidlingExtremistColor = false;

    @Expose
    @ConfigOption(name = "Corrupted Mob Highlight", desc = "Highlight corrupted mobs in purple color")
    @ConfigEditorBoolean
    public boolean corruptedMobHighlight = false;

    @Expose
    @ConfigOption(name = "Hide Damage Splash", desc = "Hide all damage splashes, from anywhere in Skyblock.")
    @ConfigEditorBoolean
    public boolean hideDamageSplash = false;
}