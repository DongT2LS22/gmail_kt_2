package com.example.gmail_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data  = ArrayList<ItemViewModel>()
        data.add(ItemViewModel("Elon musk", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.elonmusk))
        data.add(ItemViewModel("Bill gate", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.billgate))
        data.add(ItemViewModel("Elon musk", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.elonmusk))
        data.add(ItemViewModel("Bill gate", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.billgate))
        data.add(ItemViewModel("Elon musk", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.elonmusk))
        data.add(ItemViewModel("Bill gate", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.billgate))
        data.add(ItemViewModel("Elon musk", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.elonmusk))
        data.add(ItemViewModel("Bill gate", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.billgate))
        data.add(ItemViewModel("Elon musk", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.elonmusk))
        data.add(ItemViewModel("Bill gate", "Improved customer service", "NEWS: Verified users can now DM the @Premium account for support!" +
                "\n" +
                "Response times will vary but we've seen examples of users getting responses from agents in under 10 minutes.", "10:04AM",R.drawable.billgate))
        val adapter = ItemAdapter(data)
        recyclerView.adapter = adapter
    }
}