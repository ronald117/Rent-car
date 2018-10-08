package proyecto;

import javax.swing.JOptionPane;

public class Rutinas {

    static Auto arregloAuto1[] = new Auto[10];

    public static void llenaArregloAuto() {

        arregloAuto1[0] = new Auto("1111", 2, "toyota", "diesel", "manual", "2");
        arregloAuto1[1] = new Auto("2222", 4, "suzuki", "super", "manual", "5");
        arregloAuto1[2] = new Auto("3333", 4, "isuzu", "gas", "manual", "5");
        arregloAuto1[3] = new Auto("4444", 4, "toyota", "diesel", "automatico", "5");
        arregloAuto1[4] = new Auto("5555", 2, "nissan", "gas", "automatico", "2");
        arregloAuto1[5] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
        arregloAuto1[6] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
        arregloAuto1[7] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
        arregloAuto1[8] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
        arregloAuto1[9] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");

    }

    public static void agregaAuto() {
        System.out.println("\n\n\n\n");
        int i = 0;
        int indice = 0;

        String vacio = "vacio";
        int control = 0;

        for (i = 0; i < arregloAuto1.length; i++) {

            if (vacio.equals(arregloAuto1[i].getIdauto())) {
                indice = i;
                control = 1;

            }

        }//Fin de for

        if (control == 1) {

            String id = JOptionPane.showInputDialog("Digite el id");
            int cantP = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de puertas"));
            String marca = JOptionPane.showInputDialog("Digite la marca");
            String combustible = JOptionPane.showInputDialog("Digite tipo de combustible");
            String transmision = JOptionPane.showInputDialog("Digite el tipo de transmision");
            String capacidad = JOptionPane.showInputDialog("Digite la capacidad del auto");

            arregloAuto1[indice].setIdauto(id);
            arregloAuto1[indice].setPuertas(cantP);
            arregloAuto1[indice].setMarca(marca);
            arregloAuto1[indice].setCombustible(combustible);
            arregloAuto1[indice].setTransmision(transmision);
            arregloAuto1[indice].setCapacidad(capacidad);

            Rutinas.imprimeArregloAuto();

        } else {
            System.out.println("NO EXISTE UN ESPACIO VACIO");
            // System.out.println("NO EXISTE UN ESPACIO VACIO");
        }

        Rutinas.menuAutos();
    }//Fin de agregaAuto

