package com.dasharath.googlenewsretrofir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.indiview.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        review.layoutManager=LinearLayoutManager(this@MainActivity)

        var r = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("https://newsapi.org/").build()
        var api = r.create(NewsApi::class.java)
        var call = api.getNews()

        call.enqueue(object : Callback<WorldNews> {
            override fun onResponse(call: Call<WorldNews>, response: Response<WorldNews>) {
                var body = response.body()
                var list = body?.articles

                review.adapter=MyAdapter(this@MainActivity,list!!)
            }

            override fun onFailure(call: Call<WorldNews>, t: Throwable) {
                Toast.makeText(this@MainActivity,"Failed...",Toast.LENGTH_LONG).show()
            }
        })
    }
}
