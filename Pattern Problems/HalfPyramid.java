// *
// **    
// ***
// ****


class HalfPyramid{
    public static void main(String[] args){
        // System.out.println(args.length);
        if(args.length > 0){
            int input = Integer.parseInt(args[0]);
            printLeftHalfPyramid(input);
            
        }
        else{
            System.out.println("No argumnet provided. Please provide command line arguments.");
        }
    }

    static void printLeftHalfPyramid(int input){
        for(int i =0; i<input;i++){
                for(int j =0; j< i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}