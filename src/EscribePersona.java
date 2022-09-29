import java.io.*;
import java.util.Scanner;

public class EscribePersona {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        File f = new File("res" + File.separator + "personas.dat");

        //Si no existe se genera
        if(!f.exists()){

            try {
                //1. CREAR FLUJO DE INFORMACIÓN BINARIO
                //Fichero de salida
                DataOutputStream fout = new DataOutputStream(new FileOutputStream(f));

                //2. SOLICITAR DATOS AL USUARIO
                String nombre;
                int edad;

                System.out.println("Introduce el nombre del cliente");
                nombre = sn.nextLine();
                System.out.println("Introduce la edad");
                edad = sn.nextInt();

                //3. ESCRIBIR DATOS EN EL FICHERO
                fout.writeUTF(nombre);  //para las cadenas se usa este método
                fout.writeInt(edad);


                //4. CERRAR FICHERO
                fout.close();
            }catch (IOException e){
                System.out.println("Error en escritura de fichero");
            }


        }else{
            System.out.println("El fichero no se puede sobreescribir");
        }

    }

}
