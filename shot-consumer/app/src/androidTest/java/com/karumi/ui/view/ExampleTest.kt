package com.karumi.ui.view

import android.view.LayoutInflater
import androidx.test.platform.app.InstrumentationRegistry
import com.karumi.R

import com.karumi.shot.ScreenshotTest
import org.junit.Test

class ExampleTest : ScreenshotTest {
    @Test
    fun screenshot() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val view = LayoutInflater.from(context).inflate(R.layout.view_sample, null, false)

        compareScreenshot(view = view, widthInPx = 800)
    }
}