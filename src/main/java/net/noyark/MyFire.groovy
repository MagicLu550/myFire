package net.noyark

import org.bukkit.plugin.java.JavaPlugin

class MyFire extends JavaPlugin {

    @Override
    void onLoad() {
        this.logger.info("""
    /***************************************/
                老卢的bukkit试水插件
                可以让人随机出生燃烧
                ${this.name}插件
                SERVER_VERSION: ${this.server.version}
        """)
    }

    @Override
    void onEnable() {
        this.logger.info("加载成功")
        this.server.pluginManager.registerEvents(new FireListener(),this)
    }

}
