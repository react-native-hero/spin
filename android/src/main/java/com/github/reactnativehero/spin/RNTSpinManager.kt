package com.github.reactnativehero.spin

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.github.ybq.android.spinkit.SpinKitView
import com.github.ybq.android.spinkit.style.FadingCircle

class RNTSpinManager(private val reactAppContext: ReactApplicationContext) : SimpleViewManager<SpinKitView>() {

    override fun getName(): String {
        return "RNTSpin"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): SpinKitView {
        val spin = SpinKitView(reactContext)
        val style = FadingCircle()
        spin.setIndeterminateDrawable(style)
        return spin
    }

    @ReactProp(name = "color", customType = "Color")
    fun setColor(view: SpinKitView, color: Int) {
        view.setColor(color)
    }

}
