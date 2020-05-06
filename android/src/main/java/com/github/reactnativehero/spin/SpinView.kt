package com.github.reactnativehero.spin

import android.graphics.Color
import android.view.View
import com.facebook.react.uimanager.ThemedReactContext

class SpinView(private val reactContext: ThemedReactContext) : View(reactContext) {

    var size = 0

        set(value) {
            if (field == value) {
                return
            }
            field = value
            applySpin()
        }

    var color = Color.TRANSPARENT

        set(value) {
            if (field == value) {
                return
            }
            field = value
            applySpin()
        }

    private fun applySpin() {
        
    }

}