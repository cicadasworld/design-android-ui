package com.jin.ext

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class EditTextExt(context: Context, attrs: AttributeSet) : AppCompatEditText(context, attrs) {

    override fun setTypeface(tf: Typeface?) {
        val typeFace = Typeface.createFromAsset(context.assets, "fonts/站酷仓耳渔阳体_W03.ttf")
        super.setTypeface(typeFace)
    }
}