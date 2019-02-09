package br.com.paulosalvatore.kotlinrecyclerview.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.paulosalvatore.kotlinrecyclerview.R
import br.com.paulosalvatore.kotlinrecyclerview.adapter.ProgrammingLanguageAdapter
import br.com.paulosalvatore.kotlinrecyclerview.model.ProgrammingLanguage
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = ProgrammingLanguageAdapter(
                recyclerViewItems(),
                this) {
            longToast("Clicked item: ${it.title}")
        }

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
    }

    private fun recyclerViewItems() : List<ProgrammingLanguage> {
        val kotlin = ProgrammingLanguage(R.drawable.kotlin,
                "Kotlin",
                2010,
                "Kotlin description")

        return listOf(kotlin, kotlin)
    }
}
