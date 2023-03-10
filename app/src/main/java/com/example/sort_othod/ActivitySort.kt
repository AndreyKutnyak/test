package com.example.sort_othod


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivitySort : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    private lateinit var titleList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)


        titleList = arrayOf(
            "Пластик PET",
            "Пластик HDPE",
            "Пластик LDPE",
            "Пластик PP",
            "Жестяные банки консерв",
            "Алюминевые банки консерв",
            "Cтекло",
            "Бумага",
            "Картон"

        )

        newRecyclerView =findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)


        newArrayList = arrayListOf<News>()
        getUserdata()

    }

    private fun getUserdata() {
        for(i in titleList.indices){

            val news = News(titleList[i])
            newArrayList.add((news))
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}