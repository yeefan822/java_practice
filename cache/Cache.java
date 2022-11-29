package cache;

import java.net.URL;
import java.util.HashMap;
public class Cache {
    private Page[] cache = new Page[100]; // contains Pages and null references
    private int cachePointer = 0; // index of next slot available for a page
        
    /*
     * Returns a cached Page object p such that p.getURL() is url.
     * Returns null if no page for url found in the cache.
     */
    public Page get(URL url) {
        for (Page p : cache) {
            if (p == null) continue;
            else if (p.getURL().equals(url)) return p;
        }
        return null;
    }
    
    /*
     * Store page in the cache.
     */
    public void put(Page page) {
        cache[cachePointer] = page;
        ++cachePointer;
        if (cachePointer >= cache.length) cachePointer = 0;
    }   
}