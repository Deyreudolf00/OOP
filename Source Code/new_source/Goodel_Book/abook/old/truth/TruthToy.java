package abook.old.truth;

public class TruthToy {
    private int numberOfVars;
    private int numberOfSeq;
    private boolean[][] bool;
    
    /** Creates a new instance of TruthToy */
    public TruthToy(int numberOfVars) {
        this.numberOfVars = numberOfVars;
        int numberOfSeq = (int) Math.pow(2.0,numberOfVars);
        
        bool = new boolean[numberOfSeq][numberOfVars];
        for(int i=0;i<numberOfVars;i++){
            for(int j=0;j<numberOfSeq;j++){
                
            }
        }
    }
    
    private void makeTruthTable(){
    }
    
    private void mt(){
    	for (int i=0;i<numberOfSeq;i++)
        
    		for(int j=0;j<numberOfVars;j++) 
    			bool[i][j] = true;
    }
    
    static void test(){
        
    }
    
    public static void main(String[] args){
        
    }
    
}
