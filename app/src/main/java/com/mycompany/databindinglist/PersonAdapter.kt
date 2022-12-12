package com.mycompany.databindinglist

import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class PersonAdapter() : ListAdapter<Person, PersonAdapter.PersonViewHolder>(), Parcelable {

    inner class PersonViewHolder(itemView: View) : ViewHolder(itemView) {

    }

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonAdapter> {
        override fun createFromParcel(parcel: Parcel): PersonAdapter {
            return PersonAdapter(parcel)
        }

        override fun newArray(size: Int): Array<PersonAdapter?> {
            return arrayOfNulls(size)
        }
    }

}