package com.test.empassignment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.test.empassignment.Entity.LocationModel
import kotlin.collections.ArrayList

class HIstoryActivity : AppCompatActivity() {
    lateinit var mAdapter: HistoryAdapter
    var list: ArrayList<LocationModel> = ArrayList()
    private var rvLicationHistory: RecyclerView? = null
    private val locationDao = Database.getDatabase().locationDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h_istory)

        rvLicationHistory = findViewById<View>(R.id.rvLicationHistory) as RecyclerView

        list = locationDao.all as ArrayList<LocationModel>

        setHistoryAdapter()
    }

    private fun setHistoryAdapter() {
        rvLicationHistory?.apply {
        mAdapter = HistoryAdapter(list , object : HistoryAdapter.onClic{
            override fun onItemClick(locationModel: LocationModel?) {
                Toast.makeText(this@HIstoryActivity, Gson().toJson(locationModel), Toast.LENGTH_LONG).show()
            }

        })

            var lmngr =
                LinearLayoutManager(this@HIstoryActivity, LinearLayoutManager.VERTICAL, false)
            layoutManager = lmngr
            adapter = mAdapter
        }
    }
}