package com.mycompany.databindinglist

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class PersonAdapter() : ListAdapter<Person, PersonAdapter.PersonViewHolder>(){

    inner class PersonViewHolder(itemView: View) : ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}