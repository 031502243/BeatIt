package com.example.homework.data.DO.course

import android.os.Parcel
import android.os.Parcelable
import paperparcel.PaperParcel

/**
 * Created by 59800 on 2017/11/16.
 */

@PaperParcel
data class Notice(
        val title: String,
        val content: String,
        val time: String
) : Parcelable {

    companion object {
        @JvmField val CREATOR = PaperParcelNotice.CREATOR
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        PaperParcelNotice.writeToParcel(this, dest, flags)
    }
}