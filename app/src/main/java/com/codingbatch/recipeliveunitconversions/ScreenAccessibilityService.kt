package com.codingbatch.recipeliveunitconversions

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityEvent.TYPE_VIEW_TEXT_SELECTION_CHANGED
import android.widget.Toast

class ScreenAccessibilityService : AccessibilityService() {
    override fun onInterrupt() {}

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        Log.d("eventStarted", " now")

        event?.let {
            if (it.eventType == TYPE_VIEW_TEXT_SELECTION_CHANGED) {
                Log.d("eventStartedAndSelected", event.text.joinToString { it })
                Toast.makeText(
                    applicationContext,
                    event.text.joinToString { it },
                    Toast.LENGTH_LONG
                ).show()
            }
            Log.d("eventStartedAndSelected", event.text.joinToString { it })

        }
    }
}