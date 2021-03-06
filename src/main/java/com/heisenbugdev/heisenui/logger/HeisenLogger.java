package com.heisenbugdev.heisenui.logger;

import com.heisenbugdev.heisenui.HeisenProperties;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class HeisenLogger
{

    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(HeisenProperties.MOD_IDENTIFICATION, logLevel, "[HeisenUI] " + String.valueOf(object));
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }
}
