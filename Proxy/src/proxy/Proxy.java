package proxy;

import java.util.ArrayList;
import java.util.List;



public class Proxy {


    public static void main(String[] args) {
        List<Image> images = new ArrayList();
        
        final Image IMAGE1 = new ProxyImage("Photo1");
        final Image IMAGE2 = new ProxyImage("Photo2");
        images.add(IMAGE1);
        images.add(IMAGE2);
        
        images.forEach((img) -> img.showData());
        
        images.forEach((img) -> img.displayImage());
    }
    
}
