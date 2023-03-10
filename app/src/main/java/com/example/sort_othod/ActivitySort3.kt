package com.example.sort_othod


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivitySort3 : AppCompatActivity() {

    private lateinit var newRecyclerView2: RecyclerView
    private lateinit var newArrayList2: ArrayList<News2>
    private lateinit var titleList2: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort2)


        titleList2 = arrayOf(
            "Диваны",
            "Кровати",
            "Шкафы",
            "Целлофановые пакеты",
            "Люминесцентные лампы",
            "Отработанные масла",


            "Электронное оборудование",
            "Черный металлолом",
            "Цветной металлолом",
            "Автошины",
            "Аккумуляторы",
            "Лисву и траву",
            "Химические отходы",
            "Пластиковые пакеты",
            "Батарейки",
            "Горючие жидкости",
            "СТРОИТЕЛЬНЫЕ МАТЕРИАЛЫ:",
            "Плитка",
            "Асфвальт",
            "Цемент",
            "Линолеум",
            "Бетон",
            "Штукатука",
            "Скрап",
            "Пластиковые пакеты",
            "Обрезки дерева, фанеры",
            "Бой кирпича",
            "Оконные рамы",
            "Битое стекло"

        )

        newRecyclerView2 =findViewById(R.id.recyclerView2)
        newRecyclerView2.layoutManager = LinearLayoutManager(this)
        newRecyclerView2.setHasFixedSize(true)


        newArrayList2 = arrayListOf<News2>()
        getUserdata()

    }

    private fun getUserdata() {
        for(i in titleList2.indices){

            val news2 = News2(titleList2[i])
            newArrayList2.add((news2))
        }

        newRecyclerView2.adapter = MyAdapter2(newArrayList2)
    }
}