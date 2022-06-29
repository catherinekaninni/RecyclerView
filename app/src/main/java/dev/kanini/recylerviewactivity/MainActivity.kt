package dev.kanini.recylerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.kanini.recylerviewactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        displayNames()
    }
    fun displayNames(){
        var names= listOf("Misky","Yusuf","Lucy","Mary","Ajuoga","Catherine","Kanini","Violet","Faith","Marie","Linda","Samantha","Lydiah","Joyce")
        val namesAdapter=NamesRecyclerViewAdapter(names)
        binding.rvnames.layoutManager=LinearLayoutManager(this)
        binding.rvnames.adapter=namesAdapter
    }
}