package proxy;

/**
 *
 * @author Joonas
 */
public class RealImage implements Image {
    private String filename = null;
    
    public RealImage(final String filename){
        this.filename = filename;
        loadImageFromDisk();
    }
    
    private void loadImageFromDisk() {
        System.out.print("Loading "+filename);
    }
    
    public void displayImage(){
        System.out.println("Displaying "+filename);
    }
    
    public void showData(){
        System.out.println("Showing data "+filename);
    }

}
