class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     public Chick(String type, String sound)
     {
     	myType = type;
     	mySound = sound;
     }
          public Chick(String type, String sound1,String sound2)
     {
     	myType = type;
     	if(Math.random()*2 > 1) mySound = sound1;
     	else mySound = sound2;
     }
     public Chick()
     {
     	myType = "chick";
     	mySound = "cluck";
     }
     public String getSound(){return mySound;}
     public String getType(){return myType;}

}