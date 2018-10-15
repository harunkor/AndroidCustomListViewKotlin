package tr.com.harunkor.androidcustomlistviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class  FoodAdapter : BaseAdapter {

    private var mylist = ArrayList<ItemModel>()
    private var context :Context?=null


    constructor(context:Context,mylist:ArrayList<ItemModel>) : super()
    {
        this.context=context
        this.mylist=mylist

    }


    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {

        val view : View?
        val viewHolder : ViewHolder
        val layoutInflater:LayoutInflater = LayoutInflater.from(context)

        if(p1==null)
        {

            view = layoutInflater.inflate(R.layout.item_list,p2,false)
            viewHolder= ViewHolder(view)
            view.tag=viewHolder
        }
        else
        {
            view=p1;
            viewHolder = view.tag as ViewHolder
        }


        viewHolder.foodImage?.setImageResource(mylist[p0].rid)
        viewHolder.foodTitle?.setText(mylist[p0].title)
        viewHolder.foodContent?.setText(mylist[p0].content)
        viewHolder.foodContent?.setText(mylist[p0].content)




        view?.setOnClickListener {

            Toast.makeText(context,"Title ${mylist.get(p0).title.toString()} \nContent : ${mylist.get(p0).content.toString()}\nImage Id : ${mylist.get(p0).rid.dec()}" , Toast.LENGTH_SHORT).show()


        }







        return  view;


    }

    override fun getItem(p0: Int): Any {
        return mylist[p0]

    }

    override fun getItemId(p0: Int): Long {

        return p0.toLong()
    }

    override fun getCount(): Int {

        return  mylist.size
    }


}


private  class ViewHolder(view: View)
{
    var foodImage: ImageView? = null
    var foodTitle:TextView? = null
    var foodContent:TextView? = null

    init {
            this.foodImage=view?.findViewById(R.id.food_image)
            this.foodTitle=view?.findViewById(R.id.txt_title)
            this.foodContent=view?.findViewById(R.id.txt_content)


     }


}