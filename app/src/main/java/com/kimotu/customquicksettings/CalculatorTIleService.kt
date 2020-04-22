package com.kimotu.customquicksettings

import android.content.Intent
import android.provider.Settings
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class CalculatorTileService : TileService() {
    override fun onClick() {
        super.onClick()
        /*startActivity(Intent(Intent.ACTION_MAIN).apply {
            categories.add(Intent.CATEGORY_APP_CALCULATOR)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        })*/
        val intent = Intent()
        intent.selector = Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_CALCULATOR)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}