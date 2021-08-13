/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_mansourrumman;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_MansourRumman {
    
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<carros> c = new ArrayList();
        while (opcion != 6) {
            System.out.println("1. crear carro \n"
                    + "2. modificar carro\n"
                    + "3. eliminar carro\n"
                    + "4. mostrar carros \n"
                    + "5. calculo\n"
                    + "6. salida");
            opcion = s.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("ingrese el tipo de carro que quiere ingresar \n"
                            + "1.combustion\n"
                            + "2.hybrido\n"
                            + "3.hybridoenchufable\n"
                            + "4.electrico\n"
                            + "ingrese su opcion\n");
                    int ch = s.nextInt();
                    switch (ch) {
                        case 1: {
                            System.out.println("ingrese el modelo del carro");
                            String modelo = s.next();
                            System.out.println("ingrese caceria del carro");
                            String caseria = s.next();
                            System.out.println("ingrese el VIN");
                            int VIN = s.nextInt();
                            System.out.println("ingrese la cantidad de pasajeros");
                            int cantp = s.nextInt();
                            System.out.println("ingrese la capacidad del maletero");
                            int capm = s.nextInt();
                            System.out.println("ingrese el tipo de cambio automatico/manual");
                            String tipo = s.next();
                            System.out.println("ingrese el consumo de combustible");
                            int concomb = s.nextInt();
                            System.out.println("ingrese la duracion del aceite");
                            int durara = s.nextInt();
                            System.out.println("ingrese la maxima velocidad");
                            int maxv = s.nextInt();
                            c.add(new combustion(tipo, concomb, durara, maxv, modelo, caseria, VIN, cantp, capm));
                            break;
                        }
                        case 2: {
                            System.out.println("ingrese el modelo del carro");
                            String modelo = s.next();
                            System.out.println("ingrese caceria del carro");
                            String caseria = s.next();
                            System.out.println("ingrese el VIN");
                            int VIN = s.nextInt();
                            System.out.println("ingrese la cantidad de pasajeros");
                            int cantp = s.nextInt();
                            System.out.println("ingrese la capacidad del maletero");
                            int capm = s.nextInt();
                            System.out.println("ingrese capacidad de la bateria");
                            int cbat = s.nextInt();
                            System.out.println("ingrese capacidad del motor electrico");
                            int cmot = s.nextInt();
                            c.add(new hybridos(cbat, cmot, modelo, caseria, VIN, cantp, capm));
                            break;
                        }
                        case 3: {
                            System.out.println("ingrese el modelo del carro");
                            String modelo = s.next();
                            System.out.println("ingrese caceria del carro");
                            String caseria = s.next();
                            System.out.println("ingrese el VIN");
                            int VIN = s.nextInt();
                            System.out.println("ingrese la cantidad de pasajeros");
                            int cantp = s.nextInt();
                            System.out.println("ingrese la capacidad del maletero");
                            int capm = s.nextInt();
                            System.out.println("es de 4X4 el carro si/no");
                            String tipo = s.next();
                            System.out.println("ingrese la cantidad de kilometros que puede recorrer en electrico");
                            int cank = s.nextInt();
                            System.out.println("ingrese la cantidasd de motores");
                            int cmotores = s.nextInt();
                            System.out.println("ingrese la capacidad a remolcar");
                            int cremol = s.nextInt();
                            c.add(new phev(tipo, cank, cmotores, cremol, modelo, caseria, VIN, cantp, capm));
                            break;
                        }
                        case 4: {
                            System.out.println("ingrese el modelo del carro");
                            String modelo = s.next();
                            System.out.println("ingrese caceria del carro");
                            String caseria = s.next();
                            System.out.println("ingrese el VIN");
                            int VIN = s.nextInt();
                            System.out.println("ingrese la cantidad de pasajeros");
                            int cantp = s.nextInt();
                            System.out.println("ingrese la capacidad del maletero");
                            int capm = s.nextInt();
                            System.out.println("cantidad de kilometros que puede recorrer");
                            int auto = s.nextInt();
                            System.out.println("ingrese la cantidad de baterias que almacena");
                            int bat = s.nextInt();
                            System.out.println("ingrese la aceleracion");
                            int acel = s.nextInt();
                            System.out.println("ingrese la duracion de la carga");
                            int dura = s.nextInt();
                            c.add(new elec(auto, bat, acel, dura, modelo, caseria, VIN, cantp, capm));
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("ingrese posicion del carro a modificar");
                    int pos = s.nextInt();
                    if (c.get(pos) instanceof combustion) {
                        System.out.println("ingrese el dato a modificar \n"
                                + "1.modelo\n"
                                + "2.ceceria\n"
                                + "3. vin\n"
                                + "4.pasajeros cant\n"
                                + "5. capaciadad del maletero\n"
                                + "6. combustible duracion\n"
                                + "7. duracion del aceite\n"
                                + "8.maxv\n"
                                + "9.cambio\n"
                                + "ingrese su opcion\n");
                        int cam = s.nextInt();
                        switch (cam) {
                            case 1: {
                                System.out.println("ingrese el nuevo modelo del carro");
                                String modelo = s.next();
                                c.get(pos).setModelo(modelo);
                                break;
                            }
                            case 2: {
                                System.out.println("ingrese  nuevo caceria del carro");
                                String caseria = s.next();
                                c.get(pos).setCaseria(caseria);
                                break;
                            }
                            case 3: {
                                System.out.println("ingrese el VIN");
                                int VIN = s.nextInt();
                                c.get(pos).setVIN(VIN);
                                break;
                            }
                            case 4: {
                                System.out.println("ingrese la cantidad de pasajeros");
                                int cantp = s.nextInt();
                                c.get(pos).setCantp(cantp);
                                break;
                            }
                            case 5: {
                                System.out.println("ingrese la capacidad del maletero");
                                int capm = s.nextInt();
                                c.get(pos).setCapm(capm);
                                break;
                            }
                            case 6: {
                                System.out.println("ingrese el consumo de combustible");
                                int concomb = s.nextInt();
                                ((combustion) c.get(pos)).setConcomb(concomb);
                                break;
                            }
                            case 7: {
                                System.out.println("ingrese la duracion del aceite");
                                int durara = s.nextInt();
                                ((combustion) c.get(pos)).setDurara(durara);
                                break;
                            }
                            case 8: {
                                System.out.println("ingrese la maxima velocidad");
                                int maxv = s.nextInt();
                                ((combustion) c.get(pos)).setMaxv(maxv);
                                break;
                            }
                            case 9: {
                                System.out.println("ingrese el tipo de cambio automatico/manual");
                                String tipo = s.next();
                                ((combustion) c.get(pos)).setCambio(tipo);
                                break;
                            }
                        }
                        
                    } else if (c.get(pos) instanceof hybridos) {
                        System.out.println("ingrese el dato a modificar \n"
                                + "1.modelo\n"
                                + "2.caceria\n"
                                + "3. VIN\n"
                                + "4.capacidad del pasajeros\n"
                                + "5.capacidad del maletero\n"
                                + "6.capacidad dela bateria\n"
                                + "6.capacidad dela motor\n"
                                + "ingrese su opcion\n");
                        int cam = s.nextInt();
                        switch (cam) {
                            case 1: {
                                System.out.println("ingrese el nuevo modelo del carro");
                                String modelo = s.next();
                                c.get(pos).setModelo(modelo);
                                break;
                            }
                            case 2: {
                                System.out.println("ingrese  nuevo caceria del carro");
                                String caseria = s.next();
                                c.get(pos).setCaseria(caseria);
                                break;
                            }
                            case 3: {
                                System.out.println("ingrese el VIN");
                                int VIN = s.nextInt();
                                c.get(pos).setVIN(VIN);
                                break;
                            }
                            case 4: {
                                System.out.println("ingrese la cantidad de pasajeros");
                                int cantp = s.nextInt();
                                c.get(pos).setCantp(cantp);
                                break;
                            }
                            case 5: {
                                System.out.println("ingrese la capacidad del maletero");
                                int capm = s.nextInt();
                                c.get(pos).setCapm(capm);
                                break;
                            }
                            case 6: {
                                System.out.println("ingrese capacidad de la bateria");
                                int cbat = s.nextInt();
                                ((hybridos) c.get(pos)).setCbat(cbat);
                                break;                                
                            }
                            case 7: {
                                System.out.println("ingrese capacidad del motor electrico");
                                int cmot = s.nextInt();
                                ((hybridos) c.get(pos)).setCmot(cmot);
                                break;
                            }                            
                            
                        }
                        
                        break;
                    } else if (c.get(pos) instanceof phev) {
                        System.out.println("ingrese el dato a modificar \n"
                                + "1.modelo\n"
                                + "2.caceria\n"
                                + "3. VIN\n"
                                + "4.capacidad del pasajeros\n"
                                + "5.capacidad del maletero\n"
                                + "6.capacidad dela kilometros\n"
                                + "7.cantidad de remolque\n"
                                + "8.si es 4X4\n"
                                + "9. cantidad de motores\n"
                                + "ingrese su opcion\n");
                        int cam = s.nextInt();
                        switch (cam) {
                            case 1: {
                                System.out.println("ingrese el nuevo modelo del carro");
                                String modelo = s.next();
                                c.get(pos).setModelo(modelo);
                                break;
                            }
                            case 2: {
                                System.out.println("ingrese  nuevo caceria del carro");
                                String caseria = s.next();
                                c.get(pos).setCaseria(caseria);
                                break;
                            }
                            case 3: {
                                System.out.println("ingrese el VIN");
                                int VIN = s.nextInt();
                                c.get(pos).setVIN(VIN);
                                break;
                            }
                            case 4: {
                                System.out.println("ingrese la cantidad de pasajeros");
                                int cantp = s.nextInt();
                                c.get(pos).setCantp(cantp);
                                break;
                            }
                            case 5: {
                                System.out.println("ingrese la capacidad del maletero");
                                int capm = s.nextInt();
                                c.get(pos).setCapm(capm);
                                break;
                            }
                            case 6: {
                                System.out.println("ingrese la cantidad de kilometros que puede recorrer en electrico");
                                int cank = s.nextInt();
                                ((phev) c.get(pos)).setCank(cank);
                                break;
                            }
                            case 7: {
                                System.out.println("ingrese la capacidad a remolcar");
                                int cremol = s.nextInt();
                                ((phev) c.get(pos)).setCremol(cremol);
                                break;
                            }
                            case 8: {
                                System.out.println("es de 4X4 el carro si/no");
                                String tipo = s.next();
                                ((phev) c.get(pos)).setTipo(tipo);
                                break;
                            }
                            case 9: {
                                System.out.println("ingrese la cantidasd de motores");
                                int cmotores = s.nextInt();
                                ((phev) c.get(pos)).setCmotores(cmotores);
                                break;
                            }
                        }
                    }
                    else if(c.get(pos) instanceof elec){
                          System.out.println("ingrese el dato a modificar \n"
                                + "1.modelo\n"
                                + "2.caceria\n"
                                + "3. VIN\n"
                                + "4.capacidad del pasajeros\n"
                                + "5.capacidad del maletero\n"
                                + "6.kilometros que recorre\n"
                                + "7.cantidad de baterias\n"
                                + "8.aceleraccion\n"
                                + "9. tiempo que dura la carga\n"
                                + "ingrese su opcion\n");
                        int cam = s.nextInt();
                        switch (cam) {
                            case 1: {
                                System.out.println("ingrese el nuevo modelo del carro");
                                String modelo = s.next();
                                c.get(pos).setModelo(modelo);
                                break;
                            }
                            case 2: {
                                System.out.println("ingrese  nuevo caceria del carro");
                                String caseria = s.next();
                                c.get(pos).setCaseria(caseria);
                                break;
                            }
                            case 3: {
                                System.out.println("ingrese el VIN");
                                int VIN = s.nextInt();
                                c.get(pos).setVIN(VIN);
                                break;
                            }
                            case 4: {
                                System.out.println("ingrese la cantidad de pasajeros");
                                int cantp = s.nextInt();
                                c.get(pos).setCantp(cantp);
                                break;
                            }
                            case 5: {
                                System.out.println("ingrese la capacidad del maletero");
                                int capm = s.nextInt();
                                c.get(pos).setCapm(capm);
                                break;
                            }
                            case 6: {
                            System.out.println("cantidad de kilometros que puede recorrer");
                            int auto = s.nextInt();
                            ((elec)c.get(pos)).setAuto(auto);
                                break;
                            }
                            case 7: {
                            System.out.println("ingrese la cantidad de baterias que almacena");
                            int bat = s.nextInt();
                            ((elec)c.get(pos)).setBat(bat);
                                break;
                            }
                            case 8: {
                            System.out.println("ingrese la aceleracion");
                            int acel = s.nextInt();
                            ((elec)c.get(pos)).setAcel(acel);
                             break;
                            }
                            case 9: {
                            System.out.println("ingrese la duracion de la carga");
                            int dura = s.nextInt();
                            ((elec)c.get(pos)).setDurar(dura);
                                break;
                            }
                        }
                        
                    }
                }
                
                case 3: {
                    System.out.println("ingrese posicion del carro");
                    int pos = s.nextInt();
                    c.remove(pos);
                    break;
                }
                case 4: {
                    for (int i = 0; i < c.size(); i++) {
                        System.out.print(i + ". " + c.get(i) + "\n");
                    }
                    break;
                }
                case 5: {
                    System.out.println("ingrese la posicion del carro a calcular");
                    int pos=s.nextInt();
                    try{
                          System.out.println(c.get(pos).calc());
                    }catch(excepcion e){
                        System.out.println("el carro se desgasta muy rapido");
                    }
                }
            }
        }
    }
}
