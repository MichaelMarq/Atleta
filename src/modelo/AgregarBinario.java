
package modelo;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class AgregarBinario extends ObjectOutputStream{

    public AgregarBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AgregarBinario() throws IOException, SecurityException {
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        File archivo = new File("registroAtletas.bin");
        
        if(archivo.length() == 0){//Si el archivo esta vacio toca colocar la cabezera
            super.writeStreamHeader();
        }
        else{//toca ignorar la cabezera y seguir escribiendo
            reset();
        }
         
    }
    
    


    
    
    
    
    
}
