/*
 * FileListFilter.java
 *
 * Created on January 25, 2004, 11:28 AM
 */

package abook.ajava.ioToy.file;
import java.io.*;
import java.util.Date;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class FileListFilter implements FilenameFilter {
    private String fName;
    private String fExtension;
    
    /** Creates a new instance of FileListFilter */
    public FileListFilter(String name, String extension) {
        fName = name;
        fExtension = extension;
    }
    
    public boolean accept(java.io.File file, String str) {
        boolean fileOK = true;
        if(fName != null) 
            fileOK &= str.startsWith(fName);
        
        if(fExtension != null) 
            fileOK &= str.endsWith('.'+fExtension);
        return fileOK;
    }
    
}
