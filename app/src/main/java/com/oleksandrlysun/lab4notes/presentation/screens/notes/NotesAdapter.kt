package com.oleksandrlysun.lab4notes.presentation.screens.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oleksandrlysun.lab4notes.R
import com.oleksandrlysun.lab4notes.entities.Note
import com.oleksandrlysun.lab4notes.presentation.utils.DateFormatter
import kotlinx.android.synthetic.main.item_note.view.*

class NotesAdapter(private val listener: (Note) -> Unit) :
    RecyclerView.Adapter<NotesAdapter.ViewHolder>() {

    private val items = mutableListOf<Note>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setItems(items: List<Note>) {
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Note) {
            itemView.titleTextView.text = item.title
            itemView.dateTextView.text = DateFormatter.dateAsString(item.date)
            itemView.setOnClickListener {
                listener(item)
            }
        }
    }
}