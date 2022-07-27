package com.example.smartlist

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.list_item.view.*
import android.widget.CheckedTextView

class ListItem(private val items: ArrayList<String>, private val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Gets the number of items in the list
    override fun getItemCount(): Int {
        return items.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    }

    // Binds each item in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.listItem.text = items[position]

        holder.listItem.setOnClickListener {
            Toast.makeText(context, "Clicked ${holder.listItem.text}", Toast.LENGTH_SHORT).show()
        }
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each item to
    val listItem: TextView = view.item
}
