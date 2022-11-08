package GUI;

import EstructurasDeDatos.*;
import ObjetosdelProyecto.Objetos.Vehiculo;
import javax.swing.JOptionPane;

public class GUIRegistroVehiculo extends javax.swing.JFrame {

    public GUIRegistroVehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        Vehiculo vehiculito1 = new Vehiculo("P-5489", "Toyota", "Hilux", 2022, "rojo",
                4, "Gasolina", 5, 80, "Disponible");
        Vehiculo vehiculito2 = new Vehiculo("LDW-8899", "Hyundai", "Accent", 2021, "Blanco",
                4, "Gasolina", 5, 60, "Disponible");
        Vehiculo vehiculito3 = new Vehiculo("654-ARDS", "Chevrolet", "Malibu", 2021, "Azul",
                4, "Gasolina", 5, 90, "Disponible");
        Vehiculo vehiculito4 = new Vehiculo("HRR-9879", "Toyota", "Rush", 2022, "Blanco",
                4, "Gasolina", 5, 90, "Disponible");
        pilaRegistroVehiculo.push(vehiculito1);
        pilaRegistroVehiculo.push(vehiculito2);
        pilaRegistroVehiculo.push(vehiculito3);
        pilaRegistroVehiculo.push(vehiculito4);
        jTextPaneDisplayRegistro.setText(pilaRegistroVehiculo.listar2());
        jTextPaneDisplayRegistro2.setText(pilaRegistroVehiculo.listar2());

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextPaneCantPasajeros = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPanePrecio = new javax.swing.JTextPane();
        jComboBox2SelectorEstado = new javax.swing.JComboBox<>();
        jLabelPlaca1 = new javax.swing.JLabel();
        jPanelModificarVehiculo = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
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

        jButtonSalir.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
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

