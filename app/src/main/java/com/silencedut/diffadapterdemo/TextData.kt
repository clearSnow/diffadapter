package com.silencedut.diffadapterdemo

import android.graphics.Color
import com.silencedut.diffadapter.data.BaseImmutableData

/**
 * @author SilenceDut
 * @date 2018/12/5
 */
class TextData(var uid:Long,var content:String,var backgroundColor:Int = Color.TRANSPARENT) : BaseImmutableData<TextData>() {

    override fun uniqueFeature(): Any {
        return this.uid
    }

    companion object {
        const val VIEW_ID = R.layout.holder_text
    }


    override fun getItemViewId(): Int {
        return VIEW_ID
    }


    override fun areUISame(newData: TextData): Boolean {
        return this.content == newData.content && this.backgroundColor == newData.backgroundColor

    }

}