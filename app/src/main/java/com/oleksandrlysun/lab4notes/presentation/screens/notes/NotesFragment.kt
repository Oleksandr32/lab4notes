package com.oleksandrlysun.lab4notes.presentation.screens.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.oleksandrlysun.lab4notes.R
import com.oleksandrlysun.lab4notes.entities.Note
import com.oleksandrlysun.lab4notes.presentation.extensions.mainActivity
import com.oleksandrlysun.lab4notes.presentation.screens.notes.di.NotesFragmentInjector
import kotlinx.android.synthetic.main.fragment_notes.*

class NotesFragment : Fragment(), NotesView {

    lateinit var presenter: NotesPresenter

    private lateinit var adapter: NotesAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        NotesFragmentInjector().inject(this)
        mainActivity?.supportActionBar?.show()
        return inflater.inflate(R.layout.fragment_notes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = NotesAdapter { note -> presenter.onNoteClick(note) }
        notesRecyclerView.layoutManager = LinearLayoutManager(context)
        notesRecyclerView.adapter = adapter
        fab.setOnClickListener { presenter.onAddNoteClick() }
    }

    override fun setNotes(notes: List<Note>) {
        adapter.setItems(notes)
    }
}