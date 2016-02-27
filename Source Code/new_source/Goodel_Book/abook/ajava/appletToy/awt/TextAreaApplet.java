/*
 * TextAreaApplet.java
 *
 * Created on February 10, 2004, 9:07 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;

/**
 *
 * @author  bbhariyanto
 */
public class TextAreaApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        String msg = 
            "Untuk menjadi kuat, kamu harus seperti air. \n" +
            "Jika tidak ada halangan, ia mengalir;  \n" +
            "Jika ada halangan, ia berhenti;  \n" +
            "Jika bendungannya jebol, maka ia mengalir lebih jauh;  \n" +
            "Jika bencananya berbentuk persegi, bentuknya menjadi persegi;  \n" +
            "Jika bencananya berbentuk bundar, maka bentuknya menjadi bundar;  \n" +
            "Karena ia begitu lembut dan fleksibel,  \n" +
            "air adalah benda yang paling penting dan paling kuat. \n" +
            " -- Lao Tzu -- \n" +
            "\n"+
            "Salah satu pertanyaan utama adalah apakah hidup kita akan berakhir setelah kematian. \n" +
            "Menurut jawaban kita, kita yakin atau tidak yakin terhadap keabadian, \n" +
            "dan hal ini menentukan berbagai tindakan kita. \n" +
            "Oleh karena itu, tugas utama hidup kita adalah memutuskan apa yang sementara \n" +
            "dan apa yang kekal dalam diri kita. \n"+
            "Jadi, kita hendaknya memperhatikan hal-hal yang bersifat kekal. \n" +
            "Kebanyakan orang melakukan hal-hal yang benar-benar berlawanan. \n" +
            " -- Leo Tolstoy dalam kutipan dari Blaise Pascal -- \n"
            ;
        
        TextArea ta = new TextArea(msg, 10, 40);
        add(ta);
    }
    
}
