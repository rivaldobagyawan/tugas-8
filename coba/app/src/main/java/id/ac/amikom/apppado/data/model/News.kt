package id.ac.amikom.apppado.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
        val title : String = "",
        val thumb : String = "",
        val tags : String = "",
        val key : String = ""
): Parcelable
