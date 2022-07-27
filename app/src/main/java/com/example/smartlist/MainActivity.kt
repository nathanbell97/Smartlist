package com.example.smartlist

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.CheckedTextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.*

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    private val list: ArrayList<String> = ArrayList()

    //private val dbHelper = FeedReaderDbHelper(this)

    // Gets the data repository in write mode
    //private val db = dbHelper.writableDatabase

    // Create a new map of values, where column names are the keys
//    private val values = ContentValues().apply {
//        put(FeedReaderContract.FeedEntry.COLUMN_NAME_TITLE, "Hi")
//    }

    // Insert the new row, returning the primary key value of the new row
    //val newRowId = db?.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)

        recycler_view.adapter = ListItem(list, this)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val newItem = findViewById<EditText>(R.id.editItemText).text.toString()
            list.add((newItem))
            recycler_view.adapter!!.notifyDataSetChanged()
//            val values = ContentValues().apply {
//                put(FeedReaderContract.FeedEntry.COLUMN_NAME_TITLE, newItem)
//            }

            //db?.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values)
        }
    }
}
