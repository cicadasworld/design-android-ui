package com.jin.ext

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class TextViewExt : AppCompatTextView {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    override fun setTypeface(tf: Typeface?) {
        val typeFace = Typeface.createFromAsset(context.assets, "fonts/站酷仓耳渔阳体_W03.ttf")
        super.setTypeface(typeFace)
    }
}