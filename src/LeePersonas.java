import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeePersonas {

    public static void main(String[] args) {
        File f = new File("res" + File.separator + "personas.dat");

        if(f.exists()){

            try {
                //1. CREAR FLUJO DE INFORMACIÓN BINARIO
                DataInputStream fiut = new DataInputStream(new FileInputStream(f));

                //2. LEEMOS EL FICHERO
                System.out.println("Nombre: " + fiut.readUTF());
                System.out.println("Edad:" + fiut.readInt());

                //3.  CERRAMOS EL FICHERO
                fiut.close();

            }catch (IOException e){
                System.out.println("Error de lectura del fihero");
            }

        }else{
            System.out.println("El fichero no existe");
        }
    }

}
