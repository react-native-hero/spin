package com.github.reactnativehero.spin

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class RNTSpinManager(private val reactAppContext: ReactApplicationContext) : SimpleViewManager<SpinView>() {

    override fun getName(): String {
        return "RNTSpin"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): SpinView {
        return SpinView(reactContext)
    }

    @ReactProp(name = "size")
    fun setSize(view: SpinView, size: Int) {
        view.size = size
    }
    
    @ReactProp(name = "color", customType = "Color")
    fun setColor(view: SpinView, color: Int) {
        view.color = color
    }

}