package com.example.demolistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.demolistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var dataList: ArrayList<dataModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val language = arrayOf(
            "C",
            "C++",
            "Java",
            "kotlin",
            "DBMS",
            "SQL",
            "Android Development",
            "Web Development",
            "AI",
            "ML",
            "Data Science",
            "IoT",
            "operating System",
            "Computer Network"
        )

        val description = arrayOf(
            "C was developed by Dennis M. Richie.",
            "C++ was developed by Bjarne Stroustrup.",
            "Java was originally developed by James Gosling at Sun Microsystems.",
            "Kotlin was built by software development tool creators JetBrains in 2010.",
            "Database Management Systems (DBMS) are software systems used to store, retrieve, and run queries on data.",
            "SQL is used to communicate with a database.",
            "The process by which applications are created for devices running the Android operating system.",
            "Web development refers to the creating, building, and maintaining of websites.",
            "Artificial intelligence is the simulation of human intelligence processes by machines, especially computer systems",
            "Machine learning is a branch of artificial intelligence (AI) and computer science which focuses on the use of data and algorithms to imitate the way that humans learn, gradually improving its accuracy.",
            "Data science is an umbrella term for all aspects of data processing—from the collection to modeling to insights.",
            "Internet of Things, refers to the collective network of connected devices and the technology that facilitates communication between devices and the cloud, as well as between the devices themselves.",
            "An operating system is the most important software that runs on a computer.",
            "A computer network is a system that connects two or more computing devices for transmitting and sharing information."
        )

        dataList = ArrayList()
        for (eachIndex in language.indices) {
            val data = dataModel(language[eachIndex], description[eachIndex])
            dataList.add(data)
        }

        binding.listView.adapter = MyAdapter(this, dataList)

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val lang = language[position]
            val descr = description[position]

            val intent = Intent(this, DescriptionActivity::class.java)
            intent.putExtra("language", lang)
            intent.putExtra("description", descr)
            startActivity(intent)
        }

    }
}