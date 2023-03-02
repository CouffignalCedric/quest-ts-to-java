public class Photo {
    // url:string;
    // filename:string;
    // width: number;
    // height: number;
   private String url;
   private String filename;
   private int width;
   private int height;

    //constructor

    public Photo(String url) {
        this.url = url;
        this.filename = "";
        this.width = 0;
        this.height = 0;

    }
//getters setters
public String getUrl(){
    return this.url;
}
public void setUrl(String url){
    this.url=url;
} 
public String getFilename(){
    return this.filename;
}
public void setFilename(String filename){
    this.filename = filename;
}
public int getWidth(){
    return this.width;
}
public void setWidth(int width){
 this.width = width;
}
public int getheight(){
    return this.height;
}
public void setheight(int height){
 this.height = height;
}

}
