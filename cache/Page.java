package cache;

import java.io.IOException;
import java.net.URL;

public class Page {
    // fields
    private URL url;
    private String content;
    private static Cache cache = new Cache();

    // constructor
    /**
     * Make a new Page for a URL, downloading it immediately. Throws IOException
     * if an error occurs accessing the web server.
     */
    public Page(URL url) throws IOException {
        this.url = url;
        if (download()) {
            cache.put(this);
        }
    }
   public URL getURL() {
        return url;
    }
    public String getContent() {
        return content;
    }
    public static Cache getCache() {
        return cache;
    }
    /**
     * Download the page from the web server. Returns true if successful, false
     * if an error occurs.
     */
    private boolean download() throws IOException {
        content = Web.download(url);
        return true;
    }
}
