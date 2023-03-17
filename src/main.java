import java.util.Scanner;



    public class main {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            Scanner s = new Scanner(System.in);
            String opc = "";

            while(!opc.equalsIgnoreCase("N")){
                System.out.println("Volver a gestionar S o N");
                opc = s.next();
                if(opc.equalsIgnoreCase("S")){
                    System.out.print("Ingrese la opcion para la operacion que desee realizar:  \n"
                            + "1: Para realizar un registro de llamada \n"
                            + "2: Para mostrar informacion de la linea local \n"
                            + "3: Para mostrar informacion de la linea a distacia \n"
                            + "4: Para mostrar informacion de la linea celular \n"
                            + "5: Para mostrar Consolidado total \n"
                            + "6: Para reiniciar informacion de la linea local \n"
                            + "7: Para reiniciar informacion de la linea distancia \n"
                            + "8: Para reiniciar informacion de la linea celular \n"
                            + "Ingresar opcion: ");
                    int option = leer.nextInt();
                    GastosTelefonicos gestion = new GastosTelefonicos();
                    if(option == 1){
                        gestion.registrarLlamada();
                    }else if(option == 2){
                        gestion.mostrarInformacionLocal();
                    }else if(option == 3){
                        gestion.mostrarInformacionDistancia();
                    }else if(option == 4){
                        gestion.mostrarInformacionCelular();
                    }else if(option == 6){
                        gestion.reiniciarLineaLocal();
                    }else if(option == 7){
                        gestion.reiniciarLineaDistancia();
                    }else if(option == 8){
                        gestion.reiniciarLineaCelular();
                    }
                }else if(!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")){
                    System.out.println("Error");
                }
            }

            System.out.println("Gracias por gestionar con nosotros");


        }
    }
