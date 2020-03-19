package cr.una;

import java.awt.Font;
import java.io.InputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Fuentes {
    private Font font = null;
    public String RIO = "open-sans.bold.ttf";
    public String BPR = "Arial";
    public String ITROMATRIC = "ltromatic.ttf";
    private static final Logger logger = LogManager.getLogger(Fuentes.class);


    public Font fuente( String fontName, int estilo, float tamanio)
    {
        try {
            logger.debug("Hello from Log4j 2");
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}