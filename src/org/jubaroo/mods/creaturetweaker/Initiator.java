
package org.jubaroo.mods.creaturetweaker;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.jubaroo.mods.creaturetweaker.configurator.Config;
import org.jubaroo.mods.creaturetweaker.configurator.TemplateVariables;

import java.util.Properties;
import java.util.logging.Level;

public class Initiator implements WurmServerMod, Configurable, ServerStartedListener {

    /**
     * debug of the mod
     */
    public static void logInfo(String msg) {
        if (Constants.logger != null) {
            Constants.logger.log(Level.INFO, msg);
        }
    }

    /**
     * configure method adds entries to properties file to allow the user to configure the mod
     */
    @Override
    public void configure(final Properties properties) {
        Config.doConfig(properties);
        //Logging.creatureLogging();
    }

    @Override
    public void onServerStarted() {
        try {
            Initiator.logInfo("Setting guard and templar config options...");
            TemplateVariables.setTemplateVariables();
            Initiator.logInfo("Done setting guard and templar config options...");
        } catch (IllegalArgumentException | ClassCastException e) {
            e.printStackTrace();
        }
    }

    /**
     * Used for arrays to make configurable. Properties file should look something like these numbers = 0,4,9,12,14,27,30,32,41,43,62
     */
    public static int[] getPropertyArray(String str) {
        String[] arr = str.split(",");
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = Integer.valueOf(arr[i].trim());
        }
        return ret;
    }

    public String getVersion() {
        return "v1.0";
    }

}
