package GUI;

import EstructurasDeDatos.*;
import ObjetosdelProyecto.Objetos.Vehiculo;
import javax.swing.JOptionPane;

public class GUIRegistroVehiculo extends javax.swing.JFrame {

    public GUIRegistroVehiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneRegistrarvehiculo = new javax.swing.JTabbedPane();
        JPanelRegistrarVehiculo = new javax.swing.JPanel();
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
        jButtonSalir = new javax.swing.JButton();
        jButtonRefrescarRegistroVehiculo1 = new javax.swing.JButton();
        jButtonLimpiarBusqueda2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextPaneCantPasajeros = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPanePrecio = new javax.swing.JTextPane();
        jPanelModificarVehiculo = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPaneDisplayRegistro1 = new javax.swing.JTextPane();
        jButtonModificar = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPaneDisplayRegistro2 = new javax.swing.JTextPane();
        jLabelRegistroVehiculo2 = new javax.swing.JLabel();
        jLabelVehiculoSeleccionado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelParametroAModificar = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPaneValorAModificar = new javax.swing.JTextPane();
        jLabelValorAModificar = new javax.swing.JLabel();
        jButtonRefrescarVisualizacionRegistro2 = new javax.swing.JButton();
        jButtonBuscarPlacaModificarVehiculo = new javax.swing.JButton();
        jButtonSalirModificarVehiculo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiarBusqueda1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxtipoCombustibleExtras = new javax.swing.JComboBox<>();
        jCheckBoxUsarElTipoDeCombustible = new javax.swing.JCheckBox();
        jButtonAplicarCambioTipoCombustible = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jtext_numPlaca = new javax.swing.JTextPane();
        jButtonBuscar_Refrescar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelInfoDeVehiculoConExtras = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtext_extras = new javax.swing.JTextPane();
        jButtonAgregarExtras = new javax.swing.JButton();
        jButtonQuitarExtras = new javax.swing.JButton();
        jButtonLimpiarbusqueda3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehiculo");

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

        jLabelPlacaCilindraje.setText("Ciilindraje:");

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

        jButtonSalir.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonRefrescarRegistroVehiculo1.setBackground(new java.awt.Color(51, 255, 51));
        jButtonRefrescarRegistroVehiculo1.setText("Refrescar Registro Vehículo");

        jButtonLimpiarBusqueda2.setBackground(new java.awt.Color(255, 153, 204));
        jButtonLimpiarBusqueda2.setText("Limpiar Búsqueda");
        jButtonLimpiarBusqueda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarBusqueda2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad de Pasajeros");

        jLabel5.setText("Precio de Alquiler");

        jScrollPane14.setViewportView(jTextPaneCantPasajeros);

        jScrollPane15.setViewportView(jTextPane6);

        jScrollPane16.setViewportView(jTextPanePrecio);

