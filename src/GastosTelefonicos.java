

import java.util.Scanner;

//nicolas quintero
    public class GastosTelefonicos {
        int minutoLocal = 50;
        int minutoLargaDistancia = 1200;
        int minutoLLamadaCedular = 850;
        int saldoLocal;
        int saldoDistancia;
        int saldoCelular;
        int nLlamadasLocal = 0;
        int nLlamadasDistancia = 0;
        int nLlamadasCelular = 0;
        Scanner teclado = new Scanner(System.in);

        public GastosTelefonicos(){}

        public void registrarLlamada(){
            System.out.print("Indique a que linea desea registar la llamada [1=local, 2=larga distancia, 3=celular]: ");
            int seleccionUsuario = teclado.nextInt();
            if(seleccionUsuario == 1){
                this.nLlamadasLocal = this.nLlamadasLocal + 1;
                this.saldoLocal = this.nLlamadasLocal * this.minutoLocal;
                System.out.println("Saldo de llamadas locales es" + this.saldoLocal);
            }else if(seleccionUsuario == 2){
                this.nLlamadasDistancia = this.nLlamadasDistancia + 1;
                this.saldoDistancia = this.nLlamadasDistancia * this.minutoLargaDistancia;
                System.out.println("Saldo de llamadas a distancias es de" + this.saldoDistancia);
            }else if(seleccionUsuario == 3){
                this.nLlamadasCelular = this.nLlamadasCelular + 1;
                this.saldoCelular = this.nLlamadasCelular * this.minutoLLamadaCedular;
                System.out.println("Saldo de llamadas a distancias es de" + this.saldoCelular);
            }
        }

        public void mostrarInformacionLocal(){
            System.out.println("Numero de llamadas realizadas locales: " + this.nLlamadasLocal + ", Costo de total de las llamadas locales es de " + this.saldoLocal);
        }

        public void mostrarInformacionDistancia(){
            System.out.println("Numero de llamadas realizadas a distancia: " + this.nLlamadasDistancia + ", Costo de total de las llamadas a distancia es de " + this.saldoDistancia);
        }

        public void mostrarInformacionCelular(){
            System.out.println("Numero de llamadas realizadas a celular es de : " + this.nLlamadasCelular + ", Costo de total de las llamadas a celular es de " + this.saldoCelular);
        }

        public void reiniciarLineaLocal(){
            this.minutoLocal = 50;
            this.saldoLocal = 0;
            this.nLlamadasLocal = 0;
        }

        public void reiniciarLineaDistancia(){
            this.minutoLargaDistancia = 50;
            this.saldoDistancia = 0;
            this.nLlamadasDistancia = 0;
        }

        public void reiniciarLineaCelular(){
            this.minutoLLamadaCedular = 50;
            this.saldoCelular = 0;
            this.nLlamadasCelular = 0;
        }
    }

