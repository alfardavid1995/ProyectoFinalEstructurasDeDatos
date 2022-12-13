package GUI;

import EstructurasDeDatos.*;

import ObjetosdelProyecto.Objetos.Cliente;
import ObjetosdelProyecto.Objetos.Devolucion;
import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;
import ObjetosdelProyecto.Objetos.Vehiculo;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class GUIMain extends javax.swing.JFrame {

    public void limpiarConsola2() {
        jTextFieldMarca.setText("");
        jTextFieldAnio.setText("");
        jTextFieldModelo.setText("");
        jTextAreaExtras.setText("");
        jComboBoxCantPasajeros.setSelectedIndex(0);
    }

    public void creacionDeListaConsultaSoli() {
        int saltos = 0;
        if (!listaConsulta.Vacia()) {
            listaConsulta.limpiarLista();
        }
        while (saltos != listaSoli.tamanio()) {
            SolicitudDeAlquiler soli = listaSoli.retornaSoli(saltos);

            listaConsulta.agregarSolicitud(soli);

            saltos += 1;

        }
    }

    public void creacionDeListaBusqueda(SolicitudDeAlquiler soli) {
        int saltos = 0;
        if (!listaFiltro.Vacia()) {
            listaFiltro.limpiarLista();
        }
        while (saltos != pilaRegistroVehiculo.tamanio()) {
            Vehiculo vehiculo = pilaRegistroVehiculo.retornaVehiculoFiltro(saltos);

            if (listaFiltro.comparoCantPasajeros(vehiculo, soli.getPasajeros())) {
                listaFiltro.agregarVehiculoFiltro(vehiculo);

            }

            saltos += 1;
        }
        //buscar por disponibilidad
        if (!listaFiltro.Vacia()) {

            if (listaFiltro.buscarXDisponibilidad()) {
                //                    JOptionPane.showMessageDialog(null, "SI hay marca");
                listaFiltro.eliminaXDisponibilidad();
            } else {

                jTextAreaSolicitudesRegistradas.setText("No hay  vehiculos disponibles "
                        + " con " + soli.getPasajeros() + " pasajeros");
                soli.setEstadoDeSolicitud("Rechazada");
                listaFiltro.limpiarLista();

            }

        }

        if (!listaFiltro.Vacia()) {
            //buscar por marca
            if (!soli.getMarca().equals("-")) {
                filtro = true;

                if (listaFiltro.buscarXMarca(soli.getMarca())) {
                    //                    JOptionPane.showMessageDialog(null, "SI hay marca");
                    listaFiltro.eliminaXMarca(soli.getMarca());
                } else {

                    jTextAreaSolicitudesRegistradas.setText("No hay  vehiculos de la marca "
                            + soli.getMarca() + " con " + soli.getPasajeros() + " pasajeros");
                    soli.setEstadoDeSolicitud("Rechazada");
                    listaFiltro.limpiarLista();

                }
            }

            //buscar por anio
            if (soli.getAnio() != 0) {
                filtro = true;

                if (listaFiltro.buscarXAnio(soli.getAnio())) {
                    //                    JOptionPane.showMessageDialog(null, "SI hay anio");
                    listaFiltro.eliminaXAnio(soli.getAnio());
                } else {

                    jTextAreaSolicitudesRegistradas.setText("No hay  vehiculos del año "
                            + soli.getAnio() + " con " + soli.getPasajeros() + " pasajeros");
                    soli.setEstadoDeSolicitud("Rechazada");
                    listaFiltro.limpiarLista();

                }
            }
            //buscar por modelo
            if (!soli.getModelo().equals("-")) {
                filtro = true;

                if (listaFiltro.buscarXModelo(soli.getModelo())) {
                    //                    JOptionPane.showMessageDialog(null, "SI hay modelo");
                    listaFiltro.eliminaXModelo(soli.getModelo());
                } else {
                    jTextAreaSolicitudesRegistradas.setText("No hay  vehiculos del modelo "
                            + soli.getModelo() + " con " + soli.getPasajeros() + " pasajeros");
                    soli.setEstadoDeSolicitud("Rechazada");
                    listaFiltro.limpiarLista();

                }
            }
            // buscar por extras
            if (!soli.getExtra().equals("-")) {
                filtro = true;

                if (listaFiltro.buscarXExtra(soli.getExtra())) {
                    //                    JOptionPane.showMessageDialog(null, "SI hay extra");
                    listaFiltro.eliminaXExtra(soli.getExtra());
                } else {

                    jTextAreaCarrosDisponibles.setText("No hay  vehiculos con "
                            + soli.getExtra() + " de " + soli.getPasajeros() + " pasajeros");
                    soli.setEstadoDeSolicitud("Rechazada");
                    listaFiltro.limpiarLista();

                }
            }
        }
    }

    public void subirCategoriaCliente(Cliente cliente) {
        if (cliente.getCategoria().equals("")) {
            cliente.setCategoria("Bronce");
            JOptionPane.showMessageDialog(null, "Felicidades subiste a " + cliente.getCategoria());
        } else {
            if (cliente.getCategoria().equals("Bronce")) {
                cliente.setCategoria("Plata");
                JOptionPane.showMessageDialog(null, "Felicidades subiste a " + cliente.getCategoria());
            } else {
                if (cliente.getCategoria().equals("Plata")) {
                    cliente.setCategoria("Oro");
                    JOptionPane.showMessageDialog(null, "Felicidades subiste a " + cliente.getCategoria());
                } else {
                    if (cliente.getCategoria().equals("Oro")) {
                        cliente.setCategoria("Zafiro");
                        JOptionPane.showMessageDialog(null, "Felicidades subiste a " + cliente.getCategoria());
                    }
                }
            }
        }
    }

    public GUIMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        Vehiculo vehiculito1 = new Vehiculo("P-5489", "Toyota", "Hilux", 2020, "rojo",
                4, "Gasolina", 4, 80, "Disponible");

        Vehiculo vehiculito2 = new Vehiculo("LDW-8899", "Hyundai", "Accent", 2019, "Blanco",
                4, "Gasolina", 5, 60, "Disponible");

        Vehiculo vehiculito3 = new Vehiculo("654-ARDS", "Chevrolet", "Malibu", 2019, "Azul",
                4, "Gasolina", 7, 90, "Disponible");

        Vehiculo vehiculito4 = new Vehiculo("HRR-9879", "Toyota", "Rush", 2019, "Blanco",
                4, "Gasolina", 12, 90, "Disponible");

        Vehiculo vehiculito5 = new Vehiculo("P-1111", "Nissan", "Versa", 2019, "Azul",
                4, "Gasolina", 4, 80, "Disponible");

        Vehiculo vehiculito6 = new Vehiculo("P-222", "Honda", "CR-V", 2019, "Negro",
                4, "Gasolina", 4, 80, "Disponible");

        Vehiculo vehiculito7 = new Vehiculo("L-2006", "Toyota", "Hilux", 2019, "Azul",
                4, "Gasolina", 4, 90, "Disponible");

        Cliente clientito1 = new Cliente(118487, "Alejandro", "14-4-2001", "ale84@gmail.com",
                "Zafiro", 0, false);
        Cliente clientito2 = new Cliente(654641, "Pedro", "25-6-1998", "pedro36@gmail.com",
                "", 0, false);
        Cliente clientito3 = new Cliente(123213, "Tavo", "17-11-1982", "tavo@gmail.com",
                "", 0, false);
        Cliente clientito4 = new Cliente(11848, "Mariana", "10-01-2004", "mari98@gmail.com",
                "", 0, false);
        pilaRegistroVehiculo.push(vehiculito1);
        pilaRegistroVehiculo.push(vehiculito2);
        pilaRegistroVehiculo.push(vehiculito3);
        pilaRegistroVehiculo.push(vehiculito4);
        pilaRegistroVehiculo.push(vehiculito5);
        pilaRegistroVehiculo.push(vehiculito6);
        pilaRegistroVehiculo.push(vehiculito7);
        colaRegistroCliente.encola(clientito1);
        colaRegistroCliente.encola(clientito2);
        colaRegistroCliente.encola(clientito3);
        colaRegistroCliente.encola(clientito4);
        jTextPaneDisplayRegistro.setText(pilaRegistroVehiculo.listar2());
        jTextPaneDisplayRegistro2.setText(pilaRegistroVehiculo.listar2());
        jTextPaneDisplayRegistro1.setText(colaRegistroCliente.listar2());
        jTextPaneDisplayModificar.setText(colaRegistroCliente.listar2());

//        soliAlquiler = new SolicitudDeAlquiler("Procesada", 14, clientito1, 4, "-", 0, "-", "-");
//        listaSoli.agregarSolicitud(soliAlquiler);
//        soliAlquiler = new SolicitudDeAlquiler("Procesada", 55, clientito3, 4, "-", 0, "-", "-");
//        listaSoli.agregarSolicitud(soliAlquiler);
//        jTextAreaSolicitudes.setText(listaSoli.toString2());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVehiculo = new javax.swing.JTabbedPane();
        pestañasVehiculo = new javax.swing.JTabbedPane();
        pestañaRegistrarVehiculo = new javax.swing.JPanel();
        jLabelRegistrarVehiculo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneDisplayRegistro = new javax.swing.JTextPane();
        jLabelRegistro_de_Vehiculos = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPanePlaca = new javax.swing.JTextPane();
        jLabelMarca = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneMarca = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPaneModelo = new javax.swing.JTextPane();
        jLabelPlacaModelo = new javax.swing.JLabel();
        jLabelPlacaAnnio = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPaneAnnio = new javax.swing.JTextPane();
        jLabelColor = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPaneColor = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPaneCilindraje = new javax.swing.JTextPane();
        jLabelPlacaCilindraje = new javax.swing.JLabel();
        jLabelCombustible = new javax.swing.JLabel();
        jComboBoxSelectorDeCombustible = new javax.swing.JComboBox<>();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonRefrescarRegistroVehiculo1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextPaneCantPasajeros = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPanePrecio = new javax.swing.JTextPane();
        jComboBox2SelectorEstado = new javax.swing.JComboBox<>();
        jLabelPlaca1 = new javax.swing.JLabel();
        pestañaModificarEliminarVehiculo = new javax.swing.JPanel();
        jButtonModificar = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPaneDisplayRegistro2 = new javax.swing.JTextPane();
        jLabelRegistroVehiculo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelParametroAModificar = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPaneValorAModificar = new javax.swing.JTextPane();
        jLabelValorAModificar = new javax.swing.JLabel();
        jButtonBuscarPlacaModificarVehiculo = new javax.swing.JButton();
        jButtonSalirModificarVehiculo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxtipoCombustible = new javax.swing.JComboBox<>();
        jLabelPlaca2 = new javax.swing.JLabel();
        jComboBox2Estado = new javax.swing.JComboBox<>();
        pestañaExtras = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextAreaVehiculo = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jtext_numPlaca = new javax.swing.JTextPane();
        jButtonBuscar_Refrescar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelInfoDeVehiculoConExtras = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtext_extras = new javax.swing.JTextPane();
        jButtonAgregarExtras = new javax.swing.JButton();
        jButtonQuitarExtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        panelCliente = new javax.swing.JTabbedPane();
        pestañaRegistroCliente = new javax.swing.JPanel();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCedulaCliente = new javax.swing.JTextField();
        jTextFieldFechaCliente = new javax.swing.JTextField();
        jTextFieldCorreoCliente = new javax.swing.JTextField();
        jComboBoxCategorriaClente = new javax.swing.JComboBox<>();
        jButtonRegistrarCliente = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButtonRefrescarRegistroCliente = new javax.swing.JButton();
        jButtonSalir1 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPaneDisplayRegistro1 = new javax.swing.JTextArea();
        pestañaModificaEliminaCliente = new javax.swing.JPanel();
        jButtonModificar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCedulaClienteVerificar = new javax.swing.JTextField();
        jButtonBuscarCedula = new javax.swing.JButton();
        jButtonEliminar1 = new javax.swing.JButton();
        jLabelParametroAModificar1 = new javax.swing.JLabel();
        jComboBoxOpcionesCliente = new javax.swing.JComboBox<>();
        jLabelValorAModificar1 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextPaneValorAModificar1 = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jButtonMostrar = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextPaneDisplayModificar = new javax.swing.JTextArea();
        pestañaConsultaCliente = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldCedulaConsulta = new javax.swing.JTextField();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextPaneInformacionClinete = new javax.swing.JTextPane();
        jButtonConsultar = new javax.swing.JButton();
        jButtonRefrescar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAnioAlquiler = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldAnio = new javax.swing.JTextField();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextAreaExtras = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextAreaCarrosDisponibles = new javax.swing.JTextArea();
        jComboBoxCantPasajeros = new javax.swing.JComboBox<>();
        jButtonCrearSolicitud = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextFieldDiasAlquiler = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldMesAlquiler = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextFieldDiaAlquiler = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextAreaSolicitudes = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextAreaSolicitudesRegistradas = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextAreaFiltroConsulta = new javax.swing.JTextArea();
        jTextFieldNumPlaca = new javax.swing.JTextField();
        jTextFieldNumCedula = new javax.swing.JTextField();
        jButtonConsultarFiltro = new javax.swing.JButton();
        jComboBoxEstadoAlquiler = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldPlacaDevo = new javax.swing.JTextField();
        jTextFieldCondicionesDevo = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextAreaDevolucion = new javax.swing.JTextArea();
        jButtonDevolucion = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextAreaDevo = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextAreaTopClientes = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextAreaTopVehiculos = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextAreaPromedio = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rent Car");

        jLabelRegistrarVehiculo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelRegistrarVehiculo.setText("Registrar Vehiculo");

        jScrollPane1.setViewportView(jTextPaneDisplayRegistro);

        jLabelRegistro_de_Vehiculos.setText("Registro de Vehiculos");

        jLabelPlaca.setText("Placa:");

        jScrollPane2.setViewportView(jTextPanePlaca);

        jLabelMarca.setText("Marca:");

        jScrollPane3.setViewportView(jTextPaneMarca);

        jScrollPane4.setViewportView(jTextPaneModelo);

        jLabelPlacaModelo.setText("Modelo:");

        jLabelPlacaAnnio.setText("Año:");

        jScrollPane5.setViewportView(jTextPaneAnnio);

        jLabelColor.setText("Color:");

        jScrollPane6.setViewportView(jTextPaneColor);

        jScrollPane7.setViewportView(jTextPaneCilindraje);

        jLabelPlacaCilindraje.setText("Cilindraje:");

        jLabelCombustible.setText("Tipo de Combustible:");

        jComboBoxSelectorDeCombustible.setBackground(new java.awt.Color(0, 102, 255));
        jComboBoxSelectorDeCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel", "Eléctrico", "Gas Natural" }));
        jComboBoxSelectorDeCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectorDeCombustibleActionPerformed(evt);
            }
        });

        jButtonRegistrar.setBackground(new java.awt.Color(0, 51, 255));
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrar Vehiculo");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonRefrescarRegistroVehiculo1.setBackground(new java.awt.Color(51, 255, 51));
        jButtonRefrescarRegistroVehiculo1.setText("Refrescar Registro Vehículo");
        jButtonRefrescarRegistroVehiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefrescarRegistroVehiculo1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad de Pasajeros");

        jLabel5.setText("Precio de Alquiler");

        jScrollPane14.setViewportView(jTextPaneCantPasajeros);

        jScrollPane16.setViewportView(jTextPanePrecio);

        jComboBox2SelectorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", " Alquilado", " En reparación", " Fuera de circulación" }));

        jLabelPlaca1.setText("Estado: ");

        javax.swing.GroupLayout pestañaRegistrarVehiculoLayout = new javax.swing.GroupLayout(pestañaRegistrarVehiculo);
        pestañaRegistrarVehiculo.setLayout(pestañaRegistrarVehiculoLayout);
        pestañaRegistrarVehiculoLayout.setHorizontalGroup(
            pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                        .addComponent(jButtonRegistrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabelRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                                .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane14)
                                    .addComponent(jLabelPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPlacaModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelColor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaRegistrarVehiculoLayout.createSequentialGroup()
                                                .addComponent(jLabelPlaca1)
                                                .addGap(83, 83, 83))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelCombustible)
                                                .addComponent(jComboBoxSelectorDeCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox2SelectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelPlacaAnnio)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelPlacaCilindraje))
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaRegistrarVehiculoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabelRegistro_de_Vehiculos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                                .addComponent(jButtonRefrescarRegistroVehiculo1))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        pestañaRegistrarVehiculoLayout.setVerticalGroup(
            pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistro_de_Vehiculos)
                    .addComponent(jButtonRefrescarRegistroVehiculo1)
                    .addComponent(jLabelRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPlaca)
                            .addComponent(jLabelPlaca1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2SelectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaRegistrarVehiculoLayout.createSequentialGroup()
                                .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMarca)
                                    .addComponent(jLabelCombustible))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxSelectorDeCombustible, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPlacaModelo)
                            .addComponent(jLabelPlacaAnnio))
                        .addGap(12, 12, 12)
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPlacaCilindraje)
                            .addComponent(jLabelColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pestañaRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegistrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pestañaRegistrarVehiculoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(137, Short.MAX_VALUE))))
        );

        pestañasVehiculo.addTab("Registrar Vehiculo", pestañaRegistrarVehiculo);

        pestañaModificarEliminarVehiculo.setPreferredSize(new java.awt.Dimension(900, 550));

        jButtonModificar.setBackground(new java.awt.Color(51, 51, 255));
        jButtonModificar.setText("Modificar Vehiculo");
        jButtonModificar.setActionCommand("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jScrollPane9.setViewportView(jTextPaneDisplayRegistro2);

        jLabelRegistroVehiculo2.setText("Registro Vehiculos");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Placa:");

        jComboBox1.setBackground(new java.awt.Color(0, 51, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo", "Año", "Color", "Cilindraje", "Combustible", "Pasajeros", "Precio alquiler", "Estado" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelParametroAModificar.setText("Parametro a modificar");

        jScrollPane10.setViewportView(jTextPaneValorAModificar);

        jLabelValorAModificar.setText("Valor a modificar");

        jButtonBuscarPlacaModificarVehiculo.setBackground(new java.awt.Color(102, 204, 0));
        jButtonBuscarPlacaModificarVehiculo.setText("Buscar Placa");
        jButtonBuscarPlacaModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPlacaModificarVehiculoActionPerformed(evt);
            }
        });

        jButtonSalirModificarVehiculo.setBackground(new java.awt.Color(204, 0, 102));
        jButtonSalirModificarVehiculo.setText("Salir");

        jButtonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonEliminar.setText("Eliminar Vehiculo");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(153, 255, 51));
        jButtonActualizar.setText("Mostrar todos");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo Combustible");

        jComboBoxtipoCombustible.setBackground(new java.awt.Color(0, 102, 255));
        jComboBoxtipoCombustible.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxtipoCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel", "Eléctrico", "Gas Natural" }));
        jComboBoxtipoCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxtipoCombustibleActionPerformed(evt);
            }
        });

        jLabelPlaca2.setText("Estado: ");

        jComboBox2Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", " Alquilado", " En reparación", " Fuera de circulación" }));
        jComboBox2Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2EstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pestañaModificarEliminarVehiculoLayout = new javax.swing.GroupLayout(pestañaModificarEliminarVehiculo);
        pestañaModificarEliminarVehiculo.setLayout(pestañaModificarEliminarVehiculoLayout);
        pestañaModificarEliminarVehiculoLayout.setHorizontalGroup(
            pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaModificarEliminarVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaModificarEliminarVehiculoLayout.createSequentialGroup()
                        .addGroup(pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelParametroAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorAModificar)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pestañaModificarEliminarVehiculoLayout.createSequentialGroup()
                                .addComponent(jButtonBuscarPlacaModificarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxtipoCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(pestañaModificarEliminarVehiculoLayout.createSequentialGroup()
                        .addGroup(pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPlaca2)
                            .addComponent(jComboBox2Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSalirModificarVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestañaModificarEliminarVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelRegistroVehiculo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pestañaModificarEliminarVehiculoLayout.setVerticalGroup(
            pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaModificarEliminarVehiculoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroVehiculo2)
                    .addComponent(jButtonActualizar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaModificarEliminarVehiculoLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButtonSalirModificarVehiculo))
                    .addGroup(pestañaModificarEliminarVehiculoLayout.createSequentialGroup()
                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pestañaModificarEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscarPlacaModificarVehiculo)
                            .addComponent(jButtonEliminar))
                        .addGap(12, 12, 12)
                        .addComponent(jLabelParametroAModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPlaca2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxtipoCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorAModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificar)))
                .addGap(36, 36, 36))
        );

        pestañasVehiculo.addTab("Modificar / Eliminar Vehiculo", pestañaModificarEliminarVehiculo);

        jTextAreaVehiculo.setColumns(20);
        jTextAreaVehiculo.setRows(5);
        jScrollPane11.setViewportView(jTextAreaVehiculo);

        jScrollPane12.setViewportView(jtext_numPlaca);

        jButtonBuscar_Refrescar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonBuscar_Refrescar.setText("Buscar Placa ");
        jButtonBuscar_Refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscar_RefrescarActionPerformed(evt);
            }
        });

        jLabel3.setText("Placa:");

        jLabelInfoDeVehiculoConExtras.setText("Informacion de vehiculo completa");

        jScrollPane13.setViewportView(jtext_extras);

        jButtonAgregarExtras.setBackground(new java.awt.Color(51, 255, 0));
        jButtonAgregarExtras.setText("Agregar Extras");
        jButtonAgregarExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarExtrasActionPerformed(evt);
            }
        });

        jButtonQuitarExtras.setBackground(new java.awt.Color(224, 132, 15));
        jButtonQuitarExtras.setText("Quitar Extras");
        jButtonQuitarExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarExtrasActionPerformed(evt);
            }
        });

        jLabel7.setText("Extra:");

        javax.swing.GroupLayout pestañaExtrasLayout = new javax.swing.GroupLayout(pestañaExtras);
        pestañaExtras.setLayout(pestañaExtrasLayout);
        pestañaExtrasLayout.setHorizontalGroup(
            pestañaExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaExtrasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pestañaExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jButtonAgregarExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonQuitarExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscar_Refrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13))
                .addGap(50, 50, 50)
                .addGroup(pestañaExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInfoDeVehiculoConExtras)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        pestañaExtrasLayout.setVerticalGroup(
            pestañaExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaExtrasLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabelInfoDeVehiculoConExtras)
                .addGap(4, 4, 4)
                .addGroup(pestañaExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pestañaExtrasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar_Refrescar)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonAgregarExtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonQuitarExtras)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pestañasVehiculo.addTab("Modificaciones Extras", null, pestañaExtras, "");

        panelVehiculo.addTab("Vehiculo", pestañasVehiculo);
        pestañasVehiculo.getAccessibleContext().setAccessibleName("Registrar Vehículo");

        jTextFieldNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreClienteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Nombre Completo:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Número de Cédula:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Fecha de Nacimiento:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Correo Electrónico:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Categoría de Cliente:");

        jTextFieldCedulaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldFechaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldCorreoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoClienteActionPerformed(evt);
            }
        });

        jComboBoxCategorriaClente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxCategorriaClente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin categoria", "Bronce", "Plata", "Oro", "Zafiro" }));
        jComboBoxCategorriaClente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategorriaClenteActionPerformed(evt);
            }
        });

        jButtonRegistrarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegistrarCliente.setText("Registrar");
        jButtonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarClienteActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("Registro de Clientes");

        jButtonRefrescarRegistroCliente.setText("Refrescar Registo Cliente");
        jButtonRefrescarRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefrescarRegistroClienteActionPerformed(evt);
            }
        });

        jButtonSalir1.setText("Salir");
        jButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalir1ActionPerformed(evt);
            }
        });

        jTextPaneDisplayRegistro1.setColumns(20);
        jTextPaneDisplayRegistro1.setRows(5);
        jScrollPane8.setViewportView(jTextPaneDisplayRegistro1);

        javax.swing.GroupLayout pestañaRegistroClienteLayout = new javax.swing.GroupLayout(pestañaRegistroCliente);
        pestañaRegistroCliente.setLayout(pestañaRegistroClienteLayout);
        pestañaRegistroClienteLayout.setHorizontalGroup(
            pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9)
                        .addGap(25, 25, 25)
                        .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaRegistroClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBoxCategorriaClente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                    .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel10))
                                    .addGap(25, 25, 25)
                                    .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButtonRegistrarCliente, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(22, 22, 22)
                .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalir1))
                            .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jButtonRefrescarRegistroCliente)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pestañaRegistroClienteLayout.setVerticalGroup(
            pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButtonRefrescarRegistroCliente)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonSalir1))
                    .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                        .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaRegistroClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17)))
                        .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextFieldCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextFieldCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextFieldFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pestañaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(jComboBoxCategorriaClente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaRegistroClienteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonRegistrarCliente))))
                            .addGroup(pestañaRegistroClienteLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(123, 123, 123))
        );

        panelCliente.addTab("Registrar Cliente", pestañaRegistroCliente);

        jButtonModificar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonModificar1.setText("Modificar Cliente");
        jButtonModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cédula del cliente:");

        jTextFieldCedulaClienteVerificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCedulaClienteVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCedulaClienteVerificarActionPerformed(evt);
            }
        });

        jButtonBuscarCedula.setBackground(new java.awt.Color(102, 204, 0));
        jButtonBuscarCedula.setText("Buscar Cédula");
        jButtonBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCedulaActionPerformed(evt);
            }
        });

        jButtonEliminar1.setBackground(new java.awt.Color(255, 0, 0));
        jButtonEliminar1.setText("Eliminar Cliente");
        jButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar1ActionPerformed(evt);
            }
        });

        jLabelParametroAModificar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelParametroAModificar1.setText("Parametro a modificar:");

        jComboBoxOpcionesCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Fecha de Nacimiento", "Correo" }));
        jComboBoxOpcionesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionesClienteActionPerformed(evt);
            }
        });

        jLabelValorAModificar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelValorAModificar1.setText("Valor a modificar");

        jScrollPane15.setViewportView(jTextPaneValorAModificar1);

        jLabel15.setText("Registro Clientes");

        jButtonMostrar.setText("Mostrar Todos");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jTextPaneDisplayModificar.setColumns(20);
        jTextPaneDisplayModificar.setRows(5);
        jScrollPane17.setViewportView(jTextPaneDisplayModificar);

        javax.swing.GroupLayout pestañaModificaEliminaClienteLayout = new javax.swing.GroupLayout(pestañaModificaEliminaCliente);
        pestañaModificaEliminaCliente.setLayout(pestañaModificaEliminaClienteLayout);
        pestañaModificaEliminaClienteLayout.setHorizontalGroup(
            pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaModificaEliminaClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModificar1)
                    .addGroup(pestañaModificaEliminaClienteLayout.createSequentialGroup()
                        .addGroup(pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCedulaClienteVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelParametroAModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorAModificar1)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pestañaModificaEliminaClienteLayout.createSequentialGroup()
                                .addComponent(jButtonBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxOpcionesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pestañaModificaEliminaClienteLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonMostrar))
                            .addGroup(pestañaModificaEliminaClienteLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        pestañaModificaEliminaClienteLayout.setVerticalGroup(
            pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaModificaEliminaClienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jButtonMostrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaModificaEliminaClienteLayout.createSequentialGroup()
                        .addComponent(jTextFieldCedulaClienteVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pestañaModificaEliminaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscarCedula)
                            .addComponent(jButtonEliminar1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelParametroAModificar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxOpcionesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorAModificar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButtonModificar1)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        panelCliente.addTab("Modifica/Elimina Cliente", pestañaModificaEliminaCliente);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Información del Cliente:");

        jTextFieldCedulaConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextPaneInformacionClinete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane18.setViewportView(jTextPaneInformacionClinete);

        jButtonConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonRefrescar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRefrescar.setText("Refrescar");
        jButtonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefrescarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Cédula a Consultar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRefrescar)
                .addGap(354, 354, 354))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextFieldCedulaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonConsultar))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCedulaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(jButtonRefrescar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pestañaConsultaClienteLayout = new javax.swing.GroupLayout(pestañaConsultaCliente);
        pestañaConsultaCliente.setLayout(pestañaConsultaClienteLayout);
        pestañaConsultaClienteLayout.setHorizontalGroup(
            pestañaConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaConsultaClienteLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 268, Short.MAX_VALUE))
        );
        pestañaConsultaClienteLayout.setVerticalGroup(
            pestañaConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaConsultaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        panelCliente.addTab("Consulta Cliente", pestañaConsultaCliente);

        panelVehiculo.addTab("Cliente", panelCliente);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cedula");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Cantidad de Pasajeros");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Preferencias");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Marca");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Modelo");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Extras Particular");

        jTextAreaExtras.setColumns(20);
        jTextAreaExtras.setRows(5);
        jScrollPane19.setViewportView(jTextAreaExtras);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Carros disponibles");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Año");

        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });

        jTextAreaCarrosDisponibles.setColumns(20);
        jTextAreaCarrosDisponibles.setRows(5);
        jScrollPane20.setViewportView(jTextAreaCarrosDisponibles);

        jComboBoxCantPasajeros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxCantPasajeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "7", "12" }));

        jButtonCrearSolicitud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCrearSolicitud.setText("Crear Solicitud");
        jButtonCrearSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearSolicitudActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Dias de Alquiler");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Fecha de alquiler:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Año");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Mes");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Día");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDiasAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldAnioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldMesAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDiaAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(47, 47, 47)
                                        .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel21)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel24)
                                                    .addGap(25, 25, 25)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(13, 13, 13)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxCantPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16))
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCrearSolicitud, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(77, 77, 77))
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldDiaAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel34))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldMesAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel33))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(jTextFieldAnioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel32)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(jTextFieldDiasAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jComboBoxCantPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCrearSolicitud)
                        .addGap(154, 154, 154))))
        );

        jTabbedPane4.addTab("Solicitud de Alquiler", jPanel1);

        jTextAreaSolicitudes.setColumns(20);
        jTextAreaSolicitudes.setRows(5);
        jScrollPane21.setViewportView(jTextAreaSolicitudes);

        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(418, 418, 418))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Solicitudes", jPanel4);

        jTextAreaSolicitudesRegistradas.setColumns(20);
        jTextAreaSolicitudesRegistradas.setRows(5);
        jScrollPane23.setViewportView(jTextAreaSolicitudesRegistradas);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Atender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(399, 399, 399))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Atender Solicitudes", jPanel3);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setText("Filtro de Consulta");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Numero de Placa");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Estado de la Solicitud");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Numero de Cedula");

        jTextAreaFiltroConsulta.setColumns(20);
        jTextAreaFiltroConsulta.setRows(5);
        jScrollPane22.setViewportView(jTextAreaFiltroConsulta);

        jTextFieldNumPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldNumCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonConsultarFiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConsultarFiltro.setText("Consultar");
        jButtonConsultarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarFiltroActionPerformed(evt);
            }
        });

        jComboBoxEstadoAlquiler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Registrada", "Procesada", "Finalizada", "Rechazada" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(43, 43, 43)
                        .addComponent(jTextFieldNumPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(33, 33, 33)
                        .addComponent(jTextFieldNumCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxEstadoAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel26)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultarFiltro)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jTextFieldNumPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jTextFieldNumCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jComboBoxEstadoAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane4.addTab("Consulta de Solicitud", jPanel2);

        panelVehiculo.addTab("Alquiler", jTabbedPane4);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Numero de Placa");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Condiciones del vehiculo");

        jTextAreaDevolucion.setColumns(20);
        jTextAreaDevolucion.setRows(5);
        jScrollPane24.setViewportView(jTextAreaDevolucion);

        jButtonDevolucion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonDevolucion.setText("Devolucion");
        jButtonDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolucionActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel36.setText("Devolución de Vehículo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(71, 71, 71)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPlacaDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCondicionesDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDevolucion, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(55, 55, 55))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(254, 254, 254)))
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jTextFieldPlacaDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCondicionesDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDevolucion))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Devolucion vehiculo", jPanel6);

        jTextAreaDevo.setColumns(20);
        jTextAreaDevo.setRows(5);
        jScrollPane25.setViewportView(jTextAreaDevo);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Devoluciones", jPanel7);

        panelVehiculo.addTab("Devolucion", jTabbedPane1);

        jTextAreaTopClientes.setColumns(20);
        jTextAreaTopClientes.setRows(5);
        jScrollPane28.setViewportView(jTextAreaTopClientes);

        jButton5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton5.setText("Calcular");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(420, 420, 420))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton5)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Top 5 Clientes", jPanel8);

        jTextAreaTopVehiculos.setColumns(20);
        jTextAreaTopVehiculos.setRows(5);
        jScrollPane27.setViewportView(jTextAreaTopVehiculos);

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(420, 420, 420))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Top 5 Vehiculos", jPanel9);

        jTextAreaPromedio.setColumns(20);
        jTextAreaPromedio.setRows(5);
        jScrollPane26.setViewportView(jTextAreaPromedio);

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(422, 422, 422))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton2)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Promedio y total", jPanel10);

        panelVehiculo.addTab("Estadisticas", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 943, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 509, Short.MAX_VALUE)
        );

        panelVehiculo.getAccessibleContext().setAccessibleName("Rent Car");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQuitarExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarExtrasActionPerformed
        String numPlaca = jtext_numPlaca.getText();
        String extra = jtext_extras.getText();

        if (pilaRegistroVehiculo.search(numPlaca)) {
            Vehiculo vehiculo = pilaRegistroVehiculo.traerVehiculo(numPlaca);//aca traemos el vehiculo a la GUI para que se trabaje desde ahi
            vehiculo.getExtrasPila().popModificado(extra);//conseguimoos el vehiculo y le insertamos el extra

        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
        jTextAreaVehiculo.setText(pilaRegistroVehiculo.traerVehiculo(numPlaca).toString());
        jtext_extras.setText("");
    }//GEN-LAST:event_jButtonQuitarExtrasActionPerformed

    private void jButtonAgregarExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarExtrasActionPerformed
        String numPlaca = jtext_numPlaca.getText();
        String extra = jtext_extras.getText();

        if (pilaRegistroVehiculo.search(numPlaca)) {
            Vehiculo vehiculo = pilaRegistroVehiculo.traerVehiculo(numPlaca);//aca traemos el vehiculo a la GUI para que se trabaje desde ahi
            vehiculo.getExtrasPila().push(extra);//conseguimoos el vehiculo y le insertamos el extra
            pilaRegistroVehiculo.popModificado(numPlaca);//eliminamos el  vehiculo de la pila
            pilaRegistroVehiculo.push(vehiculo);// Insertamos nuevamente el vehiculo con las extras nuevas

        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
        jTextAreaVehiculo.setText(pilaRegistroVehiculo.traerVehiculo(numPlaca).toString());
        jtext_extras.setText("");
    }//GEN-LAST:event_jButtonAgregarExtrasActionPerformed

    private void jButtonBuscar_RefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar_RefrescarActionPerformed
        String numPlaca = jtext_numPlaca.getText();

        if (pilaRegistroVehiculo.search(numPlaca)) {
            jTextAreaVehiculo.setText(pilaRegistroVehiculo.traerVehiculo(numPlaca).toString());
        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
    }//GEN-LAST:event_jButtonBuscar_RefrescarActionPerformed

    private void jComboBox2EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2EstadoActionPerformed

    private void jComboBoxtipoCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxtipoCombustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxtipoCombustibleActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        jTextPaneDisplayRegistro2.setText(pilaRegistroVehiculo.listar2());
        jTextFieldPlaca.setText("");
        jTextPaneValorAModificar.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        String placa = jTextFieldPlaca.getText();

        if (pilaRegistroVehiculo.search(placa)) {
            Vehiculo vehiculo = pilaRegistroVehiculo.traerVehiculo(placa);

            if (listaSoli.buscarVehiculo(vehiculo)) {
                JOptionPane.showMessageDialog(null, "El vehiculo no se puede eliminar, porque fue alquilado");
            } else {
                pilaRegistroVehiculo.popModificado(placa);
                jTextPaneDisplayRegistro2.setText(pilaRegistroVehiculo.listar2());
            }

        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonBuscarPlacaModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPlacaModificarVehiculoActionPerformed
        String numPlaca = jTextFieldPlaca.getText();

        if (pilaRegistroVehiculo.search(numPlaca)) {
            jTextPaneDisplayRegistro2.setText(pilaRegistroVehiculo.traerVehiculo(numPlaca).toString());
        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
    }//GEN-LAST:event_jButtonBuscarPlacaModificarVehiculoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        String numPlaca = jTextFieldPlaca.getText();
        String modifica = jTextPaneValorAModificar.getText();

        if (pilaRegistroVehiculo.search(numPlaca)) {
            Vehiculo vehiculo = pilaRegistroVehiculo.traerVehiculo(numPlaca);//aca traemos el vehiculo a la GUI para que se trabaje desde ahi
            switch (jComboBox1.getSelectedIndex()) {
                case 0:

                    vehiculo.setMarcaDeVehiculo(modifica);

                    break;
                case 1:
                    vehiculo.setModeloVehiculo(modifica);
                    break;
                case 2:
                    int modifica2 = Integer.parseInt(jTextPaneValorAModificar.getText());
                    vehiculo.setAniodeVehiculo(modifica2);
                    break;
                case 3:
                    vehiculo.setColorDeVehiculo(modifica);
                    break;
                case 4:
                    modifica2 = Integer.parseInt(jTextPaneValorAModificar.getText());
                    vehiculo.setCilindradaDeVehiculo(modifica2);
                    break;
                case 5:
                    switch (jComboBoxtipoCombustible.getSelectedIndex()) {
                        case 0:
                            modifica = "Gasolina";

                            break;
                        case 1:
                            modifica = "Diesel";

                            break;
                        case 2:
                            modifica = "Eléctrico";

                            break;
                        case 3:
                            modifica = "Gas Natural";

                            break;
                    }
                    vehiculo.setTipoCombustibleDeVehiculo(modifica);
                    break;
                case 6:
                    modifica2 = Integer.parseInt(jTextPaneValorAModificar.getText());
                    vehiculo.setCantPasajerosdeVehiculo(modifica2);
                    break;
                case 7:
                    modifica2 = Integer.parseInt(jTextPaneValorAModificar.getText());
                    vehiculo.setPrecioAlquilerXDiaDeVehiculo(modifica2);
                    break;
                case 8:
                    switch (jComboBox2Estado.getSelectedIndex()) {
                        case 0:
                            modifica = "Disponible";

                            break;
                        case 1:
                            modifica = "Alquilado";

                            break;
                        case 2:
                            modifica = "En reparacion";

                            break;
                        case 3:
                            modifica = "Fuera de circulacion";

                            break;
                    }
                    vehiculo.setEstadoParaSerAlquilado(modifica);
                    break;

            }

        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        jTextPaneDisplayModificar.setText(colaRegistroCliente.toString());
        jTextFieldCedulaClienteVerificar.setText("");
        jTextPaneValorAModificar.setText("");
        jComboBoxOpcionesCliente.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jComboBoxOpcionesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionesClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOpcionesClienteActionPerformed

    private void jButtonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar1ActionPerformed
        int cedula = Integer.parseInt(jTextFieldCedulaClienteVerificar.getText());

        if (colaRegistroCliente.search(cedula)) {

            Cliente cliente = colaRegistroCliente.traerCliente(cedula);
            if (cliente.isAlquilando()) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar al cliente, porque ha iniciado un alquiler");
            } else {

                colaRegistroCliente.eliminaModificado(cedula);

            }

        } else {
            JOptionPane.showMessageDialog(null, "el cliente no existe");
        }
        jTextPaneDisplayModificar.setText(colaRegistroCliente.listar2());
    }//GEN-LAST:event_jButtonEliminar1ActionPerformed

    private void jButtonBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCedulaActionPerformed
        int cedula = Integer.parseInt(jTextFieldCedulaClienteVerificar.getText());

        if (colaRegistroCliente.search(cedula)) {
            jTextPaneDisplayModificar.setText(colaRegistroCliente.traerCliente(cedula).listar());
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        }
    }//GEN-LAST:event_jButtonBuscarCedulaActionPerformed

    private void jTextFieldCedulaClienteVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCedulaClienteVerificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCedulaClienteVerificarActionPerformed

    private void jButtonModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificar1ActionPerformed
        int cedula = Integer.parseInt(jTextFieldCedulaClienteVerificar.getText());
        String modifica = jTextPaneValorAModificar1.getText();

        if (colaRegistroCliente.search(cedula)) {
            Cliente clientito = colaRegistroCliente.traerCliente(cedula);//aca traemos el cliente a la GUI para que se trabaje desde ahi
            switch (jComboBoxOpcionesCliente.getSelectedIndex()) {
                case 0:
                    clientito.setNombreCompleto(modifica);
                    break;

                case 1:
                    clientito.setFechaNacimiento(modifica);
                    break;

                case 2:
                    clientito.setCorreoElectronico(modifica);
                    break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        }
        jTextPaneDisplayModificar.setText(colaRegistroCliente.toString());
    }//GEN-LAST:event_jButtonModificar1ActionPerformed

    private void jButtonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalir1ActionPerformed

    }//GEN-LAST:event_jButtonSalir1ActionPerformed

    private void jButtonRefrescarRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefrescarRegistroClienteActionPerformed
        jTextPaneDisplayRegistro.setText(colaRegistroCliente.toString());
    }//GEN-LAST:event_jButtonRefrescarRegistroClienteActionPerformed

    private void jButtonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarClienteActionPerformed
        String nombre = jTextFieldNombreCliente.getText();
        int cedula = Integer.parseInt(jTextFieldCedulaCliente.getText());
        String correo = jTextFieldCorreoCliente.getText();
        String fechaNacimiento = jTextFieldFechaCliente.getText();
        String categoria = "";
        switch (jComboBoxCategorriaClente.getSelectedIndex()) {
            case 0:
                categoria = "Bronce";

                break;
            case 1:
                categoria = "Plata";

                break;
            case 2:
                categoria = "Oro";

                break;
            case 3:
                categoria = "Zafiro";

                break;
        }
        int cantAlquileres = 0;
        
        Cliente clientito = new Cliente(cedula, nombre, fechaNacimiento, correo,
                categoria, cantAlquileres, false);

        colaRegistroCliente.encola(clientito);

        jTextPaneDisplayRegistro1.setText(colaRegistroCliente.toString());

        limpiarConsola();
    }//GEN-LAST:event_jButtonRegistrarClienteActionPerformed

    private void jComboBoxCategorriaClenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategorriaClenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategorriaClenteActionPerformed

    private void jTextFieldCorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoClienteActionPerformed

    private void jTextFieldNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreClienteActionPerformed

    private void jButtonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefrescarActionPerformed

    }//GEN-LAST:event_jButtonRefrescarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        int cedula = Integer.parseInt(jTextFieldCedulaConsulta.getText());
        if (colaRegistroCliente.search(cedula)) {
            jTextPaneInformacionClinete.setText(colaRegistroCliente.traerCliente(cedula).listar());
        } else {
            jTextPaneInformacionClinete.setText("");
            JOptionPane.showMessageDialog(null, "El cliente no existe");
            jTextFieldCedulaConsulta.setText("");
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonRefrescarRegistroVehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefrescarRegistroVehiculo1ActionPerformed
        jTextPaneDisplayRegistro.setText(pilaRegistroVehiculo.listar2());
    }//GEN-LAST:event_jButtonRefrescarRegistroVehiculo1ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String placa = jTextPanePlaca.getText();
        String marca = jTextPaneMarca.getText();
        String modelo = jTextPaneModelo.getText();
        String color = jTextPaneColor.getText();
        String estado = "";
        int cantPasajeros = Integer.parseInt(jTextPaneCantPasajeros.getText());
        double precio = Double.parseDouble(jTextPaneAnnio.getText());
        int anio = Integer.parseInt(jTextPaneAnnio.getText());
        int cilindraje = Integer.parseInt(jTextPaneCilindraje.getText());
        String combustible = "";
        switch (jComboBoxSelectorDeCombustible.getSelectedIndex()) {
            case 0:
                combustible = "Gasolina";

                break;
            case 1:
                combustible = "Diesel";

                break;
            case 2:
                combustible = "Eléctrico";

                break;
            case 3:
                combustible = "Gas Natural";

                break;
        }
        switch (jComboBox2SelectorEstado.getSelectedIndex()) {
            case 0:
                estado = "Disponible";

                break;
            case 1:
                estado = "Alquilado";

                break;
            case 2:
                estado = "En reparacion";

                break;
            case 3:
                estado = "Fuera de circulacion";

                break;
        }
        Vehiculo vehiculito = new Vehiculo(placa, marca, modelo, anio, color,
                cilindraje, combustible, cantPasajeros, precio, estado);

        pilaRegistroVehiculo.push(vehiculito);

        jTextPaneDisplayRegistro.setText(pilaRegistroVehiculo.listar2());

        limpiarConsola();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jComboBoxSelectorDeCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectorDeCombustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelectorDeCombustibleActionPerformed

    private void jButtonCrearSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearSolicitudActionPerformed

        if ("".equals(jTextFieldCedula.getText()) || "".equals(jTextFieldDiasAlquiler.getText())
                || "".equals(jTextFieldAnioAlquiler.getText()) || "".equals(jTextFieldMesAlquiler.getText())
                || "".equals(jTextFieldDiaAlquiler.getText())) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos ");
        } else {

            int diasAlquiler = Integer.parseInt(jTextFieldDiasAlquiler.getText());
            int cedula = Integer.parseInt(jTextFieldCedula.getText());

            if (colaRegistroCliente.search(cedula)) {
                //aca traemos el cliente a la GUI para que se trabaje desde ahi
                Cliente clientito = colaRegistroCliente.traerCliente(cedula);
                if (clientito.getCategoria().equals("") && diasAlquiler >= 30) {
                    clientito.setCategoria("Bronce");
                    JOptionPane.showMessageDialog(null, "Felicidades subiste a " + clientito.getCategoria());
                } else {
                    if (clientito.getCategoria().equals("Bronce") && diasAlquiler >= 30) {
                        clientito.setCategoria("Plata");
                        JOptionPane.showMessageDialog(null, "Felicidades subiste a " + clientito.getCategoria());
                    } else {
                        if (clientito.getCategoria().equals("Plata") && diasAlquiler >= 30) {
                            clientito.setCategoria("Oro");
                            JOptionPane.showMessageDialog(null, "Felicidades subiste a " + clientito.getCategoria());
                        } else {
                            if (clientito.getCategoria().equals("Oro") && diasAlquiler >= 30) {
                                clientito.setCategoria("Zafiro");
                                JOptionPane.showMessageDialog(null, "Felicidades subiste a " + clientito.getCategoria());
                            }
                        }
                    }
                }
                int index = jComboBoxCantPasajeros.getSelectedIndex();
                int cantPasajeros = 0;
                switch (index) {
                    case 0:
                        cantPasajeros = 4;
                        break;
                    case 1:
                        cantPasajeros = 5;
                        break;
                    case 2:
                        cantPasajeros = 7;
                        break;
                    case 3:
                        cantPasajeros = 12;
                        break;
                }

                String marca = "-";
                int anio = 0;
                String modelo = "-";
                String extra = "-";
                if (!"".equals(jTextFieldMarca.getText())) {
                    marca = jTextFieldMarca.getText();
                }
                if (!"".equals(jTextFieldAnio.getText())) {
                    anio = Integer.parseInt(jTextFieldAnio.getText());
                }
                if (!"".equals(jTextFieldModelo.getText())) {
                    modelo = jTextFieldModelo.getText();
                }
                if (!"".equals(jTextAreaExtras.getText())) {
                    extra = jTextAreaExtras.getText();
                }

                int anioAlquiler = Integer.parseInt(jTextFieldAnioAlquiler.getText());
                int monthAlquiler = Integer.parseInt(jTextFieldMesAlquiler.getText());
                int diaAlquiler = Integer.parseInt(jTextFieldDiaAlquiler.getText());

                LocalDate fechaInicialAlquiler = LocalDate.of(anioAlquiler, monthAlquiler, diaAlquiler);
                LocalDate fechaFinalAlquiler = fechaInicialAlquiler.plusDays(diasAlquiler);

                soliAlquiler = new SolicitudDeAlquiler("Registrada", diasAlquiler, clientito,
                        cantPasajeros, marca, anio, modelo, extra, fechaInicialAlquiler, fechaFinalAlquiler, 0);
                listaSoli.agregarSolicitud(soliAlquiler);

                jTextAreaSolicitudes.setText(listaSoli.toString());
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }

        }


    }//GEN-LAST:event_jButtonCrearSolicitudActionPerformed

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!listaSoli.Vacia()) {
            if (listaSoli.existSoliRegistrada()) {
                JOptionPane.showMessageDialog(null, "Si hay solicitudes registradas");
                int idSoli = 0;
                if (listaSoli.existZafiro() != 0) {
                    idSoli = listaSoli.existZafiro();
                    SolicitudDeAlquiler soli = listaSoli.traerSoli(idSoli);
                    if (soli.getUsuarioSolicitud().getCategoria().equals("Zafiro")) {
                        JOptionPane.showMessageDialog(null, "La solicitud es zafiro");
                        creacionDeListaBusqueda(soli);
                        if (!listaFiltro.Vacia()) {
                            //busqueda especial para zafiros
                            if (filtro == false) {
                                int anio = 2020;
                                if (listaFiltro.buscarParaZafiros(anio)) {
                                    listaFiltro.eliminaParaZafiros(anio);
                                    Vehiculo vehiculo = listaFiltro.asignarVehiculoASoli();
                                    vehiculo.setEstadoParaSerAlquilado("Alquilado");
                                    vehiculo.setCantidadDeVecesAlquilado(vehiculo.getCantidadDeVecesAlquilado() + 1);
                                    soli.setVehiculoSoli(vehiculo);
                                    soli.setEstadoDeSolicitud("Procesada");
                                    soli.getUsuarioSolicitud().setCantidadDeAlquileresProcesados(soli.getUsuarioSolicitud().getCantidadDeAlquileresProcesados() + 1);
                                    soli.getUsuarioSolicitud().getListaAlquilerdeCliente().agregarAlquiler(soli);
                                    soli.getUsuarioSolicitud().setAlquilando(true);
                                    double monto = soliAlquiler.calcularMonto(vehiculo.getPrecioAlquilerXDiaDeVehiculo(), soli.getCantidadDeDiasSolicitud());
                                    listaSoli.setCantidadSolicitudesProcesadasZafiro(listaSoli.getCantidadSolicitudesProcesadasZafiro() + 1);
                                    listaSoli.setTotalSolicitudesProcesadasZafiro(listaSoli.getTotalSolicitudesProcesadasZafiro() + monto);
                                    soli.setMontoAlquiler(monto);

                                    jTextAreaSolicitudesRegistradas.setText(soli.toString2());
                                } else {
                                    jTextAreaSolicitudesRegistradas.setText("No hay  vehiculos de años recientes para clientes Zafiros");
                                    soli.setEstadoDeSolicitud("Rechazada");
                                    listaFiltro.limpiarLista();

                                }

                            } else {
                                Vehiculo vehiculo = listaFiltro.asignarVehiculoASoli();
                                vehiculo.setEstadoParaSerAlquilado("Alquilado");
                                vehiculo.setCantidadDeVecesAlquilado(vehiculo.getCantidadDeVecesAlquilado() + 1);
                                soli.setVehiculoSoli(vehiculo);
                                soli.setEstadoDeSolicitud("Procesada");
                                soli.getUsuarioSolicitud().setCantidadDeAlquileresProcesados(soli.getUsuarioSolicitud().getCantidadDeAlquileresProcesados() + 1);
                                soli.getUsuarioSolicitud().getListaAlquilerdeCliente().agregarAlquiler(soli);
                                soli.getUsuarioSolicitud().setAlquilando(true);
                                double monto = soliAlquiler.calcularMonto(vehiculo.getPrecioAlquilerXDiaDeVehiculo(), soli.getCantidadDeDiasSolicitud());

                                soli.setMontoAlquiler(monto);
                                jTextAreaSolicitudesRegistradas.setText(soli.toString2());
                            }
                        }

                    }
                } else if (listaSoli.existOro() != 0) {
                    idSoli = listaSoli.existOro();
                    SolicitudDeAlquiler soli = listaSoli.traerSoli(idSoli);
                    JOptionPane.showMessageDialog(null, "La solicitud es oro");
                    creacionDeListaBusqueda(soli);
                    if (!listaFiltro.Vacia()) {
                        Vehiculo vehiculo = listaFiltro.asignarVehiculoASoli();
                        vehiculo.setEstadoParaSerAlquilado("Alquilado");
                        vehiculo.setCantidadDeVecesAlquilado(vehiculo.getCantidadDeVecesAlquilado() + 1);
                        soli.setVehiculoSoli(vehiculo);
                        soli.setEstadoDeSolicitud("Procesada");
                        soli.getUsuarioSolicitud().setCantidadDeAlquileresProcesados(soli.getUsuarioSolicitud().getCantidadDeAlquileresProcesados() + 1);
                        soli.getUsuarioSolicitud().getListaAlquilerdeCliente().agregarAlquiler(soli);
                        soli.getUsuarioSolicitud().setAlquilando(true);
                        double monto = soliAlquiler.calcularMonto(vehiculo.getPrecioAlquilerXDiaDeVehiculo(), soli.getCantidadDeDiasSolicitud());
                        listaSoli.setCantidadSolicitudesProcesadasOro(listaSoli.getCantidadSolicitudesProcesadasOro() + 1);
                        listaSoli.setTotalSolicitudesProcesadasOro(listaSoli.getTotalSolicitudesProcesadasOro() + monto);
                        if (monto > 70000) {
                            subirCategoriaCliente(soli.getUsuarioSolicitud());
                        }
                        soli.setMontoAlquiler(monto);
                        jTextAreaSolicitudesRegistradas.setText(soli.toString2());
                    }

                } else if (listaSoli.existPlata() != 0) {
                    idSoli = listaSoli.existPlata();
                    SolicitudDeAlquiler soli = listaSoli.traerSoli(idSoli);
                    JOptionPane.showMessageDialog(null, "La solicitud es plata");
                    creacionDeListaBusqueda(soli);
                    if (!listaFiltro.Vacia()) {
                        Vehiculo vehiculo = listaFiltro.asignarVehiculoASoli();
                        vehiculo.setEstadoParaSerAlquilado("Alquilado");
                        vehiculo.setCantidadDeVecesAlquilado(vehiculo.getCantidadDeVecesAlquilado() + 1);
                        soli.setVehiculoSoli(vehiculo);
                        soli.setEstadoDeSolicitud("Procesada");
                        soli.getUsuarioSolicitud().setCantidadDeAlquileresProcesados(soli.getUsuarioSolicitud().getCantidadDeAlquileresProcesados() + 1);
                        soli.getUsuarioSolicitud().getListaAlquilerdeCliente().agregarAlquiler(soli);
                        soli.getUsuarioSolicitud().setAlquilando(true);
                        double monto = soliAlquiler.calcularMonto(vehiculo.getPrecioAlquilerXDiaDeVehiculo(), soli.getCantidadDeDiasSolicitud());
                        listaSoli.setCantidadSolicitudesProcesadasPlata(listaSoli.getCantidadSolicitudesProcesadasPlata() + 1);
                        listaSoli.setTotaldSolicitudesProcesadasPlata(listaSoli.getTotaldSolicitudesProcesadasPlata() + monto);
                        if (monto > 70000) {
                            subirCategoriaCliente(soli.getUsuarioSolicitud());
                        }
                        soli.setMontoAlquiler(monto);
                        jTextAreaSolicitudesRegistradas.setText(soli.toString2());
                    }
                } else if (listaSoli.existBronce() != 0) {
                    idSoli = listaSoli.existBronce();
                    SolicitudDeAlquiler soli = listaSoli.traerSoli(idSoli);
                    JOptionPane.showMessageDialog(null, "La solicitud es bronce");
                    creacionDeListaBusqueda(soli);
                    if (!listaFiltro.Vacia()) {
                        Vehiculo vehiculo = listaFiltro.asignarVehiculoASoli();
                        vehiculo.setEstadoParaSerAlquilado("Alquilado");
                        vehiculo.setCantidadDeVecesAlquilado(vehiculo.getCantidadDeVecesAlquilado() + 1);
                        soli.setVehiculoSoli(vehiculo);
                        soli.setEstadoDeSolicitud("Procesada");
                        soli.getUsuarioSolicitud().setCantidadDeAlquileresProcesados(soli.getUsuarioSolicitud().getCantidadDeAlquileresProcesados() + 1);
                        soli.getUsuarioSolicitud().getListaAlquilerdeCliente().agregarAlquiler(soli);
                        soli.getUsuarioSolicitud().setAlquilando(true);
                        double monto = soliAlquiler.calcularMonto(vehiculo.getPrecioAlquilerXDiaDeVehiculo(), soli.getCantidadDeDiasSolicitud());
                        listaSoli.setCantidadSolicitudesProcesadasBronce(listaSoli.getCantidadSolicitudesProcesadasBronce() + 1);
                        listaSoli.setTotalSolicitudesProcesadasBronce(listaSoli.getTotalSolicitudesProcesadasBronce() + monto);
                        if (monto > 70000) {
                            subirCategoriaCliente(soli.getUsuarioSolicitud());
                        }
                        soli.setMontoAlquiler(monto);
                        jTextAreaSolicitudesRegistradas.setText(soli.toString2());
                    }

                } else {
                    idSoli = listaSoli.existSinCategoria();
                    SolicitudDeAlquiler soli = listaSoli.traerSoli(idSoli);
                    JOptionPane.showMessageDialog(null, "La solicitud es sin categoria");
                    creacionDeListaBusqueda(soli);
                    if (!listaFiltro.Vacia()) {
                        Vehiculo vehiculo = listaFiltro.asignarVehiculoASoli();
                        vehiculo.setEstadoParaSerAlquilado("Alquilado");
                        vehiculo.setCantidadDeVecesAlquilado(vehiculo.getCantidadDeVecesAlquilado() + 1);
                        soli.setVehiculoSoli(vehiculo);
                        soli.setEstadoDeSolicitud("Procesada");
                        soli.getUsuarioSolicitud().setCantidadDeAlquileresProcesados(soli.getUsuarioSolicitud().getCantidadDeAlquileresProcesados() + 1);
                        soli.getUsuarioSolicitud().getListaAlquilerdeCliente().agregarAlquiler(soli);
                        soli.getUsuarioSolicitud().setAlquilando(true);
                        double monto = soliAlquiler.calcularMonto(vehiculo.getPrecioAlquilerXDiaDeVehiculo(), soli.getCantidadDeDiasSolicitud());
                        listaSoli.setCantidadSolicitudesProcesadasSinCategoria(listaSoli.getCantidadSolicitudesProcesadasSinCategoria() + 1);
                        listaSoli.setTotalSolicitudesProcesadasSinCategoria(listaSoli.getTotalSolicitudesProcesadasSinCategoria() + monto);
                        if (monto > 70000) {
                            subirCategoriaCliente(soli.getUsuarioSolicitud());
                        }
                        soli.setMontoAlquiler(monto);
                        jTextAreaSolicitudesRegistradas.setText(soli.toString2());
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "No hay solicitudes registradas");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay solicitudes que atender");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConsultarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarFiltroActionPerformed

        creacionDeListaConsultaSoli();
        String placa = "-";
        int cedula = 0;
        String estado = "";
        int index = jComboBoxEstadoAlquiler.getSelectedIndex();
        switch (index) {
            case 0:
                estado = "";
                break;
            case 1:
                estado = "Registrada";
                break;
            case 2:
                estado = "Procesada";
                break;
            case 3:
                estado = "Finalizada";
                break;
            case 4:
                estado = "Rechazada";
                break;

        }

        if (!listaConsulta.Vacia()) {
            if (!"".equals(jTextFieldNumPlaca.getText())) {
                placa = jTextFieldNumPlaca.getText();
                if (listaConsulta.buscarXPlaca(placa)) {
                    listaConsulta.eliminaXPlaca(placa);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe una solicitud con un vehiculo placa: " + placa);
                    listaConsulta.limpiarLista();
                }

            }
        }
        if (!listaConsulta.Vacia()) {
            if (!"".equals(jTextFieldNumCedula.getText())) {
                cedula = Integer.parseInt(jTextFieldNumCedula.getText());
                if (listaConsulta.buscarXCedula(cedula)) {
                    listaConsulta.eliminaXCedula(cedula);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe una solicitud con un cliente cedula: " + cedula);
                    listaConsulta.limpiarLista();
                }
            }
        }
        if (!listaConsulta.Vacia()) {
            if (!"".equals(estado)) {

                if (listaConsulta.buscarXEstado(estado)) {
                    listaConsulta.eliminaXEstado(estado);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe una solicitud con un estado: " + estado);
                    listaConsulta.limpiarLista();
                }
            }
        }
        jTextAreaFiltroConsulta.setText(listaConsulta.toString());


    }//GEN-LAST:event_jButtonConsultarFiltroActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextAreaSolicitudes.setText(listaSoli.toString());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolucionActionPerformed
        String placa = jTextFieldPlacaDevo.getText();
        if (!listaSoli.Vacia()) {
            if (listaSoli.existVehiculoSoli(placa)) {
                SolicitudDeAlquiler soli = listaSoli.traerSoliVehiculo(placa);
                soli.getUsuarioSolicitud().setAlquilando(false);
                soli.getVehiculoSoli().setEstadoParaSerAlquilado("Disponible");
                soli.setEstadoDeSolicitud("Finalizada");
                jTextAreaDevolucion.setText(soli.toString2());
                Devolucion devolucion = new Devolucion(soli, jTextFieldCondicionesDevo.getText());
                listaDevo.agregarAlquiler(devolucion);
                jTextAreaDevo.setText(listaDevo.toString2());
            } else {
                JOptionPane.showMessageDialog(null, "No existe una solicitud con un Vehiculo placa " + placa);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay solicitudes");
        }
    }//GEN-LAST:event_jButtonDevolucionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int saltos = 0;
        if (!listaTopClientes.Vacia()) {
            listaTopClientes.limpiarLista();
        }
        while (saltos != colaRegistroCliente.tamanio()) {
            Cliente cliente = colaRegistroCliente.retornaCliente(saltos);
            listaTopClientes.agregarClienteTop(cliente);
            saltos += 1;
        }
        jTextAreaTopClientes.setText(listaTopClientes.toString());

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            listaTopVehiculos.calculaMejorVehiculo(pilaRegistroVehiculo);
            jTextAreaTopVehiculos.setText(listaTopVehiculos.toStringModificado());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s = "";

        double promedioZafiro = 0;
        double promedioOro = 0;
        double promedioPlata = 0;
        double promedioBronce = 0;
        double promedioSinCategoria = 0;

        if (listaSoli.getCantidadSolicitudesProcesadasZafiro() != 0) {
            promedioZafiro = listaSoli.getTotalSolicitudesProcesadasZafiro() / listaSoli.getCantidadSolicitudesProcesadasZafiro();
        }
        if (listaSoli.getCantidadSolicitudesProcesadasOro() != 0) {
            promedioOro = listaSoli.getTotalSolicitudesProcesadasOro() / listaSoli.getCantidadSolicitudesProcesadasOro();
        }
        if (listaSoli.getCantidadSolicitudesProcesadasPlata() != 0) {
            promedioPlata = listaSoli.getTotaldSolicitudesProcesadasPlata() / listaSoli.getCantidadSolicitudesProcesadasPlata();

        }
        if (listaSoli.getCantidadSolicitudesProcesadasBronce() != 0) {
            promedioBronce = listaSoli.getTotalSolicitudesProcesadasBronce() / listaSoli.getCantidadSolicitudesProcesadasBronce();

        }
        if (listaSoli.getCantidadSolicitudesProcesadasSinCategoria() != 0) {
            promedioSinCategoria = listaSoli.getTotalSolicitudesProcesadasSinCategoria() / listaSoli.getCantidadSolicitudesProcesadasSinCategoria();

        }

        s = s + "El promedio de categoria Zafiro es: " + promedioZafiro 
                + " y el total es: " 
                + listaSoli.getTotalSolicitudesProcesadasZafiro() + "\n\n"
                + "El promedio de categoria Oro es: " 
                + promedioOro + " y el total es: " 
                + listaSoli.getTotalSolicitudesProcesadasOro() + "\n\n"
                + "El promedio de categoria Plata es: " 
                + promedioPlata + " y el total es: " 
                + listaSoli.getTotaldSolicitudesProcesadasPlata() + "\n\n"
                + "El promedio de categoria Bronce es: " 
                + promedioBronce + " y el total es: " 
                + listaSoli.getTotalSolicitudesProcesadasBronce() + "\n\n"
                + "El promedio de sin categoria es: " 
                + promedioSinCategoria + " y el total es: "
                + listaSoli.getTotalSolicitudesProcesadasSinCategoria() + "\n\n";

        jTextAreaPromedio.setText(s);

    }//GEN-LAST:event_jButton2ActionPerformed

    public void limpiarConsola() {
        jTextPanePlaca.setText("");
        jTextPaneMarca.setText("");
        jTextPaneModelo.setText("");
        jTextPaneColor.setText("");
        jTextPaneCantPasajeros.setText("");
        jTextPanePrecio.setText("");
        jTextPaneAnnio.setText("");
        jTextPaneCilindraje.setText("");
        jComboBoxSelectorDeCombustible.setSelectedIndex(0);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMain().setVisible(true);
            }
        });
    }
    Pila_RegistroVehiculo pilaRegistroVehiculo = new Pila_RegistroVehiculo();
    Cola_RegistroCliente colaRegistroCliente = new Cola_RegistroCliente();
    ListaDobleEnlazadaResultadosBusqueda listaFiltro = new ListaDobleEnlazadaResultadosBusqueda();
    ListaDobleEnlazadaSolicitudesAlquiler listaSoli = new ListaDobleEnlazadaSolicitudesAlquiler();
    SolicitudDeAlquiler soliAlquiler = new SolicitudDeAlquiler();
    ListaDobleEnlazadaAlquileresConsultar listaConsulta = new ListaDobleEnlazadaAlquileresConsultar();
    ListaDobleEnlazadaAlquileres_Cliente listaAlquileresCliente = new ListaDobleEnlazadaAlquileres_Cliente();
    ListaDobleEnlazadaDevolucion listaDevo = new ListaDobleEnlazadaDevolucion();
    ListaDobleEnlazadaTopClientes listaTopClientes = new ListaDobleEnlazadaTopClientes();
    ListaOrdenadaTopVehiculos listaTopVehiculos = new ListaOrdenadaTopVehiculos();

    boolean filtro = false;//variable para saber si busca con filtro
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregarExtras;
    private javax.swing.JButton jButtonBuscarCedula;
    private javax.swing.JButton jButtonBuscarPlacaModificarVehiculo;
    private javax.swing.JButton jButtonBuscar_Refrescar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonConsultarFiltro;
    private javax.swing.JButton jButtonCrearSolicitud;
    private javax.swing.JButton jButtonDevolucion;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonModificar1;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonQuitarExtras;
    private javax.swing.JButton jButtonRefrescar;
    private javax.swing.JButton jButtonRefrescarRegistroCliente;
    private javax.swing.JButton jButtonRefrescarRegistroVehiculo1;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegistrarCliente;
    private javax.swing.JButton jButtonSalir1;
    private javax.swing.JButton jButtonSalirModificarVehiculo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2Estado;
    private javax.swing.JComboBox<String> jComboBox2SelectorEstado;
    private javax.swing.JComboBox<String> jComboBoxCantPasajeros;
    private javax.swing.JComboBox<String> jComboBoxCategorriaClente;
    private javax.swing.JComboBox<String> jComboBoxEstadoAlquiler;
    private javax.swing.JComboBox<String> jComboBoxOpcionesCliente;
    private javax.swing.JComboBox<String> jComboBoxSelectorDeCombustible;
    private javax.swing.JComboBox<String> jComboBoxtipoCombustible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelCombustible;
    private javax.swing.JLabel jLabelInfoDeVehiculoConExtras;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelParametroAModificar;
    private javax.swing.JLabel jLabelParametroAModificar1;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelPlaca1;
    private javax.swing.JLabel jLabelPlaca2;
    private javax.swing.JLabel jLabelPlacaAnnio;
    private javax.swing.JLabel jLabelPlacaCilindraje;
    private javax.swing.JLabel jLabelPlacaModelo;
    private javax.swing.JLabel jLabelRegistrarVehiculo;
    private javax.swing.JLabel jLabelRegistroVehiculo2;
    private javax.swing.JLabel jLabelRegistro_de_Vehiculos;
    private javax.swing.JLabel jLabelValorAModificar;
    private javax.swing.JLabel jLabelValorAModificar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextArea jTextAreaCarrosDisponibles;
    private javax.swing.JTextArea jTextAreaDevo;
    private javax.swing.JTextArea jTextAreaDevolucion;
    private javax.swing.JTextArea jTextAreaExtras;
    private javax.swing.JTextArea jTextAreaFiltroConsulta;
    private javax.swing.JTextArea jTextAreaPromedio;
    private javax.swing.JTextArea jTextAreaSolicitudes;
    private javax.swing.JTextArea jTextAreaSolicitudesRegistradas;
    private javax.swing.JTextArea jTextAreaTopClientes;
    private javax.swing.JTextArea jTextAreaTopVehiculos;
    private javax.swing.JTextArea jTextAreaVehiculo;
    private javax.swing.JTextField jTextFieldAnio;
    private javax.swing.JTextField jTextFieldAnioAlquiler;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCedulaCliente;
    private javax.swing.JTextField jTextFieldCedulaClienteVerificar;
    private javax.swing.JTextField jTextFieldCedulaConsulta;
    private javax.swing.JTextField jTextFieldCondicionesDevo;
    private javax.swing.JTextField jTextFieldCorreoCliente;
    private javax.swing.JTextField jTextFieldDiaAlquiler;
    private javax.swing.JTextField jTextFieldDiasAlquiler;
    private javax.swing.JTextField jTextFieldFechaCliente;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldMesAlquiler;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private javax.swing.JTextField jTextFieldNumCedula;
    private javax.swing.JTextField jTextFieldNumPlaca;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldPlacaDevo;
    private javax.swing.JTextPane jTextPaneAnnio;
    private javax.swing.JTextPane jTextPaneCantPasajeros;
    private javax.swing.JTextPane jTextPaneCilindraje;
    private javax.swing.JTextPane jTextPaneColor;
    private javax.swing.JTextArea jTextPaneDisplayModificar;
    private javax.swing.JTextPane jTextPaneDisplayRegistro;
    private javax.swing.JTextArea jTextPaneDisplayRegistro1;
    private javax.swing.JTextPane jTextPaneDisplayRegistro2;
    private javax.swing.JTextPane jTextPaneInformacionClinete;
    private javax.swing.JTextPane jTextPaneMarca;
    private javax.swing.JTextPane jTextPaneModelo;
    private javax.swing.JTextPane jTextPanePlaca;
    private javax.swing.JTextPane jTextPanePrecio;
    private javax.swing.JTextPane jTextPaneValorAModificar;
    private javax.swing.JTextPane jTextPaneValorAModificar1;
    private javax.swing.JTextPane jtext_extras;
    private javax.swing.JTextPane jtext_numPlaca;
    private javax.swing.JTabbedPane panelCliente;
    private javax.swing.JTabbedPane panelVehiculo;
    private javax.swing.JPanel pestañaConsultaCliente;
    private javax.swing.JPanel pestañaExtras;
    private javax.swing.JPanel pestañaModificaEliminaCliente;
    private javax.swing.JPanel pestañaModificarEliminarVehiculo;
    private javax.swing.JPanel pestañaRegistrarVehiculo;
    private javax.swing.JPanel pestañaRegistroCliente;
    private javax.swing.JTabbedPane pestañasVehiculo;
    // End of variables declaration//GEN-END:variables

}
