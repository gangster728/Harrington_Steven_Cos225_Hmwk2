public class Grove {

    //make a instance of tree called grove
    //make another variable to name the grove
    public Tree grove[];
    String GroveName;

    //Implements a constructor that creates a grove of size 16 called GroveName
    //then if goes through each spot of the array and sets them empty
    public Grove(String GroveName){
        this.GroveName = GroveName;
        grove = new Tree[16];
        for(int i = 0;i < 16; i++){
            grove[i] = null;
        }
    }


    //Makes a method called addTree(), that takes a Tree object and returns a int
    public int addTree(Tree tree){

        //looks through each spot in the array grove
        for(int i = 0; i < grove.length;i++){

            //looks to see if the spot is open
            if (grove[i] == null){
                grove[i] = tree;
                return i;
            }
            
        }
        //returns -1 incase it doesn't find a open space
        return -1;
    }

    //makes a method called removeTree() that takes a int and returns a Tree object
    public Tree removeTree(int i){

        //sets the obejct CurrentTree to the specified index
        Tree CurrentTree = grove[i];

        //sets the index to empty or null
        grove[i] = null;

        //returns the CurrentTree object
        return CurrentTree;
    }

    //Create a method called toString()
    public String toString(){

        //creates a int and sets it to 0
        int ArrayTrees = 0;

        //goes through each value in the array
        for(int i = 0; i < grove.length;i++){

            //checks to see if there is something in them
            if(grove[i] != null){

                //adds one to the int ArrayTrees
                ArrayTrees = ArrayTrees + 1;
            }
        }
        
        //returns the number of elements in the array taken up by a tree
        return "" + ArrayTrees;
        

    }
}
