public class GroveTester {

    //creates a main function for us to run
    public static void main(String args[]){

        //creates a new Grove object named Grove1
        Grove Grove1 = new Grove("Grove 1");

        //Prints out Grove1 utilizing the toString() method
        System.out.println(Grove1);

        //creates 6 Tree objects of Spruce and age 37
        //add them to the array Grove1
        for(int i = 0; i < 6;i++){

            Tree Spruce = new Tree(i,37,"Spruce");

            Grove1.addTree(Spruce);

        }

        //Prints out Grove1 utilizing the toString() method
        System.out.println(Grove1);

        //removes the tree from Grove1's index 3
        Grove1.removeTree(3);

        //removes the tree from Grove1's index 5
        Grove1.removeTree(5);

        //Prints out Grove1 utilizing the toString() method
        System.out.println(Grove1);

        //Creates a new Tree object named maple
        //Maple is identified as a maple tree and age 13
        Tree Maple = new Tree(7,13,"Maple");
        
        //adds the maple tree to the array Grove1
        Grove1.addTree(Maple);
        
        //Prints out Grove1 utilizing the toString() method
        System.out.println(Grove1);
    }
    
}
