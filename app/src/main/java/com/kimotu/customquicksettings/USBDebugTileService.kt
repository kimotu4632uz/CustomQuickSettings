package com.kimotu.customquicksettings

import android.provider.Settings
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class USBDebugTileService : TileService() {
    override fun onClick() {
        super.onClick()
        when (qsTile.state) {
            Tile.STATE_ACTIVE -> {
                Settings.Global.putInt(contentResolver, Settings.Global.ADB_ENABLED, 0)
                qsTile.state = Tile.STATE_INACTIVE
            }
            Tile.STATE_INACTIVE -> {
                Settings.Global.putInt(contentResolver, Settings.Global.ADB_ENABLED, 1)
                qsTile.state = Tile.STATE_ACTIVE
            }
        }
        qsTile.updateTile()
    }
}