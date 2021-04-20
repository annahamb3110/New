package Restaurant;

public class Restaurant {
    public String name;
    public String address;
    int rating;


public Restaurant(String name,String address,int rating )
{ this.name=name;
  this.address=address;
  this.rating=rating;
  }

  public String getResult()
  {
      String res=this.name+" "+this.address+" "+" "+this.rating;
       return res;
  }

}