        javax.swing.GroupLayout JPanelRegistrarVehiculoLayout = new javax.swing.GroupLayout(JPanelRegistrarVehiculo);
        JPanelRegistrarVehiculo.setLayout(JPanelRegistrarVehiculoLayout);
        JPanelRegistrarVehiculoLayout.setHorizontalGroup(
            JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelRegistrarVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabelRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 767, Short.MAX_VALUE))
                    .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                .addComponent(jButtonRegistrar)
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
                                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelPlaca1)
                                                    .addComponent(jComboBox2SelectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
                                                .addComponent(jLabelRegistro_de_Vehiculos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonRefrescarRegistroVehiculo1))
                                            .addComponent(jScrollPane1))))))))
                .addContainerGap())
        );
        JPanelRegistrarVehiculoLayout.setVerticalGroup(
            JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPlaca)
                            .addComponent(jLabelPlaca1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelRegistrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelRegistrarVehiculoLayout.createSequentialGroup()
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
                            .addComponent(jComboBox2SelectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(15, 15, 15))
        );

        jTabbedPaneRegistrarvehiculo.addTab("Registrar Vehiculo", new javax.swing.ImageIcon(getClass().getResource("/AnexosEImagenes/addImage.png")), JPanelRegistrarVehiculo); // NOI18N

        jPanelModificarVehiculo.setPreferredSize(new java.awt.Dimension(900, 550));

        jButtonModificar.setBackground(new java.awt.Color(51, 51, 255));
        jButtonModificar.setForeground(new java.awt.Color(0, 0, 0));
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
        jButtonBuscarPlacaModificarVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscarPlacaModificarVehiculo.setText("Buscar Placa");
        jButtonBuscarPlacaModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPlacaModificarVehiculoActionPerformed(evt);
            }
        });

        jButtonSalirModificarVehiculo.setBackground(new java.awt.Color(204, 0, 102));
        jButtonSalirModificarVehiculo.setText("Salir");

        jButtonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEliminar.setText("Eliminar Vehiculo");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(153, 255, 51));
        jButtonActualizar.setForeground(new java.awt.Color(0, 0, 0));
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

        javax.swing.GroupLayout jPanelModificarVehiculoLayout = new javax.swing.GroupLayout(jPanelModificarVehiculo);
        jPanelModificarVehiculo.setLayout(jPanelModificarVehiculoLayout);
        jPanelModificarVehiculoLayout.setHorizontalGroup(
            jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                        .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelParametroAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelValorAModificar)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                                        .addComponent(jButtonBuscarPlacaModificarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addComponent(jComboBoxtipoCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPlaca2)
                                    .addComponent(jComboBox2Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonSalirModificarVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabelRegistroVehiculo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelModificarVehiculoLayout.setVerticalGroup(
            jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificarVehiculoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroVehiculo2)
                    .addComponent(jButtonActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelModificarVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscarPlacaModificarVehiculo)
                            .addComponent(jButtonEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelParametroAModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPlaca2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxtipoCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValorAModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonModificar)
                .addGap(43, 43, 43)
                .addComponent(jButtonSalirModificarVehiculo)
                .addGap(36, 36, 36))
        );

        jTabbedPaneRegistrarvehiculo.addTab("Modificar / Eliminar Vehiculo", new javax.swing.ImageIcon(getClass().getResource("/AnexosEImagenes/editImage.png")), jPanelModificarVehiculo); // NOI18N

        jTextAreaVehiculo.setColumns(20);
        jTextAreaVehiculo.setRows(5);
        jScrollPane11.setViewportView(jTextAreaVehiculo);

        jScrollPane12.setViewportView(jtext_numPlaca);

        jButtonBuscar_Refrescar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonBuscar_Refrescar.setForeground(new java.awt.Color(0, 0, 0));
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
        jButtonAgregarExtras.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAgregarExtras.setText("Agregar Extras");
        jButtonAgregarExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarExtrasActionPerformed(evt);
            }
        });

        jButtonQuitarExtras.setBackground(new java.awt.Color(224, 132, 15));
        jButtonQuitarExtras.setForeground(new java.awt.Color(0, 0, 0));
        jButtonQuitarExtras.setText("Quitar Extras");
        jButtonQuitarExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarExtrasActionPerformed(evt);
            }
        });

        jLabel7.setText("Extra:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jButtonAgregarExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonQuitarExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscar_Refrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInfoDeVehiculoConExtras)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabelInfoDeVehiculoConExtras)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jTabbedPaneRegistrarvehiculo.addTab("Modificaciones Extras", new javax.swing.ImageIcon(getClass().getResource("/AnexosEImagenes/golive.png")), jPanel1, ""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneRegistrarvehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneRegistrarvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPaneRegistrarvehiculo.getAccessibleContext().setAccessibleName("Registrar Vehículo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jComboBoxSelectorDeCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectorDeCombustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelectorDeCombustibleActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
        GUIMainMenu m = new GUIMainMenu();
        m.setVisible(true);

    }//GEN-LAST:event_jButtonSalirActionPerformed

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

    private void jButtonBuscarPlacaModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPlacaModificarVehiculoActionPerformed
        String numPlaca = jTextFieldPlaca.getText();

        if (pilaRegistroVehiculo.search(numPlaca)) {
            jTextPaneDisplayRegistro2.setText(pilaRegistroVehiculo.traerVehiculo(numPlaca).toString());
        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }

    }//GEN-LAST:event_jButtonBuscarPlacaModificarVehiculoActionPerformed

    private void jButtonRefrescarRegistroVehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefrescarRegistroVehiculo1ActionPerformed
        jTextPaneDisplayRegistro.setText(pilaRegistroVehiculo.listar2());
    }//GEN-LAST:event_jButtonRefrescarRegistroVehiculo1ActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        jTextPaneDisplayRegistro2.setText(pilaRegistroVehiculo.listar2());
        jTextFieldPlaca.setText("");
        jTextPaneValorAModificar.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jComboBoxtipoCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxtipoCombustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxtipoCombustibleActionPerformed

    private void jButtonBuscar_RefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar_RefrescarActionPerformed
         String numPlaca = jtext_numPlaca.getText();

        if (pilaRegistroVehiculo.search(numPlaca)) {
            jTextAreaVehiculo.setText(pilaRegistroVehiculo.traerVehiculo(numPlaca).toString());
        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
    }//GEN-LAST:event_jButtonBuscar_RefrescarActionPerformed

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

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
      String placa= jTextFieldPlaca.getText();
     
       if (pilaRegistroVehiculo.search(placa)) {
           pilaRegistroVehiculo.popModificado(placa);
           jTextPaneDisplayRegistro2.setText(pilaRegistroVehiculo.listar2());
        } else {
            JOptionPane.showMessageDialog(null, "el vehiculo no existe");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregarExtras;
    private javax.swing.JButton jButtonBuscarPlacaModificarVehiculo;
    private javax.swing.JButton jButtonBuscar_Refrescar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonQuitarExtras;
    private javax.swing.JButton jButtonRefrescarRegistroVehiculo1;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalirModificarVehiculo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2Estado;
    private javax.swing.JComboBox<String> jComboBox2SelectorEstado;
    private javax.swing.JComboBox<String> jComboBoxSelectorDeCombustible;
    private javax.swing.JComboBox<String> jComboBoxtipoCombustible;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelCombustible;
    private javax.swing.JLabel jLabelInfoDeVehiculoConExtras;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelParametroAModificar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelModificarVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPaneRegistrarvehiculo;
    private javax.swing.JTextArea jTextAreaVehiculo;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextPane jTextPaneAnnio;
    private javax.swing.JTextPane jTextPaneCantPasajeros;
    private javax.swing.JTextPane jTextPaneCilindraje;
    private javax.swing.JTextPane jTextPaneColor;
    private javax.swing.JTextPane jTextPaneDisplayRegistro;
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
