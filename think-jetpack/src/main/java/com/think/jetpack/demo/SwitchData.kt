package com.think.jetpack.demo

import android.graphics.drawable.Drawable
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField

class SwitchData(
        @DrawableRes
        icon: Int,
        @DimenRes
        layoutHeight: Int = 0,
        @DrawableRes
        arrow: Int = 0,
        title: String = "",
        visibleIcon: Boolean = false,
        visibleDivider: Boolean = false,
        visibleArrow: Boolean = true,
        var summary: String = "",
        var visibleSummary: Boolean = true,
        var switchValue: ObservableField<Boolean>
) : BaseData(
        icon,
        layoutHeight,
        arrow,
        title,
        visibleIcon,
        visibleDivider,
        visibleArrow)