        javax.swing.GroupLayout JPanelRegistrarVehiculoLayout = new javax.swing.GroupLayout(JPanelRegistrarVehiculo);
        JPanelRegistrarVehiculo.setLayout(JPanelRegistrarVehiculoLayout);
        JPanelRegistrarVehiculoLayout.setHorizontalGroup(
            JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelRegistrarVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(jLabelRegistro_de_Vehiculos)
                        .addGap(109, 109, 109)
                        .addComponent(jButtonRefrescarRegistroVehiculo1)
                        .addGap(158, 158, 158))
                    .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLimpiarBusqueda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                        .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBoxSelectorDeCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabelCombustible)
                                                    .addComponent(jLabelPlacaAnnio)
                                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabelPlacaCilindraje)
                                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        JPanelRegistrarVehiculoLayout.setVerticalGroup(
            JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                        .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelRegistro_de_Vehiculos)
                                    .addComponent(jButtonRefrescarRegistroVehiculo1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabelRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabelPlaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMarca)
                                    .addComponent(jLabelCombustible))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxSelectorDeCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPlacaModelo)
                                    .addComponent(jLabelPlacaAnnio))
                                .addGap(12, 12, 12)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPlacaCilindraje)
                                    .addComponent(jLabelColor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButtonLimpiarBusqueda2)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrar)
                .addGap(16, 16, 16)
                .addComponent(jButtonSalir)
                .addGap(15, 15, 15))
        );

        jTabbedPaneRegistrarvehiculo.addTab("Registrar Vehiculo", new javax.swing.ImageIcon(getClass().getResource("/AnexosEImagenes/addImage.png")), JPanelRegistrarVehiculo); // NOI18N

        jPanelModificarVehiculo.setPreferredSize(new java.awt.Dimension(900, 550));

        jScrollPane8.setViewportView(jTextPaneDisplayRegistro1);

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

        jLabelVehiculoSeleccionado.setText("Datos de vehiculo Seleccionado:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Placa:");

        jComboBox1.setBackground(new java.awt.Color(0, 51, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "marca del Vehiculo", "modelo del vehiculo", "año del vehiculo", "color del vehiculo", "cilindraje del vehiculo", "cantidad de pasajeros", "precio de alquiler por día" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelParametroAModificar.setText("Parametro a modificar");

        jScrollPane10.setViewportView(jTextPaneValorAModificar);

        jLabelValorAModificar.setText("Valor a modificar");

        jButtonRefrescarVisualizacionRegistro2.setBackground(new java.awt.Color(51, 255, 51));
        jButtonRefrescarVisualizacionRegistro2.setText("Refrescar Registro Global Vehículos");

        jButtonBuscarPlacaModificarVehiculo.setBackground(new java.awt.Color(0, 51, 255));
        jButtonBuscarPlacaModificarVehiculo.setText("Buscar Placa");
        jButtonBuscarPlacaModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPlacaModificarVehiculoActionPerformed(evt);
            }
        });

        jButtonSalirModificarVehiculo.setBackground(new java.awt.Color(204, 0, 102));
        jButtonSalirModificarVehiculo.setText("Salir");

        jButtonEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEliminar.setText("Eliminar Vehiculo");

        jButtonLimpiarBusqueda1.setBackground(new java.awt.Color(255, 153, 204));
        jButtonLimpiarBusqueda1.setText("Limpiar Búsqueda");

        javax.swing.GroupLayout jPanelModificarVehiculoLayout = new javax.swing.GroupLayout(jPanelModificarVehiculo);
        jPanelModificarVehiculo.setLayout(jPanelModificarVehiculoLayout);
        jPanelModificarVehiculoLayout.setHorizontalGroup(
            jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscarPlacaModificarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelParametroAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorAModificar)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLimpiarBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                            .addComponent(jLabelRegistroVehiculo2)
                            .addGap(119, 119, 119)
                            .addComponent(jButtonRefrescarVisualizacionRegistro2))
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelVehiculoSeleccionado))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalirModificarVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelModificarVehiculoLayout.setVerticalGroup(
            jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificarVehiculoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRefrescarVisualizacionRegistro2)
                    .addComponent(jLabelRegistroVehiculo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVehiculoSeleccionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalirModificarVehiculo)
                        .addGap(36, 36, 36))
                    .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                        .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButtonBuscarPlacaModificarVehiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelParametroAModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorAModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpiarBusqueda1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar)
                        .addGap(54, 54, 54))))
        );

        jTabbedPaneRegistrarvehiculo.addTab("Modificar / Eliminar Vehiculo", new javax.swing.ImageIcon(getClass().getResource("/AnexosEImagenes/editImage.png")), jPanelModificarVehiculo); // NOI18N

        jComboBoxtipoCombustibleExtras.setBackground(new java.awt.Color(0, 102, 255));
        jComboBoxtipoCombustibleExtras.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxtipoCombustibleExtras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel", "Eléctrico", "Gas Natural" }));
        jComboBoxtipoCombustibleExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxtipoCombustibleExtrasActionPerformed(evt);
            }
        });

        jCheckBoxUsarElTipoDeCombustible.setText("Usar este tipo de combustible");

        jButtonAplicarCambioTipoCombustible.setBackground(new java.awt.Color(0, 0, 255));
        jButtonAplicarCambioTipoCombustible.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAplicarCambioTipoCombustible.setText("Aplicar tipo de combustible");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane11.setViewportView(jTextArea1);

        jLabel1.setText("Tipo Combustible");

        jScrollPane12.setViewportView(jtext_numPlaca);

        jButtonBuscar_Refrescar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonBuscar_Refrescar.setText("Buscar Placa / Refrescar placa");

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

        jButtonQuitarExtras.setBackground(new java.awt.Color(255, 102, 0));
        jButtonQuitarExtras.setText("Quitar Extras");

        jButtonLimpiarbusqueda3.setBackground(new java.awt.Color(255, 153, 255));
        jButtonLimpiarbusqueda3.setText("Limpiar Búsqueda");
        jButtonLimpiarbusqueda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarbusqueda3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxtipoCombustibleExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBoxUsarElTipoDeCombustible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane12)
                                .addComponent(jButtonAplicarCambioTipoCombustible))
                            .addComponent(jButtonLimpiarbusqueda3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButtonBuscar_Refrescar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAgregarExtras, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jButtonQuitarExtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane13)
                    .addComponent(jLabelInfoDeVehiculoConExtras)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfoDeVehiculoConExtras)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBuscar_Refrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxtipoCombustibleExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jCheckBoxUsarElTipoDeCombustible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAplicarCambioTipoCombustible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpiarbusqueda3)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAgregarExtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonQuitarExtras)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPaneRegistrarvehiculo.addTab("Modificaciones Extras", new javax.swing.ImageIcon(getClass().getResource("/AnexosEImagenes/golive.png")), jPanel1, ""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneRegistrarvehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneRegistrarvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPaneRegistrarvehiculo.getAccessibleContext().setAccessibleName("Registrar Vehículo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jComboBoxSelectorDeCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectorDeCombustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelectorDeCombustibleActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBoxtipoCombustibleExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxtipoCombustibleExtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxtipoCombustibleExtrasActionPerformed

    private void jButtonLimpiarbusqueda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarbusqueda3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarbusqueda3ActionPerformed

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

        Vehiculo vehiculito = new Vehiculo(placa, marca, modelo, anio, color,
                cilindraje, combustible, cantPasajeros, precio, estado);

        pilaRegistroVehiculo.push(vehiculito);

        jTextPaneDisplayRegistro.setText(pilaRegistroVehiculo.listar());

        limpiarConsola();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonLimpiarBusqueda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarBusqueda2ActionPerformed
        // TODO add your handling code here:
        limpiarConsola();
    }//GEN-LAST:event_jButtonLimpiarBusqueda2ActionPerformed

    private void jButtonAgregarExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarExtrasActionPerformed
        String numPlaca = jtext_numPlaca.getText();
        String extra = jtext_extras.getText();

        pilaRegistroVehiculo.search(numPlaca);

        if (pilaRegistroVehiculo.search(numPlaca)) {
            Vehiculo vehiculo = pilaRegistroVehiculo.traerVehiculo(numPlaca);//aca traemos el vehiculo a la GUI para que se trabaje desde ahi
            vehiculo.getExtrasPila().push(extra);//conseguimoos el vehiculo y le insertamos el extra
            pilaRegistroVehiculo.popModificado(numPlaca);//eliminamos el  vehiculo de la pila 
            pilaRegistroVehiculo.push(vehiculo);// Insertamos nuevamente el vehiculo con las extras nuevas

        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }


    }//GEN-LAST:event_jButtonAgregarExtrasActionPerformed

    private void jButtonBuscarPlacaModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPlacaModificarVehiculoActionPerformed
         String numPlaca= jTextFieldPlaca.getText();
         JOptionPane.showMessageDialog(null, "numplaca a revisar = " + numPlaca);
         JOptionPane.showMessageDialog(null, "existe? = " + pilaRegistroVehiculo.search(numPlaca));
        if(pilaRegistroVehiculo.search(numPlaca)){
            jTextPaneDisplayRegistro1.setText(pilaRegistroVehiculo.traerVehiculo(numPlaca).toString());
        }else{
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
       
    }//GEN-LAST:event_jButtonBuscarPlacaModificarVehiculoActionPerformed

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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUIRegistroVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistroVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistroVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistroVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistroVehiculo().setVisible(true);
            }
        });
    }

    Pila_RegistroVehiculo pilaRegistroVehiculo = new Pila_RegistroVehiculo();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelRegistrarVehiculo;
    private javax.swing.JButton jButtonAgregarExtras;
    private javax.swing.JButton jButtonAplicarCambioTipoCombustible;
    private javax.swing.JButton jButtonBuscarPlacaModificarVehiculo;
    private javax.swing.JButton jButtonBuscar_Refrescar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiarBusqueda1;
    private javax.swing.JButton jButtonLimpiarBusqueda2;
    private javax.swing.JButton jButtonLimpiarbusqueda3;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonQuitarExtras;
    private javax.swing.JButton jButtonRefrescarRegistroVehiculo1;
    private javax.swing.JButton jButtonRefrescarVisualizacionRegistro2;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalirModificarVehiculo;
    private javax.swing.JCheckBox jCheckBoxUsarElTipoDeCombustible;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSelectorDeCombustible;
    private javax.swing.JComboBox<String> jComboBoxtipoCombustibleExtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelCombustible;
    private javax.swing.JLabel jLabelInfoDeVehiculoConExtras;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelParametroAModificar;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelPlacaAnnio;
    private javax.swing.JLabel jLabelPlacaCilindraje;
    private javax.swing.JLabel jLabelPlacaModelo;
    private javax.swing.JLabel jLabelRegistrarVehiculo;
    private javax.swing.JLabel jLabelRegistroVehiculo2;
    private javax.swing.JLabel jLabelRegistro_de_Vehiculos;
    private javax.swing.JLabel jLabelValorAModificar;
    private javax.swing.JLabel jLabelVehiculoSeleccionado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelModificarVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPaneRegistrarvehiculo;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPaneAnnio;
    private javax.swing.JTextPane jTextPaneCantPasajeros;
    private javax.swing.JTextPane jTextPaneCilindraje;
    private javax.swing.JTextPane jTextPaneColor;
    private javax.swing.JTextPane jTextPaneDisplayRegistro;
    private javax.swing.JTextPane jTextPaneDisplayRegistro1;
    private javax.swing.JTextPane jTextPaneDisplayRegistro2;
    private javax.swing.JTextPane jTextPaneMarca;
    private javax.swing.JTextPane jTextPaneModelo;
    private javax.swing.JTextPane jTextPanePlaca;
    private javax.swing.JTextPane jTextPanePrecio;
    private javax.swing.JTextPane jTextPaneValorAModificar;
    private javax.swing.JTextPane jtext_extras;
    private javax.swing.JTextPane jtext_numPlaca;
    // End of variables declaration//GEN-END:variables
}
