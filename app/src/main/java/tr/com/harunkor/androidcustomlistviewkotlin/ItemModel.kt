package tr.com.harunkor.androidcustomlistviewkotlin


class ItemModel {

    val rid : Int
    val title : String
    val content : String

    constructor(rid:Int,title:String,content:String)
    {
        this.rid=rid
        this.title=title
        this.content=content
    }




}