    public static void modificaAuto() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloAuto1.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloAuto1[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlModificar = 1;

        while (controlModificar == 1) {

            int numeroAuto = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de auto que desea modificar 1-10"));

            if (numeroAuto >= 0 && numeroAuto <= 10) {

                numeroAuto = numeroAuto - 1;
                String idAuto = "";
                int puertas = 0;
                String marca = "";
                String combustible = "";
                String transmision = "";
                String capacidad = "";
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea modificar \n 1: ID AUTO \n 2: # PUERTAS \n 3: MARCA \n 4: TIPO COMBUSTIBLE \n 5: TRANSMISION \n 6: CAPASIDAD"));
                switch (op) {
                    case 1:
                        idAuto = JOptionPane.showInputDialog(null, "Escriba el nuevo id ");
                        arregloAuto1[numeroAuto].setIdauto(idAuto);
                        break;
                    case 2:
                        puertas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el nuevo numero de puertas"));
                        arregloAuto1[numeroAuto].setPuertas(puertas);
                        break;
                    case 3:
                        marca = JOptionPane.showInputDialog(null, "Escriba la nueva marca");
                        arregloAuto1[numeroAuto].setMarca(marca);
                        break;
                    case 4:
                        combustible = JOptionPane.showInputDialog(null, "Escriba tipo de combustible");
                        arregloAuto1[numeroAuto].setCombustible(combustible);
                        break;
                    case 5:
                        transmision = JOptionPane.showInputDialog(null, "Escriba el tipo de transmision");
                        arregloAuto1[numeroAuto].setTransmision(transmision);
                        break;
                    case 6:
                        capacidad = JOptionPane.showInputDialog(null, "Escriba la capasidad");
                        arregloAuto1[numeroAuto].setCapacidad(capacidad);

                        break;
                    default:
                        break;

                }//Fin del switch

                controlModificar = 2;
            } else {

                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else

        }//Fin del ciclo   
        Rutinas.menuAutos();
    }//Fin de modifica auto

    public static void eliminaAuto() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloAuto1.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloAuto1[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlEliminar = 1;

        while (controlEliminar == 1) {

            int idAuto = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de auto que desea modificar 1-10"));
            if (idAuto >= 0 && idAuto <= 10) {

                idAuto = idAuto - 1;
                arregloAuto1[idAuto] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
                System.out.println("\n");
                System.out.println("se a borrado con exito");
                System.out.println("\n");

                int c = 1;
                for (int i = 0; i < arregloAuto1.length; i++) {
                    System.out.println("NUMERO " + c + " " + arregloAuto1[i]);
                    c = c + 1;
                    controlEliminar = 2;
                }//Fin del for

            } else {//Fin del if
                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else
        }//Fin del ciclo   
        Rutinas.menuAutos();
    }//Fin de elimina auto

    public static void imprimeArregloAuto() {
        System.out.println("\n\n\n\n");
        System.out.println("\n");
        int c = 1;
        for (int i = 0; i < arregloAuto1.length; i++) {

            System.out.println("NUMERO " + c + " " + arregloAuto1[i]);
            c = c + 1;
        }//Fin del for
        Rutinas.menuAutos();
    }//Fin de imprime arreglo

    public static void buscaIdAuto() {
        System.out.println("\n\n\n\n");
        String idAuto = JOptionPane.showInputDialog("Escriba el id que desea buscar");

        int busqueda = 0;

        for (int k = 0; k < arregloAuto1.length; k++) {

            if (idAuto.equals(arregloAuto1[k].getIdauto())) {
                System.out.println("El id  del auto fue encontrado");
                System.out.println(arregloAuto1[k]);
                busqueda = 1;
            }

        }//Fin de for

        if (busqueda == 0) {
            System.out.println("El id no fue encontrado");
        }
        Rutinas.menuAutos();
    }//Fin de buscaAuto

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    static Cliente arregloCliente[] = new Cliente[10];

    public static void llenaArregloCliente() {
        System.out.println("\n\n\n\n");
        arregloCliente[0] = new Cliente("114000574", "Ronald", 84829540, "san jose");
        arregloCliente[1] = new Cliente("123456789", "joshua", 88390610, "alajuela");
        arregloCliente[2] = new Cliente("951753285", "jesica", 83330743, "limon");
        arregloCliente[3] = new Cliente("465798123", "kervin", 22290218, "cartago");
        arregloCliente[4] = new Cliente("456123456", "Briana", 22920044, "san jose");
        arregloCliente[5] = new Cliente("vacio", "vacio", 0, "vacio");
        arregloCliente[6] = new Cliente("vacio", "vacio", 0, "vacio");
        arregloCliente[7] = new Cliente("vacio", "vacio", 0, "vacio");
        arregloCliente[8] = new Cliente("vacio", "vacio", 0, "vacio");
        arregloCliente[9] = new Cliente("vacio", "vacio", 0, "vacio");

    }

    public static void agregaCliente() {
        System.out.println("\n\n\n\n");
        int i = 0;
        int indice = 0;

        String vacio = "vacio";
        int control = 0;

        for (i = 0; i < arregloCliente.length; i++) {

            if (vacio.equals(arregloCliente[i].getCedula())) {
                indice = i;
                control = 1;

            }//Fin del if
            System.out.println("");

        }//Fin de for

        if (control == 1) {

            String cedula = JOptionPane.showInputDialog("Digite la cedula");
            String nombre = JOptionPane.showInputDialog("Digite el nombre");
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono"));
            String direccion = JOptionPane.showInputDialog("Digite tipo de combustible");

            arregloCliente[indice].setCedula(cedula);
            arregloCliente[indice].setNombre(nombre);
            arregloCliente[indice].setTelefono(telefono);
            arregloCliente[indice].setDireccion(direccion);

            Rutinas.imprimeArregloCliente();

        } else {
            System.out.println("NO EXISTE UN ESPACIO VACIO");
            // System.out.println("NO EXISTE UN ESPACIO VACIO");
        }
        Rutinas.menuCliente();
    }//Fin de agrega cliente

    public static void modificaCliente() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloCliente.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloCliente[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlModificar = 1;

        while (controlModificar == 1) {

            int numeroCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de cliente que desea modificar 1-10"));

            if (numeroCliente >= 0 && numeroCliente <= 10) {

                numeroCliente = numeroCliente - 1;

                String cedula = "";
                String nombre = "";
                int telefono = 0;
                String direccion = "";
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea modificar \n 1: CEDULA \n 2: NOMBRE \n 3: TELEFONO \n 4: DIRECCION "));
                switch (op) {
                    case 1:
                        cedula = JOptionPane.showInputDialog(null, "Escriba la nueva cedula ");
                        arregloCliente[numeroCliente].setCedula(cedula);
                        break;
                    case 2:
                        nombre = JOptionPane.showInputDialog(null, "Escriba nuevo nombre");
                        arregloCliente[numeroCliente].setNombre(nombre);
                        break;
                    case 3:
                        telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba nuevo telefono"));
                        arregloCliente[numeroCliente].setTelefono(telefono);
                        break;
                    case 4:
                        direccion = JOptionPane.showInputDialog(null, "Escriba nueva direccion");
                        arregloCliente[numeroCliente].setDireccion(direccion);
                        break;
                    default:
                        break;

                }//Fin del switch

                controlModificar = 2;
            } else {

                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else

        }//Fin del ciclo   
        Rutinas.menuCliente();
    }//Fin de modificaCliente

    public static void eliminaCliente() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloCliente.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloCliente[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlEliminar = 1;

        while (controlEliminar == 1) {

            int idCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de cliente que desea eliminar 1-10"));
            if (idCliente >= 0 && idCliente <= 10) {

                idCliente = idCliente - 1;
                arregloCliente[idCliente] = new Cliente("vacio", "vacio", 0, "vacio");
                System.out.println("\n");
                System.out.println("se a borrado con exito");
                System.out.println("\n");

                int c = 1;
                for (int i = 0; i < arregloCliente.length; i++) {
                    System.out.println("NUMERO " + c + " " + arregloCliente[i]);
                    c = c + 1;
                    controlEliminar = 2;
                }//Fin del for

            } else {//Fin del if
                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else
        }//Fin del ciclo   
        Rutinas.menuCliente();
    }//Fin de elimina cliente

    public static void imprimeArregloCliente() {
        System.out.println("\n\n\n\n");
        System.out.println("\n");
        int c = 1;
        for (int i = 0; i < arregloCliente.length; i++) {

            System.out.println("NUMERO " + c + " " + arregloCliente[i]);
            c = c + 1;
        }//Fin del for
        Rutinas.menuCliente();
    }//Fin de imprime cliente

    public static void buscaIdCliente() {
        System.out.println("\n\n\n\n");
        String idCliente = JOptionPane.showInputDialog("Escriba la cedula que desea buscar");

        int busqueda = 0;

        for (int k = 0; k < arregloCliente.length; k++) {

            if (idCliente.equals(arregloCliente[k].getCedula())) {
                System.out.println("El id  del auto fue encontrado");
                System.out.println(arregloCliente[k]);
                busqueda = 1;
            }

        }//Fin de for

        if (busqueda == 0) {
            System.out.println("El id no fue encontrado");
        }
        Rutinas.menuCliente();
    }//Fin de busca cliente

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    static Reservacion arregloReservacion[] = new Reservacion[10];

    public static void llenaArregloReserva() {

        arregloReservacion[0] = new Reservacion("123", "ronald", 22, "12:00", "1111");
        arregloReservacion[1] = new Reservacion("456", "joshua", 11, "18:00", "2222");
        arregloReservacion[2] = new Reservacion("789", "ronald", 15, "15:00", "3333");
        arregloReservacion[3] = new Reservacion("987", "ronald", 23, "19:00", "4444");
        arregloReservacion[4] = new Reservacion("645", "ronald", 14, "11:00", "5555");
        arregloReservacion[5] = new Reservacion("vacio", "vacio", 0, "vacio", "vacio");
        arregloReservacion[6] = new Reservacion("vacio", "vacio", 0, "vacio", "vacio");
        arregloReservacion[7] = new Reservacion("vacio", "vacio", 0, "vacio", "vacio");
        arregloReservacion[8] = new Reservacion("vacio", "vacio", 0, "vacio", "vacio");
        arregloReservacion[9] = new Reservacion("vacio", "vacio", 0, "vacio", "vacio");

    }

    public static void agregaReserva() {
        System.out.println("\n\n\n\n");
        int i = 0;
        int indice = 0;

        String vacio = "vacio";
        int control = 0;

        for (i = 0; i < arregloReservacion.length; i++) {

            if (vacio.equals(arregloReservacion[i].getIdAutoReserva())) {
                indice = i;
                control = 1;

            }

        }//Fin de for

        if (control == 1) {

            String idReserva = JOptionPane.showInputDialog("Digite id de la reserva");
            String cliente = JOptionPane.showInputDialog("Digite cliente de la reserva");
            int fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha"));
            String hora = JOptionPane.showInputDialog("Digite la hora");
            String idAuto = JOptionPane.showInputDialog("Digite id del auto");
            
            

            arregloReservacion[indice].setIdReservacion(idReserva);
            arregloReservacion[indice].setClienteReserva(cliente);
            arregloReservacion[indice].setFecha(fecha);
            arregloReservacion[indice].setHora(hora);
            arregloReservacion[indice].setIdAutoReserva(idAuto);
            

            Rutinas.imprimeArregloAuto();

        } else {
            System.out.println("NO EXISTE UN ESPACIO VACIO");
            // System.out.println("NO EXISTE UN ESPACIO VACIO");
        }
        
        
        
        
       
        
        
        
        Rutinas.menuReservacion();
    }//Fin de agregaReserva

    public static void modificaReserva() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloReservacion.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloReservacion[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlModificar = 1;

        while (controlModificar == 1) {

            int numeroReserva = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de reserva que desea modificar 1-10"));

            if (numeroReserva >= 0 && numeroReserva <= 10) {

                numeroReserva = numeroReserva - 1;

                String reserva = "";
                String cliente = "";
                int fecha = 0;
                String hora = "";
                String auto = "";
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea modificar \n 1: RESERVA \n 2: CLIENTE \n 3: FECHA \n 4: HORA \n 5: AUTO "));
                switch (op) {
                    case 1:
                        reserva = JOptionPane.showInputDialog(null, "Escriba el nuevo id de la reserva ");
                        arregloReservacion[numeroReserva].setIdReservacion(reserva);
                        break;
                    case 2:
                        cliente = JOptionPane.showInputDialog(null, "Escriba nuevo cliente de la reserva");
                        arregloReservacion[numeroReserva].setClienteReserva(cliente);
                        break;
                    case 3:
                        fecha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba nueva fecha de reserva"));
                        arregloReservacion[numeroReserva].setFecha(fecha);
                        break;
                    case 4:
                        hora = JOptionPane.showInputDialog(null, "Escriba nueva hora de reserva");
                        arregloReservacion[numeroReserva].setHora(hora);
                        break;
                    case 5:
                        auto = JOptionPane.showInputDialog(null, "Escriba nuevo auto para la reserva");
                        arregloReservacion[numeroReserva].setIdAutoReserva(reserva);
                        break;
                    default:
                        break;

                }//Fin del switch

                controlModificar = 2;
            } else {

                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else

        }//Fin del ciclo   
        Rutinas.menuReservacion();
    }//Fin de modificaReserva

    public static void eliminaReserva() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloReservacion.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloReservacion[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlEliminar = 1;

        while (controlEliminar == 1) {

            int idReserva = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de cliente que desea eliminar 1-10"));
            if (idReserva >= 0 && idReserva <= 10) {

                idReserva = idReserva - 1;
                arregloReservacion[idReserva] = new Reservacion("vacio", "vacio", 0, "vacio", "vacio");
                System.out.println("\n");
                System.out.println("se a borrado con exito");
                System.out.println("\n");

                int c = 1;
                for (int i = 0; i < arregloReservacion.length; i++) {
                    System.out.println("NUMERO " + c + " " + arregloReservacion[i]);
                    c = c + 1;
                    controlEliminar = 2;
                }//Fin del for

            } else {//Fin del if
                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else
        }//Fin del ciclo   
        Rutinas.menuReservacion();
    }//Fin de elimina Reserva

    public static void imprimeArregloReserva() {
        System.out.println("\n\n\n\n");
        System.out.println("\n");
        int c = 1;
        for (int i = 0; i < arregloReservacion.length; i++) {

            System.out.println("NUMERO " + c + " " + arregloReservacion[i]);
            c = c + 1;
        }//Fin del for
        Rutinas.menuReservacion();
    }//Fin de imprime reserva

    public static void buscaIdReserva() {
        System.out.println("\n\n\n\n");
        String idReserva = JOptionPane.showInputDialog("Escriba el id que desea buscar");

        int busqueda = 0;

        for (int k = 0; k < arregloReservacion.length; k++) {

            if (idReserva.equals(arregloReservacion[k].getIdReservacion())) {
                System.out.println("La reservacion fue encontrada");
                System.out.println(arregloReservacion[k]);
                busqueda = 1;
            }

        }//Fin de for

        if (busqueda == 0) {
            System.out.println("El reservacion no fue encontrada");
        }
        Rutinas.menuReservacion();
    }//Fin de busca reserva

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    static Pago arregloPago[] = new Pago[10];

    public static void llenaArregloPago() {

        arregloPago[0] = new Pago("123", "Ronald", 3000);
        arregloPago[1] = new Pago("456", "Joshua", 2000);
        arregloPago[2] = new Pago("789", "pedro", 5500);
        arregloPago[3] = new Pago("987", "brian", 6200);
        arregloPago[4] = new Pago("454", "allan", 4400);
        arregloPago[5] = new Pago("vacio", "vacio", 0);
        arregloPago[6] = new Pago("vacio", "vacio", 0);
        arregloPago[7] = new Pago("vacio", "vacio", 0);
        arregloPago[8] = new Pago("vacio", "vacio", 0);
        arregloPago[9] = new Pago("vacio", "vacio", 0);

    }

    public static void agregaPago() {
        System.out.println("\n\n\n\n");
        int i = 0;
        int indice = 0;

        String vacio = "vacio";
        int control = 0;

        for (i = 0; i < arregloPago.length; i++) {

            if (vacio.equals(arregloPago[i].getIdPago())) {
                indice = i;
                control = 1;

            }

        }//Fin de for

        if (control == 1) {

            String idPago = JOptionPane.showInputDialog("Digite el numero de pago");
            String PagoCliente = JOptionPane.showInputDialog("Digite el cliente");
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio"));

            arregloPago[indice].setIdPago(idPago);
            arregloPago[indice].setPagoCliente(PagoCliente);
            arregloPago[indice].setPrecio(precio);

            Rutinas.imprimeArregloPago();

        } else {
            System.out.println("NO EXISTE UN ESPACIO VACIO");
            // System.out.println("NO EXISTE UN ESPACIO VACIO");
        }
        Rutinas.menuPago();
    }//Fin de agrega pago

    public static void modificaPago() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloPago.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloPago[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlModificar = 1;

        while (controlModificar == 1) {

            int numeroPago = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de pago que desea modificar 1-10"));

            if (numeroPago >= 0 && numeroPago <= 10) {

                numeroPago = numeroPago - 1;

                String idPago = "";
                String cliente = "";
                int precio = 0;
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea modificar \n 1: ID PAGO \n 2: CLIENTE \n 3: PRECIO"));
                switch (op) {
                    case 1:
                        idPago = JOptionPane.showInputDialog(null, "Escriba el nuevo id de pago ");
                        arregloPago[numeroPago].setIdPago(idPago);
                        break;
                    case 2:
                        cliente = JOptionPane.showInputDialog(null, "Escriba nuevo cliente del pago");
                        arregloPago[numeroPago].setPagoCliente(cliente);
                        break;
                    case 3:
                        precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba nueva monto"));
                        arregloPago[numeroPago].setPrecio(precio);
                        break;

                    default:
                        break;

                }//Fin del switch

                controlModificar = 2;
            } else {

                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else

        }//Fin del ciclo   
        Rutinas.menuPago();
    }//Fin de modifica pago

    public static void eliminaPago() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloPago.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloPago[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlEliminar = 1;

        while (controlEliminar == 1) {

            int idPago = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de pago que desea eliminar 1-10"));
            if (idPago >= 0 && idPago <= 10) {

                idPago = idPago - 1;
                arregloPago[idPago] = new Pago("vacio", "vacio", 0);
                System.out.println("\n");
                System.out.println("se a borrado con exito");
                System.out.println("\n");

                int c = 1;
                for (int i = 0; i < arregloPago.length; i++) {
                    System.out.println("NUMERO " + c + " " + arregloPago[i]);
                    c = c + 1;
                    controlEliminar = 2;
                }//Fin del for

            } else {//Fin del if
                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else
        }//Fin del ciclo   
        Rutinas.menuPago();
    }//Fin de elimina pago

    public static void imprimeArregloPago() {
        System.out.println("\n\n\n\n");
        System.out.println("\n");
        int c = 1;
        for (int i = 0; i < arregloPago.length; i++) {

            System.out.println("NUMERO " + c + " " + arregloPago[i]);
            c = c + 1;
        }//Fin del for
        Rutinas.menuPago();
    }//Fin de impriime pago

    public static void buscaIdPago() {
        System.out.println("\n\n\n\n");
        String idPago = JOptionPane.showInputDialog("Escriba el id que desea buscar");

        int busqueda = 0;

        for (int k = 0; k < arregloPago.length; k++) {

            if (idPago.equals(arregloPago[k].getIdPago())) {
                System.out.println("La reservacion fue encontrada");
                System.out.println(arregloPago[k]);
                busqueda = 1;
            }

        }//Fin de for

        if (busqueda == 0) {
            System.out.println("El reservacion no fue encontrada");
        }
        Rutinas.menuPago();
    }//Fin de busca pago

    ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    static Sucursal arregloSucursal[] = new Sucursal[2];
    
    

    public static void llenaArregloSucursal() {

        arregloSucursal[0] = new Sucursal("1", "heredia", 0700, 25565230);
        arregloSucursal[1] = new Sucursal("2", "cartago", 0730, 22574682);
        
        

    }

    public static void agregaSucursal() {
        System.out.println("\n\n\n\n");
        int i = 0;
        int indice = 0;

        String vacio = "vacio";
        int control = 0;

        for (i = 0; i < arregloSucursal.length; i++) {

            if (vacio.equals(arregloSucursal[i].getIdSucursal())) {
                indice = i;
                control = 1;

            }//Fin del if
            System.out.println("");

        }//Fin de for

        if (control == 1) {

            String idSucursal = JOptionPane.showInputDialog("Digite el id de sucursal");
            String localizacion = JOptionPane.showInputDialog("Digite la localizacion");
            int horario = Integer.parseInt(JOptionPane.showInputDialog("Digite el el horario"));
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono"));

            arregloSucursal[indice].setIdSucursal(idSucursal);
            arregloSucursal[indice].setLocalizacion(localizacion);
            arregloSucursal[indice].setHorario(horario);
            arregloSucursal[indice].setTelefono(telefono);

            Rutinas.imprimeArregloSucursal();

        } else {
            System.out.println("NO EXISTE UN ESPACIO VACIO");
            // System.out.println("NO EXISTE UN ESPACIO VACIO");
        }
        Rutinas.menuSucursal();
    }//Fin de agrega sucursal

    public static void modificaSucursal() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloSucursal.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloSucursal[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlModificar = 1;

        while (controlModificar == 1) {

            int numeroSucursal = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de sucursal que desea modificar 1 o 2"));

            if (numeroSucursal >= 0 && numeroSucursal <= 10) {

                numeroSucursal = numeroSucursal - 1;

                String idSucursal = "";
                String localizacion = "";
                int hora = 0;
                int telefono = 0;
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea modificar \n 1: ID SUCURSAL \n 2: LOCALIZACION \n 3: HORARIO \n 4: TELEFONO"));
                switch (op) {
                    case 1:
                        idSucursal = JOptionPane.showInputDialog(null, "Escriba nuevo id sucursal ");
                        arregloSucursal[numeroSucursal].setIdSucursal(idSucursal);
                        break;
                    case 2:
                        localizacion = JOptionPane.showInputDialog(null, "Escriba nueva localizacion");
                        arregloSucursal[numeroSucursal].setLocalizacion(localizacion);
                        break;
                    case 3:
                        hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba nuevo horario 00:00-24:00"));
                        arregloSucursal[numeroSucursal].setHorario(hora);
                        break;
                    case 4:
                        telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba nuevo numero de telefono"));
                        arregloSucursal[numeroSucursal].setTelefono(telefono);
                        break;
                    default:
                        break;

                }//Fin del switch

                controlModificar = 2;
            } else {

                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else

        }//Fin del ciclo   
        Rutinas.menuSucursal();
    }//Fin de modifica sucursal

    public static void eliminaSucursal() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloSucursal.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloSucursal[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlEliminar = 1;

        while (controlEliminar == 1) {

            int idSucursal = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de sucursal que desea eliminar 1-10"));
            if (idSucursal >= 0 && idSucursal <= 10) {

                idSucursal = idSucursal - 1;
                arregloSucursal[idSucursal] = new Sucursal("vacio", "vacio", 0, 0);
                System.out.println("\n");
                System.out.println("se a borrado con exito");
                System.out.println("\n");

                int c = 1;
                for (int i = 0; i < arregloSucursal.length; i++) {
                    System.out.println("NUMERO " + c + " " + arregloSucursal[i]);
                    c = c + 1;
                    controlEliminar = 2;
                }//Fin del for

            } else {//Fin del if
                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else
        }//Fin del ciclo   
        Rutinas.menuSucursal();
    }//Fin de elimina sucursal

    public static void imprimeArregloSucursal() {
        System.out.println("\n\n\n\n");
        System.out.println("\n");
        int c = 1;
        for (int i = 0; i < arregloSucursal.length; i++) {

            System.out.println("NUMERO " + c + " " + arregloSucursal[i]);
            c = c + 1;
        }//Fin del for
        Rutinas.menuSucursal();
    }//Fin de imprime Sucursal

    public static void buscaIdSucursal() {
        System.out.println("\n\n\n\n");
        String idSucursal = JOptionPane.showInputDialog("Escriba el id que desea buscar");

        int busqueda = 0;

        for (int k = 0; k < arregloSucursal.length; k++) {

            if (idSucursal.equals(arregloSucursal[k].getIdSucursal())) {
                System.out.println("La sucursal fue encontrada");
                System.out.println(arregloSucursal[k]);
                busqueda = 1;
            }

        }//Fin de for

        if (busqueda == 0) {
            System.out.println("El reservacion no fue encontrada");
        }
        Rutinas.menuSucursal();
    }//Fin de busca sucursal

    ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    static Auto arregloAuto2[] = new Auto[10];

    public static void llenaArregloAuto2() {

        arregloAuto2[0] = new Auto("155", 4, "isuzu", "diesel", "auto", "5");
        arregloAuto2[1] = new Auto("166", 4, "toyota", "diesel", "auto", "5");
        arregloAuto2[2] = new Auto("177", 4, "mazda", "diesel", "auto", "5");
        arregloAuto2[3] = new Auto("188", 4, "nissan", "diesel", "auto", "5");
        arregloAuto2[4] = new Auto("199", 2, "isuzu", "diesel", "auto", "2");
        arregloAuto2[5] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
        arregloAuto2[6] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
        arregloAuto2[7] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
        arregloAuto2[8] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
        arregloAuto2[9] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");

    }

    public static void agregaAuto2() {
        System.out.println("\n\n\n\n");
        int i = 0;
        int indice = 0;

        String vacio = "vacio";
        int control = 0;
        int p = 0;
        int c = 0;

        for (i = 0; i < arregloAuto2.length; i++) {

            if (vacio.equals(arregloAuto2[i].getIdauto())) {
                indice = i;
                control = 1;

            }

        }//Fin de for

        if (control == 1) {

            String id = JOptionPane.showInputDialog("Digite el id");
            int cantP = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de puertas"));
            String marca = JOptionPane.showInputDialog("Digite la marca");
            String combustible = JOptionPane.showInputDialog("Digite tipo de combustible");
            String transmision = JOptionPane.showInputDialog("Digite el tipo de transmision");
            String capacidad = JOptionPane.showInputDialog("Digite la capacidad del auto");

            arregloAuto2[indice].setIdauto(id);
            arregloAuto2[indice].setPuertas(cantP);
            arregloAuto2[indice].setMarca(marca);
            arregloAuto2[indice].setCombustible(combustible);
            arregloAuto2[indice].setTransmision(transmision);
            arregloAuto2[indice].setCapacidad(capacidad);

            Rutinas.imprimeArregloAuto2();

        } else {
            System.out.println("NO EXISTE UN ESPACIO VACIO");
            // System.out.println("NO EXISTE UN ESPACIO VACIO");
        }

    }//Fin de agrega auto 2

    public static void modificaAuto2() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloAuto2.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloAuto2[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlModificar = 1;

        while (controlModificar == 1) {

            int numeroAuto = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de auto que desea modificar 1-10"));

            if (numeroAuto >= 0 && numeroAuto <= 10) {

                numeroAuto = numeroAuto - 1;
                String idAuto = "";
                int puertas = 0;
                String marca = "";
                String combustible = "";
                String transmision = "";
                String capacidad = "";
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea modificar \n 1: ID AUTO \n 2: # PUERTAS \n 3: MARCA \n 4: TIPO COMBUSTIBLE \n 5: TRANSMISION \n 6: CAPASIDAD"));
                switch (op) {
                    case 1:
                        idAuto = JOptionPane.showInputDialog(null, "Escriba el nuevo id ");
                        arregloAuto2[numeroAuto].setIdauto(idAuto);
                        break;
                    case 2:
                        puertas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el nuevo numero de puertas"));
                        arregloAuto2[numeroAuto].setPuertas(puertas);
                        break;
                    case 3:
                        marca = JOptionPane.showInputDialog(null, "Escriba la nueva marca");
                        arregloAuto2[numeroAuto].setMarca(marca);
                        break;
                    case 4:
                        combustible = JOptionPane.showInputDialog(null, "Escriba tipo de combustible");
                        arregloAuto2[numeroAuto].setCombustible(combustible);
                        break;
                    case 5:
                        transmision = JOptionPane.showInputDialog(null, "Escriba el tipo de transmision");
                        arregloAuto2[numeroAuto].setTransmision(transmision);
                        break;
                    case 6:
                        capacidad = JOptionPane.showInputDialog(null, "Escriba la capasidad");
                        arregloAuto2[numeroAuto].setCapacidad(capacidad);

                        break;
                    default:
                        break;

                }//Fin del switch

                controlModificar = 2;
            } else {

                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else

        }//Fin del ciclo   

    }//Fin de modifica autos2

    public static void eliminaAuto2() {
        System.out.println("\n\n\n\n");
        int n = 1;

        for (int i = 0; i < arregloAuto2.length; i++) {

            System.out.println("NUMERO " + n + " " + arregloAuto2[i]);

            n = n + 1;

        }//Fin del for

        System.out.println("\n");

        int controlEliminar = 1;

        while (controlEliminar == 1) {

            int idAuto = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de auto que desea modificar 1-10"));
            if (idAuto >= 0 && idAuto <= 10) {

                idAuto = idAuto - 1;
                arregloAuto2[idAuto] = new Auto("vacio", 0, "vacio", "vacio", "vacio", "vacio");
                System.out.println("\n");
                System.out.println("se a borrado con exito");
                System.out.println("\n");

                int c = 1;
                for (int i = 0; i < arregloAuto2.length; i++) {
                    System.out.println("NUMERO " + c + " " + arregloAuto2[i]);
                    c = c + 1;
                    controlEliminar = 2;
                }//Fin del for

            } else {//Fin del if
                System.out.println("Por favor ingrese un numero que este entre 1 y 10");

            }//Fin del else
        }//Fin del ciclo   

    }//Fin de elimina auto2

    public static void imprimeArregloAuto2() {
        System.out.println("\n\n\n\n");
        System.out.println("\n");
        int c = 1;
        for (int i = 0; i < arregloAuto2.length; i++) {

            System.out.println("NUMERO " + c + " " + arregloAuto2[i]);
            c = c + 1;
        }//Fin del for

    }//Fin de imprime auto 2

    public static void buscaIdAuto2() {
        System.out.println("\n\n\n\n");
        String idAuto = JOptionPane.showInputDialog("Escriba el id que desea buscar");

        int busqueda = 0;

        for (int k = 0; k < arregloAuto2.length; k++) {

            if (idAuto.equals(arregloAuto2[k].getIdauto())) {
                System.out.println("El id  del auto fue encontrado");
                System.out.println(arregloAuto2[k]);
                busqueda = 1;
            }

        }//Fin de for

        if (busqueda == 0) {
            System.out.println("El id no fue encontrado");
        }

    }//fin de busca auto 2

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    public static void menuPrincipal() {

    

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO QUE DESEE ENTRAR \n 1: AUTOS \n 2: CLIENTES \n 3: RESERVACIONES \n 4: PAGOS \n 5: SUCURSALES  \n 6: SALIR"));
        switch (op) {
            case 1:
                menuAutos();
                break;
            case 2:
                menuCliente();
                break;
            case 3:
                menuReservacion();
                break;
            case 4:
                menuPago();
                break;
            case 5:
                menuSucursal();
                break;
            case 6:
                System.out.println("GRACIAS, HASTA PRONTO");
                break;
            default:
                break;

        }//Fin de switch    

    }  //Fin de menuPrincipal 

    public static void menuAutos() {

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea entrar \n 1: AGREGAR \n 2: MODIFICAR \n 3: ELIMINAR \n 4: BUSCAR \n 5: LISTAR \n 6: REGRESAR \n 7: SALIR"));
        switch (op) {
            case 1:
                Rutinas.agregaAuto();
                break;
            case 2:
                Rutinas.modificaAuto();
                break;
            case 3:
                Rutinas.eliminaAuto();
                break;
            case 4:

                Rutinas.buscaIdAuto();
                break;
            case 5:
                Rutinas.imprimeArregloAuto();

                break;
            case 6:
                menuPrincipal();
                break;
            case 7:
                System.out.println("GRACIAS, HASTA PRONTO");
                break;
            default:
                break;

        }//Fin de switch    

    }  //Fin de menuPrincipal

    public static void menuCliente() {

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea entrar \n 1: AGREGAR \n 2: MODIFICAR \n 3: ELIMINAR \n 4: BUSCAR \n 5: LISTAR \n 6: REGRESAR \n 7: SALIR"));
        switch (op) {
            case 1:
                Rutinas.agregaCliente();
                break;
            case 2:
                Rutinas.modificaCliente();
                break;
            case 3:
                Rutinas.eliminaCliente();
                break;
            case 4:
                Rutinas.buscaIdCliente();
                break;
            case 5:

                Rutinas.imprimeArregloCliente();
                break;
            case 6:
                menuPrincipal();
                break;
            case 7:
                System.out.println("GRACIAS, HASTA PRONTO");
                break;
            default:
                break;

        }//Fin de switch    

    }  //Fin de menuPrincipal

    public static void menuReservacion() {

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea entrar \n 1: AGREGAR \n 2: MODIFICAR \n 3: ELIMINAR \n 4: BUSCAR \n 5: LISTAR \n 6: REGRESAR \n 7: SALIR"));
        switch (op) {
            case 1:
                Rutinas.agregaReserva();
                break;
            case 2:
                Rutinas.modificaReserva();
                break;
            case 3:
                Rutinas.eliminaReserva();
                break;
            case 4:
                Rutinas.buscaIdReserva();
                break;
            case 5:

                Rutinas.imprimeArregloReserva();
                break;
            case 6:
                menuPrincipal();
                break;
            case 7:
                System.out.println("GRACIAS, HASTA PRONTO");
                break;
            default:
                break;

        }//Fin de switch    

    }  //Fin de menuPrincipal

    public static void menuPago() {

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea entrar \n 1: AGREGAR \n 2: MODIFICAR \n 3: ELIMINAR \n 4: BUSCAR \n 5: LISTAR \n 6: REGRESAR \n 7: SALIR"));
        switch (op) {
            case 1:
                Rutinas.agregaPago();
                break;
            case 2:
                Rutinas.modificaPago();
                break;
            case 3:
                Rutinas.eliminaPago();
                break;
            case 4:

                Rutinas.buscaIdPago();
                break;
            case 5:
                Rutinas.imprimeArregloPago();

                break;
            case 6:
                menuPrincipal();
                break;
            case 7:
                System.out.println("GRACIAS, HASTA PRONTO");
                break;
            default:
                break;

        }//Fin de switch    

    }  //Fin de menuPrincipal

    public static void menuSucursal() {

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero que desea entrar \n 1: AGREGAR \n 2: MODIFICAR \n 3: ELIMINAR \n 4: BUSCAR \n 5: LISTAR \n 6: REGRESAR \n 7: SALIR"));
        switch (op) {
            case 1:
                Rutinas.agregaSucursal();
                break;
            case 2:
                Rutinas.modificaSucursal();
                break;
            case 3:
                Rutinas.eliminaSucursal();
                break;
            case 4:
                Rutinas.buscaIdSucursal();

                break;
            case 5:
                Rutinas.imprimeArregloSucursal();
                break;
            case 6:
                menuPrincipal();
                break;
            case 7:
                System.out.println("GRACIAS, HASTA PRONTO");
                break;
            default:
                break;

        }//Fin de switch    

    }  //Fin de menuPrincipal 

    public static void cargas(){
        Rutinas.llenaArregloAuto();
        Rutinas.llenaArregloAuto2();
        Rutinas.llenaArregloCliente();
        Rutinas.llenaArregloReserva();
        Rutinas.llenaArregloPago();
        Rutinas.llenaArregloSucursal();
    }//Fin de cargas
}//public class Rutinas

