package tr.com.harunkor.androidcustomlistviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    private var arraylist =  ArrayList<ItemModel>()
    private var listview : ListView? = null
    private var myadapter : FoodAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listview = findViewById(R.id.listvi)
        arraylist.add(ItemModel(R.drawable.pizza1,"Lorem ipsum dolor","Donec sem eros, maximus in purus et, laoreet mollis sem. Proin vel metus ornare mauris dictum maximus. Nam sollicitudin, ligula et luctus gravida, sem risus iaculis sem, ac rutrum lacus diam vel metus. Praesent neque orci, dapibus eu dapibus eu, sagittis at arcu. "))
        arraylist.add(ItemModel(R.drawable.pizza2,"Lorem ipsum dolor","Donec sem eros, maximus in purus et, laoreet mollis sem. Proin vel metus ornare mauris dictum maximus. Nam sollicitudin, ligula et luctus gravida, sem risus iaculis sem, ac rutrum lacus diam vel metus. Praesent neque orci, dapibus eu dapibus eu, sagittis at arcu. "))
        arraylist.add(ItemModel(R.drawable.pizza3,"Lorem ipsum dolor","Donec sem eros, maximus in purus et, laoreet mollis sem. Proin vel metus ornare mauris dictum maximus. Nam sollicitudin, ligula et luctus gravida, sem risus iaculis sem, ac rutrum lacus diam vel metus. Praesent neque orci, dapibus eu dapibus eu, sagittis at arcu. "))
        arraylist.add(ItemModel(R.drawable.pizaa4,"Lorem ipsum dolor","Donec sem eros, maximus in purus et, laoreet mollis sem. Proin vel metus ornare mauris dictum maximus. Nam sollicitudin, ligula et luctus gravida, sem risus iaculis sem, ac rutrum lacus diam vel metus. Praesent neque orci, dapibus eu dapibus eu, sagittis at arcu. "))
        arraylist.add(ItemModel(R.drawable.pizza1,"Lorem ipsum dolor","Donec sem eros, maximus in purus et, laoreet mollis sem. Proin vel metus ornare mauris dictum maximus. Nam sollicitudin, ligula et luctus gravida, sem risus iaculis sem, ac rutrum lacus diam vel metus. Praesent neque orci, dapibus eu dapibus eu, sagittis at arcu. "))
        arraylist.add(ItemModel(R.drawable.pizza2,"Lorem ipsum dolor","Donec sem eros, maximus in purus et, laoreet mollis sem. Proin vel metus ornare mauris dictum maximus. Nam sollicitudin, ligula et luctus gravida, sem risus iaculis sem, ac rutrum lacus diam vel metus. Praesent neque orci, dapibus eu dapibus eu, sagittis at arcu. "))
        arraylist.add(ItemModel(R.drawable.pizza3,"Lorem ipsum dolor","Donec sem eros, maximus in purus et, laoreet mollis sem. Proin vel metus ornare mauris dictum maximus. Nam sollicitudin, ligula et luctus gravida, sem risus iaculis sem, ac rutrum lacus diam vel metus. Praesent neque orci, dapibus eu dapibus eu, sagittis at arcu. "))
        arraylist.add(ItemModel(R.drawable.pizaa4,"Lorem ipsum dolor","Donec sem eros, maximus in purus et, laoreet mollis sem. Proin vel metus ornare mauris dictum maximus. Nam sollicitudin, ligula et luctus gravida, sem risus iaculis sem, ac rutrum lacus diam vel metus. Praesent neque orci, dapibus eu dapibus eu, sagittis at arcu. "))


        myadapter= FoodAdapter(applicationContext,arraylist)
        myadapter?.notifyDataSetChanged()
        listview?.adapter=myadapter











    }
}