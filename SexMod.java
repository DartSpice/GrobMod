package ua.grobsex.main;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;


@Mod(modid = SexMod.MODID, name = SexMod.NAME, version = SexMod.VERSION)
public class SexMod {
	public static final String MODID = "grobsex";
	public static final String VERSION = "1.0";
	public static final String NAME = "Grob Sex mod";
	
	
	// Создаем экземпляр прокси
	@SidedProxy(clientSide="ua.grobsex.main.ClientProxy", serverSide="ua.grobsex.main.ServerProxy")
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Здесь добавьте код для предварительной инициализации
        proxy.preInit(event);
        
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Здесь добавьте код для инициализации
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Здесь добавьте код для пост-инициализации
        proxy.postInit(event);
    }
}
