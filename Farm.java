class Farm 
{     
   private Animal[] aBunchofAnimals = new Animal[3];
   public Farm()
   {
   	aBunchofAnimals[0] = new NamedCow("cow","Elsie","moo");
   	aBunchofAnimals[1] = new Chick("chick","cluck","cheep");
   	aBunchofAnimals[2] = new Pig("pig","oink");
   }
   public void animalSounds()
   {
   	for(int nI=0; nI < aBunchofAnimals.length; nI++)
   		{System.out.println(aBunchofAnimals[nI].getType() + " goes " + aBunchofAnimals[nI].getSound());}
   	System.out.println("The cow is known as " + ((NamedCow)aBunchofAnimals[0]).getName());
   }

}
